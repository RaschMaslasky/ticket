alter table TICKET_ACTIVITY add column ACTIVITY_TYPE varchar(50) ^
update TICKET_ACTIVITY set ACTIVITY_TYPE = 'ACTIVITY' where ACTIVITY_TYPE is null ;
alter table TICKET_ACTIVITY alter column ACTIVITY_TYPE set not null ;
alter table TICKET_ACTIVITY add column DURATION_DAY decimal(19, 2) ;
alter table TICKET_ACTIVITY add column IS_CONTROLLED boolean ;
alter table TICKET_ACTIVITY add column IS_REPORTED boolean ;
alter table TICKET_ACTIVITY add column NAME varchar(255) ^
update TICKET_ACTIVITY set NAME = '' where NAME is null ;
alter table TICKET_ACTIVITY alter column NAME set not null ;
