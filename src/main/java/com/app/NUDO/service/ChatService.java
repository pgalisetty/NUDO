package com.app.NUDO.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.NUDO.model.Chat;
import com.app.NUDO.repository.ChatRepository;

@Service
public class ChatService {
	
	@Autowired
	ChatRepository nr;

	public Iterable<Chat> getAllMessages(Chat ch) {
		
	    nr.save(ch);
        Iterable<Chat> msg = nr.findAll();
        System.out.print(msg.toString());
		return msg;
	}

	

}
