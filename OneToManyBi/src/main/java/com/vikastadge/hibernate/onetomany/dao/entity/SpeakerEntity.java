package com.vikastadge.hibernate.onetomany.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="speakers")
public class SpeakerEntity {

    @Id
    @Column(name = "speaker_id")
    private int speaker_id;

    @Column(name = "speaker_name")
    private String speaker_name;

    @Column(name = "duration")
    private int duration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;

    public SpeakerEntity(){

    }
    public SpeakerEntity(int speaker_id, String speaker_name, int duration) {
        this.speaker_id = speaker_id;
        this.speaker_name = speaker_name;
        this.duration = duration;
    }

    public int getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(int speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public EventEntity getEventEntity() {
        return eventEntity;
    }

    public void setEventEntity(EventEntity eventEntity) {
        this.eventEntity = eventEntity;
    }


    public void printSpeakerDetails() {
        System.out.println("SpeakerEntity{" +
                "speaker_id=" + speaker_id +
                ", speaker_name='" + speaker_name + '\'' +
                ", duration=" + duration+"}");
    }

    public void printEventDetails() {
        this.getEventEntity().printEventDetails();
    }
}
