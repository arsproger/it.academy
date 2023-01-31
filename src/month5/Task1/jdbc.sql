CREATE TABLE person (
    id integer primary key,
    name varchar(25) not null,
    age integer default 0
);

CREATE SEQUENCE person_id;

insert into person values
                       (nextval('person_id'), 'Arsen', 17),
                       (nextval('person_id'), 'Ruslan', 19),
                       (nextval('person_id'), 'Erlan', 18),
                       (nextval('person_id'), 'Aidai', 23),
                       (nextval('person_id'), 'Argen', 25);

select * from person;