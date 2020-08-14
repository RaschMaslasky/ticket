alter table TICKET_ISSUE alter column ISSUE_DATE rename to ISSUE_DATE__U40721 ^
alter table TICKET_ISSUE alter column ISSUE_DATE__U40721 set null ;
alter table TICKET_ISSUE add column ISSUE_DATE timestamp ^
update TICKET_ISSUE set ISSUE_DATE = current_timestamp where ISSUE_DATE is null ;
alter table TICKET_ISSUE alter column ISSUE_DATE set not null ;
