use me;

-- a select
select region_name
from regions
where region_id = 1;

-- select all
select * from regions;

-- select distinct
select distinct MANAGER_ID -- NON LI METTE IN ORDINE MA CON DISTINCT NON CI SONO DUPLICATI
from employees;

-- select with change on results
select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

-- alias
select job_title, min_salary as original, min_salary salary from jobs;
select job_title, min_salary + 2000 "increased min salary" from jobs; -- bisogna metterlo tra apici doppi 
																	-- la frase è un alias per job title e min_salary...as è indifferente 

-- dual
select current_date; -- from dual; se si omette from dual, il sistema lo da comunque per scontato (dual=tabella fittizia)
select 1+2, 3-4, 2*6, 5/2, current_date;

-- concatenation ---> prende tutti i valori che trova 
select concat(country_id, "...", region_id, '!' ) as x
from countries;
