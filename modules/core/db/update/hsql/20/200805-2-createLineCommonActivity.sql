alter table TICKET_LINE_COMMON_ACTIVITY add constraint FK_TICKET_LINE_COMMON_ACTIVITY_ON_INCIDENT foreign key (INCIDENT_ID) references TICKET_INCIDENT(ID);
alter table TICKET_LINE_COMMON_ACTIVITY add constraint FK_TICKET_LINE_COMMON_ACTIVITY_ON_ACTIVITY foreign key (ACTIVITY_ID) references TICKET_ACTIVITY(ID);
alter table TICKET_LINE_COMMON_ACTIVITY add constraint FK_TICKET_LINE_COMMON_ACTIVITY_ON_REPORTER foreign key (REPORTER_ID) references TICKET_PERSON(ID);
alter table TICKET_LINE_COMMON_ACTIVITY add constraint FK_TICKET_LINE_COMMON_ACTIVITY_ON_RESPONSIBLE foreign key (RESPONSIBLE_ID) references TICKET_PERSON(ID);
create index IDX_TICKET_LINE_COMMON_ACTIVITY_ON_INCIDENT on TICKET_LINE_COMMON_ACTIVITY (INCIDENT_ID);
create index IDX_TICKET_LINE_COMMON_ACTIVITY_ON_ACTIVITY on TICKET_LINE_COMMON_ACTIVITY (ACTIVITY_ID);
create index IDX_TICKET_LINE_COMMON_ACTIVITY_ON_REPORTER on TICKET_LINE_COMMON_ACTIVITY (REPORTER_ID);
create index IDX_TICKET_LINE_COMMON_ACTIVITY_ON_RESPONSIBLE on TICKET_LINE_COMMON_ACTIVITY (RESPONSIBLE_ID);