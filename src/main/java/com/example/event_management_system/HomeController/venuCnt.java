package com.example.event_management_system.HomeController;


import com.example.event_management_system.entites.venue;
import com.example.event_management_system.services.venuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venues")
public class venuCnt {

    @Autowired
    private venuservice venueService;

    @PostMapping
    public venue createvenue(@RequestBody venue venue) {
        return venueService.createvenue(venue);
    }

    @GetMapping("/{id}")
    public venue getvenueById(@PathVariable int id) {
        return venueService.getvenueById(id);
    }

    @PutMapping("/{id}")
    public venue updatevenue(@PathVariable int id, @RequestBody venue venue) {
        venue.setId(id);
        return venueService.updatevenue(venue);
    }

    @DeleteMapping("/{id}")
    public void deletevenue(@PathVariable int id) {
        venueService.deletevenue(id);
    }
}
