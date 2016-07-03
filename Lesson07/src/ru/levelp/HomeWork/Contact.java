package ru.levelp.HomeWork;

import java.util.ArrayList;

/**
 * Created by Tesla on 18.06.2016.
 */
public class Contact {
    private String name;
    private String email;
    private ArrayList<String> phones = new ArrayList<String>();

    //Метод добавляет телефон
    public void addPhone(String phone){
        phones.add(phone);
    }
    public ArrayList<String> getPhones(){
        return  phones;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String result = name + " " + email;

        if(phones.size() == 1) {
            result += phones.get(0);
        } else {
            result += "\n<=== Phones ===>\n";
            for (int i = 0; i < phones.size(); i++) {
                result += phones.get(i) + "\n";
            }
            result += "<<<" + name + " phones >>>";
        }
        return result;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
