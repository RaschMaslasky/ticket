alter table TICKET_LINE_STRUCKED_PERSON alter column DAMAGE_SEVERITY rename to DAMAGE_SEVERITY__U02005 ^
alter table TICKET_LINE_STRUCKED_PERSON add column DAMAGE_DEGREE_ID varchar(36) ;
alter table TICKET_LINE_STRUCKED_PERSON add column COMMENT_ longvarchar ;
