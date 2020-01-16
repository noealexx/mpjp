-- salary( max, min, sum, avg) 

select max(salary), min(salary), sum(salary), truncate (avg(salary), 2)
from employees;               

-- group by job_id

select max(salary), min(salary), sum(salary), truncate (avg(salary), 2)
from employees
group by job_id;

-- num dipendenti per job_id

select job_id, count(*)
from employees
group by job_id;

-- quanti sono gli it prog

select job_id, count(job_id)
from employees
where job_id='IT_PROG';

-- num manager

select count(distinct manager_id)
from employees;

-- nome dipendenti no manager

select first_name, last_name
from employees
where employee_id not in (select distinct manager_id from employees where manager_id is not null);

-- gap tra salary max e min

select (max(salary)-min(salary)) as difference
from employees;

-- group by job_id

select job_id, (max(salary)-min(salary)) as difference
from employees
group by job_id
having difference != 0; -- max(salary)!=min(salary)
 
-- min salary group by manager, no chi non ha manager, no chi ha salario min < 6000

select min(salary)
from employees
where manager_id is not null
group by manager_id
having min(salary)>6000;

-- indirizzi completi

select street_address, postal_code, city, state_province, country_name
from locations join countries
using (country_id);

-- nome dipendenti e loro department

select first_name, last_name, department_name
from employees join departments 
using (department_id);

-- nome dipendendi e department di toronto

select first_name, last_name, department_name, city
from employees join departments using(department_id)
join locations using(location_id)
where city = 'toronto';

-- chi è stato assunto dopo david lee

select count(employee_id)
from employees
where first_name='David' and last_name='Lee';

select first_name, last_name
from employees
where hire_date>(select hire_date from employees where last_name = 'Lee');

-- chi è stato assunto prima del proprio manager

select e.first_name, e.last_name, e.hire_date, m.hire_date
from employees e join employees m 
on e.hire_date < (select m.hire_date from employees) where (select distinct m.manager_id from employees); -- ????

-- chi ha lo stesso manager di lisa ozer

select count(employee_id)
from employees
where first_name='Lisa' and last_name='Ozer';

select first_name, last_name
from employees 
where manager_id=(select manager_id from employees where last_name='Ozer');

-- chi lavora in un department in cui c'è employee con almeno una u nel cognome

select first_name, last_name
from employees 
where department_id in
(select distinct department_id from employees where last_name like '%u%');


-- chi lavora nello shipping 

select first_name, last_name, department_name
from employees join departments
using(department_id)
where department_name = 'shipping';

-- chi ha come manager steven king 

select first_name, last_name 
from employees
where manager_id=(select employee_id from employees where last_name='King');


