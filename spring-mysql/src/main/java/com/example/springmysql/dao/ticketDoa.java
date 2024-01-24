package com.example.springmysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springmysql.model.ticket;

public interface ticketDoa extends CrudRepository<ticket , Integer> {
    
}
