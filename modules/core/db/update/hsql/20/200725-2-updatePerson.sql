-- alter table TICKET_PERSON add column LINE_TICKET_REGISTER_ID varchar(36) ^
-- update TICKET_PERSON set LINE_TICKET_REGISTER_ID = <default_value> ;
-- alter table TICKET_PERSON alter column LINE_TICKET_REGISTER_ID set not null ;
alter table TICKET_PERSON add column LINE_TICKET_REGISTER_ID varchar(36) not null ;
