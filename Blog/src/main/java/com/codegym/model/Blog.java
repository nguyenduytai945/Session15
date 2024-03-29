package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tittle;
    private String content;

    public Blog() {
    }

    public Blog(String tittle, String content) {
        this.tittle = tittle;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, tittle='%s', content='%s']", id, tittle, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
