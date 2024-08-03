package com.example.event_management_system.services;

import com.example.event_management_system.entites.organizer;
import com.example.event_management_system.repo.organizerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class organizerservice {

    @Autowired
    private organizerrepo organizerRepository;

    public organizer createorganizer(organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public organizer getorganizerById(int id) {
        return organizerRepository.findById(id).orElse(null);
    }

    public organizer updateorganizer(organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public void deleteorganizer(int id) {
        organizerRepository.deleteById(id);
    }
}
