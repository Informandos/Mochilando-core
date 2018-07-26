CREATE TABLE "usuario" (

"cod_usuario" serial8 NOT NULL,

"nom_usuario" varchar(255) NOT NULL,

"sobrenome_usuario" varchar(255) NOT NULL,

"txt_email" varchar(255) NOT NULL,

"txt_senha" varchar(255) NOT NULL,

"img_perfil" bytea,

"sexo" varchar(9) NOT NULL,

"dat_nascimento" date NOT NULL,

"cod_cidade" serial4 NOT NULL,

PRIMARY KEY ("cod_usuario") ,

UNIQUE ("cod_usuario")

)

WITHOUT OIDS;




CREATE TABLE "estado" (

"cod_estado" serial2 NOT NULL,

"sigla" varchar(2) NOT NULL,

"nom_estado" varchar(30) NOT NULL,

PRIMARY KEY ("cod_estado") ,

UNIQUE ("cod_estado")

)

WITHOUT OIDS;



CREATE TABLE "cidade" (

"cod_cidade" serial4 NOT NULL,

"cod_estado" serial2 NOT NULL,

"nom_cidade" varchar(255) NOT NULL,

PRIMARY KEY ("cod_cidade", "cod_estado") ,

UNIQUE ("cod_cidade")

)

WITHOUT OIDS;



CREATE TABLE "diario" (

"cod_diario" serial8 NOT NULL,

"cod_usuario" serial8 NOT NULL,

"nom_diario" varchar NOT NULL,

"dat_publicacao" date NOT NULL,

"dat_inicio_viagem" date NOT NULL,

"dat_fim_viagem" date NOT NULL,

"txt_diario" varchar NOT NULL,

PRIMARY KEY ("cod_diario", "cod_usuario") ,

UNIQUE ("cod_diario")

)

WITHOUT OIDS;



CREATE TABLE "atracao" (

"seq_atracao" serial8 NOT NULL,

"cod_cidade_atracao" serial8 NOT NULL,

"cod_tipo_atracao" serial4 NOT NULL,

"nom_atracao" varchar NOT NULL,

"nro_latitude" float8 NOT NULL,

"nro_longitude" float8 NOT NULL,

PRIMARY KEY ("seq_atracao", "cod_cidade_atracao", "cod_tipo_atracao") ,

UNIQUE ("seq_atracao")

)

WITHOUT OIDS;



CREATE TABLE "comentario" (

"seq_comentario" serial8 NOT NULL,

"cod_diario" serial8 NOT NULL,

"cod_autor_comentario" serial8 NOT NULL,

"dat_publicacao" date NOT NULL,

"txt_comentario" varchar NOT NULL,

PRIMARY KEY ("seq_comentario", "cod_diario", "cod_autor_comentario") ,

UNIQUE ("seq_comentario")

)

WITHOUT OIDS;



CREATE TABLE "tipo_atracao" (

"cod_tipo_atracao" serial2 NOT NULL,

"desc_tipo_atracao" varchar NOT NULL,

PRIMARY KEY ("cod_tipo_atracao") ,

UNIQUE ("cod_tipo_atracao")

)

WITHOUT OIDS;



CREATE TABLE "dia" (

"seq_dia" serial8 NOT NULL,

"cod_diario" serial8 NOT NULL,

"txt_dia" varchar NOT NULL,

PRIMARY KEY ("seq_dia", "cod_diario") ,

UNIQUE ("seq_dia")

)

WITHOUT OIDS;



CREATE TABLE "dia_atracao" (

"seq_dia_atracao" serial8 NOT NULL,

"seq_atracao" serial8 NOT NULL,

"seq_dia" serial8 NOT NULL,

PRIMARY KEY ("seq_dia_atracao", "seq_atracao", "seq_dia") ,

UNIQUE ("seq_dia_atracao")

)

WITHOUT OIDS;



CREATE TABLE "avaliacao_comentario" (

"seq_avaliacao" serial8 NOT NULL,

"seq_comentario" serial8 NOT NULL,

"cod_usuario" serial8 NOT NULL,

"avaliacao" char NOT NULL,

PRIMARY KEY ("seq_avaliacao", "seq_comentario", "cod_usuario") ,

UNIQUE ("seq_avaliacao")

)

WITHOUT OIDS;



CREATE TABLE "avaliacao_diario" (

"seq_avaliacao" serial8 NOT NULL,

"cod_diario" serial8 NOT NULL,

"cod_usuario" serial8 NOT NULL,

"avaliacao" char NOT NULL,

PRIMARY KEY ("seq_avaliacao", "cod_diario", "cod_usuario") ,

UNIQUE ("seq_avaliacao")

)

WITHOUT OIDS;



CREATE TABLE "foto" (

"seq_foto" serial8 NOT NULL,

"seq_dia" serial8 NOT NULL,

"foto" bytea NOT NULL,

PRIMARY KEY ("seq_foto", "seq_dia") ,

UNIQUE ("seq_foto")

)

WITHOUT OIDS;



CREATE TABLE "tag" (

"cod_tag" serial4 NOT NULL,

"desc_tag" varchar NOT NULL,

PRIMARY KEY ("cod_tag") ,

UNIQUE ("cod_tag")

)

WITHOUT OIDS;



CREATE TABLE "usuario_tag" (

"seq_usuario_tag" serial8 NOT NULL,

"cod_usuario" serial8 NOT NULL,

"cod_tag" serial4 NOT NULL,

PRIMARY KEY ("seq_usuario_tag", "cod_usuario", "cod_tag") ,

UNIQUE ("seq_usuario_tag")

)

WITHOUT OIDS;



CREATE TABLE "tag_diario" (

"seq_tag_diario" serial8 NOT NULL,

"cod_diario" serial8 NOT NULL,

"cod_tag" serial8 NOT NULL,

PRIMARY KEY ("seq_tag_diario", "cod_diario", "cod_tag") ,

UNIQUE ("seq_tag_diario")

)

WITHOUT OIDS;





ALTER TABLE "cidade" ADD FOREIGN KEY ("cod_estado") REFERENCES "estado" ("cod_estado") MATCH FULL;

ALTER TABLE "usuario" ADD FOREIGN KEY ("cod_cidade") REFERENCES "cidade" ("cod_cidade") MATCH FULL;

ALTER TABLE "diario" ADD FOREIGN KEY ("cod_usuario") REFERENCES "usuario" ("cod_usuario") MATCH FULL;

ALTER TABLE "atracao" ADD FOREIGN KEY ("cod_cidade_atracao") REFERENCES "cidade" ("cod_cidade") MATCH FULL;

ALTER TABLE "comentario" ADD FOREIGN KEY ("cod_diario") REFERENCES "diario" ("cod_diario") MATCH FULL;

ALTER TABLE "comentario" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_autor_comentario") REFERENCES "usuario" ("cod_usuario") MATCH FULL;

ALTER TABLE "atracao" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_tipo_atracao") REFERENCES "tipo_atracao" ("cod_tipo_atracao") MATCH FULL;

ALTER TABLE "dia" ADD FOREIGN KEY ("cod_diario") REFERENCES "diario" ("cod_diario") MATCH FULL;

ALTER TABLE "dia_atracao" ADD FOREIGN KEY ("seq_atracao") REFERENCES "atracao" ("seq_atracao") MATCH FULL;

ALTER TABLE "dia_atracao" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("seq_dia") REFERENCES "dia" ("seq_dia") MATCH FULL;

ALTER TABLE "avaliacao_comentario" ADD FOREIGN KEY ("seq_comentario") REFERENCES "comentario" ("seq_comentario") MATCH FULL;

ALTER TABLE "avaliacao_comentario" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_usuario") REFERENCES "usuario" ("cod_usuario") MATCH FULL;

ALTER TABLE "avaliacao_diario" ADD FOREIGN KEY ("cod_diario") REFERENCES "diario" ("cod_diario") MATCH FULL;

ALTER TABLE "avaliacao_diario" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_usuario") REFERENCES "usuario" ("cod_usuario") MATCH FULL;

ALTER TABLE "foto" ADD FOREIGN KEY ("seq_dia") REFERENCES "dia" ("seq_dia") MATCH FULL;

ALTER TABLE "usuario_tag" ADD FOREIGN KEY ("cod_usuario") REFERENCES "usuario" ("cod_usuario") MATCH FULL;

ALTER TABLE "usuario_tag" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_tag") REFERENCES "tag" ("cod_tag") MATCH FULL;

ALTER TABLE "tag_diario" ADD FOREIGN KEY ("cod_diario") REFERENCES "diario" ("cod_diario") MATCH FULL;

ALTER TABLE "tag_diario" ADD CONSTRAINT "_copy_1" FOREIGN KEY ("cod_tag") REFERENCES "tag" ("cod_tag") MATCH FULL;



