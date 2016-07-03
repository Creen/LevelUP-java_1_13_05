package ru.levelp;

import java.util.ArrayList;

/**
 * Created by Tesla on 03.07.2016.
 */
public class Contact {
    //Поля
    private String name;
    private String email;
    private ArrayList<String> phones = new ArrayList<String>();

    //Создадим сеттеры и геттеры name и email
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    //Создадим метод который будет принимать phones
    public void addPhones(String phone){
        phones.add(phone);
    }

    public ArrayList<String> getPhones(){
        return phones;
    }

    @Override
    public String toString() {
        String result = name + " " + email + " " + phones;

        if(phones.size() == 1) {
            result += phones.get(0);
        } else {
            for (int i = 0; i < phones.size(); i++) {
                result += "\n<=== Phones ===>\n" + phones.get(i) + "\n" + name + " phones >>>";
            }

        }
        return result;
    }

}
