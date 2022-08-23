package com.example.tourism.data.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Place", schema = "public", catalog = "postgres")
public class PlaceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "place_id")
    private int placeId;
    @Basic
    @Column(name = "dateStart")
    private Date dateStart;
    @Basic
    @Column(name = "dateEnd")
    private Date dateEnd;
    @Basic
    @Column(name = "price")
    private int price;
    @Basic
    @Column(name = "rating")
    private Integer rating;
    @Basic
    @Column(name = "googleReviews")
    private String googleReviews;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "transportTo")
    private int transportTo;

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getGoogleReviews() {
        return googleReviews;
    }

    public void setGoogleReviews(String googleReviews) {
        this.googleReviews = googleReviews;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTransportTo() {
        return transportTo;
    }

    public void setTransportTo(int transportTo) {
        this.transportTo = transportTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceEntity that = (PlaceEntity) o;

        if (placeId != that.placeId) return false;
        if (price != that.price) return false;
        if (transportTo != that.transportTo) return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (dateEnd != null ? !dateEnd.equals(that.dateEnd) : that.dateEnd != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (googleReviews != null ? !googleReviews.equals(that.googleReviews) : that.googleReviews != null)
            return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placeId;
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (googleReviews != null ? googleReviews.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + transportTo;
        return result;
    }
}
