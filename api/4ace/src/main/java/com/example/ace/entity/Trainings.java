package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainings")
public class Trainings {
    @Column(name = "owner")
    private String owner;
    @Column(name = "contact")
    private String contact;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public Trainings() {
    }

    public Trainings(String owner, String contact, String description, String name, String date, String time, String uuid) {
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

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Trainings{" +
                "owner='" + owner + '\'' +
                ", contact='" + contact + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
