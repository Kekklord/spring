package com.dem.kek.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("datacodes")
public class DataCode {
    @Id
    private String id;

    private String link;
    private boolean status;

    public DataCode(String id, String link, boolean status) {
        super();
        this.id = id;
        this.link = link;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
