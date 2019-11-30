DROP TABLE student;
CREATE TABLE student (student_id int(3), student_name VARCHAR(20),
 primary key student_pk (student_id));

DROP TABLE student_location;
CREATE TABLE student_location (student_location_id int(3), street VARCHAR(20), city VARCHAR(20),
state VARCHAR(20), zipcode VARCHAR(6), primary key student_location_pk (student_location_id));

