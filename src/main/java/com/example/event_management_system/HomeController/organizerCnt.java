package com.example.event_management_system.HomeController;


import com.example.event_management_system.entites.organizer;
import com.example.event_management_system.services.organizerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizers")
public class organizerCnt {

    @Autowired
    private organizerservice organizerService;

    @PostMapping
    public organizer createorganizer(@RequestBody organizer organizer) {
        return organizerService.createorganizer(organizer);
    }

    public organizer getorganizerById(@PathVariable int id) {
        return organizerService.getorganizerById(id);
    }

    @PutMapping("/{id}")
    public organizer updateorganizer(@PathVariable int id, @RequestBody organizer organizer) {
        organizer.setId(id);
        return organizerService.updateorganizer(organizer);
    }

    @DeleteMapping("/{id}")
    public void deleteorganizer(@PathVariable int id) {
        organizerService.deleteorganizer(id);
    }
}
