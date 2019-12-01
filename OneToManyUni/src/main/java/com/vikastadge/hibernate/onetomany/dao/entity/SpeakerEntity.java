package com.vikastadge.hibernate.onetomany.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
