package com.levelsbeyond.challenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.levelsbeyond.challenge.service.INoteService;
import com.levelsbeyond.challenge.service.NoteService;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public INoteService noteService() {

		return new NoteService();
	}
}
