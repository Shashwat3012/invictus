package com.example.ace.data.response;

public class CommunityProfilesResponse {
    private String contact;
    private String uuid;

    public CommunityProfilesResponse(String contact, String uuid) {
        this.contact = contact;
        this.uuid = uuid;
    }

    public String getContact() {
        return contact;
    }

    public String getUuid() {
        return uuid;
    }
}
