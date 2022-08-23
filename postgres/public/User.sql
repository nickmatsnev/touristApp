create table "User"
(
    user_id       integer not null
        constraint user_pk
            primary key,
    name          text    not null,
    surname       text    not null,
    email         text    not null,
    password      text    not null,
    wallet        text    not null,
    notifications text
);

alter table "User"
    owner to postgres;

