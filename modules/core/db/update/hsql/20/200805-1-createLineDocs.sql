create table TICKET_LINE_DOCS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DOC_TYPE varchar(50),
    COMMENT_ varchar(255),
    DOC_LINK longvarchar,
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
);