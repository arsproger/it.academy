CREATE TABLE client (
    id integer primary key,
    name varchar(25) not null,
    date_of_birth date not null,
    gender varchar(15) not null,
    phone_number varchar(25)
);

CREATE TABLE type_sport_section (
    id integer primary key,
    name varchar(25) not null
);

CREATE TABLE trainer(
    id integer primary key,
    name varchar(25),
    id_type_sport_section integer references type_sport_section(id)
);

CREATE TABLE visits(
    id_client integer references client(id),
    time_visits timestamp not null,
    id_trainer integer references trainer(id)
);

insert into client values
                       (1, 'Arsen', '2005.01.14', 'Man', '100'),
                       (2, 'Bob', '2005.05.03', 'Man', '101'),
                       (3, 'Ruslan', '2005.08.23', 'Man', '102');
insert into type_sport_section values
                                   (1, 'Бокс'),
                                   (2, 'Теннис'),
                                   (3, 'Баскетбол');

insert into trainer values
                        (1, 'Name1', 1),
                        (2, 'Name2', 3),
                        (3, 'Name3', 2);

insert into visits values
                       (2, current_date, 3),
                       (1, current_date, 2),
                       (3, current_date, 1);

select * from visits order by time_visits desc;
select * from client;
select * from trainer;
select * from visits;
select * from type_sport_section;
