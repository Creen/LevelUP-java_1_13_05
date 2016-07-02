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

    @Override
    public String toString() {
        String result = name + " " + email + " " + phones;

        if(phones.size() == 1) {
            result += phones.get(0);
        } else {
            for (int i = 0; i < phones.size(); i++) {
                result += "\n<=== Phones ===>\n" + phones.get(i) + "\n" + name+ " phones >>>";
            }

        }
        return result;
    }
    public void print(){
        System.out.println(toString());
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
