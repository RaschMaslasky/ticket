update TICKET_LINE_TICKET set QUANTITY = 0 where QUANTITY is null ;
alter table TICKET_LINE_TICKET alter column QUANTITY set not null ;
