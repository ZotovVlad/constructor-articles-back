create table images
(
    id                int auto_increment,
    name              text not null,
    original_filename text not null,
    content_type      text not null,
    size              int          not null,
    bytes             longblob     not null,
    constraint images_pk
        primary key (id)
);