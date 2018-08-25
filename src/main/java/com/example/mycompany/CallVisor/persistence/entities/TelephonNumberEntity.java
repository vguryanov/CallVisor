package com.example.mycompany.CallVisor.persistence.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by User2 on 19.08.2018.
 */
@Entity
@Table(name = "TelephonNumber", schema = "dbo", catalog = "Aloho")
public class TelephonNumberEntity {
    private String id;
    private String parentId;
    private Timestamp createDate;
    private Boolean deleted;
    private String number;
    private Integer type;
    private String dopInfo;
    private String typeNumberId;
    private Boolean noSms;

    @Basic
    @Column(name = "ID", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "CreateDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "Deleted", nullable = true)
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Id
    @Column(name = "Number", nullable = false, length = 30)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "Type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "DopInfo", nullable = true, length = 100)
    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }

    @Basic
    @Column(name = "TypeNumberID", nullable = true, length = 40)
    public String getTypeNumberId() {
        return typeNumberId;
    }

    public void setTypeNumberId(String typeNumberId) {
        this.typeNumberId = typeNumberId;
    }

    @Basic
    @Column(name = "NoSMS", nullable = true)
    public Boolean getNoSms() {
        return noSms;
    }

    public void setNoSms(Boolean noSms) {
        this.noSms = noSms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelephonNumberEntity that = (TelephonNumberEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (dopInfo != null ? !dopInfo.equals(that.dopInfo) : that.dopInfo != null) return false;
        if (typeNumberId != null ? !typeNumberId.equals(that.typeNumberId) : that.typeNumberId != null) return false;
        if (noSms != null ? !noSms.equals(that.noSms) : that.noSms != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (dopInfo != null ? dopInfo.hashCode() : 0);
        result = 31 * result + (typeNumberId != null ? typeNumberId.hashCode() : 0);
        result = 31 * result + (noSms != null ? noSms.hashCode() : 0);
        return result;
    }
}
