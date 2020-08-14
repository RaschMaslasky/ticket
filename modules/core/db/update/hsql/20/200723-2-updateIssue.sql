-- alter table TICKET_ISSUE add column PERSON_ID varchar(36) ^
-- update TICKET_ISSUE set PERSON_ID = <default_value> ;
-- alter table TICKET_ISSUE alter column PERSON_ID set not null ;
alter table TICKET_ISSUE add column PERSON_ID varchar(36) not null ;
