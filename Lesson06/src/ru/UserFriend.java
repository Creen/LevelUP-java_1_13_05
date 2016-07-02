package ru;

import ru.model.User;

/**
 * Created by Tesla on 14.06.2016.
 */
public class UserFriend extends User {
    private String phone;
    private String email;

    public UserFriend(){
        super;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

}
