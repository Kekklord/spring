package com.dem.kek.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("jumpcode")
public class Jumpcode {
    @Id
    private String id;
    private Boolean status;
    private String link;

    public Jumpcode(String id, Boolean status, String link) {
        this.id = id;
        this.status = status;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
