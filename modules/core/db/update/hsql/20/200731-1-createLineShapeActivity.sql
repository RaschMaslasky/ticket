create table TICKET_LINE_SHAPE_ACTIVITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ACTIVITY_ID varchar(36),
    DURATION decimal(19, 2),
    SEQUENCE integer,
    COMMENT_ longvarchar,
    --
    primary key (ID)
);