package com.example.mycompany.CallVisor.persistence.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by User2 on 21.08.2018.
 */
@Entity
@Table(name = "manager", schema = "dbo", catalog = "Aloho")
public class ManagerEntity {
    private String id;
    private Boolean deleted;
    private String fio;
    private String login;
    private Integer admintype;
    private String pass;
    private String location;
    private String sip;
    private String email;
    private String mobilNumber;
    private String fotoId;
    private Boolean visibleInReception;
    private Timestamp lastRaytingate;
    private Double rayting;
    private Boolean access;
    private Timestamp createDate;
    private Timestamp dateOld;
    private String dopInfo;
    private Boolean dateOldRemember;
    private String warrantNumber;
    private Timestamp warrantDate;
    private Boolean callStandartApply;
    private String psevdonim;
    private Double oklad;
    private String signature;
    private Boolean phoneBlock;
    private Boolean logAsteriskEvent;
    private String klientid;
    private Boolean recProtection;
    private String companyId;
    private Double oficialOklad;
    private Double komission;
    private Boolean isDisMissed;
    private Timestamp disMissedDate;
    private String createdManagerId;
    private String smtpServer;
    private String pop3Server;
    private String loginEmail;
    private String passwordEmail;
    private String pictureId;
    private Timestamp lastStartDate;
    private Timestamp firstStartDayDate;
    private String lastStartVersion;
    private String director2;
    private Integer color;
    private String idKlientKategory;
    private String displaySize;
    private String os;
    private Boolean noPlain;
    private String vkUrl;
    private String passVk;
    private String loginVk;
    private Boolean sex;
    private String myVirtualBillId;
    private String smsAccauntDefaultId;
    private Integer discountBous;
    private Boolean ssl;
    private Integer emailPort;
    private String managerTypeId;
    private Boolean testEmailOk;
    private Boolean changeCompanyByLoction;
    private String lateManagerManagerId;
    private Integer komissionType;
    private String locationId2;
    private Boolean noRecalcSpList;
    private Double medikalPercent;
    private String kodManager;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "Fio", nullable = true, length = 100)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "Login", nullable = true, length = 20)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "Admintype", nullable = true)
    public Integer getAdmintype() {
        return admintype;
    }

    public void setAdmintype(Integer admintype) {
        this.admintype = admintype;
    }

    @Basic
    @Column(name = "Pass", nullable = true, length = 20)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "Location", nullable = true, length = 50)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "Sip", nullable = true, length = 40)
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "MobilNumber", nullable = true, length = 15)
    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    @Basic
    @Column(name = "FotoID", nullable = true, length = 50)
    public String getFotoId() {
        return fotoId;
    }

    public void setFotoId(String fotoId) {
        this.fotoId = fotoId;
    }

    @Basic
    @Column(name = "VisibleInReception", nullable = true)
    public Boolean getVisibleInReception() {
        return visibleInReception;
    }

    public void setVisibleInReception(Boolean visibleInReception) {
        this.visibleInReception = visibleInReception;
    }

    @Basic
    @Column(name = "LastRaytingate", nullable = true)
    public Timestamp getLastRaytingate() {
        return lastRaytingate;
    }

    public void setLastRaytingate(Timestamp lastRaytingate) {
        this.lastRaytingate = lastRaytingate;
    }

    @Basic
    @Column(name = "Rayting", nullable = true, precision = 0)
    public Double getRayting() {
        return rayting;
    }

    public void setRayting(Double rayting) {
        this.rayting = rayting;
    }

    @Basic
    @Column(name = "Access", nullable = true)
    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    @Basic
    @Column(name = "CreateDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "DateOld", nullable = true)
    public Timestamp getDateOld() {
        return dateOld;
    }

    public void setDateOld(Timestamp dateOld) {
        this.dateOld = dateOld;
    }

    @Basic
    @Column(name = "DopInfo", nullable = true, length = 500)
    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    @Basic
    @Column(name = "DateOldRemember", nullable = true)
    public Boolean getDateOldRemember() {
        return dateOldRemember;
    }

    public void setDateOldRemember(Boolean dateOldRemember) {
        this.dateOldRemember = dateOldRemember;
    }

    @Basic
    @Column(name = "WarrantNumber", nullable = true, length = 50)
    public String getWarrantNumber() {
        return warrantNumber;
    }

    public void setWarrantNumber(String warrantNumber) {
        this.warrantNumber = warrantNumber;
    }

    @Basic
    @Column(name = "WarrantDate", nullable = true)
    public Timestamp getWarrantDate() {
        return warrantDate;
    }

    public void setWarrantDate(Timestamp warrantDate) {
        this.warrantDate = warrantDate;
    }

    @Basic
    @Column(name = "CallStandartApply", nullable = true)
    public Boolean getCallStandartApply() {
        return callStandartApply;
    }

    public void setCallStandartApply(Boolean callStandartApply) {
        this.callStandartApply = callStandartApply;
    }

    @Basic
    @Column(name = "Psevdonim", nullable = true, length = 50)
    public String getPsevdonim() {
        return psevdonim;
    }

    public void setPsevdonim(String psevdonim) {
        this.psevdonim = psevdonim;
    }

    @Basic
    @Column(name = "oklad", nullable = true, precision = 0)
    public Double getOklad() {
        return oklad;
    }

    public void setOklad(Double oklad) {
        this.oklad = oklad;
    }

    @Basic
    @Column(name = "Signature", nullable = true, length = 500)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "PhoneBlock", nullable = true)
    public Boolean getPhoneBlock() {
        return phoneBlock;
    }

    public void setPhoneBlock(Boolean phoneBlock) {
        this.phoneBlock = phoneBlock;
    }

    @Basic
    @Column(name = "LogAsteriskEvent", nullable = true)
    public Boolean getLogAsteriskEvent() {
        return logAsteriskEvent;
    }

    public void setLogAsteriskEvent(Boolean logAsteriskEvent) {
        this.logAsteriskEvent = logAsteriskEvent;
    }

    @Basic
    @Column(name = "klientid", nullable = true, length = 40)
    public String getKlientid() {
        return klientid;
    }

    public void setKlientid(String klientid) {
        this.klientid = klientid;
    }

    @Basic
    @Column(name = "RecProtection", nullable = true)
    public Boolean getRecProtection() {
        return recProtection;
    }

    public void setRecProtection(Boolean recProtection) {
        this.recProtection = recProtection;
    }

    @Basic
    @Column(name = "CompanyID", nullable = true, length = 50)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "OficialOklad", nullable = true, precision = 0)
    public Double getOficialOklad() {
        return oficialOklad;
    }

    public void setOficialOklad(Double oficialOklad) {
        this.oficialOklad = oficialOklad;
    }

    @Basic
    @Column(name = "Komission", nullable = true, precision = 0)
    public Double getKomission() {
        return komission;
    }

    public void setKomission(Double komission) {
        this.komission = komission;
    }

    @Basic
    @Column(name = "IsDisMissed", nullable = true)
    public Boolean getIsDisMissed() {
        return isDisMissed;
    }

    public void setIsDisMissed(Boolean disMissed) {
        isDisMissed = disMissed;
    }

    @Basic
    @Column(name = "DisMissedDate", nullable = true)
    public Timestamp getDisMissedDate() {
        return disMissedDate;
    }

    public void setDisMissedDate(Timestamp disMissedDate) {
        this.disMissedDate = disMissedDate;
    }

    @Basic
    @Column(name = "CreatedManagerID", nullable = true, length = 40)
    public String getCreatedManagerId() {
        return createdManagerId;
    }

    public void setCreatedManagerId(String createdManagerId) {
        this.createdManagerId = createdManagerId;
    }

    @Basic
    @Column(name = "SMTPServer", nullable = true, length = 60)
    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    @Basic
    @Column(name = "POP3Server", nullable = true, length = 60)
    public String getPop3Server() {
        return pop3Server;
    }

    public void setPop3Server(String pop3Server) {
        this.pop3Server = pop3Server;
    }

    @Basic
    @Column(name = "LoginEmail", nullable = true, length = 60)
    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    @Basic
    @Column(name = "PasswordEmail", nullable = true, length = 60)
    public String getPasswordEmail() {
        return passwordEmail;
    }

    public void setPasswordEmail(String passwordEmail) {
        this.passwordEmail = passwordEmail;
    }

    @Basic
    @Column(name = "PictureID", nullable = true, length = 50)
    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    @Basic
    @Column(name = "LastStartDate", nullable = true)
    public Timestamp getLastStartDate() {
        return lastStartDate;
    }

    public void setLastStartDate(Timestamp lastStartDate) {
        this.lastStartDate = lastStartDate;
    }

    @Basic
    @Column(name = "FirstStartDayDate", nullable = true)
    public Timestamp getFirstStartDayDate() {
        return firstStartDayDate;
    }

    public void setFirstStartDayDate(Timestamp firstStartDayDate) {
        this.firstStartDayDate = firstStartDayDate;
    }

    @Basic
    @Column(name = "LastStartVersion", nullable = true, length = 50)
    public String getLastStartVersion() {
        return lastStartVersion;
    }

    public void setLastStartVersion(String lastStartVersion) {
        this.lastStartVersion = lastStartVersion;
    }

    @Basic
    @Column(name = "director2", nullable = true, length = 200)
    public String getDirector2() {
        return director2;
    }

    public void setDirector2(String director2) {
        this.director2 = director2;
    }

    @Basic
    @Column(name = "color", nullable = true)
    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    @Basic
    @Column(name = "IDKlientKategory", nullable = true, length = 40)
    public String getIdKlientKategory() {
        return idKlientKategory;
    }

    public void setIdKlientKategory(String idKlientKategory) {
        this.idKlientKategory = idKlientKategory;
    }

    @Basic
    @Column(name = "DisplaySize", nullable = true, length = 40)
    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    @Basic
    @Column(name = "OS", nullable = true, length = 40)
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "NoPlain", nullable = true)
    public Boolean getNoPlain() {
        return noPlain;
    }

    public void setNoPlain(Boolean noPlain) {
        this.noPlain = noPlain;
    }

    @Basic
    @Column(name = "VKUrl", nullable = true, length = 400)
    public String getVkUrl() {
        return vkUrl;
    }

    public void setVkUrl(String vkUrl) {
        this.vkUrl = vkUrl;
    }

    @Basic
    @Column(name = "PassVK", nullable = true, length = 100)
    public String getPassVk() {
        return passVk;
    }

    public void setPassVk(String passVk) {
        this.passVk = passVk;
    }

    @Basic
    @Column(name = "LoginVK", nullable = true, length = 100)
    public String getLoginVk() {
        return loginVk;
    }

    public void setLoginVk(String loginVk) {
        this.loginVk = loginVk;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "MyVirtualBillID", nullable = true, length = 40)
    public String getMyVirtualBillId() {
        return myVirtualBillId;
    }

    public void setMyVirtualBillId(String myVirtualBillId) {
        this.myVirtualBillId = myVirtualBillId;
    }

    @Basic
    @Column(name = "SMSAccauntDefaultID", nullable = true, length = 40)
    public String getSmsAccauntDefaultId() {
        return smsAccauntDefaultId;
    }

    public void setSmsAccauntDefaultId(String smsAccauntDefaultId) {
        this.smsAccauntDefaultId = smsAccauntDefaultId;
    }

    @Basic
    @Column(name = "DiscountBous", nullable = true)
    public Integer getDiscountBous() {
        return discountBous;
    }

    public void setDiscountBous(Integer discountBous) {
        this.discountBous = discountBous;
    }

    @Basic
    @Column(name = "SSL", nullable = true)
    public Boolean getSsl() {
        return ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    @Basic
    @Column(name = "EmailPort", nullable = true)
    public Integer getEmailPort() {
        return emailPort;
    }

    public void setEmailPort(Integer emailPort) {
        this.emailPort = emailPort;
    }

    @Basic
    @Column(name = "ManagerTypeID", nullable = true, length = 40)
    public String getManagerTypeId() {
        return managerTypeId;
    }

    public void setManagerTypeId(String managerTypeId) {
        this.managerTypeId = managerTypeId;
    }

    @Basic
    @Column(name = "TestEmailOk", nullable = true)
    public Boolean getTestEmailOk() {
        return testEmailOk;
    }

    public void setTestEmailOk(Boolean testEmailOk) {
        this.testEmailOk = testEmailOk;
    }

    @Basic
    @Column(name = "ChangeCompanyByLoction", nullable = true)
    public Boolean getChangeCompanyByLoction() {
        return changeCompanyByLoction;
    }

    public void setChangeCompanyByLoction(Boolean changeCompanyByLoction) {
        this.changeCompanyByLoction = changeCompanyByLoction;
    }

    @Basic
    @Column(name = "LateManagerManagerID", nullable = true, length = 40)
    public String getLateManagerManagerId() {
        return lateManagerManagerId;
    }

    public void setLateManagerManagerId(String lateManagerManagerId) {
        this.lateManagerManagerId = lateManagerManagerId;
    }

    @Basic
    @Column(name = "KomissionType", nullable = true)
    public Integer getKomissionType() {
        return komissionType;
    }

    public void setKomissionType(Integer komissionType) {
        this.komissionType = komissionType;
    }

    @Basic
    @Column(name = "LocationID2", nullable = true, length = 40)
    public String getLocationId2() {
        return locationId2;
    }

    public void setLocationId2(String locationId2) {
        this.locationId2 = locationId2;
    }

    @Basic
    @Column(name = "NoRecalcSPList", nullable = true)
    public Boolean getNoRecalcSpList() {
        return noRecalcSpList;
    }

    public void setNoRecalcSpList(Boolean noRecalcSpList) {
        this.noRecalcSpList = noRecalcSpList;
    }

    @Basic
    @Column(name = "MedikalPercent", nullable = true, precision = 0)
    public Double getMedikalPercent() {
        return medikalPercent;
    }

    public void setMedikalPercent(Double medikalPercent) {
        this.medikalPercent = medikalPercent;
    }

    @Basic
    @Column(name = "KodManager", nullable = true, length = 40)
    public String getKodManager() {
        return kodManager;
    }

    public void setKodManager(String kodManager) {
        this.kodManager = kodManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntity that = (ManagerEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (admintype != null ? !admintype.equals(that.admintype) : that.admintype != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (sip != null ? !sip.equals(that.sip) : that.sip != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (mobilNumber != null ? !mobilNumber.equals(that.mobilNumber) : that.mobilNumber != null) return false;
        if (fotoId != null ? !fotoId.equals(that.fotoId) : that.fotoId != null) return false;
        if (visibleInReception != null ? !visibleInReception.equals(that.visibleInReception) : that.visibleInReception != null)
            return false;
        if (lastRaytingate != null ? !lastRaytingate.equals(that.lastRaytingate) : that.lastRaytingate != null)
            return false;
        if (rayting != null ? !rayting.equals(that.rayting) : that.rayting != null) return false;
        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (dateOld != null ? !dateOld.equals(that.dateOld) : that.dateOld != null) return false;
        if (dopInfo != null ? !dopInfo.equals(that.dopInfo) : that.dopInfo != null) return false;
        if (dateOldRemember != null ? !dateOldRemember.equals(that.dateOldRemember) : that.dateOldRemember != null)
            return false;
        if (warrantNumber != null ? !warrantNumber.equals(that.warrantNumber) : that.warrantNumber != null)
            return false;
        if (warrantDate != null ? !warrantDate.equals(that.warrantDate) : that.warrantDate != null) return false;
        if (callStandartApply != null ? !callStandartApply.equals(that.callStandartApply) : that.callStandartApply != null)
            return false;
        if (psevdonim != null ? !psevdonim.equals(that.psevdonim) : that.psevdonim != null) return false;
        if (oklad != null ? !oklad.equals(that.oklad) : that.oklad != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (phoneBlock != null ? !phoneBlock.equals(that.phoneBlock) : that.phoneBlock != null) return false;
        if (logAsteriskEvent != null ? !logAsteriskEvent.equals(that.logAsteriskEvent) : that.logAsteriskEvent != null)
            return false;
        if (klientid != null ? !klientid.equals(that.klientid) : that.klientid != null) return false;
        if (recProtection != null ? !recProtection.equals(that.recProtection) : that.recProtection != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (oficialOklad != null ? !oficialOklad.equals(that.oficialOklad) : that.oficialOklad != null) return false;
        if (komission != null ? !komission.equals(that.komission) : that.komission != null) return false;
        if (disMissedDate != null ? !disMissedDate.equals(that.disMissedDate) : that.disMissedDate != null)
            return false;
        if (createdManagerId != null ? !createdManagerId.equals(that.createdManagerId) : that.createdManagerId != null)
            return false;
        if (smtpServer != null ? !smtpServer.equals(that.smtpServer) : that.smtpServer != null) return false;
        if (pop3Server != null ? !pop3Server.equals(that.pop3Server) : that.pop3Server != null) return false;
        if (loginEmail != null ? !loginEmail.equals(that.loginEmail) : that.loginEmail != null) return false;
        if (passwordEmail != null ? !passwordEmail.equals(that.passwordEmail) : that.passwordEmail != null)
            return false;
        if (pictureId != null ? !pictureId.equals(that.pictureId) : that.pictureId != null) return false;
        if (lastStartDate != null ? !lastStartDate.equals(that.lastStartDate) : that.lastStartDate != null)
            return false;
        if (firstStartDayDate != null ? !firstStartDayDate.equals(that.firstStartDayDate) : that.firstStartDayDate != null)
            return false;
        if (lastStartVersion != null ? !lastStartVersion.equals(that.lastStartVersion) : that.lastStartVersion != null)
            return false;
        if (director2 != null ? !director2.equals(that.director2) : that.director2 != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (idKlientKategory != null ? !idKlientKategory.equals(that.idKlientKategory) : that.idKlientKategory != null)
            return false;
        if (displaySize != null ? !displaySize.equals(that.displaySize) : that.displaySize != null) return false;
        if (os != null ? !os.equals(that.os) : that.os != null) return false;
        if (noPlain != null ? !noPlain.equals(that.noPlain) : that.noPlain != null) return false;
        if (vkUrl != null ? !vkUrl.equals(that.vkUrl) : that.vkUrl != null) return false;
        if (passVk != null ? !passVk.equals(that.passVk) : that.passVk != null) return false;
        if (loginVk != null ? !loginVk.equals(that.loginVk) : that.loginVk != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (myVirtualBillId != null ? !myVirtualBillId.equals(that.myVirtualBillId) : that.myVirtualBillId != null)
            return false;
        if (smsAccauntDefaultId != null ? !smsAccauntDefaultId.equals(that.smsAccauntDefaultId) : that.smsAccauntDefaultId != null)
            return false;
        if (discountBous != null ? !discountBous.equals(that.discountBous) : that.discountBous != null) return false;
        if (ssl != null ? !ssl.equals(that.ssl) : that.ssl != null) return false;
        if (emailPort != null ? !emailPort.equals(that.emailPort) : that.emailPort != null) return false;
        if (managerTypeId != null ? !managerTypeId.equals(that.managerTypeId) : that.managerTypeId != null)
            return false;
        if (testEmailOk != null ? !testEmailOk.equals(that.testEmailOk) : that.testEmailOk != null) return false;
        if (changeCompanyByLoction != null ? !changeCompanyByLoction.equals(that.changeCompanyByLoction) : that.changeCompanyByLoction != null)
            return false;
        if (lateManagerManagerId != null ? !lateManagerManagerId.equals(that.lateManagerManagerId) : that.lateManagerManagerId != null)
            return false;
        if (komissionType != null ? !komissionType.equals(that.komissionType) : that.komissionType != null)
            return false;
        if (locationId2 != null ? !locationId2.equals(that.locationId2) : that.locationId2 != null) return false;
        if (noRecalcSpList != null ? !noRecalcSpList.equals(that.noRecalcSpList) : that.noRecalcSpList != null)
            return false;
        if (medikalPercent != null ? !medikalPercent.equals(that.medikalPercent) : that.medikalPercent != null)
            return false;
        if (kodManager != null ? !kodManager.equals(that.kodManager) : that.kodManager != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (admintype != null ? admintype.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (sip != null ? sip.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobilNumber != null ? mobilNumber.hashCode() : 0);
        result = 31 * result + (fotoId != null ? fotoId.hashCode() : 0);
        result = 31 * result + (visibleInReception != null ? visibleInReception.hashCode() : 0);
        result = 31 * result + (lastRaytingate != null ? lastRaytingate.hashCode() : 0);
        result = 31 * result + (rayting != null ? rayting.hashCode() : 0);
        result = 31 * result + (access != null ? access.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (dateOld != null ? dateOld.hashCode() : 0);
        result = 31 * result + (dopInfo != null ? dopInfo.hashCode() : 0);
        result = 31 * result + (dateOldRemember != null ? dateOldRemember.hashCode() : 0);
        result = 31 * result + (warrantNumber != null ? warrantNumber.hashCode() : 0);
        result = 31 * result + (warrantDate != null ? warrantDate.hashCode() : 0);
        result = 31 * result + (callStandartApply != null ? callStandartApply.hashCode() : 0);
        result = 31 * result + (psevdonim != null ? psevdonim.hashCode() : 0);
        result = 31 * result + (oklad != null ? oklad.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (phoneBlock != null ? phoneBlock.hashCode() : 0);
        result = 31 * result + (logAsteriskEvent != null ? logAsteriskEvent.hashCode() : 0);
        result = 31 * result + (klientid != null ? klientid.hashCode() : 0);
        result = 31 * result + (recProtection != null ? recProtection.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (oficialOklad != null ? oficialOklad.hashCode() : 0);
        result = 31 * result + (komission != null ? komission.hashCode() : 0);
        result = 31 * result + (disMissedDate != null ? disMissedDate.hashCode() : 0);
        result = 31 * result + (createdManagerId != null ? createdManagerId.hashCode() : 0);
        result = 31 * result + (smtpServer != null ? smtpServer.hashCode() : 0);
        result = 31 * result + (pop3Server != null ? pop3Server.hashCode() : 0);
        result = 31 * result + (loginEmail != null ? loginEmail.hashCode() : 0);
        result = 31 * result + (passwordEmail != null ? passwordEmail.hashCode() : 0);
        result = 31 * result + (pictureId != null ? pictureId.hashCode() : 0);
        result = 31 * result + (lastStartDate != null ? lastStartDate.hashCode() : 0);
        result = 31 * result + (firstStartDayDate != null ? firstStartDayDate.hashCode() : 0);
        result = 31 * result + (lastStartVersion != null ? lastStartVersion.hashCode() : 0);
        result = 31 * result + (director2 != null ? director2.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (idKlientKategory != null ? idKlientKategory.hashCode() : 0);
        result = 31 * result + (displaySize != null ? displaySize.hashCode() : 0);
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (noPlain != null ? noPlain.hashCode() : 0);
        result = 31 * result + (vkUrl != null ? vkUrl.hashCode() : 0);
        result = 31 * result + (passVk != null ? passVk.hashCode() : 0);
        result = 31 * result + (loginVk != null ? loginVk.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (myVirtualBillId != null ? myVirtualBillId.hashCode() : 0);
        result = 31 * result + (smsAccauntDefaultId != null ? smsAccauntDefaultId.hashCode() : 0);
        result = 31 * result + (discountBous != null ? discountBous.hashCode() : 0);
        result = 31 * result + (ssl != null ? ssl.hashCode() : 0);
        result = 31 * result + (emailPort != null ? emailPort.hashCode() : 0);
        result = 31 * result + (managerTypeId != null ? managerTypeId.hashCode() : 0);
        result = 31 * result + (testEmailOk != null ? testEmailOk.hashCode() : 0);
        result = 31 * result + (changeCompanyByLoction != null ? changeCompanyByLoction.hashCode() : 0);
        result = 31 * result + (lateManagerManagerId != null ? lateManagerManagerId.hashCode() : 0);
        result = 31 * result + (komissionType != null ? komissionType.hashCode() : 0);
        result = 31 * result + (locationId2 != null ? locationId2.hashCode() : 0);
        result = 31 * result + (noRecalcSpList != null ? noRecalcSpList.hashCode() : 0);
        result = 31 * result + (medikalPercent != null ? medikalPercent.hashCode() : 0);
        result = 31 * result + (kodManager != null ? kodManager.hashCode() : 0);
        return result;
    }
}
