package com.stharzun.dwellease.data;


import java.util.ArrayList;

/**
 * Created by Arjun Shrestha on 7/14/19.
 * arjunshrestha.com.np
 * stharzun@gmail.com
 */
public class DummyData {

    public static ArrayList<Module> getData() {
        ArrayList<Module> arrayList = new ArrayList<>();
        Module m = new Module();
        m.setName("Rosehill District");
        m.setType("condominium");
        m.setStreet("Somerest");
        m.setMonthlyRent("4200");
        m.setNoOfBed("5");
        m.setNoOfBathroom("3");
        m.setSqFt("821");
        m.setLeaseTerm("6 months");
        m.setFurnishin("Fully furnished");
        m.setClosestmart("Orchard MRT station, 3KM");
        m.setAmenities("Pool, BBQ Area");
        m.setYearBuilt("2005");
        m.setSpecial("Maids room, Sea view, Quite place");
        m.setStatus("approved");
        m.setWishlisted(false);

        m.setLandlordName("Henry Ong");
        m.setLandlordProfileImage("http://lorempixel.com/400/200/city/");
        m.setImage("http://lorempixel.com/400/200/sports/");
        arrayList.add(m);
        arrayList.add(m);
        arrayList.add(m);
        arrayList.add(m);
        arrayList.add(m);
        arrayList.add(m);
        return arrayList;
    }
}
