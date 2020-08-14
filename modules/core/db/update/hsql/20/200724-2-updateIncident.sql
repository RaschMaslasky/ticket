-- alter table TICKET_INCIDENT add column ISSUE_ID varchar(36) ^
-- update TICKET_INCIDENT set ISSUE_ID = <default_value> ;
-- alter table TICKET_INCIDENT alter column ISSUE_ID set not null ;
alter table TICKET_INCIDENT add column ISSUE_ID varchar(36) not null ;
