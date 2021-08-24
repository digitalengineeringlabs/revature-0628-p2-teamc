CREATE TABLE project2.userlogin (
	user_id SERIAL NOT NULL,
	username VARCHAR UNIQUE,
	userpassword VARCHAR NULL,
	manager BOOL NULL,
	CONSTRAINT userlogin_pk PRIMARY KEY (user_id)
);

ALTER TABLE project2.userlogin ADD CONSTRAINT username_un UNIQUE (username);

CREATE TABLE project2.tickets (
	user_id int4 NOT NULL,
	ticketnumber SERIAL NOT NULL,
	tickettype VARCHAR NULL,
	ticketvalue FLOAT8 NULL,
	ticketcomments VARCHAR NULL,
	ticketdate DATE DEFAULT current_date,
	status VARCHAR NOT NULL, 
	CONSTRAINT tickets_pk PRIMARY KEY (ticketnumber),
	CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES project2.userlogin(user_id)
);

--

CREATE USER groupc WITH PASSWORD 'postgres'

CREATE ROLE readwrite;
GRANT USAGE, CREATE ON SCHEMA project2 TO readwrite;
GRANT ALL ON TABLE project2.userlogin TO readwrite;
GRANT ALL ON TABLE project2.tickets TO readwrite;

GRANT readwrite TO  groupc;

-- populate userlo
insert into project2.userlogin (user_id, username, userpassword, manager) values(1,'testEmp','password',false);

-- Drop tables

-- DROP TABLE project2.userlogin CASCADE;
<<<<<<< Updated upstream
-- DROP TABLE project2.status CASCADE;
-- DROP TABLE project2.tickets;


=======
-- DROP TABLE project2.tickets;
>>>>>>> Stashed changes
