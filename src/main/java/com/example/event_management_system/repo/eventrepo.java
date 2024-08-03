package com.example.event_management_system.repo;

import com.example.event_management_system.entites.event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface eventrepo extends JpaRepository<event, Integer> {
    List<event> findByVenueId(int venueId);
    List<event> findByOrganizerId(int organizerId);
}
