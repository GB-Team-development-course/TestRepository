create table users
(
    id         bigserial primary key,
    firstName  varchar(255),
    lastName  varchar(255),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

insert into users (firstName, lastName)
values ('firstName 1', 'lastName 1'),
       ('firstName 2', 'lastName 2'),
       ('firstName 3', 'lastName 3'),
       ('firstName 4', 'lastName 4'),
       ('firstName 5', 'lastName 5'),
       ('firstName 6', 'lastName 6'),
       ('firstName 7', 'lastName 7'),
       ('firstName 8', 'lastName 8'),
       ('firstName 9', 'lastName 9');
