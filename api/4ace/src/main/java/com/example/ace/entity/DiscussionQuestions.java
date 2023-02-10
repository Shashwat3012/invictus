package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discussion_question")
public class DiscussionQuestions {
    @Column(name = "question")
    private String question;
    @Column(name = "channel")
    private String channel;
    @Column(name = "userId")
    private String userId;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public DiscussionQuestions() {
    }

    public DiscussionQuestions(String question, String channel, String userId, String uuid) {
        this.question = question;
        this.channel = channel;
        this.userId = userId;
        this.uuid = uuid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "DiscussionQuestions{" +
                "question='" + question + '\'' +
                ", channel='" + channel + '\'' +
                ", userId='" + userId + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
