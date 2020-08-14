alter table TICKET_LINE_PERSON add constraint FK_TICKET_LINE_PERSON_ON_PERSON foreign key (PERSON_ID) references TICKET_PERSON(ID);
alter table TICKET_LINE_PERSON add constraint FK_TICKET_LINE_PERSON_ON_ISSUE foreign key (ISSUE_ID) references TICKET_ISSUE(ID);
create index IDX_TICKET_LINE_PERSON_ON_PERSON on TICKET_LINE_PERSON (PERSON_ID);
create index IDX_TICKET_LINE_PERSON_ON_ISSUE on TICKET_LINE_PERSON (ISSUE_ID);