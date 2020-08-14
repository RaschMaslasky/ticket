alter table TICKET_INCIDENT alter column INCIDENT_DATE rename to INCIDENT_DATE__U91468 ^
alter table TICKET_INCIDENT alter column INCIDENT_DATE__U91468 set null ;
alter table TICKET_INCIDENT add column INCIDENT_DATE timestamp ^
update TICKET_INCIDENT set INCIDENT_DATE = current_timestamp where INCIDENT_DATE is null ;
alter table TICKET_INCIDENT alter column INCIDENT_DATE set not null ;
