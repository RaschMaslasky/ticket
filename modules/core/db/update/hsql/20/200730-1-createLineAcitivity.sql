create table TICKET_LINE_ACITIVITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ACTIVITY_ID varchar(36) not null,
    ACTIVITY_STATUS varchar(50) not null,
    DATE_FROM timestamp,
    DATE_TO timestamp,
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
);