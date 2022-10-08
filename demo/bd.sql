create table clientes
(
    id                  integer not null
        constraint clientes_pk
            primary key,
    tipo_identificacion integer
        constraint clientes_tipo_identificacion_null_fk
            references tipo_identificacion (id),
    nombre              varchar,
    apellidos           varchar,
    edad                integer,
    telefono            integer,
    direccion           varchar
);
create table tipo_identificacion
(
    id          numeric
        constraint tipo_identificacion_pk
            unique,
    descripcion varchar
);

INSERT INTO tipo_identificacion (id, descripcion) VALUES (1, 'Cedula ciudadania');
INSERT INTO tipo_identificacion (id, descripcion) VALUES (2, 'Cedula extranjeria')
