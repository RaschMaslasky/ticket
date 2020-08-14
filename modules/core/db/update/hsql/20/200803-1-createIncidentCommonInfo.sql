create table TICKET_INCIDENT_COMMON_INFO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WORK_PLACE_ID varchar(36),
    INITIATOR_ID varchar(36),
    CONDITIONS longvarchar,
    DELAY_REASON varchar(255),
    --
    primary key (ID)
);