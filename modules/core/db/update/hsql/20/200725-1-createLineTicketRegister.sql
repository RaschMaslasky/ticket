create table TICKET_LINE_TICKET_REGISTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ timestamp not null,
    PERSON_ID varchar(36) not null,
    TICKET_ID varchar(36) not null,
    QUANTITY integer not null,
    ISSUE_ID varchar(36),
    INCIDENT_ID varchar(36),
    TITLE_DOCUMENT_ID varchar(36),
    ACTIVITY_ID varchar(36),
    --
    primary key (ID)
);