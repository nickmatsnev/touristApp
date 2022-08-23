package com.example.tourism.data.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Trip", schema = "public", catalog = "postgres")
public class TripEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "trip_id")
    private int tripId;
    @Basic
    @Column(name = "dateStart")
    private Date dateStart;
    @Basic
    @Column(name = "dateEnd")
    private int dateEnd;
    @Basic
    @Column(name = "countries")
    private String countries;
    @Basic
    @Column(name = "cities")
    private String cities;
    @Basic
    @Column(name = "places")
    private String places;
    @Basic
    @Column(name = "money")
    private int money;
    @Basic
    @Column(name = "transportOptions")
    private String transportOptions;
    @Basic
    @Column(name = "status")
    private int status;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(int dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getTransportOptions() {
        return transportOptions;
    }

    public void setTransportOptions(String transportOptions) {
        this.transportOptions = transportOptions;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripEntity that = (TripEntity) o;

        if (tripId != that.tripId) return false;
        if (dateEnd != that.dateEnd) return false;
        if (money != that.money) return false;
        if (status != that.status) return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (countries != null ? !countries.equals(that.countries) : that.countries != null) return false;
        if (cities != null ? !cities.equals(that.cities) : that.cities != null) return false;
        if (places != null ? !places.equals(that.places) : that.places != null) return false;
        if (transportOptions != null ? !transportOptions.equals(that.transportOptions) : that.transportOptions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tripId;
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + dateEnd;
        result = 31 * result + (countries != null ? countries.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + money;
        result = 31 * result + (transportOptions != null ? transportOptions.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
