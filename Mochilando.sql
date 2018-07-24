--PostgreSQL Maestro 17.8.0.3
------------------------------------------
--Host     : localhost
--Database : Mochilando


\connect - postgres
CREATE DATABASE "Mochilando" WITH TEMPLATE = template0 ENCODING = 6 TABLESPACE = pg_default;
\connect "Mochilando" postgres
-- Structure for table Usuario (OID = 16966):
SET search_path = public, pg_catalog;
CREATE TABLE "Usuario" (
    "cod_Usuario" varchar(5) NOT NULL,
    "nom_Usuario" varchar(20) NOT NULL,
    "sobrenome_Usuario" varchar(20) NOT NULL,
    "txt_Email" varchar(200) NOT NULL,
    "txt_Senha" varchar(32) NOT NULL,
    "img_Perfil" bytea
) WITHOUT OIDS;
-- Structure for table Diario (OID = 16972):
CREATE TABLE "Diario" (
    "cod_Diario" varchar(10) NOT NULL,
    "cod_Usuario_Autor" varchar(5) NOT NULL,
    "nom_Diario" varchar(30) NOT NULL,
    "dat_Publicacao" date NOT NULL,
    "dat_Inicio_Viagem" date NOT NULL,
    "dat_Fim_Viagem" date NOT NULL,
    "txt_Diario" text NOT NULL
) WITHOUT OIDS;
-- Structure for table Dia (OID = 16978):
CREATE TABLE "Dia" (
    seq_dia varchar(20) NOT NULL,
    "cod_Diario" varchar(10) NOT NULL,
    "txt_Dia" text NOT NULL
) WITHOUT OIDS;
-- Structure for table Dia_Atracao (OID = 16984):
CREATE TABLE "Dia_Atracao" (
    "seq_Atracao" varchar(10) NOT NULL,
    seq_dia varchar(20) NOT NULL
) WITHOUT OIDS;
-- Structure for table Foto (OID = 16987):
CREATE TABLE "Foto" (
    "seq_Foto" integer NOT NULL,
    seq_dia varchar(20) NOT NULL,
    foto bytea NOT NULL
) WITHOUT OIDS;
-- Structure for table Atracao (OID = 16993):
CREATE TABLE "Atracao" (
    "seq_Atracao" varchar(10) NOT NULL,
    "cod_Cidade_Atracao" varchar(4) NOT NULL,
    cod_tipo_atracao varchar(5) NOT NULL,
    "nom_Atracao" varchar(100) NOT NULL,
    "nro_Latitude" numeric(5,0) NOT NULL,
    "nro_Longitude" numeric(5,0) NOT NULL
) WITHOUT OIDS;
-- Structure for table Cidade (OID = 16996):
CREATE TABLE "Cidade" (
    "cod_Cidade" varchar(4) NOT NULL,
    "cod_Estado" varchar(2) NOT NULL,
    "nom_Cidade" varchar(20) NOT NULL
) WITHOUT OIDS;
-- Structure for table Estado (OID = 16999):
CREATE TABLE "Estado" (
    "cod_Estado" varchar(2) NOT NULL,
    "nom_Estado" varchar(20) NOT NULL
) WITHOUT OIDS;
-- Structure for table Comentario (OID = 17002):
CREATE TABLE "Comentario" (
    "seq_Comentario" varchar(10) NOT NULL,
    "cod_Diario" varchar(10) NOT NULL,
    "cod_Autor_Comentario" varchar(5) NOT NULL,
    "dat_Publicacao" date NOT NULL,
    "txt_Comentario" varchar(2000) NOT NULL
) WITHOUT OIDS;
-- Structure for table Avaliacao_Diario (OID = 17008):
CREATE TABLE "Avaliacao_Diario" (
    seq_avaliacao varchar(15) NOT NULL,
    "cod_Diario" varchar(10) NOT NULL,
    "cod_Usuario_Avaliador" varchar(5) NOT NULL,
    avaliacao char(1)
) WITHOUT OIDS;
-- Structure for table Preferencia (OID = 17011):
CREATE TABLE "Preferencia" (
    cod_preferencia varchar(20) NOT NULL,
    desc_preferencia varchar(50) NOT NULL
) WITHOUT OIDS;
-- Structure for table Avaliacao_Comentario (OID = 17014):
CREATE TABLE "Avaliacao_Comentario" (
    "seq_Avaliacao" varchar(15) NOT NULL,
    "seq_Comentario" varchar(10) NOT NULL,
    "cod_Usuario_Avaliador" varchar(5) NOT NULL,
    avaliacao char(1) NOT NULL
) WITHOUT OIDS;
-- Structure for table Tipo_Atracao (OID = 17017):
CREATE TABLE "Tipo_Atracao" (
    cod_tipo_atracao varchar(5) NOT NULL,
    desc_tipo_atracao varchar(100)
) WITHOUT OIDS;
-- Structure for table Usuario_Preferencia (OID = 17020):
CREATE TABLE "Usuario_Preferencia" (
    "cod_Usuario" varchar(10) NOT NULL,
    "cod_Preferencia" varchar(5) NOT NULL
) WITHOUT OIDS;
-- Definition for index IX_Relationship1 (OID = 17023):
CREATE INDEX "IX_Relationship1" ON public."Diario" USING btree ("cod_Usuario_Autor");
-- Definition for index fki_Relationship15 -> Usuario (OID = 17024):
CREATE INDEX "fki_Relationship15 -> Usuario" ON public."Avaliacao_Comentario" USING btree ("cod_Usuario_Avaliador");
-- Definition for index fki_Key13 (OID = 17025):
CREATE INDEX "fki_Key13" ON public."Atracao" USING btree (cod_tipo_atracao);
-- Definition for index fki_Relashionship16 (OID = 17026):
CREATE INDEX "fki_Relashionship16" ON public."Foto" USING btree (seq_dia);
-- Definition for index fki_Relashionship18 (OID = 17027):
CREATE INDEX "fki_Relashionship18" ON public."Dia_Atracao" USING btree ("seq_Atracao");
-- Definition for index fki_Relashionship19 (OID = 17028):
CREATE INDEX "fki_Relashionship19" ON public."Dia_Atracao" USING btree (seq_dia);
-- Definition for index fki_Relashionship20 (OID = 17029):
CREATE INDEX "fki_Relashionship20" ON public."Usuario_Preferencia" USING btree ("cod_Usuario");
-- Definition for index fki_Relashionship21 (OID = 17030):
CREATE INDEX "fki_Relashionship21" ON public."Usuario_Preferencia" USING btree ("cod_Preferencia");
-- Definition for index Key1 (OID = 17031):
ALTER TABLE ONLY "Usuario"
    ADD CONSTRAINT "Key1" PRIMARY KEY ("cod_Usuario");
-- Definition for index cod_Usuario (OID = 17033):
ALTER TABLE ONLY "Usuario"
    ADD CONSTRAINT "cod_Usuario" UNIQUE ("cod_Usuario");
-- Definition for index cod_Diario (OID = 17035):
ALTER TABLE ONLY "Diario"
    ADD CONSTRAINT "cod_Diario" UNIQUE ("cod_Diario");
-- Definition for index seq_Foto (OID = 17037):
ALTER TABLE ONLY "Foto"
    ADD CONSTRAINT "seq_Foto" UNIQUE ("seq_Foto");
-- Definition for index seq_Atracao_Visitada (OID = 17039):
ALTER TABLE ONLY "Atracao"
    ADD CONSTRAINT "seq_Atracao_Visitada" UNIQUE ("seq_Atracao");
-- Definition for index Key7 (OID = 17041):
ALTER TABLE ONLY "Cidade"
    ADD CONSTRAINT "Key7" PRIMARY KEY ("cod_Cidade", "cod_Estado");
-- Definition for index cod_Cidade (OID = 17043):
ALTER TABLE ONLY "Cidade"
    ADD CONSTRAINT "cod_Cidade" UNIQUE ("cod_Cidade");
-- Definition for index Key8 (OID = 17045):
ALTER TABLE ONLY "Estado"
    ADD CONSTRAINT "Key8" PRIMARY KEY ("cod_Estado");
-- Definition for index cod_Estado (OID = 17047):
ALTER TABLE ONLY "Estado"
    ADD CONSTRAINT "cod_Estado" UNIQUE ("cod_Estado");
-- Definition for index Key11 (OID = 17049):
ALTER TABLE ONLY "Preferencia"
    ADD CONSTRAINT "Key11" PRIMARY KEY (cod_preferencia);
-- Definition for index Relationship1 (OID = 17051):
ALTER TABLE ONLY "Diario"
    ADD CONSTRAINT "Relationship1" FOREIGN KEY ("cod_Usuario_Autor") REFERENCES "Usuario"("cod_Usuario");
-- Definition for index Relationship3 (OID = 17056):
ALTER TABLE ONLY "Comentario"
    ADD CONSTRAINT "Relationship3" FOREIGN KEY ("cod_Autor_Comentario") REFERENCES "Usuario"("cod_Usuario");
-- Definition for index Relationship4 (OID = 17061):
ALTER TABLE ONLY "Avaliacao_Diario"
    ADD CONSTRAINT "Relationship4" FOREIGN KEY ("cod_Usuario_Avaliador") REFERENCES "Usuario"("cod_Usuario");
-- Definition for index Relationship10 (OID = 17066):
ALTER TABLE ONLY "Cidade"
    ADD CONSTRAINT "Relationship10" FOREIGN KEY ("cod_Estado") REFERENCES "Estado"("cod_Estado");
-- Definition for index Relationship15 (OID = 17071):
ALTER TABLE ONLY "Avaliacao_Comentario"
    ADD CONSTRAINT "Relationship15" FOREIGN KEY ("cod_Usuario_Avaliador") REFERENCES "Usuario"("cod_Usuario");
-- Definition for index seq_comentario (OID = 17076):
ALTER TABLE ONLY "Comentario"
    ADD CONSTRAINT seq_comentario UNIQUE ("seq_Comentario");
-- Definition for index Key9 (OID = 17078):
ALTER TABLE ONLY "Comentario"
    ADD CONSTRAINT "Key9" PRIMARY KEY ("cod_Diario", "cod_Autor_Comentario", "seq_Comentario");
-- Definition for index Relashionship15 (OID = 17080):
ALTER TABLE ONLY "Avaliacao_Comentario"
    ADD CONSTRAINT "Relashionship15" FOREIGN KEY ("seq_Comentario") REFERENCES "Comentario"("seq_Comentario");
-- Definition for index Key12 (OID = 17085):
ALTER TABLE ONLY "Avaliacao_Comentario"
    ADD CONSTRAINT "Key12" PRIMARY KEY ("seq_Avaliacao", "seq_Comentario", "cod_Usuario_Avaliador");
-- Definition for index Avaliacao_Comentario_seq_Avaliacao_key (OID = 17087):
ALTER TABLE ONLY "Avaliacao_Comentario"
    ADD CONSTRAINT "Avaliacao_Comentario_seq_Avaliacao_key" UNIQUE ("seq_Avaliacao");
-- Definition for index Avaliacao_Diario_seq_avaliacao_key (OID = 17089):
ALTER TABLE ONLY "Avaliacao_Diario"
    ADD CONSTRAINT "Avaliacao_Diario_seq_avaliacao_key" UNIQUE (seq_avaliacao);
-- Definition for index Key10 (OID = 17091):
ALTER TABLE ONLY "Avaliacao_Diario"
    ADD CONSTRAINT "Key10" PRIMARY KEY ("cod_Diario", "cod_Usuario_Avaliador", seq_avaliacao);
-- Definition for index foreign_key01 (OID = 17093):
ALTER TABLE ONLY "Atracao"
    ADD CONSTRAINT foreign_key01 FOREIGN KEY ("cod_Cidade_Atracao") REFERENCES "Cidade"("cod_Cidade");
-- Definition for index Tipo_Atracao_pkey (OID = 17098):
ALTER TABLE ONLY "Tipo_Atracao"
    ADD CONSTRAINT "Tipo_Atracao_pkey" PRIMARY KEY (cod_tipo_atracao);
-- Definition for index Tipo_Atracao_cod_tipo_atracao_key (OID = 17100):
ALTER TABLE ONLY "Tipo_Atracao"
    ADD CONSTRAINT "Tipo_Atracao_cod_tipo_atracao_key" UNIQUE (cod_tipo_atracao);
-- Definition for index Relationship13 (OID = 17102):
ALTER TABLE ONLY "Atracao"
    ADD CONSTRAINT "Relationship13" FOREIGN KEY (cod_tipo_atracao) REFERENCES "Tipo_Atracao"(cod_tipo_atracao);
-- Definition for index Key6 (OID = 17107):
ALTER TABLE ONLY "Atracao"
    ADD CONSTRAINT "Key6" PRIMARY KEY ("seq_Atracao", cod_tipo_atracao, "cod_Cidade_Atracao");
-- Definition for index Foto_pkey (OID = 17109):
ALTER TABLE ONLY "Foto"
    ADD CONSTRAINT "Foto_pkey" PRIMARY KEY ("seq_Foto", seq_dia);
-- Definition for index Dia_pkey (OID = 17111):
ALTER TABLE ONLY "Dia"
    ADD CONSTRAINT "Dia_pkey" PRIMARY KEY (seq_dia, "cod_Diario");
-- Definition for index Dia_seq_dia_key (OID = 17113):
ALTER TABLE ONLY "Dia"
    ADD CONSTRAINT "Dia_seq_dia_key" UNIQUE (seq_dia);
-- Definition for index Relashionship16 (OID = 17115):
ALTER TABLE ONLY "Foto"
    ADD CONSTRAINT "Relashionship16" FOREIGN KEY (seq_dia) REFERENCES "Dia"(seq_dia);
-- Definition for index Diario_pkey (OID = 17120):
ALTER TABLE ONLY "Diario"
    ADD CONSTRAINT "Diario_pkey" PRIMARY KEY ("cod_Diario", "cod_Usuario_Autor");
-- Definition for index Relashionship (OID = 17122):
ALTER TABLE ONLY "Dia_Atracao"
    ADD CONSTRAINT "Relashionship" FOREIGN KEY ("seq_Atracao") REFERENCES "Atracao"("seq_Atracao");
-- Definition for index Relashionship19 (OID = 17127):
ALTER TABLE ONLY "Dia_Atracao"
    ADD CONSTRAINT "Relashionship19" FOREIGN KEY (seq_dia) REFERENCES "Dia"(seq_dia);
-- Definition for index Dia_Atracao_pkey (OID = 17132):
ALTER TABLE ONLY "Dia_Atracao"
    ADD CONSTRAINT "Dia_Atracao_pkey" PRIMARY KEY ("seq_Atracao", seq_dia);
-- Definition for index Preferencia_cod_preferencia_key (OID = 17134):
ALTER TABLE ONLY "Preferencia"
    ADD CONSTRAINT "Preferencia_cod_preferencia_key" UNIQUE (cod_preferencia);
-- Definition for index Relashionship20 (OID = 17136):
ALTER TABLE ONLY "Usuario_Preferencia"
    ADD CONSTRAINT "Relashionship20" FOREIGN KEY ("cod_Usuario") REFERENCES "Usuario"("cod_Usuario");
-- Definition for index Relashionship21 (OID = 17141):
ALTER TABLE ONLY "Usuario_Preferencia"
    ADD CONSTRAINT "Relashionship21" FOREIGN KEY ("cod_Preferencia") REFERENCES "Preferencia"(cod_preferencia);
-- Definition for index Usuario_Preferencia_pkey (OID = 17146):
ALTER TABLE ONLY "Usuario_Preferencia"
    ADD CONSTRAINT "Usuario_Preferencia_pkey" PRIMARY KEY ("cod_Usuario", "cod_Preferencia");
SET search_path = pg_catalog, pg_catalog;
COMMENT ON SCHEMA public IS 'standard public schema';
--
-- Comments
--
SET search_path = public, pg_catalog;
COMMENT ON COLUMN "Avaliacao_Diario".avaliacao IS 'L=like, D=deslike';
COMMENT ON COLUMN "Avaliacao_Comentario".avaliacao IS 'L=like, D=dislike';
