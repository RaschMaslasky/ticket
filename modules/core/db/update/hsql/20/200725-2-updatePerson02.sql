alter table TICKET_PERSON alter column LINE_TICKET_REGISTER_ID rename to LINE_TICKET_REGISTER_ID__U00679 ^
alter table TICKET_PERSON alter column LINE_TICKET_REGISTER_ID__U00679 set null ;
alter table TICKET_PERSON drop constraint FK_TICKET_PERSON_ON_LINE_TICKET_REGISTER ;
drop index IDX_TICKET_PERSON_ON_LINE_TICKET_REGISTER ;
