package com.app.NUDO.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.NUDO.model.Chat;
import com.app.NUDO.service.ChatService;


@RestController
@RequestMapping("/nudo")
public class ChatController {

	@Autowired
	ChatService ns;
	
	@PostMapping(value ="/chat",produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Chat> postChatting(@RequestBody Chat ch ){
		Iterable<Chat> message = ns.getAllMessages(ch);
		return message;
	
	}
}
