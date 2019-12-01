package com.vikastadge.hibernate.onetomany.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "event")
public class EventEntity implements Serializable {

    @Id
    @Column(name="event_id")
    private int event_id;

    @Column(name="event_name")
    private String event_name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Set<SpeakerEntity> speakers;

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public Set<SpeakerEntity> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<SpeakerEntity> speakers) {
        this.speakers = speakers;
    }
}
