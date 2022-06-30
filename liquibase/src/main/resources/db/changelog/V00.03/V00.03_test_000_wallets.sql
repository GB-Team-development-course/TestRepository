create table wallets
(
    id         bigserial primary key,
    name       varchar(255),
    value      double precision
);

insert into wallets (name, value)
values ('Копилочка', 10000),
       ('На машину', 1000000),
       ('На дом', 30000000),
       ('На комп', 100000),
       ('На др', 50000),
       ('На нг', 100000);