package com.example.event_management_system.services;

import com.example.event_management_system.entites.venue;
import com.example.event_management_system.repo.venurepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class venuservice {

    @Autowired
    private venurepo venueRepository;

    public venue createvenue(venue venue) {
        return venueRepository.save(venue);
    }

    public venue getvenueById(int id) {
        return venueRepository.findById(id).orElse(null);
    }

    public venue updatevenue(venue venue) {
        return venueRepository.save(venue);
    }

    public void deletevenue(int id) {
        venueRepository.deleteById(id);
    }
}
