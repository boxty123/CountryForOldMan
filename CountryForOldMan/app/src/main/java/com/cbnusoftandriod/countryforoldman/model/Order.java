package com.cbnusoftandriod.countryforoldman.model;


public class Order {

    private final User user;
    private String phonenumber;
    private String address;
    private String menu;
    private String pay;
    private String price;
    private String userReq;


    public Order(User user, String menu, String pay, String price, String userReq) {
        this.user = user;
        this.menu = menu;
        this.pay = pay;
        this.price = price;
        this.userReq = userReq;
        phonenumber = user.getPhonenumber();
        address = user.getAddress();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getMenu() {
        return menu;
    }

    public String getPay() {
        return pay;
    }

    public String getPrice() {
        return price;
    }

    public String getUserReq() {
        return userReq;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUserReq(String userReq) {
        this.userReq = userReq;
    }


}
