package com.example.mycompany.CallVisor.persistence.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by User2 on 19.08.2018.
 */
@Entity
@Table(name = "Call", schema = "dbo", catalog = "Aloho")
public class CallEntity {
    private String id;
    private Date callDate;
    private Boolean deleted;
    private String parentId;
    private String action;
    private String idManager;
    private Boolean rec;
    private String dopInfo;
    private String sourceNumber;
    private String managerIdController;
    private String idKlient;
    private Integer duration;
    private Boolean isPriorityUp;
    private Boolean isTransfer;
    private Boolean wasListened;
    private String transferToManagerId;
    private Boolean isWarning;
    private Boolean isFavorit;
    private Integer honorificNameCount;
    private Boolean isListen;
    private Integer noCounter;
    private Boolean anketDataError;
    private String extraInfo;
    private Timestamp listenDate;
    private Timestamp startCallDate;
    private String errorKlientHistoryId;
    private int ident;
    private String cause;
    private Integer badWordCounter;
    private String signature;
    private String location;
    private Boolean missingAnswerState;
    private String missingAnswerCallId;
    private Boolean isoffline;
    private String callWavUrl;
    private Boolean manualCompletePayment;
    private Timestamp otrabotanDate;

    @Id
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CallDate", nullable = true)
    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    @Basic
    @Column(name = "Deleted", nullable = true)
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "ParentID", nullable = true, length = 40)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "Action", nullable = true, length = 40)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "idManager", nullable = true, length = 40)
    public String getIdManager() {
        return idManager;
    }

    public void setIdManager(String idManager) {
        this.idManager = idManager;
    }

    @Basic
    @Column(name = "Rec", nullable = true)
    public Boolean getRec() {
        return rec;
    }

    public void setRec(Boolean rec) {
        this.rec = rec;
    }

    @Basic
    @Column(name = "DopInfo", nullable = true, length = 200)
    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    @Basic
    @Column(name = "SourceNumber", nullable = true, length = 50)
    public String getSourceNumber() {
        return sourceNumber;
    }

    public void setSourceNumber(String sourceNumber) {
        this.sourceNumber = sourceNumber;
    }

    @Basic
    @Column(name = "ManagerIDController", nullable = true, length = 40)
    public String getManagerIdController() {
        return managerIdController;
    }

    public void setManagerIdController(String managerIdController) {
        this.managerIdController = managerIdController;
    }

    @Basic
    @Column(name = "IDKlient", nullable = true, length = 40)
    public String getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(String idKlient) {
        this.idKlient = idKlient;
    }

    @Basic
    @Column(name = "Duration", nullable = true)
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "IsPriorityUp", nullable = true)
    public Boolean getIsPriorityUp() {
        return isPriorityUp;
    }

    public void setIsPriorityUp(Boolean priorityUp) {
        isPriorityUp = priorityUp;
    }

    @Basic
    @Column(name = "IsTransfer", nullable = true)
    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean transfer) {
        isTransfer = transfer;
    }

    @Basic
    @Column(name = "WasListened", nullable = true)
    public Boolean getWasListened() {
        return wasListened;
    }

    public void setWasListened(Boolean wasListened) {
        this.wasListened = wasListened;
    }

    @Basic
    @Column(name = "TransferToManagerID", nullable = true, length = 40)
    public String getTransferToManagerId() {
        return transferToManagerId;
    }

    public void setTransferToManagerId(String transferToManagerId) {
        this.transferToManagerId = transferToManagerId;
    }

    @Basic
    @Column(name = "IsWarning", nullable = true)
    public Boolean getIsWarning() {
        return isWarning;
    }

    public void setIsWarning(Boolean warning) {
        isWarning = warning;
    }

    @Basic
    @Column(name = "IsFavorit", nullable = true)
    public Boolean getIsFavorit() {
        return isFavorit;
    }

    public void setIsFavorit(Boolean favorit) {
        isFavorit = favorit;
    }

    @Basic
    @Column(name = "HonorificNameCount", nullable = true)
    public Integer getHonorificNameCount() {
        return honorificNameCount;
    }

    public void setHonorificNameCount(Integer honorificNameCount) {
        this.honorificNameCount = honorificNameCount;
    }

    @Basic
    @Column(name = "IsListen", nullable = true)
    public Boolean getIsListen() {
        return isListen;
    }

    public void setIsListen(Boolean listen) {
        isListen = listen;
    }

    @Basic
    @Column(name = "NoCounter", nullable = true)
    public Integer getNoCounter() {
        return noCounter;
    }

    public void setNoCounter(Integer noCounter) {
        this.noCounter = noCounter;
    }

    @Basic
    @Column(name = "AnketDataError", nullable = true)
    public Boolean getAnketDataError() {
        return anketDataError;
    }

    public void setAnketDataError(Boolean anketDataError) {
        this.anketDataError = anketDataError;
    }

    @Basic
    @Column(name = "ExtraInfo", nullable = true, length = 100)
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Basic
    @Column(name = "ListenDate", nullable = true)
    public Timestamp getListenDate() {
        return listenDate;
    }

    public void setListenDate(Timestamp listenDate) {
        this.listenDate = listenDate;
    }

    @Basic
    @Column(name = "StartCallDate", nullable = true)
    public Timestamp getStartCallDate() {
        return startCallDate;
    }

    public void setStartCallDate(Timestamp startCallDate) {
        this.startCallDate = startCallDate;
    }

    @Basic
    @Column(name = "ErrorKlientHistoryID", nullable = true, length = 40)
    public String getErrorKlientHistoryId() {
        return errorKlientHistoryId;
    }

    public void setErrorKlientHistoryId(String errorKlientHistoryId) {
        this.errorKlientHistoryId = errorKlientHistoryId;
    }

    @Basic
    @Column(name = "ident", nullable = false)
    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    @Basic
    @Column(name = "Cause", nullable = true, length = 40)
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Basic
    @Column(name = "BadWordCounter", nullable = true)
    public Integer getBadWordCounter() {
        return badWordCounter;
    }

    public void setBadWordCounter(Integer badWordCounter) {
        this.badWordCounter = badWordCounter;
    }

    @Basic
    @Column(name = "Signature", nullable = true, length = 100)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "Location", nullable = true, length = 100)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "MissingAnswerState", nullable = true)
    public Boolean getMissingAnswerState() {
        return missingAnswerState;
    }

    public void setMissingAnswerState(Boolean missingAnswerState) {
        this.missingAnswerState = missingAnswerState;
    }

    @Basic
    @Column(name = "MissingAnswerCallID", nullable = true, length = 50)
    public String getMissingAnswerCallId() {
        return missingAnswerCallId;
    }

    public void setMissingAnswerCallId(String missingAnswerCallId) {
        this.missingAnswerCallId = missingAnswerCallId;
    }

    @Basic
    @Column(name = "isoffline", nullable = true)
    public Boolean getIsoffline() {
        return isoffline;
    }

    public void setIsoffline(Boolean isoffline) {
        this.isoffline = isoffline;
    }

    @Basic
    @Column(name = "CallWavUrl", nullable = true, length = 400)
    public String getCallWavUrl() {
        return callWavUrl;
    }

    public void setCallWavUrl(String callWavUrl) {
        this.callWavUrl = callWavUrl;
    }

    @Basic
    @Column(name = "ManualCompletePayment", nullable = true)
    public Boolean getManualCompletePayment() {
        return manualCompletePayment;
    }

    public void setManualCompletePayment(Boolean manualCompletePayment) {
        this.manualCompletePayment = manualCompletePayment;
    }

    @Basic
    @Column(name = "OtrabotanDate", nullable = true)
    public Timestamp getOtrabotanDate() {
        return otrabotanDate;
    }

    public void setOtrabotanDate(Timestamp otrabotanDate) {
        this.otrabotanDate = otrabotanDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallEntity that = (CallEntity) o;

        if (ident != that.ident) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (callDate != null ? !callDate.equals(that.callDate) : that.callDate != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (idManager != null ? !idManager.equals(that.idManager) : that.idManager != null) return false;
        if (rec != null ? !rec.equals(that.rec) : that.rec != null) return false;
        if (dopInfo != null ? !dopInfo.equals(that.dopInfo) : that.dopInfo != null) return false;
        if (sourceNumber != null ? !sourceNumber.equals(that.sourceNumber) : that.sourceNumber != null) return false;
        if (managerIdController != null ? !managerIdController.equals(that.managerIdController) : that.managerIdController != null)
            return false;
        if (idKlient != null ? !idKlient.equals(that.idKlient) : that.idKlient != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (isPriorityUp != null ? !isPriorityUp.equals(that.isPriorityUp) : that.isPriorityUp != null) return false;
        if (isTransfer != null ? !isTransfer.equals(that.isTransfer) : that.isTransfer != null) return false;
        if (wasListened != null ? !wasListened.equals(that.wasListened) : that.wasListened != null) return false;
        if (transferToManagerId != null ? !transferToManagerId.equals(that.transferToManagerId) : that.transferToManagerId != null)
            return false;
        if (isWarning != null ? !isWarning.equals(that.isWarning) : that.isWarning != null) return false;
        if (isFavorit != null ? !isFavorit.equals(that.isFavorit) : that.isFavorit != null) return false;
        if (honorificNameCount != null ? !honorificNameCount.equals(that.honorificNameCount) : that.honorificNameCount != null)
            return false;
        if (isListen != null ? !isListen.equals(that.isListen) : that.isListen != null) return false;
        if (noCounter != null ? !noCounter.equals(that.noCounter) : that.noCounter != null) return false;
        if (anketDataError != null ? !anketDataError.equals(that.anketDataError) : that.anketDataError != null)
            return false;
        if (extraInfo != null ? !extraInfo.equals(that.extraInfo) : that.extraInfo != null) return false;
        if (listenDate != null ? !listenDate.equals(that.listenDate) : that.listenDate != null) return false;
        if (startCallDate != null ? !startCallDate.equals(that.startCallDate) : that.startCallDate != null)
            return false;
        if (errorKlientHistoryId != null ? !errorKlientHistoryId.equals(that.errorKlientHistoryId) : that.errorKlientHistoryId != null)
            return false;
        if (cause != null ? !cause.equals(that.cause) : that.cause != null) return false;
        if (badWordCounter != null ? !badWordCounter.equals(that.badWordCounter) : that.badWordCounter != null)
            return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (missingAnswerState != null ? !missingAnswerState.equals(that.missingAnswerState) : that.missingAnswerState != null)
            return false;
        if (missingAnswerCallId != null ? !missingAnswerCallId.equals(that.missingAnswerCallId) : that.missingAnswerCallId != null)
            return false;
        if (isoffline != null ? !isoffline.equals(that.isoffline) : that.isoffline != null) return false;
        if (callWavUrl != null ? !callWavUrl.equals(that.callWavUrl) : that.callWavUrl != null) return false;
        if (manualCompletePayment != null ? !manualCompletePayment.equals(that.manualCompletePayment) : that.manualCompletePayment != null)
            return false;
        if (otrabotanDate != null ? !otrabotanDate.equals(that.otrabotanDate) : that.otrabotanDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (idManager != null ? idManager.hashCode() : 0);
        result = 31 * result + (rec != null ? rec.hashCode() : 0);
        result = 31 * result + (dopInfo != null ? dopInfo.hashCode() : 0);
        result = 31 * result + (sourceNumber != null ? sourceNumber.hashCode() : 0);
        result = 31 * result + (managerIdController != null ? managerIdController.hashCode() : 0);
        result = 31 * result + (idKlient != null ? idKlient.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (isPriorityUp != null ? isPriorityUp.hashCode() : 0);
        result = 31 * result + (isTransfer != null ? isTransfer.hashCode() : 0);
        result = 31 * result + (wasListened != null ? wasListened.hashCode() : 0);
        result = 31 * result + (transferToManagerId != null ? transferToManagerId.hashCode() : 0);
        result = 31 * result + (isWarning != null ? isWarning.hashCode() : 0);
        result = 31 * result + (isFavorit != null ? isFavorit.hashCode() : 0);
        result = 31 * result + (honorificNameCount != null ? honorificNameCount.hashCode() : 0);
        result = 31 * result + (isListen != null ? isListen.hashCode() : 0);
        result = 31 * result + (noCounter != null ? noCounter.hashCode() : 0);
        result = 31 * result + (anketDataError != null ? anketDataError.hashCode() : 0);
        result = 31 * result + (extraInfo != null ? extraInfo.hashCode() : 0);
        result = 31 * result + (listenDate != null ? listenDate.hashCode() : 0);
        result = 31 * result + (startCallDate != null ? startCallDate.hashCode() : 0);
        result = 31 * result + (errorKlientHistoryId != null ? errorKlientHistoryId.hashCode() : 0);
        result = 31 * result + ident;
        result = 31 * result + (cause != null ? cause.hashCode() : 0);
        result = 31 * result + (badWordCounter != null ? badWordCounter.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (missingAnswerState != null ? missingAnswerState.hashCode() : 0);
        result = 31 * result + (missingAnswerCallId != null ? missingAnswerCallId.hashCode() : 0);
        result = 31 * result + (isoffline != null ? isoffline.hashCode() : 0);
        result = 31 * result + (callWavUrl != null ? callWavUrl.hashCode() : 0);
        result = 31 * result + (manualCompletePayment != null ? manualCompletePayment.hashCode() : 0);
        result = 31 * result + (otrabotanDate != null ? otrabotanDate.hashCode() : 0);
        return result;
    }
}
