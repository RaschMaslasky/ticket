-- alter table TICKET_LINE_SHAPE add column PATTERN_ID varchar(36) ^
-- update TICKET_LINE_SHAPE set PATTERN_ID = <default_value> ;
-- alter table TICKET_LINE_SHAPE alter column PATTERN_ID set not null ;
alter table TICKET_LINE_SHAPE add column PATTERN_ID varchar(36) not null ;
