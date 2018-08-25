package com.example.mycompany.CallVisor.logic.util;

import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.helpers.Transform;
import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;

import java.util.Date;

/**
 * Created by User2 on 25.08.2018.
 */
public class CustomHtmlLogLayout extends HTMLLayout {
    private StringBuffer sbuf = new StringBuffer(256);
    static String TRACE_PREFIX = "<br>&nbsp;&nbsp;&nbsp;&nbsp;";

    @Override
    public String format(LoggingEvent event) {
        if (this.sbuf.capacity() > 1024) {
            this.sbuf = new StringBuffer(256);
        } else {
            this.sbuf.setLength(0);
        }

        this.sbuf.append(org.apache.log4j.Layout.LINE_SEP + "<tr>" + org.apache.log4j.Layout.LINE_SEP);
        this.sbuf.append("<td>");
        this.sbuf.append(new Date(event.timeStamp));
        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);
        String escapedThread = Transform.escapeTags(event.getThreadName());
        this.sbuf.append("<td title=\"" + escapedThread + " thread\">");
        this.sbuf.append(escapedThread);
        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);
        this.sbuf.append("<td title=\"Level\">");
        if (event.getLevel().equals(Level.DEBUG)) {
            this.sbuf.append("<font color=\"#339933\">");
            this.sbuf.append(Transform.escapeTags(String.valueOf(event.getLevel())));
            this.sbuf.append("</font>");
        } else if (event.getLevel().isGreaterOrEqual(Level.WARN)) {
            this.sbuf.append("<font color=\"#993300\"><strong>");
            this.sbuf.append(Transform.escapeTags(String.valueOf(event.getLevel())));
            this.sbuf.append("</strong></font>");
        } else {
            this.sbuf.append(Transform.escapeTags(String.valueOf(event.getLevel())));
        }

        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);
        String escapedLogger = Transform.escapeTags(event.getLoggerName());
        this.sbuf.append("<td title=\"" + escapedLogger + " category\">");
        this.sbuf.append(escapedLogger);
        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);

        LocationInfo s = event.getLocationInformation();
        this.sbuf.append("<td>");
        this.sbuf.append(Transform.escapeTags(s.getFileName()));
        this.sbuf.append(':');
        this.sbuf.append(s.getLineNumber());
        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);

        this.sbuf.append("<td title=\"Message\">");
        this.sbuf.append(Transform.escapeTags(event.getRenderedMessage()));
        this.sbuf.append("</td>" + org.apache.log4j.Layout.LINE_SEP);
        this.sbuf.append("</tr>" + org.apache.log4j.Layout.LINE_SEP);
        if (event.getNDC() != null) {
            this.sbuf.append("<tr><td bgcolor=\"#EEEEEE\" style=\"font-size : xx-small;\" colspan=\"6\" title=\"Nested Diagnostic Context\">");
            this.sbuf.append("NDC: " + Transform.escapeTags(event.getNDC()));
            this.sbuf.append("</td></tr>" + org.apache.log4j.Layout.LINE_SEP);
        }

        String[] s1 = event.getThrowableStrRep();
        if (s1 != null) {
            this.sbuf.append("<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : xx-small;\" colspan=\"6\">");
            this.appendThrowableAsHTML(s1, this.sbuf);
            this.sbuf.append("</td></tr>" + org.apache.log4j.Layout.LINE_SEP);
        }

        return this.sbuf.toString();
    }

    private void appendThrowableAsHTML(String[] s, StringBuffer sbuf) {
        if (s != null) {
            int len = s.length;
            if (len == 0) {
                return;
            }

            sbuf.append(Transform.escapeTags(s[0]));
            sbuf.append(org.apache.log4j.Layout.LINE_SEP);

            for (int i = 1; i < len; ++i) {
                sbuf.append(TRACE_PREFIX);
                sbuf.append(Transform.escapeTags(s[i]));
                sbuf.append(org.apache.log4j.Layout.LINE_SEP);
            }
        }
    }
}
