package com.emc.ETAPPS.REST.model;

import java.util.Date;

public class Contact {
    private String id;
    private String firstName;
    private String lastName; 
    private String contactphone; 
    private String email; 
    private String city; 
    private String state; 
   // private String createdDateTime;
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   /** public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
**/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactPhone() {
        return contactphone;
    }

    public void setContactPhone(String ContactPhone) {
        this.contactphone = ContactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }




}
