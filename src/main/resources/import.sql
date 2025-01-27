-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

SELECT 'CREATE DATABASE cucumber'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'cucumber');

CREATE ROLE jonathan WITH CREATEDB CREATEROLE LOGIN SUPERUSER PASSWORD 'admin';
GRANT ALL PRIVILEGES on DATABASE cucumber TO jonathan;
ALTER USER jonathan PASSWORD 'admin';

CREATE TABLE IF NOT EXISTS cucumbers (
    uid varchar primary key,
    csize int not null,
    sizeCategory varchar not null,
    pimpleCount int not null,
    address  varchar
);

INSERT INTO cucumbers (uid, csize, sizeCategory, pimpleCount, address) VALUES ('daea0d59-308c-47c3-b5c0-3484ef3ee7cf', 4, 'MIDDLE', 62, 'Address 1');
INSERT INTO cucumbers (uid, csize, sizeCategory, pimpleCount, address) VALUES ('9698458a-a184-4716-b2b6-466e7fdb581d', 4, 'SMALL', 72, 'Address 2');

