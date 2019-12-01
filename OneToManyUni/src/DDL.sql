DROP TABLE event;
CREATE TABLE event (event_id int(3), event_name VARCHAR(20));

DROP TABLE speakers;
CREATE TABLE speakers (speaker_id int(3), speaker_name VARCHAR(20),
    duration int(3), event_id int(3));