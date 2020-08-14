alter table TICKET_ISSUE alter column RELATIVE_DOC_ID rename to RELATIVE_DOC_ID__U93743 ^
alter table TICKET_ISSUE drop constraint FK_TICKET_ISSUE_ON_RELATIVE_DOC ;
drop index IDX_TICKET_ISSUE_ON_RELATIVE_DOC ;
alter table TICKET_ISSUE add column RELATIVE_DOCS_ID varchar(36) ;
