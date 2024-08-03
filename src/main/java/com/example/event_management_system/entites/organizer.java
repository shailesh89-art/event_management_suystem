package com.example.event_management_system.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "organizer")
    private List<event> events;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<event> getEvents() {
        return events;
    }

    public void setEvents(List<event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "organizer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", events=" + events +
                '}';
    }
}
