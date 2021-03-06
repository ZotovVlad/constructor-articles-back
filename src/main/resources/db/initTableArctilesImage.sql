create table articles_image
(
    id         int auto_increment,
    fio        text     null,
    email      text     null,
    author     text     null,
    annotation text     null,
    keywords   text     null,
    type       text     null,
    date       datetime null,
    resource0  int      null,
    resource1  int      null,
    resource2  int      null,
    resource3  int      null,
    resource4  int      null,
    resource5  int      null,
    resource6  int      null,
    resource7  int      null,
    resource8  int      null,
    resource9  int      null,
    constraint articles_pk
        primary key (id),
    constraint table_name_images_id_fk0
        foreign key (resource0) references images (id),
    constraint table_name_images_id_fk1
        foreign key (resource1) references images (id),
    constraint table_name_images_id_fk2
        foreign key (resource2) references images (id),
    constraint table_name_images_id_fk3
        foreign key (resource3) references images (id),
    constraint table_name_images_id_fk4
        foreign key (resource4) references images (id),
    constraint table_name_images_id_fk5
        foreign key (resource5) references images (id),
    constraint table_name_images_id_fk6
        foreign key (resource6) references images (id),
    constraint table_name_images_id_fk7
        foreign key (resource7) references images (id),
    constraint table_name_images_id_fk8
        foreign key (resource8) references images (id),
    constraint table_name_images_id_fk9
        foreign key (resource9) references images (id)
);