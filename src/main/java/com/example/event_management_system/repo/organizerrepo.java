package com.example.event_management_system.repo;

import com.example.event_management_system.entites.event;
import com.example.event_management_system.entites.organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface organizerrepo extends JpaRepository<organizer, Integer> {
}
