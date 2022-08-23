package com.example.tourism.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ActivePlace", schema = "public", catalog = "postgres")
public class ActivePlaceEntity {
    @Basic
    @Column(name = "positionInTrip")
    private int positionInTrip;
    @Basic
    @Column(name = "place_id")
    private int placeId;
    @Basic
    @Column(name = "trip_id")
    private int tripId;

    public int getPositionInTrip() {
        return positionInTrip;
    }

    public void setPositionInTrip(int positionInTrip) {
        this.positionInTrip = positionInTrip;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivePlaceEntity that = (ActivePlaceEntity) o;

        if (positionInTrip != that.positionInTrip) return false;
        if (placeId != that.placeId) return false;
        if (tripId != that.tripId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = positionInTrip;
        result = 31 * result + placeId;
        result = 31 * result + tripId;
        return result;
    }
}
