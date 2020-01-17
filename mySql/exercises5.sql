-- scrivere e invocare la proceura tommorrow()
 
delimiter //
create procedure tomorrow()
begin
select date_add(curdate(), interval 1 day) as tomorrow;
end;
// delimiter ;
call tomorrow();

-- Modificare tomorrow() per fargli accettare come parametro un nome da stampare

drop procedure if exists tomorrow;

delimiter //
create procedure tomorrow(
in p_name varchar(30))
begin
select date_add(curdate(), interval 1 day) as tomorrow,
p_name;
end;
// delimiter ;
call tomorrow('emanuele');

-- Scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id

drop procedure if exists get_coder;
delimiter //
create procedure get_coder(
in p_coder_id integer,
out p_first_name varchar(40),
out p_last_name varchar(40)
)begin
select first_name, last_name from coders 
where coder_id=p_coder_id;
end;
// delimiter ;
call get_coder(103, @result, @result);
select @result;
