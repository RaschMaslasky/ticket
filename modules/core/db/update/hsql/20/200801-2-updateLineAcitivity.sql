alter table TICKET_LINE_ACITIVITY alter column INCIDENT_ID rename to INCIDENT_ID__U66666 ^
alter table TICKET_LINE_ACITIVITY drop constraint FK_TICKET_LINE_ACITIVITY_ON_INCIDENT ;
drop index IDX_TICKET_LINE_ACITIVITY_ON_INCIDENT ;