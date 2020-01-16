-- nome employees e department
select e.first_name, e.last_name, d.department_name
from employees e join departments d 
using (department_id);

-- nome employees e job title
select e.first_name, e.last_name, j.job_title
from employees e join jobs j
using (job_id);

-- coloro che hanno salario min o max per job title
select first_name, last_name, job_title, salary
from employees join jobs 
using (job_id)
where (salary = min_salary) or (salary = max_salary);

-- coloro basati in uk 
select first_name, last_name, street_address, city
from employees right outer join departments using(department_id)
join locations using(location_id)
where country_id = 'UK';
 
-- departments e manager associato
select department_name, m.first_name, m.last_name
from employees m join departments d
on (employee_id = d.MANAGER_ID);

-- tutti i departments e manager associato 
select department_name, m.first_name, m.last_name
from employees m right outer join departments d
on (EMPLOYEE_ID = d.manager_id);

-- departments senza manager 
select department_name, manager_id
from departments
where manager_id is null;

-- tutti gli employees e il loro manager 
select concat (e.last_name, ' ', e.FIRST_NAME) as employee, concat (m.last_name, ' ', m.FIRST_NAME) as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by e.last_name;

-- salario corrente, salario + 8.5, delta
select first_name, last_name, salary, truncate (salary/100*8.5, 2) as 'delta', truncate (salary+salary/100*8.5, 2) as 'salary +8.5'
from employees;

-- gg data di assunzione-oggi
select first_name, last_name, hire_date, datediff(now(), hire_date)
from employees;

-- commissione/no value
select last_name, first_name, 
ifnull(commission_pct, 'no  value') as commission_pct
from employees;

select count(manager_id) 
from employees;





