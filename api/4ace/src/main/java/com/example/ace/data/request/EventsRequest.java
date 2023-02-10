package com.example.ace.data.request;

public class EventsRequest {
    private String description;
    private String date;
    private String time;
    private String organizer;
    private String contact;
    private String uuid;

    public EventsRequest(String description, String date, String time, String organizer, String contact, String uuid) {
        this.description = description;
        this.date = date;
        this.time = time;
        this.organizer = organizer;
        this.contact = contact;
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getContact() {
        return contact;
    }

    public String getUuid() {
        return uuid;
    }
}
