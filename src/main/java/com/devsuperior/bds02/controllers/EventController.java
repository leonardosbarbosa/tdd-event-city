package com.devsuperior.bds02.controllers;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/events")
public class EventController {

    @Autowired
    EventService service;

    @PutMapping("/{id}")
    public ResponseEntity<EventDTO> updateById(@PathVariable Long id, @RequestBody EventDTO dto) {
        dto = service.updateById(id, dto);
        return ResponseEntity.ok(dto);
    }
}
