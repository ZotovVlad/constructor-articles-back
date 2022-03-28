create table images
(
    id                int auto_increment,
    name              text null,
    original_filename text null,
    content_type      text null,
    size              int null,
    bytes             longblob null,
    constraint images_pk
        primary key (id)
);