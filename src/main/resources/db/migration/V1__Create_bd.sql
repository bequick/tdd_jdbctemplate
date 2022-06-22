CREATE TABLE public.sesion
(
    id      bigserial NOT NULL,
    "token" varchar   NOT NULL,
    CONSTRAINT sesion_pk PRIMARY KEY (id)
);