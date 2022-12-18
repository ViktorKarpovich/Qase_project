package org.tms.model;

public class User {

    private String login = "vik.karpovich@gmail.com";
    private String password ="tmsproject2022";

    public User(){

    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
