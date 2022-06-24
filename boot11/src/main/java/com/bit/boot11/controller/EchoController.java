package com.bit.boot11.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.bit.boot11.domain.Message;

@Controller
public class EchoController {
	
	@Autowired
	HttpSession session;
	
	@MessageMapping("/room1")
	@SendTo("/topic/msg1")
	public Message func01(Message msg) {
		System.out.println(session.getId());
		return msg;
	}
}
