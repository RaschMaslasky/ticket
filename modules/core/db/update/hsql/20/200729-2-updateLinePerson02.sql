alter table TICKET_LINE_PERSON add constraint FK_TICKET_LINE_PERSON_ON_TICKET_WITHDRAWAL foreign key (TICKET_WITHDRAWAL_ID) references TICKET_TICKET_WITHDRAWAL(ID);
create index IDX_TICKET_LINE_PERSON_ON_TICKET_WITHDRAWAL on TICKET_LINE_PERSON (TICKET_WITHDRAWAL_ID);
