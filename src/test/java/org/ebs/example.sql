
CREATE SCHEMA ex;

CREATE TABLE ex.parent (
	id serial NOT NULL,
	name varchar NOT NULL,
	stock_code varchar NULL,
	creator_id int NOT NULL,
	creation_timestamp timestamp NOT NULL,
	modifier_id int NULL,
	modification_timestamp timestamp NULL,
	is_void bool not null default false,
	CONSTRAINT parent_pk PRIMARY KEY (id)
);

CREATE TABLE ex.child (
	id serial NOT NULL,
	parent_id int NOT NULL,
	a_number int NOT NULL,
	creator_id int NOT NULL,
	creation_timestamp timestamp NOT NULL,
	modifier_id int NULL,
	modification_timestamp timestamp NULL,
	is_void bool not null default false,
	CONSTRAINT child_pk PRIMARY KEY (id),
	CONSTRAINT child_fk FOREIGN KEY (parent_id) REFERENCES ex.parent(id)
);

INSERT INTO ex.parent("name", stock_code, creator_id, creation_timestamp)
VALUES('parent 1', 'STOCK-01', 1, now()),
('my parent', 'STOCK-02', 1, now()),
('other parent', 'SC_ABC', 1, now());

INSERT INTO ex.child (parent_id, a_number, creator_id, creation_timestamp) values
(1, 1, 1, now()),
(1, 2, 1, now()),
(2, 5, 1, now()),
(2, 6, 1, now()),
(3, 1010, 1, now()),
(3, 1011, 1, now()),
(3, 1012, 1, now());
