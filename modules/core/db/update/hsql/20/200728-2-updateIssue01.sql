alter table TICKET_ISSUE add constraint FK_TICKET_ISSUE_ON_ISSUE_PATTERN foreign key (ISSUE_PATTERN_ID) references TICKET_PATTERN(ID);
create index IDX_TICKET_ISSUE_ON_ISSUE_PATTERN on TICKET_ISSUE (ISSUE_PATTERN_ID);
