create table IF NOT EXISTS topfizz
(
	id bigserial  primary key,
	int1 int not null,
	int2 int not null,
	str1 text not null,
	str2 text not null
);
DELETE from topfiZZ WHERE id is NOT null;
ALTER SEQUENCE topfizz_id_seq RESTART WITH 1;
insert into topfizz(int1,int2,str1,str2)
values(5,7,'Le Bon','Coin'),
       (2,3,'Fizz','Buzz'),
       (10,21,'Cou','Cou'),
       (6,5,'Bon','Jour'),
       (5,7,'Le Bon','Coin'),
       (9,4,'Le Bon','Coin'),
       (2,1,'Ca','Nard'),
	(8,9,'Ca','Mion');