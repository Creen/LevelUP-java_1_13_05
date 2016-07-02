package ru.levelp.HomeWork;

import java.util.ArrayList;

/**
 * Created by Tesla on 18.06.2016.
 */
public class DetailContact extends Contact {
    private String address;
    private String workpale;


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkpale() {
        return workpale;
    }
    public void setWorkpale(String workpale) {
        this.workpale = workpale;
    }

//    @Override
//    public String toString() {
//        String result = name + " " + email + " " + phones;
//
//        if(phones.size() == 1) {
//            result += phones.get(0);
//        } else {
//            result += "\n<=== Phones ===>";
//        }
//        return result;
//    }
}
