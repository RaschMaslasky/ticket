create table TICKET_INCIDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INCIDENT_DATE date not null,
    INCIDENT_ID varchar(255),
    INCIDENT_STATUS varchar(50) not null,
    INCIDENT_COMMENT longvarchar,
    --
    primary key (ID)
);