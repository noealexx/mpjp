SELECT * FROM me.coders;

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (203, 'Maria', 'Rossi', curdate(), 5000.00);

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (202, 'Franco', 'Bianchi', curdate(), 4500.00);

update coders 
set first_name = 'Mariangela'
where first_name = 'Maria';

update coders
set salary = salary +500
where salary<6000;

delete from coders
where first_name = 'Franco' and last_name = 'Bianchi';

commit;

