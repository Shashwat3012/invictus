package com.example.ace.data.request;

public class TrainingsRequest {
    private String owner;
    private String contact;
    private String description;
    private String name;
    private String date;
    private String time;
    private String uuid;

    public TrainingsRequest(String owner, String contact, String description, String name, String date, String time, String uuid) {
        this.owner = owner;
        this.contact = contact;
        this.description = description;
        this.name = name;
        this.date = date;
        this.time = time;
        this.uuid = uuid;
    }

    public String getOwner() {
        return owner;
    }

    public String getContact() {
        return contact;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getUuid() {
        return uuid;
    }
}
