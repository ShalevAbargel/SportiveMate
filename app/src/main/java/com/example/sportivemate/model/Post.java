package com.example.sportivemate.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


import java.io.Serializable;

@Entity(tableName = "Posts")
public class Post implements Serializable {


    @PrimaryKey
    @NonNull
    private String id;
    @NonNull
    private String ownerId;
    @NonNull
    private long date;
    private String sportName;
    private String name;
    private String imageUrl;
    private String description;
    private String city;
    private String phoneNumber;
    long lastUpdated;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    private boolean isDeleted;

    @NonNull
    public long getDate() {
        return date;
    }
    @NonNull
    public void setDate(long date) {
        this.date = date;
    }
    @NonNull
    public String getOwnerId() {
        return ownerId;
    }

    @NonNull
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Post() {
    }

    public Post(@NonNull String name,@NonNull String description,@NonNull String imageUrl,String sportName,String ownerId,
                String city, String phoneNumber) {
        this.name = name;
        this.description=description;
        this.imageUrl = imageUrl;
        this.sportName = sportName;
        this.ownerId = ownerId;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

}
