alter table TICKET_LINE_ACITIVITY alter column ACTIVITY_PATTERN_ID rename to ACTIVITY_PATTERN_ID__U45147 ^
alter table TICKET_LINE_ACITIVITY drop constraint FK_TICKET_LINE_ACITIVITY_ON_ACTIVITY_PATTERN ;
drop index IDX_TICKET_LINE_ACITIVITY_ON_ACTIVITY_PATTERN ;