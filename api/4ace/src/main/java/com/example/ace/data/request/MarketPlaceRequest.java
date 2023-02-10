package com.example.ace.data.request;


import org.springframework.web.multipart.MultipartFile;

public class MarketPlaceRequest {
    private String item;
    private String owner;
    private String contact;
    private String price;
    private String filename;
    private String filecontent;
    private String uuid;

    public MarketPlaceRequest(String item, String owner, String contact, String price, String filename, String filecontent, String uuid) {
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

    public String getOwner() {
        return owner;
    }

    public String getContact() {
        return contact;
    }

    public String getPrice() {
        return price;
    }

    public String getFilename() {
        return filename;
    }

    public String getFilecontent() {
        return filecontent;
    }

    public String getUuid() {
        return uuid;
    }
}
