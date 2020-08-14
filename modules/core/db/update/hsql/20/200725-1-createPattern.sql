create table TICKET_PATTERN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    DATE_FROM date not null,
    DATE_TO date not null,
    COMMENT_ longvarchar,
    --
    primary key (ID)
);