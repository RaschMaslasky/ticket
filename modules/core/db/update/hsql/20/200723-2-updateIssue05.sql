alter table TICKET_ISSUE alter column PERSONS_ID rename to PERSONS_ID__U05386 ^
alter table TICKET_ISSUE drop constraint FK_TICKET_ISSUE_ON_PERSONS ;
drop index IDX_TICKET_ISSUE_ON_PERSONS ;
