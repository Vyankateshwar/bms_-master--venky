package com.example.Book_my_Show_Application_February.ResponseDto;



public class UserDto {
    private int id;

    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
    // Constructors, getters, and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public UserDto() {
    }

    public UserDto(int id, String name, int age, String email, String mobNo, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobNo = mobNo;
        this.address = address;
    }
}



