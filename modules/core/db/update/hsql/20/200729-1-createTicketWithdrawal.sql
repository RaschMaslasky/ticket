create table TICKET_TICKET_WITHDRAWAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WITHDRAWAL_DATE timestamp not null,
    WITHDRAWAL_STATUS varchar(50) not null,
    WITHDRAWAL_ID varchar(255),
    RELATIVE_DOC_ID varchar(36),
    COMMENT_ varchar(255),
    --
    primary key (ID)
);