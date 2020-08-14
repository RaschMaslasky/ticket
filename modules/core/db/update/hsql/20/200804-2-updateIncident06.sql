alter table TICKET_INCIDENT alter column OUTCOME rename to OUTCOME__U33666 ^
alter table TICKET_INCIDENT alter column REASON rename to REASON__U78662 ^
alter table TICKET_INCIDENT add column REASON_ID varchar(36) ;
alter table TICKET_INCIDENT add column OUTCOME_ID varchar(36) ;
