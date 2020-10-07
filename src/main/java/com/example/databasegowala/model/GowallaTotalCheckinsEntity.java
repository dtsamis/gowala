package com.example.databasegowala.model;

import javax.persistence.*;

@Entity
@Table(name = "Gowalla_totalCheckins", schema = "gowala")
public class GowallaTotalCheckinsEntity {
    private Integer userId;
    private String checkTime;
    private Double latitude;
    private Double longitude;
    private Integer locationId;

    @Id
    @Column(name = "C1")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer c1) {
        this.userId = c1;
    }

    @Basic
    @Lob
    @Column(name = "C2")
    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String c2) {
        this.checkTime = c2;
    }

    @Basic
    @Column(name = "C3")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double c3) {
        this.latitude = c3;
    }

    @Basic
    @Column(name = "C4")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double c4) {
        this.longitude = c4;
    }

    @Basic
    @Column(name = "C5")
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer c5) {
        this.locationId = c5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GowallaTotalCheckinsEntity that = (GowallaTotalCheckinsEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GowallaTotalCheckinsEntity{" +
                "userId=" + userId +
                ", checkTime='" + checkTime + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", locationId=" + locationId +
                '}';
    }
}
