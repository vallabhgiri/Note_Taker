package com.notetaker.note_taker.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="new_note_taker")
public class Note {
	 @Id
	 private long id;
	@Column(name="title")
    private String title;
	@Column(name="content")
    private String content;
	@Column(name="c_date")
	private Date addDate=new Date();
	
	

    // Getters and Setters

    public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
