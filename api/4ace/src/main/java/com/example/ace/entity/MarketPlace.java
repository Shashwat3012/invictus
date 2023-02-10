package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marketPlace")
public class MarketPlace {
    @Column(name = "item")
    private String item;
    @Column(name = "owner")
    private String owner;
    @Column(name = "contact")
    private String contact;
    @Column(name = "price")
    private String price;
    @Column(name = "filename")
    private String filename;
    @Column(name = "filecontent")
    private String filecontent;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public MarketPlace() {
    }

    public MarketPlace(String item, String owner, String contact, String price, String filename, String filecontent, String uuid) {
        this.item = item;
        this.owner = owner;
        this.contact = contact;
        this.price = price;
        this.filename = filename;
        this.filecontent = filecontent;
        this.uuid = uuid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilecontent() {
        return filecontent;
    }

    public void setFilecontent(String filecontent) {
        this.filecontent = filecontent;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "MarketPlace{" +
                "item='" + item + '\'' +
                ", owner='" + owner + '\'' +
                ", contact='" + contact + '\'' +
                ", price='" + price + '\'' +
                ", filename='" + filename + '\'' +
                ", filecontent='" + filecontent + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
