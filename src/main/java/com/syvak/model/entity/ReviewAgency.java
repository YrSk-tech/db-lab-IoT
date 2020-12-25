package com.syvak.model.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "review_agency")
public class ReviewAgency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "author")
    private String author;

    @Column(name = "text")
    private String text;

    @Column(name = "agency_id")
    private Integer agency_id;


    public ReviewAgency(Integer id, String author, String text, Integer agency_id) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.agency_id = agency_id;
    }

    public ReviewAgency(String author, String text, Integer agency_id) {
        this.author = author;
        this.text = text;
        this.agency_id = agency_id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAgencyId() {
        return agency_id;
    }

    public void setAgencyId(Integer agency_id) {
        this.agency_id = agency_id;
    }
    @Override
    public String toString() {
        return "\nReviewAgency{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", agency_id=" + agency_id + '}';
    }
}