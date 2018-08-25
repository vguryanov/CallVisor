package com.example.mycompany.CallVisor.persistence.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by User2 on 19.08.2018.
 */
@Entity
@Table(name = "klientinfo", schema = "dbo", catalog = "Aloho")
public class KlientinfoEntity {
    private String id;
    private Boolean deleted;
    private String famaly;
    private String name;
    private String patronymic;
    private Timestamp dateOld;
    private Timestamp recordCreateDate;
    private String idManagerCreater;
    private String email;
    private Integer saveDateOld;
    private int type;
    private String dopinfo;
    private String passportNumber;
    private String adressStreet;
    private String adressNumberHaus;
    private String adressNumberRoom;
    private String indexAdress;
    private String reklama;
    private Integer stars;
    private Boolean distribution;
    private String idKlientGroup;
    private String passportSeria;
    private String passportOut;
    private Timestamp passportOutDate;
    private Boolean passportOutDateOk;
    private String sPassportNumber;
    private String sPassportSeria;
    private String sPassportOut;
    private Timestamp sPassportOutDate;
    private Boolean sPassportOutDateOk;
    private String createdEvent;
    private String idCallCreator;
    private String algoritm;
    private Boolean isCompany;
    private Boolean birdaymem;
    private Boolean godenDoOk;
    private Timestamp godenDo;
    private Boolean autoopen;
    private String psevdonim;
    private Boolean miniQuest;
    private String discountCard;
    private Boolean noSms;
    private String name2;
    private String famaly2;
    private String patronymic2;
    private Timestamp lastDateCallIn;
    private Timestamp lastDateCallOut;
    private Timestamp lastDateContakt;
    private Integer callInCount;
    private Integer callOutCount;
    private Integer smsCount;
    private Boolean sPasportGodenDoReminder;
    private Integer filescount;
    private Integer taskCount;
    private Integer buyingCount;
    private String grasdanstvo;
    private String country;
    private String fatherAnketUnionId;
    private Boolean canDeleted;
    private String jobName;
    private String jobTitle;
    private String jobPosition;
    private String directorCompany;
    private Timestamp lastbuyingdte;
    private String bankName;
    private String bik;
    private String rs;
    private String ks;
    private byte[] avatarData;

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
    @Column(name = "famaly", nullable = true, length = 200)
    public String getFamaly() {
        return famaly;
    }

    public void setFamaly(String famaly) {
        this.famaly = famaly;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "patronymic", nullable = true, length = 200)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Basic
    @Column(name = "dateOld", nullable = true)
    public Timestamp getDateOld() {
        return dateOld;
    }

    public void setDateOld(Timestamp dateOld) {
        this.dateOld = dateOld;
    }

    @Basic
    @Column(name = "recordCreateDate", nullable = true)
    public Timestamp getRecordCreateDate() {
        return recordCreateDate;
    }

    public void setRecordCreateDate(Timestamp recordCreateDate) {
        this.recordCreateDate = recordCreateDate;
    }

    @Basic
    @Column(name = "idManagerCreater", nullable = true, length = 40)
    public String getIdManagerCreater() {
        return idManagerCreater;
    }

    public void setIdManagerCreater(String idManagerCreater) {
        this.idManagerCreater = idManagerCreater;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "saveDateOld", nullable = true)
    public Integer getSaveDateOld() {
        return saveDateOld;
    }

    public void setSaveDateOld(Integer saveDateOld) {
        this.saveDateOld = saveDateOld;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "dopinfo", nullable = true, length = 500)
    public String getDopinfo() {
        return dopinfo;
    }

    public void setDopinfo(String dopinfo) {
        this.dopinfo = dopinfo;
    }

    @Basic
    @Column(name = "PassportNumber", nullable = true, length = 12)
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "AdressStreet", nullable = true, length = 1000)
    public String getAdressStreet() {
        return adressStreet;
    }

    public void setAdressStreet(String adressStreet) {
        this.adressStreet = adressStreet;
    }

    @Basic
    @Column(name = "AdressNumberHaus", nullable = true, length = 6)
    public String getAdressNumberHaus() {
        return adressNumberHaus;
    }

    public void setAdressNumberHaus(String adressNumberHaus) {
        this.adressNumberHaus = adressNumberHaus;
    }

    @Basic
    @Column(name = "AdressNumberRoom", nullable = true, length = 200)
    public String getAdressNumberRoom() {
        return adressNumberRoom;
    }

    public void setAdressNumberRoom(String adressNumberRoom) {
        this.adressNumberRoom = adressNumberRoom;
    }

    @Basic
    @Column(name = "IndexAdress", nullable = true, length = 20)
    public String getIndexAdress() {
        return indexAdress;
    }

    public void setIndexAdress(String indexAdress) {
        this.indexAdress = indexAdress;
    }

    @Basic
    @Column(name = "Reklama", nullable = true, length = 200)
    public String getReklama() {
        return reklama;
    }

    public void setReklama(String reklama) {
        this.reklama = reklama;
    }

    @Basic
    @Column(name = "Stars", nullable = true)
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Basic
    @Column(name = "Distribution", nullable = true)
    public Boolean getDistribution() {
        return distribution;
    }

    public void setDistribution(Boolean distribution) {
        this.distribution = distribution;
    }

    @Basic
    @Column(name = "IDKlientGroup", nullable = true, length = 50)
    public String getIdKlientGroup() {
        return idKlientGroup;
    }

    public void setIdKlientGroup(String idKlientGroup) {
        this.idKlientGroup = idKlientGroup;
    }

    @Basic
    @Column(name = "PassportSeria", nullable = true, length = 30)
    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    @Basic
    @Column(name = "PassportOut", nullable = true, length = 500)
    public String getPassportOut() {
        return passportOut;
    }

    public void setPassportOut(String passportOut) {
        this.passportOut = passportOut;
    }

    @Basic
    @Column(name = "PassportOutDate", nullable = true)
    public Timestamp getPassportOutDate() {
        return passportOutDate;
    }

    public void setPassportOutDate(Timestamp passportOutDate) {
        this.passportOutDate = passportOutDate;
    }

    @Basic
    @Column(name = "PassportOutDateOk", nullable = true)
    public Boolean getPassportOutDateOk() {
        return passportOutDateOk;
    }

    public void setPassportOutDateOk(Boolean passportOutDateOk) {
        this.passportOutDateOk = passportOutDateOk;
    }

    @Basic
    @Column(name = "SPassportNumber", nullable = true, length = 12)
    public String getsPassportNumber() {
        return sPassportNumber;
    }

    public void setsPassportNumber(String sPassportNumber) {
        this.sPassportNumber = sPassportNumber;
    }

    @Basic
    @Column(name = "SPassportSeria", nullable = true, length = 20)
    public String getsPassportSeria() {
        return sPassportSeria;
    }

    public void setsPassportSeria(String sPassportSeria) {
        this.sPassportSeria = sPassportSeria;
    }

    @Basic
    @Column(name = "SPassportOut", nullable = true, length = 500)
    public String getsPassportOut() {
        return sPassportOut;
    }

    public void setsPassportOut(String sPassportOut) {
        this.sPassportOut = sPassportOut;
    }

    @Basic
    @Column(name = "SPassportOutDate", nullable = true)
    public Timestamp getsPassportOutDate() {
        return sPassportOutDate;
    }

    public void setsPassportOutDate(Timestamp sPassportOutDate) {
        this.sPassportOutDate = sPassportOutDate;
    }

    @Basic
    @Column(name = "SPassportOutDateOk", nullable = true)
    public Boolean getsPassportOutDateOk() {
        return sPassportOutDateOk;
    }

    public void setsPassportOutDateOk(Boolean sPassportOutDateOk) {
        this.sPassportOutDateOk = sPassportOutDateOk;
    }

    @Basic
    @Column(name = "CreatedEvent", nullable = true, length = 50)
    public String getCreatedEvent() {
        return createdEvent;
    }

    public void setCreatedEvent(String createdEvent) {
        this.createdEvent = createdEvent;
    }

    @Basic
    @Column(name = "IdCallCreator", nullable = true, length = 50)
    public String getIdCallCreator() {
        return idCallCreator;
    }

    public void setIdCallCreator(String idCallCreator) {
        this.idCallCreator = idCallCreator;
    }

    @Basic
    @Column(name = "Algoritm", nullable = true, length = 100)
    public String getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(String algoritm) {
        this.algoritm = algoritm;
    }

    @Basic
    @Column(name = "IsCompany", nullable = true)
    public Boolean getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(Boolean company) {
        isCompany = company;
    }

    @Basic
    @Column(name = "birdaymem", nullable = true)
    public Boolean getBirdaymem() {
        return birdaymem;
    }

    public void setBirdaymem(Boolean birdaymem) {
        this.birdaymem = birdaymem;
    }

    @Basic
    @Column(name = "GodenDoOK", nullable = true)
    public Boolean getGodenDoOk() {
        return godenDoOk;
    }

    public void setGodenDoOk(Boolean godenDoOk) {
        this.godenDoOk = godenDoOk;
    }

    @Basic
    @Column(name = "GodenDo", nullable = true)
    public Timestamp getGodenDo() {
        return godenDo;
    }

    public void setGodenDo(Timestamp godenDo) {
        this.godenDo = godenDo;
    }

    @Basic
    @Column(name = "autoopen", nullable = true)
    public Boolean getAutoopen() {
        return autoopen;
    }

    public void setAutoopen(Boolean autoopen) {
        this.autoopen = autoopen;
    }

    @Basic
    @Column(name = "psevdonim", nullable = true, length = 200)
    public String getPsevdonim() {
        return psevdonim;
    }

    public void setPsevdonim(String psevdonim) {
        this.psevdonim = psevdonim;
    }

    @Basic
    @Column(name = "MiniQuest", nullable = true)
    public Boolean getMiniQuest() {
        return miniQuest;
    }

    public void setMiniQuest(Boolean miniQuest) {
        this.miniQuest = miniQuest;
    }

    @Basic
    @Column(name = "DiscountCard", nullable = true, length = 50)
    public String getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(String discountCard) {
        this.discountCard = discountCard;
    }

    @Basic
    @Column(name = "NoSMS", nullable = true)
    public Boolean getNoSms() {
        return noSms;
    }

    public void setNoSms(Boolean noSms) {
        this.noSms = noSms;
    }

    @Basic
    @Column(name = "name2", nullable = true, length = 200)
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Basic
    @Column(name = "famaly2", nullable = true, length = 200)
    public String getFamaly2() {
        return famaly2;
    }

    public void setFamaly2(String famaly2) {
        this.famaly2 = famaly2;
    }

    @Basic
    @Column(name = "patronymic2", nullable = true, length = 200)
    public String getPatronymic2() {
        return patronymic2;
    }

    public void setPatronymic2(String patronymic2) {
        this.patronymic2 = patronymic2;
    }

    @Basic
    @Column(name = "LastDateCallIn", nullable = true)
    public Timestamp getLastDateCallIn() {
        return lastDateCallIn;
    }

    public void setLastDateCallIn(Timestamp lastDateCallIn) {
        this.lastDateCallIn = lastDateCallIn;
    }

    @Basic
    @Column(name = "LastDateCallOut", nullable = true)
    public Timestamp getLastDateCallOut() {
        return lastDateCallOut;
    }

    public void setLastDateCallOut(Timestamp lastDateCallOut) {
        this.lastDateCallOut = lastDateCallOut;
    }

    @Basic
    @Column(name = "LastDateContakt", nullable = true)
    public Timestamp getLastDateContakt() {
        return lastDateContakt;
    }

    public void setLastDateContakt(Timestamp lastDateContakt) {
        this.lastDateContakt = lastDateContakt;
    }

    @Basic
    @Column(name = "CallInCount", nullable = true)
    public Integer getCallInCount() {
        return callInCount;
    }

    public void setCallInCount(Integer callInCount) {
        this.callInCount = callInCount;
    }

    @Basic
    @Column(name = "CallOutCount", nullable = true)
    public Integer getCallOutCount() {
        return callOutCount;
    }

    public void setCallOutCount(Integer callOutCount) {
        this.callOutCount = callOutCount;
    }

    @Basic
    @Column(name = "SMSCount", nullable = true)
    public Integer getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    @Basic
    @Column(name = "SPasportGodenDoReminder", nullable = true)
    public Boolean getsPasportGodenDoReminder() {
        return sPasportGodenDoReminder;
    }

    public void setsPasportGodenDoReminder(Boolean sPasportGodenDoReminder) {
        this.sPasportGodenDoReminder = sPasportGodenDoReminder;
    }

    @Basic
    @Column(name = "filescount", nullable = true)
    public Integer getFilescount() {
        return filescount;
    }

    public void setFilescount(Integer filescount) {
        this.filescount = filescount;
    }

    @Basic
    @Column(name = "TaskCount", nullable = true)
    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    @Basic
    @Column(name = "BuyingCount", nullable = true)
    public Integer getBuyingCount() {
        return buyingCount;
    }

    public void setBuyingCount(Integer buyingCount) {
        this.buyingCount = buyingCount;
    }

    @Basic
    @Column(name = "Grasdanstvo", nullable = true, length = 100)
    public String getGrasdanstvo() {
        return grasdanstvo;
    }

    public void setGrasdanstvo(String grasdanstvo) {
        this.grasdanstvo = grasdanstvo;
    }

    @Basic
    @Column(name = "country", nullable = true, length = 200)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "FatherAnketUnionID", nullable = true, length = 40)
    public String getFatherAnketUnionId() {
        return fatherAnketUnionId;
    }

    public void setFatherAnketUnionId(String fatherAnketUnionId) {
        this.fatherAnketUnionId = fatherAnketUnionId;
    }

    @Basic
    @Column(name = "CanDeleted", nullable = true)
    public Boolean getCanDeleted() {
        return canDeleted;
    }

    public void setCanDeleted(Boolean canDeleted) {
        this.canDeleted = canDeleted;
    }

    @Basic
    @Column(name = "JobName", nullable = true, length = 200)
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "JobTitle", nullable = true, length = 200)
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "JobPosition", nullable = true, length = 200)
    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Basic
    @Column(name = "DirectorCompany", nullable = true, length = 200)
    public String getDirectorCompany() {
        return directorCompany;
    }

    public void setDirectorCompany(String directorCompany) {
        this.directorCompany = directorCompany;
    }

    @Basic
    @Column(name = "lastbuyingdte", nullable = true)
    public Timestamp getLastbuyingdte() {
        return lastbuyingdte;
    }

    public void setLastbuyingdte(Timestamp lastbuyingdte) {
        this.lastbuyingdte = lastbuyingdte;
    }

    @Basic
    @Column(name = "BankName", nullable = true, length = 100)
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "Bik", nullable = true, length = 100)
    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    @Basic
    @Column(name = "RS", nullable = true, length = 100)
    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    @Basic
    @Column(name = "KS", nullable = true, length = 100)
    public String getKs() {
        return ks;
    }

    public void setKs(String ks) {
        this.ks = ks;
    }

    @Basic
    @Column(name = "AvatarData", nullable = true)
    public byte[] getAvatarData() {
        return avatarData;
    }

    public void setAvatarData(byte[] avatarData) {
        this.avatarData = avatarData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KlientinfoEntity that = (KlientinfoEntity) o;

        if (type != that.type) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (famaly != null ? !famaly.equals(that.famaly) : that.famaly != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;
        if (dateOld != null ? !dateOld.equals(that.dateOld) : that.dateOld != null) return false;
        if (recordCreateDate != null ? !recordCreateDate.equals(that.recordCreateDate) : that.recordCreateDate != null)
            return false;
        if (idManagerCreater != null ? !idManagerCreater.equals(that.idManagerCreater) : that.idManagerCreater != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (saveDateOld != null ? !saveDateOld.equals(that.saveDateOld) : that.saveDateOld != null) return false;
        if (dopinfo != null ? !dopinfo.equals(that.dopinfo) : that.dopinfo != null) return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (adressStreet != null ? !adressStreet.equals(that.adressStreet) : that.adressStreet != null) return false;
        if (adressNumberHaus != null ? !adressNumberHaus.equals(that.adressNumberHaus) : that.adressNumberHaus != null)
            return false;
        if (adressNumberRoom != null ? !adressNumberRoom.equals(that.adressNumberRoom) : that.adressNumberRoom != null)
            return false;
        if (indexAdress != null ? !indexAdress.equals(that.indexAdress) : that.indexAdress != null) return false;
        if (reklama != null ? !reklama.equals(that.reklama) : that.reklama != null) return false;
        if (stars != null ? !stars.equals(that.stars) : that.stars != null) return false;
        if (distribution != null ? !distribution.equals(that.distribution) : that.distribution != null) return false;
        if (idKlientGroup != null ? !idKlientGroup.equals(that.idKlientGroup) : that.idKlientGroup != null)
            return false;
        if (passportSeria != null ? !passportSeria.equals(that.passportSeria) : that.passportSeria != null)
            return false;
        if (passportOut != null ? !passportOut.equals(that.passportOut) : that.passportOut != null) return false;
        if (passportOutDate != null ? !passportOutDate.equals(that.passportOutDate) : that.passportOutDate != null)
            return false;
        if (passportOutDateOk != null ? !passportOutDateOk.equals(that.passportOutDateOk) : that.passportOutDateOk != null)
            return false;
        if (sPassportNumber != null ? !sPassportNumber.equals(that.sPassportNumber) : that.sPassportNumber != null)
            return false;
        if (sPassportSeria != null ? !sPassportSeria.equals(that.sPassportSeria) : that.sPassportSeria != null)
            return false;
        if (sPassportOut != null ? !sPassportOut.equals(that.sPassportOut) : that.sPassportOut != null) return false;
        if (sPassportOutDate != null ? !sPassportOutDate.equals(that.sPassportOutDate) : that.sPassportOutDate != null)
            return false;
        if (sPassportOutDateOk != null ? !sPassportOutDateOk.equals(that.sPassportOutDateOk) : that.sPassportOutDateOk != null)
            return false;
        if (createdEvent != null ? !createdEvent.equals(that.createdEvent) : that.createdEvent != null) return false;
        if (idCallCreator != null ? !idCallCreator.equals(that.idCallCreator) : that.idCallCreator != null)
            return false;
        if (algoritm != null ? !algoritm.equals(that.algoritm) : that.algoritm != null) return false;
        if (birdaymem != null ? !birdaymem.equals(that.birdaymem) : that.birdaymem != null) return false;
        if (godenDoOk != null ? !godenDoOk.equals(that.godenDoOk) : that.godenDoOk != null) return false;
        if (godenDo != null ? !godenDo.equals(that.godenDo) : that.godenDo != null) return false;
        if (autoopen != null ? !autoopen.equals(that.autoopen) : that.autoopen != null) return false;
        if (psevdonim != null ? !psevdonim.equals(that.psevdonim) : that.psevdonim != null) return false;
        if (miniQuest != null ? !miniQuest.equals(that.miniQuest) : that.miniQuest != null) return false;
        if (discountCard != null ? !discountCard.equals(that.discountCard) : that.discountCard != null) return false;
        if (noSms != null ? !noSms.equals(that.noSms) : that.noSms != null) return false;
        if (name2 != null ? !name2.equals(that.name2) : that.name2 != null) return false;
        if (famaly2 != null ? !famaly2.equals(that.famaly2) : that.famaly2 != null) return false;
        if (patronymic2 != null ? !patronymic2.equals(that.patronymic2) : that.patronymic2 != null) return false;
        if (lastDateCallIn != null ? !lastDateCallIn.equals(that.lastDateCallIn) : that.lastDateCallIn != null)
            return false;
        if (lastDateCallOut != null ? !lastDateCallOut.equals(that.lastDateCallOut) : that.lastDateCallOut != null)
            return false;
        if (lastDateContakt != null ? !lastDateContakt.equals(that.lastDateContakt) : that.lastDateContakt != null)
            return false;
        if (callInCount != null ? !callInCount.equals(that.callInCount) : that.callInCount != null) return false;
        if (callOutCount != null ? !callOutCount.equals(that.callOutCount) : that.callOutCount != null) return false;
        if (smsCount != null ? !smsCount.equals(that.smsCount) : that.smsCount != null) return false;
        if (sPasportGodenDoReminder != null ? !sPasportGodenDoReminder.equals(that.sPasportGodenDoReminder) : that.sPasportGodenDoReminder != null)
            return false;
        if (filescount != null ? !filescount.equals(that.filescount) : that.filescount != null) return false;
        if (taskCount != null ? !taskCount.equals(that.taskCount) : that.taskCount != null) return false;
        if (buyingCount != null ? !buyingCount.equals(that.buyingCount) : that.buyingCount != null) return false;
        if (grasdanstvo != null ? !grasdanstvo.equals(that.grasdanstvo) : that.grasdanstvo != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (fatherAnketUnionId != null ? !fatherAnketUnionId.equals(that.fatherAnketUnionId) : that.fatherAnketUnionId != null)
            return false;
        if (canDeleted != null ? !canDeleted.equals(that.canDeleted) : that.canDeleted != null) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobTitle != null ? !jobTitle.equals(that.jobTitle) : that.jobTitle != null) return false;
        if (jobPosition != null ? !jobPosition.equals(that.jobPosition) : that.jobPosition != null) return false;
        if (directorCompany != null ? !directorCompany.equals(that.directorCompany) : that.directorCompany != null)
            return false;
        if (lastbuyingdte != null ? !lastbuyingdte.equals(that.lastbuyingdte) : that.lastbuyingdte != null)
            return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
        if (bik != null ? !bik.equals(that.bik) : that.bik != null) return false;
        if (rs != null ? !rs.equals(that.rs) : that.rs != null) return false;
        if (ks != null ? !ks.equals(that.ks) : that.ks != null) return false;
        if (!Arrays.equals(avatarData, that.avatarData)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (famaly != null ? famaly.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (dateOld != null ? dateOld.hashCode() : 0);
        result = 31 * result + (recordCreateDate != null ? recordCreateDate.hashCode() : 0);
        result = 31 * result + (idManagerCreater != null ? idManagerCreater.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (saveDateOld != null ? saveDateOld.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (dopinfo != null ? dopinfo.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (adressStreet != null ? adressStreet.hashCode() : 0);
        result = 31 * result + (adressNumberHaus != null ? adressNumberHaus.hashCode() : 0);
        result = 31 * result + (adressNumberRoom != null ? adressNumberRoom.hashCode() : 0);
        result = 31 * result + (indexAdress != null ? indexAdress.hashCode() : 0);
        result = 31 * result + (reklama != null ? reklama.hashCode() : 0);
        result = 31 * result + (stars != null ? stars.hashCode() : 0);
        result = 31 * result + (distribution != null ? distribution.hashCode() : 0);
        result = 31 * result + (idKlientGroup != null ? idKlientGroup.hashCode() : 0);
        result = 31 * result + (passportSeria != null ? passportSeria.hashCode() : 0);
        result = 31 * result + (passportOut != null ? passportOut.hashCode() : 0);
        result = 31 * result + (passportOutDate != null ? passportOutDate.hashCode() : 0);
        result = 31 * result + (passportOutDateOk != null ? passportOutDateOk.hashCode() : 0);
        result = 31 * result + (sPassportNumber != null ? sPassportNumber.hashCode() : 0);
        result = 31 * result + (sPassportSeria != null ? sPassportSeria.hashCode() : 0);
        result = 31 * result + (sPassportOut != null ? sPassportOut.hashCode() : 0);
        result = 31 * result + (sPassportOutDate != null ? sPassportOutDate.hashCode() : 0);
        result = 31 * result + (sPassportOutDateOk != null ? sPassportOutDateOk.hashCode() : 0);
        result = 31 * result + (createdEvent != null ? createdEvent.hashCode() : 0);
        result = 31 * result + (idCallCreator != null ? idCallCreator.hashCode() : 0);
        result = 31 * result + (algoritm != null ? algoritm.hashCode() : 0);
        result = 31 * result + (birdaymem != null ? birdaymem.hashCode() : 0);
        result = 31 * result + (godenDoOk != null ? godenDoOk.hashCode() : 0);
        result = 31 * result + (godenDo != null ? godenDo.hashCode() : 0);
        result = 31 * result + (autoopen != null ? autoopen.hashCode() : 0);
        result = 31 * result + (psevdonim != null ? psevdonim.hashCode() : 0);
        result = 31 * result + (miniQuest != null ? miniQuest.hashCode() : 0);
        result = 31 * result + (discountCard != null ? discountCard.hashCode() : 0);
        result = 31 * result + (noSms != null ? noSms.hashCode() : 0);
        result = 31 * result + (name2 != null ? name2.hashCode() : 0);
        result = 31 * result + (famaly2 != null ? famaly2.hashCode() : 0);
        result = 31 * result + (patronymic2 != null ? patronymic2.hashCode() : 0);
        result = 31 * result + (lastDateCallIn != null ? lastDateCallIn.hashCode() : 0);
        result = 31 * result + (lastDateCallOut != null ? lastDateCallOut.hashCode() : 0);
        result = 31 * result + (lastDateContakt != null ? lastDateContakt.hashCode() : 0);
        result = 31 * result + (callInCount != null ? callInCount.hashCode() : 0);
        result = 31 * result + (callOutCount != null ? callOutCount.hashCode() : 0);
        result = 31 * result + (smsCount != null ? smsCount.hashCode() : 0);
        result = 31 * result + (sPasportGodenDoReminder != null ? sPasportGodenDoReminder.hashCode() : 0);
        result = 31 * result + (filescount != null ? filescount.hashCode() : 0);
        result = 31 * result + (taskCount != null ? taskCount.hashCode() : 0);
        result = 31 * result + (buyingCount != null ? buyingCount.hashCode() : 0);
        result = 31 * result + (grasdanstvo != null ? grasdanstvo.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (fatherAnketUnionId != null ? fatherAnketUnionId.hashCode() : 0);
        result = 31 * result + (canDeleted != null ? canDeleted.hashCode() : 0);
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        result = 31 * result + (jobPosition != null ? jobPosition.hashCode() : 0);
        result = 31 * result + (directorCompany != null ? directorCompany.hashCode() : 0);
        result = 31 * result + (lastbuyingdte != null ? lastbuyingdte.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (bik != null ? bik.hashCode() : 0);
        result = 31 * result + (rs != null ? rs.hashCode() : 0);
        result = 31 * result + (ks != null ? ks.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(avatarData);
        return result;
    }
}
