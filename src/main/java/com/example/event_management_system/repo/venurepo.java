package com.example.event_management_system.repo;

import com.example.event_management_system.entites.event;
import com.example.event_management_system.entites.venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface venurepo extends JpaRepository<venue, Integer> {
}
