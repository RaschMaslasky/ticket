alter table TICKET_INCIDENT alter column ISSUE_ID rename to ISSUE_ID__U98508 ^
alter table TICKET_INCIDENT alter column ISSUE_ID__U98508 set null ;
alter table TICKET_INCIDENT drop constraint FK_TICKET_INCIDENT_ON_ISSUE ;
drop index IDX_TICKET_INCIDENT_ON_ISSUE ;
alter table TICKET_INCIDENT alter column INCIDENT_COMMENT rename to INCIDENT_COMMENT__U37336 ^
alter table TICKET_INCIDENT add column TYPE_ varchar(255) ;
alter table TICKET_INCIDENT add column ACTIVITES varchar(255) ;
alter table TICKET_INCIDENT add column COMMENT longvarchar ;
