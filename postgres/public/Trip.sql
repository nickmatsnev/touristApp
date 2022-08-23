create table "Trip"
(
    trip_id            integer not null
        constraint trip_pk
            primary key,
    "dateStart"        date    not null,
    "dateEnd"          integer not null,
    countries          text,
    cities             text,
    places             text    not null,
    money              integer not null,
    "transportOptions" text    not null,
    status             integer not null
);

alter table "Trip"
    owner to postgres;

