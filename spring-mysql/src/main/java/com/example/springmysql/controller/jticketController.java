package com.example.springmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmysql.dao.ticketDoa;
import com.example.springmysql.model.ticket;

@RestController
@RequestMapping("/ticket")
public class jticketController {
    @Autowired
    private ticketDoa doa;

    @PostMapping("/bookTickets") 
    public String bookTicket( @RequestBody List<ticket> tickets) {
        doa.saveAll(tickets);
        return "Ticked books :" + tickets.size();

    }

    @GetMapping("/getTicket")
    public List<ticket> getTicket() {

        return (List<ticket>) doa.findAll();

    }

}
