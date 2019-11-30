Different types of identifier generation strategy
GenerationType.AUTO
GenerationType.IDENTITY
GenerationType.SEQUENCE
GenerationType.TABLE


Drop existing table and create new table:
DROP TABLE Person;
CREATE TABLE Person (
    ID int(3) NOT NULL,
    Name VARCHAR(20),
    PRIMARY KEY (ID)
 );


Generation strategy - GenerationType.AUTO
The GenerationType.AUTO is the default generation type and lets the persistence provider
choose the generation strategy.
If you use Hibernate as your persistence provider, it selects a generation strategy
based on the database specific dialect.
For most popular databases, it selects GenerationType.SEQUENCE
Impl:-
Hibernate creates hibernate_sequence in the data base which is used for fetching next id value

Generation strategy - GenerationType.IDENTITY
The GenerationType.IDENTITY is the easiest to use but not the best one from a performance point of view.
It relies on an auto-incremented database column and lets the database generate a new value with
each insert operation.
From a database point of view, this is very efficient because the auto-increment columns are
highly optimized, and it doesn’t require any additional statements.
Impl:-
Table ID column should have auto increament.
ALTER TABLE Person MODIFY COLUMN ID INT auto_increment;

Generation strategy - GenerationType.SEQUENCE
The GenerationType.SEQUENCE is preferred way to generate primary key values and
uses a database sequence to generate unique values.
It requires additional select statements to get the next value from a database sequence.
But this has no performance impact for most applications. And if your application has to persist
a huge number of new entities, you can use some Hibernate specific optimizations to reduce
the number of statements.
@GeneratedValue(strategy = GenerationType.SEQUENCE)

If you don’t provide any additional information, Hibernate will request the next value from its default sequence.
You can change that by referencing the name of a @SequenceGenerator in the generator attribute of the
@GeneratedValue annotation. The @SequenceGenerator annotation lets you define the name of the generator,
the name, and schema of the database sequence and the allocation size of the sequence.
Impl:-
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_generator")
    @GenericGenerator(
            name = "person_id_generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "person_id_seq", value = "person_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )

Generation strategy - GenerationType.TABLE
The GenerationType.TABLE gets only rarely used nowadays. It simulates a sequence by storing and
updating its current value in a database table which requires the use of pessimistic locks which
put all transactions into a sequential order.
This slows down your application, and you should, therefore, prefer the GenerationType.SEQUENCE,
if your database supports sequences, which most popular databases do.

Impl:-
@GeneratedValue(strategy = GenerationType.TABLE)
Hibernate will create following entries for you.
Hibernate: create table hibernate_sequences (sequence_name varchar(255) not null, next_val bigint, primary key (sequence_name)) engine=InnoDB
Hibernate: insert into hibernate_sequences(sequence_name, next_val) values ('default',0)

Creating our own table for primary key generation
DROP TABLE person_sequences;
create table person_sequences (sequence_name varchar(255) not null, next_val bigint, primary key (sequence_name));


 @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "table-generator")
    @TableGenerator(name = "table-generator",
            table = "person_sequences",
            pkColumnName = "sequence_name",
            valueColumnName = "next_val",
            allocationSize = 1,
            initialValue = 0
            )