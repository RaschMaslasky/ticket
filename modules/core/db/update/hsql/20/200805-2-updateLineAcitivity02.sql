alter table TICKET_LINE_ACITIVITY add constraint FK_TICKET_LINE_ACITIVITY_ON_RESPONSIBLE foreign key (RESPONSIBLE_ID) references TICKET_PERSON(ID);
create index IDX_TICKET_LINE_ACITIVITY_ON_RESPONSIBLE on TICKET_LINE_ACITIVITY (RESPONSIBLE_ID);
