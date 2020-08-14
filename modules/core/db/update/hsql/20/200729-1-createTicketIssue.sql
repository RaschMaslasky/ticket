create table TICKET_TICKET_ISSUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ISSUE_DATE timestamp not null,
    ISSUE_STATUS varchar(50) not null,
    ISSUE_ID varchar(255),
    RELATIVE_DOC_ID varchar(36),
    COMMENT_ varchar(255),
    --
    primary key (ID)
);