package com.app.NUDO.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.NUDO.model.Chat;
import com.app.NUDO.repository.ChatRepository;
import com.app.NUDO.service.ChatService;


@RestController
@RequestMapping("/nudo")
public class ChatController {

	@Autowired
	ChatService ns;
	
	@Autowired
	ChatRepository nr;
	
	@PostMapping(value ="/chat",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Chat> postChatting(@RequestBody Chat ch ){
		return ns.getAllMessages(ch);
	
	}
	
	@DeleteMapping(value ="/delete",produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean delete(@RequestBody Chat ch ){
		return ns.deleteMessage(ch);
	
	}
}
