package com.example.event_management_system.services;

import com.example.event_management_system.entites.event;
import com.example.event_management_system.repo.eventrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class eventservice {

    @Autowired
    private eventrepo eventRepository;

    public event createevent(event event) {
        return eventRepository.save(event);
    }

    public List<event> getAllevents() {
        return eventRepository.findAll();
    }

    public event geteventById(int id) {
        return eventRepository.findById(id).orElse(null);
    }

    public event updateevent(event event) {
        return eventRepository.save(event);
    }

    public void deleteevent(int id) {
        eventRepository.deleteById(id);
    }

    public List<event> geteventsByVenue(int venueId) {
        return eventRepository.findByVenueId(venueId);
    }

    public List<event> geteventsByOrganizer(int organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
}
