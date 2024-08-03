package com.example.event_management_system.HomeController;

import com.example.event_management_system.entites.event;
import com.example.event_management_system.services.eventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class eventCnt {

    @Autowired
    private eventservice eventService;

    @PostMapping
    public event createevent(@RequestBody event event) {
        return eventService.createevent(event);
    }

    @GetMapping
    public List<event> getAllevents() {
        return eventService.getAllevents();
    }

    @GetMapping("/{id}")
    public event geteventById(@PathVariable int id) {
        return eventService.geteventById(id);
    }

    @PutMapping("/{id}")
    public event updateevent(@PathVariable int id, @RequestBody event event) {
        event.setId(id);
        return eventService.updateevent(event);
    }

    @DeleteMapping("/{id}")
    public void deleteevent(@PathVariable int id) {
        eventService.deleteevent(id);
    }

    @GetMapping("/venue/{venueId}")
    public List<event> geteventsByVenue(@PathVariable int venueId) {
        return eventService.geteventsByVenue(venueId);
    }

    @GetMapping("/organizer/{organizerId}")
    public List<event> geteventsByOrganizer(@PathVariable int organizerId) {
        return eventService.geteventsByOrganizer(organizerId);
    }
}
