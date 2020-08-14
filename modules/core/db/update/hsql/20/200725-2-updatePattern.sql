alter table TICKET_PATTERN add column IS_DEFAULT boolean ^
update TICKET_PATTERN set IS_DEFAULT = false where IS_DEFAULT is null ;
alter table TICKET_PATTERN alter column IS_DEFAULT set not null ;
