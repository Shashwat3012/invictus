package com.example.ace.data.request;

public class DiscussionQuestionRequest {
    private String question;
    private String channel;
    private String userId;
    private String uuid;

    public DiscussionQuestionRequest(String question, String channel, String userId, String uuid) {
        this.question = question;
        this.channel = channel;
        this.userId = userId;
        this.uuid = uuid;
    }

    public String getQuestion() {
        return question;
    }

    public String getChannel() {
        return channel;
    }

    public String getUserId() {
        return userId;
    }

    public String getUuid() {
        return uuid;
    }
}
