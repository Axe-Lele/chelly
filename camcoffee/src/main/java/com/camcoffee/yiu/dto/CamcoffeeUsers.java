package com.camcoffee.yiu.dto;

public class CamcoffeeUsers {
    private String userPwd;
    private String userPwd2;
    private String userName;
    private String birthYear;
    private String birthMonth;
    private String birthDay;
    
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getUserPwd2() {
        return userPwd2;
    }
    public void setUserPwd2(String userPwd2) {
        this.userPwd2 = userPwd2;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public String getBirthMonth() {
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
