create table "Place"
(
    place_id        integer not null
        constraint place_pk
            primary key,
    "dateStart"     date    not null,
    "dateEnd"       date    not null,
    price           integer not null,
    rating          integer,
    "googleReviews" text,
    location        text    not null,
    "transportTo"   integer not null
);

alter table "Place"
    owner to postgres;

