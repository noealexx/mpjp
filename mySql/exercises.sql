select first_name, last_name, email, phone_number, hire_date
from employees
order by last_name asc, first_name asc;

-- nome david o peter
select first_name, last_name, email, phone_number, hire_date 
from employees
where first_name = 'David' or first_name = 'Peter';

-- dipartimento 60
select first_name, last_name, email, phone_number, hire_date, department_id
from employees
where department_id = 60 ;


-- dipartimento 30 o 50
select first_name, last_name, email, phone_number, hire_date, department_id
from employees
where department_id = 30 or department_id = 50;

-- salario > 10000
select first_name, last_name, email, phone_number, hire_date, department_id 
from employees
where salary > 10000;

-- salario < 4000 or >15000
select first_name, last_name, email, phone_number, hire_date, department_id 
from employees
where salary < 4000 or salary > 15000;

-- salario < 4000 or > 15000 SOLO dip. 50 or 80
select first_name, last_name, email, phone_number, hire_date, department_id
from employees
where (department_id = 50 or department_id = 80) and (salary < 4000 or salary > 15000);

-- assunto nel 2005
select first_name, last_name, email, phone_number, hire_date, department_id
from employees
where HIRE_DATE between 2005-01-01 and 2005-12-31; -- non funziona

-- job_id + duplicati
select job_id 
from employees
order by job_id asc;

-- commissione
select distinct first_name, last_name, email, phone_number, commission_pct
from employees
where commission_pct is not null;

-- una a nel nome o cognome
select first_name, last_name, email, phone_number, hire_date
from employees 
where (first_name like '%a%') or (last_name like '%a%');

-- departments nomi 
select department_name 
from departments
order by department_name asc;

-- indirizzi sedi italiane 
select street_address, city 
from locations
where country_id = 'IT';

select first_name, last_name, hire_date
from employees
where last_name like 'Mc%';

select first_name, last_name
from employees
where (first_name like '_h%')  or (last_name like '_h%'); 

select * from regions









