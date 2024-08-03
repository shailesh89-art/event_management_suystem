package com.example.event_management_system.entites;

import jakarta.persistence.*;


@Entity
public class venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private int capacity;

    @OneToOne(mappedBy = "venue")
    private event event;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public com.example.event_management_system.entites.event getEvent() {
        return event;
    }

    public void setEvent(com.example.event_management_system.entites.event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", event=" + event +
                '}';
    }
}
