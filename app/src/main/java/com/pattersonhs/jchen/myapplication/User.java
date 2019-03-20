package com.pattersonhs.jchen.myapplication;

public class User {
    String username;
    String password;

    public User (String newUsername, String newPassword) {
        username = newUsername;
        password = newPassword;
    }


    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public boolean login(String typedUsername,String typedPasswod){
        if (typedUsername.equals(username)&&(typedPasswod.equals(password)))
        {
            return true;
        }
        return false;
    }
}
