create table TICKET_ISSUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ varchar(255) not null,
    ISSUE_STATUS varchar(50) not null,
    ISSUE_ID varchar(255),
    --
    primary key (ID)
);