DROP TABLE event_speakers_lnk;
DROP TABLE event;
DROP TABLE speakers;


CREATE TABLE event (event_id int(3), event_name VARCHAR(20),
primary key event_pk (event_id));


CREATE TABLE speakers (speaker_id int(3), speaker_name VARCHAR(20), duration int(3),
primary key speakers_pk (speaker_id));

CREATE TABLE event_speakers_lnk (event_id int(3), speaker_id int(3),
foreign key speaker_id_fk (speaker_id) references speakers (speaker_id),
foreign key event_id_fk (event_id) references event (event_id));

