create table "ActivePlace"
(
    "positionInTrip" integer not null,
    place_id         integer not null
        constraint place_id_fk
            references "Place",
    trip_id          integer not null
        constraint trip_id_fk
            references "Trip"
);

comment on table "ActivePlace" is 'weak entity between Place and Trip';

alter table "ActivePlace"
    owner to postgres;

