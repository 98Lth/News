package com.sq.News.pojo;

import java.sql.Date;

public class NewsInfo {
	private int id;
	private String head;
	private String body;
	private Date date;
	private String summary;
	private String author;
	
	
	
	public NewsInfo(int id, String head, String body, Date date, String summary, String author) {
		super();
		this.id = id;
		this.head = head;
		this.body = body;
		this.date = date;
		this.summary = summary;
		this.author = author;

	}
	
	
	public NewsInfo() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
