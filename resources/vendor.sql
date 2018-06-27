use projectdb;

create table vendor (
	id int primary key,
	code varchar(28),
    name varchar(28),
    type varchar(28),
    email varchar(28),
    phone varchar(28),
    address varchar(28)
);

select * from vendor;

commit;



