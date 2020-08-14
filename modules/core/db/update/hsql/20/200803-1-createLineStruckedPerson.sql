create table TICKET_LINE_STRUCKED_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSON_ID varchar(36) not null,
    DAMAGE varchar(255),
    DAMAGE_SEVERITY varchar(255),
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
);