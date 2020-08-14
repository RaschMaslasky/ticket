alter table TICKET_LINE_SHAPE alter column QUANTITY rename to QUANTITY__U94192 ^
alter table TICKET_LINE_SHAPE alter column QUANTITY__U94192 set null ;
alter table TICKET_LINE_SHAPE add column QUANTITY integer ^
update TICKET_LINE_SHAPE set QUANTITY = 0 where QUANTITY is null ;
alter table TICKET_LINE_SHAPE alter column QUANTITY set not null ;
