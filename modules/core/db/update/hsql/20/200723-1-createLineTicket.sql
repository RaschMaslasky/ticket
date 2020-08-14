create table TICKET_LINE_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TICKET_ID varchar(36) not null,
    QUANTITY integer,
    LINE_PERSON_ID varchar(36) not null,
    --
    primary key (ID)
);