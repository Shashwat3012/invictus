package com.example.ace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discussion_answers")
public class DiscussionAnswers {
    @Column(name = "answer")
    private String answer;
    @Column(name = "channel")
    private String channel;
    @Column(name = "userId")
    private String userId;
    @Id
    @Column(name = "uuid")
    private String uuid;

    public DiscussionAnswers() {
    }

    public DiscussionAnswers(String answer, String channel, String userId, String uuid) {
        this.answer = answer;
        this.channel = channel;
        this.userId = userId;
        this.uuid = uuid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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
        return "DiscussionAnswers{" +
                "answer='" + answer + '\'' +
                ", channel='" + channel + '\'' +
                ", userId='" + userId + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
