package com.example.domain;

import java.io.Serializable;

/**
 * Created by paul on 16/11/25.
 */
public class Coordinate implements Serializable {
    private static final long serialVersionUID = -291910041161637327L;
    private Double longitude;
    private Double latitude;

    public Coordinate(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
