alter table TICKET_TICKET_ISSUE add constraint FK_TICKET_TICKET_ISSUE_ON_PERSONS foreign key (PERSONS_ID) references TICKET_LINE_PERSON(ID);
create index IDX_TICKET_TICKET_ISSUE_ON_PERSONS on TICKET_TICKET_ISSUE (PERSONS_ID);
