-- begin TICKET_PERSON
create table TICKET_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    SECURITY_LEVEL varchar(50),
    LAST_NAME varchar(255),
    INN varchar(255) not null,
    JOB varchar(255),
    DEPARTMENT varchar(255),
    ORGANIZATION varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_PERSON

-- begin TICKET_TICKET
create table TICKET_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255) not null,
    TYPE_ varchar(50) not null,
    STATUS varchar(50) not null,
    DATA_FROM date,
    DATA_TO date,
    --
    primary key (ID)
)^
-- end TICKET_TICKET
-- begin TICKET_LINE_PERSON
create table TICKET_LINE_PERSON (
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
    ISSUE_ID varchar(36) not null,
    TICKET_ISSUE_ID varchar(36) not null,
    TICKET_WITHDRAWAL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TICKET_LINE_PERSON
-- begin TICKET_LINE_TICKET
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
    QUANTITY integer not null,
    LINE_PERSON_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_TICKET
-- begin TICKET_ISSUE
create table TICKET_ISSUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ISSUE_DATE timestamp not null,
    ISSUE_STATUS varchar(50) not null,
    ISSUE_ID varchar(255),
    ISSUE_COMMENT longvarchar,
    RELATIVE_DOCS_ID varchar(36),
    ISSUE_PATTERN_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TICKET_ISSUE
-- begin TICKET_INCIDENT
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
    INCIDENT_DATE timestamp not null,
    INCIDENT_STATUS varchar(50) not null,
    TYPE_ varchar(50) not null,
    INCIDENT_ID varchar(255),
    COMMENT longvarchar,
    ACTIVITY_PATTERN_ID varchar(36),
    WORK_PLACE_ID varchar(36),
    INITIATOR_ID varchar(36),
    INITIATOR_DATE timestamp,
    INVESTIGATION_START_DATE varchar(255),
    INVESTIGATION_END_DATE timestamp,
    CONDITIONS longvarchar,
    DELAY_REASON longvarchar,
    VIEW_ID varchar(36),
    OUTCOME_ID varchar(36),
    REASON_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_INCIDENT

-- begin TICKET_LINE_SHAPE
create table TICKET_LINE_SHAPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TICKET_TYPE varchar(50) not null,
    COMMENT_ longvarchar,
    QUANTITY integer not null,
    PATTERN_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TICKET_LINE_SHAPE
-- begin TICKET_PATTERN
create table TICKET_PATTERN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    IS_DEFAULT boolean not null,
    DATE_FROM date not null,
    DATE_TO date not null,
    COMMENT_ longvarchar,
    --
    primary key (ID)
)^
-- end TICKET_PATTERN
-- begin TICKET_ACTIVITY
create table TICKET_ACTIVITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    ACTIVITY_TYPE varchar(50) not null,
    IS_REPORTED boolean,
    IS_CONTROLLED boolean,
    --
    primary key (ID)
)^
-- end TICKET_ACTIVITY
-- begin TICKET_TITLE_DOCS
create table TICKET_TITLE_DOCS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end TICKET_TITLE_DOCS
-- begin TICKET_LINE_TICKET_REGISTER
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
    TICKET_ID varchar(36) not null,
    PERSON_ID varchar(36),
    PATTERN_ID varchar(36),
    QUANTITY integer not null,
    ISSUE_ID varchar(36),
    INCIDENT_ID varchar(36),
    TITLE_DOCUMENT_ID varchar(36),
    ACTIVITY_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_TICKET_REGISTER
-- begin TICKET_TICKET_WITHDRAWAL
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
)^
-- end TICKET_TICKET_WITHDRAWAL
-- begin TICKET_TICKET_ISSUE
create table TICKET_TICKET_ISSUE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ISSUE_DATE timestamp not null,
    ISSUE_STATUS varchar(50) not null,
    ISSUE_ID varchar(255),
    PERSONS_ID varchar(36),
    RELATIVE_DOC_ID varchar(36),
    COMMENT_ varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_TICKET_ISSUE
-- begin TICKET_LINE_ACITIVITY
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
    RESPONSIBLE_ID varchar(36),
    REPORTER_ID varchar(36),
    SEQUENCE integer,
    ACTIVITY_STATUS varchar(50) not null,
    DATE_FROM timestamp,
    DATE_TO timestamp,
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_ACITIVITY
-- begin TICKET_ACTIVITY_PATTERN
create table TICKET_ACTIVITY_PATTERN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    INCIDENT_TYPE varchar(50) not null,
    COMMENT_ longvarchar,
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_ACTIVITY_PATTERN
-- begin TICKET_LINE_SHAPE_ACTIVITY
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
    ACTIVITY_PATTERN_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_SHAPE_ACTIVITY
-- begin TICKET_WORK_PLACE
create table TICKET_WORK_PLACE (
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
    --
    primary key (ID)
)^
-- end TICKET_WORK_PLACE

-- begin TICKET_LINE_STRUCKED_PERSON
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
    DAMAGE varchar(50),
    DAMAGE_DEGREE_ID varchar(36),
    COMMENT_ longvarchar,
    WORK_PLACE_ID varchar(36),
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_STRUCKED_PERSON
-- begin TICKET_LINE_COMMISSION_PERSON
create table TICKET_LINE_COMMISSION_PERSON (
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
    IS_CHAIRMAN boolean,
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_COMMISSION_PERSON
-- begin TICKET_LINE_VIOLATOR_PERSON
create table TICKET_LINE_VIOLATOR_PERSON (
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
    WORK_PLACE_ID varchar(36),
    GULTY_DEGREE integer,
    ACTIVITY_ID varchar(36),
    ACTIVITY_STATUS varchar(50),
    ACTIVITY_START_DATE timestamp,
    ACTIVITY_END_DATE timestamp,
    COMMENT_ longvarchar,
    INCIDENT_ID varchar(36),
    LAW_ARTICLE_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_VIOLATOR_PERSON
-- begin TICKET_INCIDENT_VIEW
create table TICKET_INCIDENT_VIEW (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME longvarchar not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_INCIDENT_VIEW
-- begin TICKET_INCIDENT_OUTCOME
create table TICKET_INCIDENT_OUTCOME (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_INCIDENT_OUTCOME
-- begin TICKET_INCIDENT_REASON
create table TICKET_INCIDENT_REASON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_INCIDENT_REASON
-- begin TICKET_DAMAGE_DEGREE
create table TICKET_DAMAGE_DEGREE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME longvarchar,
    CODE varchar(255),
    GROUP_ varchar(255),
    --
    primary key (ID)
)^
-- end TICKET_DAMAGE_DEGREE
-- begin TICKET_LINE_INVOLVED_PERSON
create table TICKET_LINE_INVOLVED_PERSON (
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
    INVOLVED_STATUS varchar(50),
    INCIDENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKET_LINE_INVOLVED_PERSON
-- begin TICKET_LINE_COMMON_ACTIVITY
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
)^
-- end TICKET_LINE_COMMON_ACTIVITY
-- begin TICKET_LINE_DOCS
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
)^
-- end TICKET_LINE_DOCS
-- begin TICKET_LAW_ARTICLE
create table TICKET_LAW_ARTICLE (
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
    ARTICLE longvarchar,
    BODY_ longvarchar,
    COMMENT_ longvarchar,
    --
    primary key (ID)
)^
-- end TICKET_LAW_ARTICLE
