-- alter table TICKET_ISSUE add column ISSUE_PATTERN_ID varchar(36) ^
-- update TICKET_ISSUE set ISSUE_PATTERN_ID = <default_value> ;
-- alter table TICKET_ISSUE alter column ISSUE_PATTERN_ID set not null ;
-- alter table TICKET_ISSUE add column ISSUE_PATTERN_ID varchar(36) not null ; RML copy of original 28.07.2020
alter table TICKET_ISSUE add column ISSUE_PATTERN_ID varchar(36);
