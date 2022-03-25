create table images
(
    id                int auto_increment,
    name              varchar(100) not null,
    original_filename varchar(100) not null,
    content_type      varchar(100) not null,
    size              int          not null,
    bytes             longblob     not null,
    constraint images_pk
        primary key (id)
);