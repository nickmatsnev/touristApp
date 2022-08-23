create table "TripTourist"
(
    trip_id integer
        constraint trip_id
            references "Trip",
    user_id integer
        constraint user_id
            references "User",
    status  integer not null
);

comment on table "TripTourist" is 'weal entity to link tourists and trips';

alter table "TripTourist"
    owner to postgres;

