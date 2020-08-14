create table TICKET_LINE_COMMON_ACTIVITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INCIDENT_ID varchar(36),
    ACTIVITY_ID varchar(36) not null,
    REPORTER_ID varchar(36),
    RESPONSIBLE_ID varchar(36),
    SEQUENCE integer,
    ACTIVITY_STATUS varchar(50),
    DATE_FROM timestamp,
    DATE_TO timestamp,
    --
    primary key (ID)
);