package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Events {
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "organizer")
    private String organizer;
    @Column(name = "contact")
    private String contact;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public Events() {
    }

    public Events(String description, String date, String time, String organizer, String contact, String uuid) {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Events{" +
                "description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", organizer='" + organizer + '\'' +
                ", contact='" + contact + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
