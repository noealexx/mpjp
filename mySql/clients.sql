create table clients(
client_id integer primary key,
card_number integer,
generic_id integer references generes (generic_id)
);

insert into clients (client_id, card_number, generic_id) values (400, 1456152, 300);


