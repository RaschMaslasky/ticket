alter table TICKET_ISSUE alter column DATE_ rename to DATE___U03618 ^
alter table TICKET_ISSUE alter column DATE___U03618 set null ;
alter table TICKET_ISSUE add column ISSUE_DATE date ^
update TICKET_ISSUE set ISSUE_DATE = current_date where ISSUE_DATE is null ;
alter table TICKET_ISSUE alter column ISSUE_DATE set not null ;
