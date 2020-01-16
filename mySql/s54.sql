create table items (
    item_id integer primary key,
    status char,
    name varchar(20),
    coder_id integer);
    
    insert into items(item_id, status, coder_id)
    values(1, 'm', 103);
    delete from items 
    where item_id = 1;
    insert into items(item_id, status, coder_id)
    values(1, 'a', 103);
    insert into items(item_id, status, name, coder_id)
    values(2, 'a', 'hello', 104);
    insert into items(item_id, name, coder_id)
    values(3, 'bye', 105);
    savepoint sp;
    
    select * from items;
    
    update items 
    set name = 'Maria'
    where name = 'hello';
    
    alter table items drop column status;
    
    alter table items add counter decimal (15, 2); 
    
    alter table items add constraint name_uq unique (name);
    
    insert into items (item_id, name)
    values (4, 'bye');
    
    -- select*
    -- from information_schema.table_constraints
    -- where constraints_schema='me' and table_name= 'items';
    
    
    