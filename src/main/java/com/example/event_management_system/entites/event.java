package com.example.event_management_system.entites;

import jakarta.persistence.*;

@Entity
public class event
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private String event_dat;
    private String des;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private organizer organizer;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private venue venue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEvent_dat() {
        return event_dat;
    }

    public void setEvent_dat(String event_dat) {
        this.event_dat = event_dat;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public com.example.event_management_system.entites.organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(com.example.event_management_system.entites.organizer organizer) {
        this.organizer = organizer;
    }

    public com.example.event_management_system.entites.venue getVenue() {
        return venue;
    }

    public void setVenue(com.example.event_management_system.entites.venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", event_dat='" + event_dat + '\'' +
                ", des='" + des + '\'' +
                ", organizer=" + organizer +
                ", venue=" + venue +
                '}';
    }
}
