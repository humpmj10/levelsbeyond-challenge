package com.levelsbeyond.challenge.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String body;

	public Note() {
	}

	public Note(Long id, String name) {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
