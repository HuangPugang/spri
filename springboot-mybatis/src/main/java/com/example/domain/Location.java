package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by paul on 16/11/25.
 */
@Document(collection = "l_location2")
public class Location implements Serializable {

    @Id
    private String id;
    private Coordinate coordinate;
    private String address;

    public Location(String id, Coordinate coordinate, String address) {
        this.id = id;
        this.coordinate = coordinate;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
