create table if not exists peoples (
    id integer primary key auto_increment,
    first_name varchar(80) not null,
    last_name varchar(80) not null
);