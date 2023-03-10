package com.firstSpringDatabase.demo.General;


import jakarta.persistence.*;

@Entity
@Table(name = "complaints")
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String author;
    private String complaint;


    public Submission() {  }

    public Submission(String author, String complaint) {
        this.setAuthor(author);
        this.setComplaint(complaint);
    }



    public Submission(int id, String title, String complaint) {
        this.setId(id);
        this.setAuthor(author);
        this.setComplaint(complaint);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + author + "'" +
        ", content='" + complaint +  "'"+
        '}';
    }
}