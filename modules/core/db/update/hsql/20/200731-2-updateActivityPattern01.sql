alter table TICKET_ACTIVITY_PATTERN alter column ACTIVITY_TYPE rename to ACTIVITY_TYPE__U18973 ^
alter table TICKET_ACTIVITY_PATTERN alter column ACTIVITY_TYPE__U18973 set null ;
alter table TICKET_ACTIVITY_PATTERN add column INCIDENT_TYPE varchar(50) ^
update TICKET_ACTIVITY_PATTERN set INCIDENT_TYPE = 'INCIDENT' where INCIDENT_TYPE is null ;
alter table TICKET_ACTIVITY_PATTERN alter column INCIDENT_TYPE set not null ;
