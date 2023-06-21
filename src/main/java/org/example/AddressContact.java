package org.example;

public class AddressContact {
    private String name;
    private String street;
    private String city;
    private  String state;
    private  String  zipCode;
    private  String phoneNumber;

    public AddressContact(String name, String street, String city, String state, String zipCode, String phoneNumber){
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "Name: " +  name + ", Street; " + street + ", City: " + city + ", Street: " + ", ZipCode: " + zipCode +
                ", phone number: " + phoneNumber;
    }
}
