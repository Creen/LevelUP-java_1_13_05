package ru.levelp;

/**
 * Created by Tesla on 03.07.2016.
 */
public class DetailContact extends Contact{
    private String workplace;
    private String address;

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
