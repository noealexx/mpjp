-- self join
select e.last_name as employee, e.FIRST_NAME as 'e.name', m.last_name as manager, m.FIRST_NAME as 'm.name'
from employees e join employees m
on (e.manager_id = m.employee_id);

select concat (e.last_name, ' ', e.first_name) as employee,
       concat (m.last_name, ' ', m.first_name) as manager 
from employees e join employees m
on (e.manager_id = m.employee_id);
-- todo hire date + manager





-- "classic" self join
select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;
