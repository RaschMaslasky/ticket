alter table TICKET_INCIDENT alter column ACTIVITES rename to ACTIVITES__U52596 ^
update TICKET_INCIDENT set TYPE_ = 'INCIDENT' where TYPE_ is null ;
alter table TICKET_INCIDENT alter column TYPE_ set not null ;
