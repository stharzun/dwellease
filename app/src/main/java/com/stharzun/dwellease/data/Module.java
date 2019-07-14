package com.stharzun.dwellease.data;

/**
 * Created by Arjun Shrestha on 7/14/19.
 * arjunshrestha.com.np
 * stharzun@gmail.com
 */
public class Module {
    private String name, type, street, monthlyRent, noOfBed, noOfBathroom, sqFt, leaseTerm, furnishin, closestmart, amenities, yearBuilt, special, status;
    private String landlordName, landlordProfileImage,landlordThoughts;
    private boolean wishlisted;
    private String image;

    public String getLandlordThoughts() {
        return landlordThoughts;
    }

    public void setLandlordThoughts(String landlordThoughts) {
        this.landlordThoughts = landlordThoughts;
    }

    public boolean isWishlisted() {
        return wishlisted;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getNoOfBed() {
        return noOfBed;
    }

    public void setNoOfBed(String noOfBed) {
        this.noOfBed = noOfBed;
    }

    public String getNoOfBathroom() {
        return noOfBathroom;
    }

    public void setNoOfBathroom(String noOfBathroom) {
        this.noOfBathroom = noOfBathroom;
    }

    public String getSqFt() {
        return sqFt;
    }

    public void setSqFt(String sqFt) {
        this.sqFt = sqFt;
    }

    public String getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public String getFurnishin() {
        return furnishin;
    }

    public void setFurnishin(String furnishin) {
        this.furnishin = furnishin;
    }

    public String getClosestmart() {
        return closestmart;
    }

    public void setClosestmart(String closestmart) {
        this.closestmart = closestmart;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWishlisted(boolean wishlisted) {
        this.wishlisted = wishlisted;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getLandlordProfileImage() {
        return landlordProfileImage;
    }

    public void setLandlordProfileImage(String landlordProfileImage) {
        this.landlordProfileImage = landlordProfileImage;
    }
}
