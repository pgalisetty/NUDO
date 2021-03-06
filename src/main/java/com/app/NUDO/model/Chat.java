package com.app.NUDO.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chat")
public class Chat {


    @Id
    private Long id;
    
    @Column(name="SENDER_ID")
    private Long senderId;
    
    @Column(name="RECEIVER_ID")
    private String receiverId;
    
    @Column(name="MESSAGE")
    private String message;
    
    @Column(name="Date")
    private Timestamp date;

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Chat [id=" + id + ", senderId=" + senderId + ", receiverId=" + receiverId + ", message=" + message
				+ ", date=" + date + "]";
	}

	
	

}
