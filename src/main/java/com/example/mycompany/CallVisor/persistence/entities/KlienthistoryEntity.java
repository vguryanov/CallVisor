package com.example.mycompany.CallVisor.persistence.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by User2 on 21.08.2018.
 */
@Entity
@Table(name = "klienthistory", schema = "dbo", catalog = "Aloho")
public class KlienthistoryEntity {
    private String id;
    private Boolean deleted;
    private Boolean rimindebackdate;
    private Boolean rimindevojagedate;
    private Boolean tourcomplete;
    private Boolean touroperatormomey;
    private Boolean documentKlientComplete;
    private Boolean inTour;
    private Boolean priority;
    private Boolean outTour;
    private Boolean taskclose;
    private String taskclosemotiv;
    private String idHotel;
    private String idCountry;
    private Timestamp createDate;
    private Timestamp vojageDate;
    private Timestamp backDate;
    private Integer dayCount;
    private Integer places;
    private Double price;
    private Double totalPriceIn;
    private String dopInfo;
    private String idManager;
    private String theme;
    private Timestamp dateTimeStart;
    private Timestamp dateTimeEnd;
    private String idKlient;
    private Timestamp buyingDate;
    private Boolean buyingOk;
    private Timestamp closeDate;
    private String startcountry;
    private String returncountry;
    private String resort;
    private String dogovorNumber;
    private int ident;
    private Timestamp endMoneyDate;
    private String tourType;
    private String idTaskGroup;
    private String state;
    private String idTaskOtherProgram;
    private Integer children;
    private Integer child1;
    private Integer child2;
    private Integer child3;
    private Integer child4;
    private Boolean hotelCategory2;
    private Boolean hotelCategory3;
    private Boolean hotelCategory4;
    private Boolean hotelCategory5;
    private String idfoodtype;
    private String extrafield1;
    private Boolean errorState;
    private String partnerManagerId;
    private String reklama;
    private Boolean hotelcategory1;
    private Boolean archive;
    private Integer taskCloseMotivState;
    private String discountCardId;
    private String createdEvent;
    private Double avans;
    private Integer discountValue;
    private String otherSystemNumber;
    private Boolean isBooking;
    private String currencyId;
    private Boolean isCurrency;
    private Double price2;
    private Double totalPriceIn2;
    private Double percentCurrency;
    private Timestamp tourCompleteDate;
    private Double avans2;
    private Double avans2CurrencyValue;
    private String companyId;
    private String location;
    private Boolean isExport1C;
    private Boolean returnedBying;
    private Integer buyingType;
    private Timestamp lastMoneyDate;
    private Integer buyingCount;
    private String callId;
    private String polsaNumber;
    private Boolean isPolsaUsed;
    private Double polsaAnnulation;
    private Double polsaUnnulation;
    private String endBuyingId;
    private String endBuyingToid;
    private String endBuyingPolsaId;
    private String fatherTaskId;
    private String buyingTypeSt;
    private Boolean doplataRecalcType;
    private Double buyingCurrencyValue;
    private String buyingTypeStr;
    private String poolId;
    private Integer currencyType;
    private String presentId;
    private String spListId;
    private Double vosvratMoney;

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
    @Column(name = "rimindebackdate", nullable = true)
    public Boolean getRimindebackdate() {
        return rimindebackdate;
    }

    public void setRimindebackdate(Boolean rimindebackdate) {
        this.rimindebackdate = rimindebackdate;
    }

    @Basic
    @Column(name = "rimindevojagedate", nullable = true)
    public Boolean getRimindevojagedate() {
        return rimindevojagedate;
    }

    public void setRimindevojagedate(Boolean rimindevojagedate) {
        this.rimindevojagedate = rimindevojagedate;
    }

    @Basic
    @Column(name = "tourcomplete", nullable = true)
    public Boolean getTourcomplete() {
        return tourcomplete;
    }

    public void setTourcomplete(Boolean tourcomplete) {
        this.tourcomplete = tourcomplete;
    }

    @Basic
    @Column(name = "touroperatormomey", nullable = true)
    public Boolean getTouroperatormomey() {
        return touroperatormomey;
    }

    public void setTouroperatormomey(Boolean touroperatormomey) {
        this.touroperatormomey = touroperatormomey;
    }

    @Basic
    @Column(name = "DocumentKlientComplete", nullable = true)
    public Boolean getDocumentKlientComplete() {
        return documentKlientComplete;
    }

    public void setDocumentKlientComplete(Boolean documentKlientComplete) {
        this.documentKlientComplete = documentKlientComplete;
    }

    @Basic
    @Column(name = "inTour", nullable = true)
    public Boolean getInTour() {
        return inTour;
    }

    public void setInTour(Boolean inTour) {
        this.inTour = inTour;
    }

    @Basic
    @Column(name = "priority", nullable = true)
    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "outTour", nullable = true)
    public Boolean getOutTour() {
        return outTour;
    }

    public void setOutTour(Boolean outTour) {
        this.outTour = outTour;
    }

    @Basic
    @Column(name = "taskclose", nullable = true)
    public Boolean getTaskclose() {
        return taskclose;
    }

    public void setTaskclose(Boolean taskclose) {
        this.taskclose = taskclose;
    }

    @Basic
    @Column(name = "taskclosemotiv", nullable = true, length = 400)
    public String getTaskclosemotiv() {
        return taskclosemotiv;
    }

    public void setTaskclosemotiv(String taskclosemotiv) {
        this.taskclosemotiv = taskclosemotiv;
    }

    @Basic
    @Column(name = "idHotel", nullable = true, length = 300)
    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    @Basic
    @Column(name = "idCountry", nullable = true, length = 300)
    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "vojageDate", nullable = true)
    public Timestamp getVojageDate() {
        return vojageDate;
    }

    public void setVojageDate(Timestamp vojageDate) {
        this.vojageDate = vojageDate;
    }

    @Basic
    @Column(name = "backDate", nullable = true)
    public Timestamp getBackDate() {
        return backDate;
    }

    public void setBackDate(Timestamp backDate) {
        this.backDate = backDate;
    }

    @Basic
    @Column(name = "dayCount", nullable = true)
    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    @Basic
    @Column(name = "places", nullable = true)
    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "TotalPriceIn", nullable = true, precision = 0)
    public Double getTotalPriceIn() {
        return totalPriceIn;
    }

    public void setTotalPriceIn(Double totalPriceIn) {
        this.totalPriceIn = totalPriceIn;
    }

    @Basic
    @Column(name = "dopInfo", nullable = true, length = 4000)
    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
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
    @Column(name = "theme", nullable = true, length = 100)
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    @Column(name = "dateTimeStart", nullable = true)
    public Timestamp getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(Timestamp dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    @Basic
    @Column(name = "dateTimeEnd", nullable = true)
    public Timestamp getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(Timestamp dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }

    @Basic
    @Column(name = "idKlient", nullable = true, length = 40)
    public String getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(String idKlient) {
        this.idKlient = idKlient;
    }

    @Basic
    @Column(name = "BuyingDate", nullable = true)
    public Timestamp getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Timestamp buyingDate) {
        this.buyingDate = buyingDate;
    }

    @Basic
    @Column(name = "BuyingOK", nullable = true)
    public Boolean getBuyingOk() {
        return buyingOk;
    }

    public void setBuyingOk(Boolean buyingOk) {
        this.buyingOk = buyingOk;
    }

    @Basic
    @Column(name = "CloseDate", nullable = true)
    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }

    @Basic
    @Column(name = "startcountry", nullable = true, length = 300)
    public String getStartcountry() {
        return startcountry;
    }

    public void setStartcountry(String startcountry) {
        this.startcountry = startcountry;
    }

    @Basic
    @Column(name = "returncountry", nullable = true, length = 300)
    public String getReturncountry() {
        return returncountry;
    }

    public void setReturncountry(String returncountry) {
        this.returncountry = returncountry;
    }

    @Basic
    @Column(name = "Resort", nullable = true, length = 300)
    public String getResort() {
        return resort;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    @Basic
    @Column(name = "DogovorNumber", nullable = true, length = 20)
    public String getDogovorNumber() {
        return dogovorNumber;
    }

    public void setDogovorNumber(String dogovorNumber) {
        this.dogovorNumber = dogovorNumber;
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
    @Column(name = "EndMoneyDate", nullable = true)
    public Timestamp getEndMoneyDate() {
        return endMoneyDate;
    }

    public void setEndMoneyDate(Timestamp endMoneyDate) {
        this.endMoneyDate = endMoneyDate;
    }

    @Basic
    @Column(name = "TourType", nullable = true, length = 100)
    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    @Basic
    @Column(name = "IdTaskGroup", nullable = true, length = 40)
    public String getIdTaskGroup() {
        return idTaskGroup;
    }

    public void setIdTaskGroup(String idTaskGroup) {
        this.idTaskGroup = idTaskGroup;
    }

    @Basic
    @Column(name = "State", nullable = true, length = 20)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "IdTaskOtherProgram", nullable = true, length = 40)
    public String getIdTaskOtherProgram() {
        return idTaskOtherProgram;
    }

    public void setIdTaskOtherProgram(String idTaskOtherProgram) {
        this.idTaskOtherProgram = idTaskOtherProgram;
    }

    @Basic
    @Column(name = "children", nullable = true)
    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    @Basic
    @Column(name = "child1", nullable = true)
    public Integer getChild1() {
        return child1;
    }

    public void setChild1(Integer child1) {
        this.child1 = child1;
    }

    @Basic
    @Column(name = "child2", nullable = true)
    public Integer getChild2() {
        return child2;
    }

    public void setChild2(Integer child2) {
        this.child2 = child2;
    }

    @Basic
    @Column(name = "child3", nullable = true)
    public Integer getChild3() {
        return child3;
    }

    public void setChild3(Integer child3) {
        this.child3 = child3;
    }

    @Basic
    @Column(name = "child4", nullable = true)
    public Integer getChild4() {
        return child4;
    }

    public void setChild4(Integer child4) {
        this.child4 = child4;
    }

    @Basic
    @Column(name = "hotelCategory2", nullable = true)
    public Boolean getHotelCategory2() {
        return hotelCategory2;
    }

    public void setHotelCategory2(Boolean hotelCategory2) {
        this.hotelCategory2 = hotelCategory2;
    }

    @Basic
    @Column(name = "hotelCategory3", nullable = true)
    public Boolean getHotelCategory3() {
        return hotelCategory3;
    }

    public void setHotelCategory3(Boolean hotelCategory3) {
        this.hotelCategory3 = hotelCategory3;
    }

    @Basic
    @Column(name = "hotelCategory4", nullable = true)
    public Boolean getHotelCategory4() {
        return hotelCategory4;
    }

    public void setHotelCategory4(Boolean hotelCategory4) {
        this.hotelCategory4 = hotelCategory4;
    }

    @Basic
    @Column(name = "hotelCategory5", nullable = true)
    public Boolean getHotelCategory5() {
        return hotelCategory5;
    }

    public void setHotelCategory5(Boolean hotelCategory5) {
        this.hotelCategory5 = hotelCategory5;
    }

    @Basic
    @Column(name = "idfoodtype", nullable = true, length = 40)
    public String getIdfoodtype() {
        return idfoodtype;
    }

    public void setIdfoodtype(String idfoodtype) {
        this.idfoodtype = idfoodtype;
    }

    @Basic
    @Column(name = "extrafield1", nullable = true, length = 300)
    public String getExtrafield1() {
        return extrafield1;
    }

    public void setExtrafield1(String extrafield1) {
        this.extrafield1 = extrafield1;
    }

    @Basic
    @Column(name = "ErrorState", nullable = true)
    public Boolean getErrorState() {
        return errorState;
    }

    public void setErrorState(Boolean errorState) {
        this.errorState = errorState;
    }

    @Basic
    @Column(name = "PartnerManagerID", nullable = true, length = 40)
    public String getPartnerManagerId() {
        return partnerManagerId;
    }

    public void setPartnerManagerId(String partnerManagerId) {
        this.partnerManagerId = partnerManagerId;
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
    @Column(name = "hotelcategory1", nullable = true)
    public Boolean getHotelcategory1() {
        return hotelcategory1;
    }

    public void setHotelcategory1(Boolean hotelcategory1) {
        this.hotelcategory1 = hotelcategory1;
    }

    @Basic
    @Column(name = "archive", nullable = true)
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Basic
    @Column(name = "TaskCloseMotivState", nullable = true)
    public Integer getTaskCloseMotivState() {
        return taskCloseMotivState;
    }

    public void setTaskCloseMotivState(Integer taskCloseMotivState) {
        this.taskCloseMotivState = taskCloseMotivState;
    }

    @Basic
    @Column(name = "DiscountCardID", nullable = true, length = 50)
    public String getDiscountCardId() {
        return discountCardId;
    }

    public void setDiscountCardId(String discountCardId) {
        this.discountCardId = discountCardId;
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
    @Column(name = "avans", nullable = true, precision = 0)
    public Double getAvans() {
        return avans;
    }

    public void setAvans(Double avans) {
        this.avans = avans;
    }

    @Basic
    @Column(name = "DiscountValue", nullable = true)
    public Integer getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    @Basic
    @Column(name = "OtherSystemNumber", nullable = true, length = 40)
    public String getOtherSystemNumber() {
        return otherSystemNumber;
    }

    public void setOtherSystemNumber(String otherSystemNumber) {
        this.otherSystemNumber = otherSystemNumber;
    }

    @Basic
    @Column(name = "IsBooking", nullable = true)
    public Boolean getIsBooking() {
        return isBooking;
    }

    public void setIsBooking(Boolean booking) {
        isBooking = booking;
    }

    @Basic
    @Column(name = "CurrencyID", nullable = true, length = 40)
    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    @Basic
    @Column(name = "IsCurrency", nullable = true)
    public Boolean getIsCurrency() {
        return isCurrency;
    }

    public void setIsCurrency(Boolean currency) {
        isCurrency = currency;
    }

    @Basic
    @Column(name = "Price2", nullable = true, precision = 0)
    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    @Basic
    @Column(name = "TotalPriceIn2", nullable = true, precision = 0)
    public Double getTotalPriceIn2() {
        return totalPriceIn2;
    }

    public void setTotalPriceIn2(Double totalPriceIn2) {
        this.totalPriceIn2 = totalPriceIn2;
    }

    @Basic
    @Column(name = "PercentCurrency", nullable = true, precision = 0)
    public Double getPercentCurrency() {
        return percentCurrency;
    }

    public void setPercentCurrency(Double percentCurrency) {
        this.percentCurrency = percentCurrency;
    }

    @Basic
    @Column(name = "TourCompleteDate", nullable = true)
    public Timestamp getTourCompleteDate() {
        return tourCompleteDate;
    }

    public void setTourCompleteDate(Timestamp tourCompleteDate) {
        this.tourCompleteDate = tourCompleteDate;
    }

    @Basic
    @Column(name = "avans2", nullable = true, precision = 0)
    public Double getAvans2() {
        return avans2;
    }

    public void setAvans2(Double avans2) {
        this.avans2 = avans2;
    }

    @Basic
    @Column(name = "Avans2CurrencyValue", nullable = true, precision = 0)
    public Double getAvans2CurrencyValue() {
        return avans2CurrencyValue;
    }

    public void setAvans2CurrencyValue(Double avans2CurrencyValue) {
        this.avans2CurrencyValue = avans2CurrencyValue;
    }

    @Basic
    @Column(name = "CompanyID", nullable = true, length = 40)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
    @Column(name = "IsExport1C", nullable = true)
    public Boolean getIsExport1C() {
        return isExport1C;
    }

    public void setIsExport1C(Boolean export1C) {
        isExport1C = export1C;
    }

    @Basic
    @Column(name = "ReturnedBying", nullable = true)
    public Boolean getReturnedBying() {
        return returnedBying;
    }

    public void setReturnedBying(Boolean returnedBying) {
        this.returnedBying = returnedBying;
    }

    @Basic
    @Column(name = "BuyingType", nullable = true)
    public Integer getBuyingType() {
        return buyingType;
    }

    public void setBuyingType(Integer buyingType) {
        this.buyingType = buyingType;
    }

    @Basic
    @Column(name = "LastMoneyDate", nullable = true)
    public Timestamp getLastMoneyDate() {
        return lastMoneyDate;
    }

    public void setLastMoneyDate(Timestamp lastMoneyDate) {
        this.lastMoneyDate = lastMoneyDate;
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
    @Column(name = "CallID", nullable = true, length = 40)
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    @Basic
    @Column(name = "PolsaNumber", nullable = true, length = 40)
    public String getPolsaNumber() {
        return polsaNumber;
    }

    public void setPolsaNumber(String polsaNumber) {
        this.polsaNumber = polsaNumber;
    }

    @Basic
    @Column(name = "IsPolsaUsed", nullable = true)
    public Boolean getIsPolsaUsed() {
        return isPolsaUsed;
    }

    public void setIsPolsaUsed(Boolean polsaUsed) {
        isPolsaUsed = polsaUsed;
    }

    @Basic
    @Column(name = "PolsaAnnulation", nullable = true, precision = 0)
    public Double getPolsaAnnulation() {
        return polsaAnnulation;
    }

    public void setPolsaAnnulation(Double polsaAnnulation) {
        this.polsaAnnulation = polsaAnnulation;
    }

    @Basic
    @Column(name = "PolsaUnnulation", nullable = true, precision = 0)
    public Double getPolsaUnnulation() {
        return polsaUnnulation;
    }

    public void setPolsaUnnulation(Double polsaUnnulation) {
        this.polsaUnnulation = polsaUnnulation;
    }

    @Basic
    @Column(name = "EndBuyingID", nullable = true, length = 40)
    public String getEndBuyingId() {
        return endBuyingId;
    }

    public void setEndBuyingId(String endBuyingId) {
        this.endBuyingId = endBuyingId;
    }

    @Basic
    @Column(name = "EndBuyingTOID", nullable = true, length = 40)
    public String getEndBuyingToid() {
        return endBuyingToid;
    }

    public void setEndBuyingToid(String endBuyingToid) {
        this.endBuyingToid = endBuyingToid;
    }

    @Basic
    @Column(name = "EndBuyingPolsaID", nullable = true, length = 40)
    public String getEndBuyingPolsaId() {
        return endBuyingPolsaId;
    }

    public void setEndBuyingPolsaId(String endBuyingPolsaId) {
        this.endBuyingPolsaId = endBuyingPolsaId;
    }

    @Basic
    @Column(name = "FatherTaskID", nullable = true, length = 40)
    public String getFatherTaskId() {
        return fatherTaskId;
    }

    public void setFatherTaskId(String fatherTaskId) {
        this.fatherTaskId = fatherTaskId;
    }

    @Basic
    @Column(name = "BuyingTypeSt", nullable = true, length = 100)
    public String getBuyingTypeSt() {
        return buyingTypeSt;
    }

    public void setBuyingTypeSt(String buyingTypeSt) {
        this.buyingTypeSt = buyingTypeSt;
    }

    @Basic
    @Column(name = "DoplataRecalcType", nullable = true)
    public Boolean getDoplataRecalcType() {
        return doplataRecalcType;
    }

    public void setDoplataRecalcType(Boolean doplataRecalcType) {
        this.doplataRecalcType = doplataRecalcType;
    }

    @Basic
    @Column(name = "BuyingCurrencyValue", nullable = true, precision = 0)
    public Double getBuyingCurrencyValue() {
        return buyingCurrencyValue;
    }

    public void setBuyingCurrencyValue(Double buyingCurrencyValue) {
        this.buyingCurrencyValue = buyingCurrencyValue;
    }

    @Basic
    @Column(name = "BuyingTypeStr", nullable = true, length = 200)
    public String getBuyingTypeStr() {
        return buyingTypeStr;
    }

    public void setBuyingTypeStr(String buyingTypeStr) {
        this.buyingTypeStr = buyingTypeStr;
    }

    @Basic
    @Column(name = "PoolID", nullable = true, length = 50)
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    @Basic
    @Column(name = "CurrencyType", nullable = true)
    public Integer getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Integer currencyType) {
        this.currencyType = currencyType;
    }

    @Basic
    @Column(name = "PresentID", nullable = true, length = 40)
    public String getPresentId() {
        return presentId;
    }

    public void setPresentId(String presentId) {
        this.presentId = presentId;
    }

    @Basic
    @Column(name = "SPListID", nullable = true, length = 40)
    public String getSpListId() {
        return spListId;
    }

    public void setSpListId(String spListId) {
        this.spListId = spListId;
    }

    @Basic
    @Column(name = "VosvratMoney", nullable = true, precision = 0)
    public Double getVosvratMoney() {
        return vosvratMoney;
    }

    public void setVosvratMoney(Double vosvratMoney) {
        this.vosvratMoney = vosvratMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KlienthistoryEntity that = (KlienthistoryEntity) o;

        if (ident != that.ident) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (rimindebackdate != null ? !rimindebackdate.equals(that.rimindebackdate) : that.rimindebackdate != null)
            return false;
        if (rimindevojagedate != null ? !rimindevojagedate.equals(that.rimindevojagedate) : that.rimindevojagedate != null)
            return false;
        if (tourcomplete != null ? !tourcomplete.equals(that.tourcomplete) : that.tourcomplete != null) return false;
        if (touroperatormomey != null ? !touroperatormomey.equals(that.touroperatormomey) : that.touroperatormomey != null)
            return false;
        if (documentKlientComplete != null ? !documentKlientComplete.equals(that.documentKlientComplete) : that.documentKlientComplete != null)
            return false;
        if (inTour != null ? !inTour.equals(that.inTour) : that.inTour != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (outTour != null ? !outTour.equals(that.outTour) : that.outTour != null) return false;
        if (taskclose != null ? !taskclose.equals(that.taskclose) : that.taskclose != null) return false;
        if (taskclosemotiv != null ? !taskclosemotiv.equals(that.taskclosemotiv) : that.taskclosemotiv != null)
            return false;
        if (idHotel != null ? !idHotel.equals(that.idHotel) : that.idHotel != null) return false;
        if (idCountry != null ? !idCountry.equals(that.idCountry) : that.idCountry != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (vojageDate != null ? !vojageDate.equals(that.vojageDate) : that.vojageDate != null) return false;
        if (backDate != null ? !backDate.equals(that.backDate) : that.backDate != null) return false;
        if (dayCount != null ? !dayCount.equals(that.dayCount) : that.dayCount != null) return false;
        if (places != null ? !places.equals(that.places) : that.places != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (totalPriceIn != null ? !totalPriceIn.equals(that.totalPriceIn) : that.totalPriceIn != null) return false;
        if (dopInfo != null ? !dopInfo.equals(that.dopInfo) : that.dopInfo != null) return false;
        if (idManager != null ? !idManager.equals(that.idManager) : that.idManager != null) return false;
        if (theme != null ? !theme.equals(that.theme) : that.theme != null) return false;
        if (dateTimeStart != null ? !dateTimeStart.equals(that.dateTimeStart) : that.dateTimeStart != null)
            return false;
        if (dateTimeEnd != null ? !dateTimeEnd.equals(that.dateTimeEnd) : that.dateTimeEnd != null) return false;
        if (idKlient != null ? !idKlient.equals(that.idKlient) : that.idKlient != null) return false;
        if (buyingDate != null ? !buyingDate.equals(that.buyingDate) : that.buyingDate != null) return false;
        if (buyingOk != null ? !buyingOk.equals(that.buyingOk) : that.buyingOk != null) return false;
        if (closeDate != null ? !closeDate.equals(that.closeDate) : that.closeDate != null) return false;
        if (startcountry != null ? !startcountry.equals(that.startcountry) : that.startcountry != null) return false;
        if (returncountry != null ? !returncountry.equals(that.returncountry) : that.returncountry != null)
            return false;
        if (resort != null ? !resort.equals(that.resort) : that.resort != null) return false;
        if (dogovorNumber != null ? !dogovorNumber.equals(that.dogovorNumber) : that.dogovorNumber != null)
            return false;
        if (endMoneyDate != null ? !endMoneyDate.equals(that.endMoneyDate) : that.endMoneyDate != null) return false;
        if (tourType != null ? !tourType.equals(that.tourType) : that.tourType != null) return false;
        if (idTaskGroup != null ? !idTaskGroup.equals(that.idTaskGroup) : that.idTaskGroup != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (idTaskOtherProgram != null ? !idTaskOtherProgram.equals(that.idTaskOtherProgram) : that.idTaskOtherProgram != null)
            return false;
        if (children != null ? !children.equals(that.children) : that.children != null) return false;
        if (child1 != null ? !child1.equals(that.child1) : that.child1 != null) return false;
        if (child2 != null ? !child2.equals(that.child2) : that.child2 != null) return false;
        if (child3 != null ? !child3.equals(that.child3) : that.child3 != null) return false;
        if (child4 != null ? !child4.equals(that.child4) : that.child4 != null) return false;
        if (hotelCategory2 != null ? !hotelCategory2.equals(that.hotelCategory2) : that.hotelCategory2 != null)
            return false;
        if (hotelCategory3 != null ? !hotelCategory3.equals(that.hotelCategory3) : that.hotelCategory3 != null)
            return false;
        if (hotelCategory4 != null ? !hotelCategory4.equals(that.hotelCategory4) : that.hotelCategory4 != null)
            return false;
        if (hotelCategory5 != null ? !hotelCategory5.equals(that.hotelCategory5) : that.hotelCategory5 != null)
            return false;
        if (idfoodtype != null ? !idfoodtype.equals(that.idfoodtype) : that.idfoodtype != null) return false;
        if (extrafield1 != null ? !extrafield1.equals(that.extrafield1) : that.extrafield1 != null) return false;
        if (errorState != null ? !errorState.equals(that.errorState) : that.errorState != null) return false;
        if (partnerManagerId != null ? !partnerManagerId.equals(that.partnerManagerId) : that.partnerManagerId != null)
            return false;
        if (reklama != null ? !reklama.equals(that.reklama) : that.reklama != null) return false;
        if (hotelcategory1 != null ? !hotelcategory1.equals(that.hotelcategory1) : that.hotelcategory1 != null)
            return false;
        if (archive != null ? !archive.equals(that.archive) : that.archive != null) return false;
        if (taskCloseMotivState != null ? !taskCloseMotivState.equals(that.taskCloseMotivState) : that.taskCloseMotivState != null)
            return false;
        if (discountCardId != null ? !discountCardId.equals(that.discountCardId) : that.discountCardId != null)
            return false;
        if (createdEvent != null ? !createdEvent.equals(that.createdEvent) : that.createdEvent != null) return false;
        if (avans != null ? !avans.equals(that.avans) : that.avans != null) return false;
        if (discountValue != null ? !discountValue.equals(that.discountValue) : that.discountValue != null)
            return false;
        if (otherSystemNumber != null ? !otherSystemNumber.equals(that.otherSystemNumber) : that.otherSystemNumber != null)
            return false;
        if (currencyId != null ? !currencyId.equals(that.currencyId) : that.currencyId != null) return false;
        if (price2 != null ? !price2.equals(that.price2) : that.price2 != null) return false;
        if (totalPriceIn2 != null ? !totalPriceIn2.equals(that.totalPriceIn2) : that.totalPriceIn2 != null)
            return false;
        if (percentCurrency != null ? !percentCurrency.equals(that.percentCurrency) : that.percentCurrency != null)
            return false;
        if (tourCompleteDate != null ? !tourCompleteDate.equals(that.tourCompleteDate) : that.tourCompleteDate != null)
            return false;
        if (avans2 != null ? !avans2.equals(that.avans2) : that.avans2 != null) return false;
        if (avans2CurrencyValue != null ? !avans2CurrencyValue.equals(that.avans2CurrencyValue) : that.avans2CurrencyValue != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (returnedBying != null ? !returnedBying.equals(that.returnedBying) : that.returnedBying != null)
            return false;
        if (buyingType != null ? !buyingType.equals(that.buyingType) : that.buyingType != null) return false;
        if (lastMoneyDate != null ? !lastMoneyDate.equals(that.lastMoneyDate) : that.lastMoneyDate != null)
            return false;
        if (buyingCount != null ? !buyingCount.equals(that.buyingCount) : that.buyingCount != null) return false;
        if (callId != null ? !callId.equals(that.callId) : that.callId != null) return false;
        if (polsaNumber != null ? !polsaNumber.equals(that.polsaNumber) : that.polsaNumber != null) return false;
        if (polsaAnnulation != null ? !polsaAnnulation.equals(that.polsaAnnulation) : that.polsaAnnulation != null)
            return false;
        if (polsaUnnulation != null ? !polsaUnnulation.equals(that.polsaUnnulation) : that.polsaUnnulation != null)
            return false;
        if (endBuyingId != null ? !endBuyingId.equals(that.endBuyingId) : that.endBuyingId != null) return false;
        if (endBuyingToid != null ? !endBuyingToid.equals(that.endBuyingToid) : that.endBuyingToid != null)
            return false;
        if (endBuyingPolsaId != null ? !endBuyingPolsaId.equals(that.endBuyingPolsaId) : that.endBuyingPolsaId != null)
            return false;
        if (fatherTaskId != null ? !fatherTaskId.equals(that.fatherTaskId) : that.fatherTaskId != null) return false;
        if (buyingTypeSt != null ? !buyingTypeSt.equals(that.buyingTypeSt) : that.buyingTypeSt != null) return false;
        if (doplataRecalcType != null ? !doplataRecalcType.equals(that.doplataRecalcType) : that.doplataRecalcType != null)
            return false;
        if (buyingCurrencyValue != null ? !buyingCurrencyValue.equals(that.buyingCurrencyValue) : that.buyingCurrencyValue != null)
            return false;
        if (buyingTypeStr != null ? !buyingTypeStr.equals(that.buyingTypeStr) : that.buyingTypeStr != null)
            return false;
        if (poolId != null ? !poolId.equals(that.poolId) : that.poolId != null) return false;
        if (currencyType != null ? !currencyType.equals(that.currencyType) : that.currencyType != null) return false;
        if (presentId != null ? !presentId.equals(that.presentId) : that.presentId != null) return false;
        if (spListId != null ? !spListId.equals(that.spListId) : that.spListId != null) return false;
        if (vosvratMoney != null ? !vosvratMoney.equals(that.vosvratMoney) : that.vosvratMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (rimindebackdate != null ? rimindebackdate.hashCode() : 0);
        result = 31 * result + (rimindevojagedate != null ? rimindevojagedate.hashCode() : 0);
        result = 31 * result + (tourcomplete != null ? tourcomplete.hashCode() : 0);
        result = 31 * result + (touroperatormomey != null ? touroperatormomey.hashCode() : 0);
        result = 31 * result + (documentKlientComplete != null ? documentKlientComplete.hashCode() : 0);
        result = 31 * result + (inTour != null ? inTour.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (outTour != null ? outTour.hashCode() : 0);
        result = 31 * result + (taskclose != null ? taskclose.hashCode() : 0);
        result = 31 * result + (taskclosemotiv != null ? taskclosemotiv.hashCode() : 0);
        result = 31 * result + (idHotel != null ? idHotel.hashCode() : 0);
        result = 31 * result + (idCountry != null ? idCountry.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (vojageDate != null ? vojageDate.hashCode() : 0);
        result = 31 * result + (backDate != null ? backDate.hashCode() : 0);
        result = 31 * result + (dayCount != null ? dayCount.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (totalPriceIn != null ? totalPriceIn.hashCode() : 0);
        result = 31 * result + (dopInfo != null ? dopInfo.hashCode() : 0);
        result = 31 * result + (idManager != null ? idManager.hashCode() : 0);
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (dateTimeStart != null ? dateTimeStart.hashCode() : 0);
        result = 31 * result + (dateTimeEnd != null ? dateTimeEnd.hashCode() : 0);
        result = 31 * result + (idKlient != null ? idKlient.hashCode() : 0);
        result = 31 * result + (buyingDate != null ? buyingDate.hashCode() : 0);
        result = 31 * result + (buyingOk != null ? buyingOk.hashCode() : 0);
        result = 31 * result + (closeDate != null ? closeDate.hashCode() : 0);
        result = 31 * result + (startcountry != null ? startcountry.hashCode() : 0);
        result = 31 * result + (returncountry != null ? returncountry.hashCode() : 0);
        result = 31 * result + (resort != null ? resort.hashCode() : 0);
        result = 31 * result + (dogovorNumber != null ? dogovorNumber.hashCode() : 0);
        result = 31 * result + ident;
        result = 31 * result + (endMoneyDate != null ? endMoneyDate.hashCode() : 0);
        result = 31 * result + (tourType != null ? tourType.hashCode() : 0);
        result = 31 * result + (idTaskGroup != null ? idTaskGroup.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (idTaskOtherProgram != null ? idTaskOtherProgram.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        result = 31 * result + (child1 != null ? child1.hashCode() : 0);
        result = 31 * result + (child2 != null ? child2.hashCode() : 0);
        result = 31 * result + (child3 != null ? child3.hashCode() : 0);
        result = 31 * result + (child4 != null ? child4.hashCode() : 0);
        result = 31 * result + (hotelCategory2 != null ? hotelCategory2.hashCode() : 0);
        result = 31 * result + (hotelCategory3 != null ? hotelCategory3.hashCode() : 0);
        result = 31 * result + (hotelCategory4 != null ? hotelCategory4.hashCode() : 0);
        result = 31 * result + (hotelCategory5 != null ? hotelCategory5.hashCode() : 0);
        result = 31 * result + (idfoodtype != null ? idfoodtype.hashCode() : 0);
        result = 31 * result + (extrafield1 != null ? extrafield1.hashCode() : 0);
        result = 31 * result + (errorState != null ? errorState.hashCode() : 0);
        result = 31 * result + (partnerManagerId != null ? partnerManagerId.hashCode() : 0);
        result = 31 * result + (reklama != null ? reklama.hashCode() : 0);
        result = 31 * result + (hotelcategory1 != null ? hotelcategory1.hashCode() : 0);
        result = 31 * result + (archive != null ? archive.hashCode() : 0);
        result = 31 * result + (taskCloseMotivState != null ? taskCloseMotivState.hashCode() : 0);
        result = 31 * result + (discountCardId != null ? discountCardId.hashCode() : 0);
        result = 31 * result + (createdEvent != null ? createdEvent.hashCode() : 0);
        result = 31 * result + (avans != null ? avans.hashCode() : 0);
        result = 31 * result + (discountValue != null ? discountValue.hashCode() : 0);
        result = 31 * result + (otherSystemNumber != null ? otherSystemNumber.hashCode() : 0);
        result = 31 * result + (currencyId != null ? currencyId.hashCode() : 0);
        result = 31 * result + (price2 != null ? price2.hashCode() : 0);
        result = 31 * result + (totalPriceIn2 != null ? totalPriceIn2.hashCode() : 0);
        result = 31 * result + (percentCurrency != null ? percentCurrency.hashCode() : 0);
        result = 31 * result + (tourCompleteDate != null ? tourCompleteDate.hashCode() : 0);
        result = 31 * result + (avans2 != null ? avans2.hashCode() : 0);
        result = 31 * result + (avans2CurrencyValue != null ? avans2CurrencyValue.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (returnedBying != null ? returnedBying.hashCode() : 0);
        result = 31 * result + (buyingType != null ? buyingType.hashCode() : 0);
        result = 31 * result + (lastMoneyDate != null ? lastMoneyDate.hashCode() : 0);
        result = 31 * result + (buyingCount != null ? buyingCount.hashCode() : 0);
        result = 31 * result + (callId != null ? callId.hashCode() : 0);
        result = 31 * result + (polsaNumber != null ? polsaNumber.hashCode() : 0);
        result = 31 * result + (polsaAnnulation != null ? polsaAnnulation.hashCode() : 0);
        result = 31 * result + (polsaUnnulation != null ? polsaUnnulation.hashCode() : 0);
        result = 31 * result + (endBuyingId != null ? endBuyingId.hashCode() : 0);
        result = 31 * result + (endBuyingToid != null ? endBuyingToid.hashCode() : 0);
        result = 31 * result + (endBuyingPolsaId != null ? endBuyingPolsaId.hashCode() : 0);
        result = 31 * result + (fatherTaskId != null ? fatherTaskId.hashCode() : 0);
        result = 31 * result + (buyingTypeSt != null ? buyingTypeSt.hashCode() : 0);
        result = 31 * result + (doplataRecalcType != null ? doplataRecalcType.hashCode() : 0);
        result = 31 * result + (buyingCurrencyValue != null ? buyingCurrencyValue.hashCode() : 0);
        result = 31 * result + (buyingTypeStr != null ? buyingTypeStr.hashCode() : 0);
        result = 31 * result + (poolId != null ? poolId.hashCode() : 0);
        result = 31 * result + (currencyType != null ? currencyType.hashCode() : 0);
        result = 31 * result + (presentId != null ? presentId.hashCode() : 0);
        result = 31 * result + (spListId != null ? spListId.hashCode() : 0);
        result = 31 * result + (vosvratMoney != null ? vosvratMoney.hashCode() : 0);
        return result;
    }
}
