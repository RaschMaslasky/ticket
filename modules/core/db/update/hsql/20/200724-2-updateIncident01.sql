alter table TICKET_INCIDENT add constraint FK_TICKET_INCIDENT_ON_ISSUE foreign key (ISSUE_ID) references TICKET_ISSUE(ID);
create index IDX_TICKET_INCIDENT_ON_ISSUE on TICKET_INCIDENT (ISSUE_ID);
