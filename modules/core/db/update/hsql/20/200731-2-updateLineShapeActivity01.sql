alter table TICKET_LINE_SHAPE_ACTIVITY add constraint FK_TICKET_LINE_SHAPE_ACTIVITY_ON_ACTIVITY_PATTERN foreign key (ACTIVITY_PATTERN_ID) references TICKET_ACTIVITY_PATTERN(ID);
create index IDX_TICKET_LINE_SHAPE_ACTIVITY_ON_ACTIVITY_PATTERN on TICKET_LINE_SHAPE_ACTIVITY (ACTIVITY_PATTERN_ID);
