DROP TABLE event;
CREATE TABLE event (event_id int(3), event_name VARCHAR(20),
    primary key event_pk (event_id));

DROP TABLE speakers;
CREATE TABLE speakers (speaker_id int(3), speaker_name VARCHAR(20),
    duration int(3), event_id int(3),
    foreign key event_id_fk (event_id) references event (event_id));