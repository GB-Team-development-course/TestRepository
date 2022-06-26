create schema postgres;

create table products
(
    id         bigserial primary key,
    title      varchar(255),
    price      numeric(8, 2) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

insert into products (title, price)
values ('Milk', 100.20),
       ('Bread', 80.20),
       ('Cheese', 90.20),
       ('Cheese2', 90.00),
       ('Cheese3', 90.00),
       ('Cheese4', 90.00),
       ('Cheese5', 90.00),
       ('Cheese6', 90.00),
       ('Cheese7', 90.00),
       ('Cheese8', 90.00),
       ('Cheese9', 90.00);
