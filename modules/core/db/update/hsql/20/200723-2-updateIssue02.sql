alter table TICKET_ISSUE alter column DATE_ rename to DATE___U13222 ^
alter table TICKET_ISSUE alter column DATE___U13222 set null ;
alter table TICKET_ISSUE add column DATE_ date ^
update TICKET_ISSUE set DATE_ = current_date where DATE_ is null ;
alter table TICKET_ISSUE alter column DATE_ set not null ;
