alter table TICKET_LINE_VIOLATOR_PERSON add column ACTIVITY_END_DATE timestamp ;
alter table TICKET_LINE_VIOLATOR_PERSON add column INCIDENT_ID varchar(36) ;
alter table TICKET_LINE_VIOLATOR_PERSON add column ACTIVITY_ID varchar(36) ;
alter table TICKET_LINE_VIOLATOR_PERSON add column GULTY_DEGREE integer ;
alter table TICKET_LINE_VIOLATOR_PERSON add column COMMENT_ longvarchar ;
alter table TICKET_LINE_VIOLATOR_PERSON add column ACTIVITY_START_DATE timestamp ;
