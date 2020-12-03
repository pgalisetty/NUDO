package com.app.NUDO.service;



import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.NUDO.model.Chat;
import com.app.NUDO.repository.ChatRepository;

@Service
public class ChatService {
	
	@Autowired
	ChatRepository nr;
    
	@Autowired
	EntityManager em;
	// DATE_FORMAT("2017-06-15", "%m-%d-%y %h:%i:%p")
	//@Query(value = "insert into chat c (c.id,c.sender_id,c.receiver_id,c.message,c.Date) values(?,?,?,curdate()))")
	public List<Chat> getAllMessages(Chat ch) {
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm:sss");
		ch.setDate(Timestamp.valueOf(sdf.format(new Date(System.currentTimeMillis())).toString()));
	    nr.save(ch);
        //Iterable<Chat> msg = nr.getAll();
        // javax.persistence.Query q = em.createNativeQuery("SELECT c.id,c.sender_id,c.receiver_id,c.message, DATE_FORMAT(c.Date, \"%m-%d-%y %h:%i:%p\") creationDate FROM chat c", Chat.class);
	    javax.persistence.Query q = em.createNativeQuery("SELECT c.id,c.sender_id,c.receiver_id,c.message, STR_TO_DATE( DATE_FORMAT(c.date, \"%m-%d-%Y %h:%i %p\"), \"%m-%d-%Y %h:%i %p\") date FROM chat c", Chat.class);
        List<Chat> chats = q.getResultList();
        System.out.print(chats.toString());
		return chats;
	}
	public boolean deleteMessage(Chat ch) {
		if(ch!=null)
		{
			nr.deleteById(ch.getId());
			return true;
		}
		else
			return false;
	}

	

}
