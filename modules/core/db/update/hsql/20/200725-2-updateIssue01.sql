alter table TICKET_ISSUE add constraint FK_TICKET_ISSUE_ON_RELATIVE_DOCS foreign key (RELATIVE_DOCS_ID) references TICKET_INCIDENT(ID);
create index IDX_TICKET_ISSUE_ON_RELATIVE_DOCS on TICKET_ISSUE (RELATIVE_DOCS_ID);