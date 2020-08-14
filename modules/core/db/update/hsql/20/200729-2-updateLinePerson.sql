-- alter table TICKET_LINE_PERSON add column TICKET_ISSUE_ID varchar(36) ^
-- update TICKET_LINE_PERSON set TICKET_ISSUE_ID = <default_value> ;
-- alter table TICKET_LINE_PERSON alter column TICKET_ISSUE_ID set not null ;
alter table TICKET_LINE_PERSON add column TICKET_ISSUE_ID varchar(36);
-- alter table TICKET_LINE_PERSON add column TICKET_WITHDRAWAL_ID varchar(36) ^
-- update TICKET_LINE_PERSON set TICKET_WITHDRAWAL_ID = <default_value> ;
-- alter table TICKET_LINE_PERSON alter column TICKET_WITHDRAWAL_ID set not null ;
alter table TICKET_LINE_PERSON add column TICKET_WITHDRAWAL_ID varchar(36);
