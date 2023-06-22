package org.example;
// Attributes to create the object
public class AddressContact {
    private String name;
    private String street;
    private String city;
    private  String state;
    private  String  zipCode;
    private  String phoneNumber;

    public AddressContact(Builder builder){
        this.name = builder.name;
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Street: " + street + ", City: " + city + ", State: " + state + ", ZipCoe: " + zipCode +
                ", Phone Number: " + phoneNumber;
    }

    public static class Builder {
        private String name;
        private String street;
        private String city;
        private  String state;
        private  String  zipCode;
        private  String phoneNumber;
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        public Builder state(String state) {
            this.state = state;
            return this;
        }
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public AddressContact build(){
            return new AddressContact(this);
        }
    }
}
