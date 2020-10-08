package org.launchcode.codingevents.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Event {
    private int id;
    private int nextId=1;

    @NotBlank
    @Size(min =3, max = 20, message = "Name should be between 3 and 20 characters long")
    private String name;

    @Size(max = 200, message = "Description is too long")
    private String description;

    @NotBlank
    @Size(min =3, max = 20, message = "Name should be between 3 and 20 characters long")
    private String location;

    private boolean registrationRequired;
    @Min(1)
    private int attendees;

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String description, String location, int attendees) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
        this.registrationRequired = true;
        this.attendees=attendees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }
}
