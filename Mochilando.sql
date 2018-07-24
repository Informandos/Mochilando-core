--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4
-- Dumped by pg_dump version 10.4

-- Started on 2018-07-24 10:30:40

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2942 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 201 (class 1259 OID 17563)
-- Name: Atracao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Atracao" (
    "seq_Atracao" character varying(10) NOT NULL,
    "cod_Cidade_Atracao" character varying(4) NOT NULL,
    cod_tipo_atracao character varying(5) NOT NULL,
    "nom_Atracao" character varying(100) NOT NULL,
    "nro_Latitude" numeric(5,0) NOT NULL,
    "nro_Longitude" numeric(5,0) NOT NULL
);


ALTER TABLE public."Atracao" OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 17584)
-- Name: Avaliacao_Comentario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Avaliacao_Comentario" (
    "seq_Avaliacao" character varying(15) NOT NULL,
    "seq_Comentario" character varying(10) NOT NULL,
    "cod_Usuario_Avaliador" character varying(5) NOT NULL,
    avaliacao character(1) NOT NULL
);


ALTER TABLE public."Avaliacao_Comentario" OWNER TO postgres;

--
-- TOC entry 2943 (class 0 OID 0)
-- Dependencies: 207
-- Name: COLUMN "Avaliacao_Comentario".avaliacao; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public."Avaliacao_Comentario".avaliacao IS 'L=like, D=dislike';


--
-- TOC entry 205 (class 1259 OID 17578)
-- Name: Avaliacao_Diario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Avaliacao_Diario" (
    seq_avaliacao character varying(15) NOT NULL,
    "cod_Diario" character varying(10) NOT NULL,
    "cod_Usuario_Avaliador" character varying(5) NOT NULL,
    avaliacao character(1)
);


ALTER TABLE public."Avaliacao_Diario" OWNER TO postgres;

--
-- TOC entry 2944 (class 0 OID 0)
-- Dependencies: 205
-- Name: COLUMN "Avaliacao_Diario".avaliacao; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public."Avaliacao_Diario".avaliacao IS 'L=like, D=deslike';


--
-- TOC entry 202 (class 1259 OID 17566)
-- Name: Cidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Cidade" (
    "cod_Cidade" character varying(4) NOT NULL,
    "cod_Estado" character varying(2) NOT NULL,
    "nom_Cidade" character varying(40) NOT NULL
);


ALTER TABLE public."Cidade" OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 17572)
-- Name: Comentario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Comentario" (
    "seq_Comentario" character varying(10) NOT NULL,
    "cod_Diario" character varying(10) NOT NULL,
    "cod_Autor_Comentario" character varying(5) NOT NULL,
    "dat_Publicacao" date NOT NULL,
    "txt_Comentario" character varying(2000) NOT NULL
);


ALTER TABLE public."Comentario" OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 17548)
-- Name: Dia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Dia" (
    seq_dia character varying(20) NOT NULL,
    "cod_Diario" character varying(10) NOT NULL,
    "txt_Dia" text NOT NULL
);


ALTER TABLE public."Dia" OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 17554)
-- Name: Dia_Atracao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Dia_Atracao" (
    "seq_Atracao" character varying(10) NOT NULL,
    seq_dia character varying(20) NOT NULL
);


ALTER TABLE public."Dia_Atracao" OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 17542)
-- Name: Diario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Diario" (
    "cod_Diario" character varying(10) NOT NULL,
    "cod_Usuario_Autor" character varying(5) NOT NULL,
    "nom_Diario" character varying(30) NOT NULL,
    "dat_Publicacao" date NOT NULL,
    "dat_Inicio_Viagem" date NOT NULL,
    "dat_Fim_Viagem" date NOT NULL,
    "txt_Diario" text NOT NULL
);


ALTER TABLE public."Diario" OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 17569)
-- Name: Estado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Estado" (
    "cod_Estado" character varying(2) NOT NULL,
    "nom_Estado" character varying(20) NOT NULL
);


ALTER TABLE public."Estado" OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 17557)
-- Name: Foto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Foto" (
    "seq_Foto" integer NOT NULL,
    seq_dia character varying(20) NOT NULL,
    foto bytea NOT NULL
);


ALTER TABLE public."Foto" OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 17581)
-- Name: Preferencia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Preferencia" (
    cod_preferencia character varying(20) NOT NULL,
    desc_preferencia character varying(50) NOT NULL
);


ALTER TABLE public."Preferencia" OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 17587)
-- Name: Tipo_Atracao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Tipo_Atracao" (
    cod_tipo_atracao character varying(5) NOT NULL,
    desc_tipo_atracao character varying(100)
);


ALTER TABLE public."Tipo_Atracao" OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 17536)
-- Name: Usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Usuario" (
    "cod_Usuario" character varying(5) NOT NULL,
    "nom_Usuario" character varying(20) NOT NULL,
    "sobrenome_Usuario" character varying(20) NOT NULL,
    "txt_Email" character varying(200) NOT NULL,
    "txt_Senha" character varying(32) NOT NULL,
    "img_Perfil" bytea,
    sexo character varying(9) NOT NULL,
    dat_nascimento date NOT NULL,
    cod_cidade character varying(4) NOT NULL
);


ALTER TABLE public."Usuario" OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 17590)
-- Name: Usuario_Preferencia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Usuario_Preferencia" (
    "cod_Usuario" character varying(10) NOT NULL,
    "cod_Preferencia" character varying(5) NOT NULL
);


ALTER TABLE public."Usuario_Preferencia" OWNER TO postgres;

--
-- TOC entry 2926 (class 0 OID 17563)
-- Dependencies: 201
-- Data for Name: Atracao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Atracao" ("seq_Atracao", "cod_Cidade_Atracao", cod_tipo_atracao, "nom_Atracao", "nro_Latitude", "nro_Longitude") FROM stdin;
\.


--
-- TOC entry 2932 (class 0 OID 17584)
-- Dependencies: 207
-- Data for Name: Avaliacao_Comentario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Avaliacao_Comentario" ("seq_Avaliacao", "seq_Comentario", "cod_Usuario_Avaliador", avaliacao) FROM stdin;
\.


--
-- TOC entry 2930 (class 0 OID 17578)
-- Dependencies: 205
-- Data for Name: Avaliacao_Diario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Avaliacao_Diario" (seq_avaliacao, "cod_Diario", "cod_Usuario_Avaliador", avaliacao) FROM stdin;
\.


--
-- TOC entry 2927 (class 0 OID 17566)
-- Dependencies: 202
-- Data for Name: Cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Cidade" ("cod_Cidade", "cod_Estado", "nom_Cidade") FROM stdin;
\.


--
-- TOC entry 2929 (class 0 OID 17572)
-- Dependencies: 204
-- Data for Name: Comentario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Comentario" ("seq_Comentario", "cod_Diario", "cod_Autor_Comentario", "dat_Publicacao", "txt_Comentario") FROM stdin;
\.


--
-- TOC entry 2923 (class 0 OID 17548)
-- Dependencies: 198
-- Data for Name: Dia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Dia" (seq_dia, "cod_Diario", "txt_Dia") FROM stdin;
\.


--
-- TOC entry 2924 (class 0 OID 17554)
-- Dependencies: 199
-- Data for Name: Dia_Atracao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Dia_Atracao" ("seq_Atracao", seq_dia) FROM stdin;
\.


--
-- TOC entry 2922 (class 0 OID 17542)
-- Dependencies: 197
-- Data for Name: Diario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Diario" ("cod_Diario", "cod_Usuario_Autor", "nom_Diario", "dat_Publicacao", "dat_Inicio_Viagem", "dat_Fim_Viagem", "txt_Diario") FROM stdin;
\.


--
-- TOC entry 2928 (class 0 OID 17569)
-- Dependencies: 203
-- Data for Name: Estado; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Estado" ("cod_Estado", "nom_Estado") FROM stdin;
\.


--
-- TOC entry 2925 (class 0 OID 17557)
-- Dependencies: 200
-- Data for Name: Foto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Foto" ("seq_Foto", seq_dia, foto) FROM stdin;
\.


--
-- TOC entry 2931 (class 0 OID 17581)
-- Dependencies: 206
-- Data for Name: Preferencia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Preferencia" (cod_preferencia, desc_preferencia) FROM stdin;
\.


--
-- TOC entry 2933 (class 0 OID 17587)
-- Dependencies: 208
-- Data for Name: Tipo_Atracao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Tipo_Atracao" (cod_tipo_atracao, desc_tipo_atracao) FROM stdin;
\.


--
-- TOC entry 2921 (class 0 OID 17536)
-- Dependencies: 196
-- Data for Name: Usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Usuario" ("cod_Usuario", "nom_Usuario", "sobrenome_Usuario", "txt_Email", "txt_Senha", "img_Perfil", sexo, dat_nascimento, cod_cidade) FROM stdin;
\.


--
-- TOC entry 2934 (class 0 OID 17590)
-- Dependencies: 209
-- Data for Name: Usuario_Preferencia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Usuario_Preferencia" ("cod_Usuario", "cod_Preferencia") FROM stdin;
\.


--
-- TOC entry 2774 (class 2606 OID 17658)
-- Name: Avaliacao_Comentario Avaliacao_Comentario_seq_Avaliacao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Comentario"
    ADD CONSTRAINT "Avaliacao_Comentario_seq_Avaliacao_key" UNIQUE ("seq_Avaliacao");


--
-- TOC entry 2766 (class 2606 OID 17660)
-- Name: Avaliacao_Diario Avaliacao_Diario_seq_avaliacao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Diario"
    ADD CONSTRAINT "Avaliacao_Diario_seq_avaliacao_key" UNIQUE (seq_avaliacao);


--
-- TOC entry 2740 (class 2606 OID 17703)
-- Name: Dia_Atracao Dia_Atracao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Dia_Atracao"
    ADD CONSTRAINT "Dia_Atracao_pkey" PRIMARY KEY ("seq_Atracao", seq_dia);


--
-- TOC entry 2736 (class 2606 OID 17682)
-- Name: Dia Dia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Dia"
    ADD CONSTRAINT "Dia_pkey" PRIMARY KEY (seq_dia, "cod_Diario");


--
-- TOC entry 2738 (class 2606 OID 17684)
-- Name: Dia Dia_seq_dia_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Dia"
    ADD CONSTRAINT "Dia_seq_dia_key" UNIQUE (seq_dia);


--
-- TOC entry 2731 (class 2606 OID 17691)
-- Name: Diario Diario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Diario"
    ADD CONSTRAINT "Diario_pkey" PRIMARY KEY ("cod_Diario", "cod_Usuario_Autor");


--
-- TOC entry 2744 (class 2606 OID 17680)
-- Name: Foto Foto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Foto"
    ADD CONSTRAINT "Foto_pkey" PRIMARY KEY ("seq_Foto", seq_dia);


--
-- TOC entry 2726 (class 2606 OID 17602)
-- Name: Usuario Key1; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "Key1" PRIMARY KEY ("cod_Usuario");


--
-- TOC entry 2768 (class 2606 OID 17662)
-- Name: Avaliacao_Diario Key10; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Diario"
    ADD CONSTRAINT "Key10" PRIMARY KEY ("cod_Diario", "cod_Usuario_Avaliador", seq_avaliacao);


--
-- TOC entry 2770 (class 2606 OID 17620)
-- Name: Preferencia Key11; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Preferencia"
    ADD CONSTRAINT "Key11" PRIMARY KEY (cod_preferencia);


--
-- TOC entry 2776 (class 2606 OID 17656)
-- Name: Avaliacao_Comentario Key12; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Comentario"
    ADD CONSTRAINT "Key12" PRIMARY KEY ("seq_Avaliacao", "seq_Comentario", "cod_Usuario_Avaliador");


--
-- TOC entry 2749 (class 2606 OID 17678)
-- Name: Atracao Key6; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Atracao"
    ADD CONSTRAINT "Key6" PRIMARY KEY ("seq_Atracao", cod_tipo_atracao, "cod_Cidade_Atracao");


--
-- TOC entry 2754 (class 2606 OID 17612)
-- Name: Cidade Key7; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cidade"
    ADD CONSTRAINT "Key7" PRIMARY KEY ("cod_Cidade", "cod_Estado");


--
-- TOC entry 2758 (class 2606 OID 17616)
-- Name: Estado Key8; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Estado"
    ADD CONSTRAINT "Key8" PRIMARY KEY ("cod_Estado");


--
-- TOC entry 2762 (class 2606 OID 17649)
-- Name: Comentario Key9; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Comentario"
    ADD CONSTRAINT "Key9" PRIMARY KEY ("cod_Diario", "cod_Autor_Comentario", "seq_Comentario");


--
-- TOC entry 2772 (class 2606 OID 17705)
-- Name: Preferencia Preferencia_cod_preferencia_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Preferencia"
    ADD CONSTRAINT "Preferencia_cod_preferencia_key" UNIQUE (cod_preferencia);


--
-- TOC entry 2779 (class 2606 OID 17671)
-- Name: Tipo_Atracao Tipo_Atracao_cod_tipo_atracao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tipo_Atracao"
    ADD CONSTRAINT "Tipo_Atracao_cod_tipo_atracao_key" UNIQUE (cod_tipo_atracao);


--
-- TOC entry 2781 (class 2606 OID 17669)
-- Name: Tipo_Atracao Tipo_Atracao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Tipo_Atracao"
    ADD CONSTRAINT "Tipo_Atracao_pkey" PRIMARY KEY (cod_tipo_atracao);


--
-- TOC entry 2783 (class 2606 OID 17717)
-- Name: Usuario_Preferencia Usuario_Preferencia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario_Preferencia"
    ADD CONSTRAINT "Usuario_Preferencia_pkey" PRIMARY KEY ("cod_Usuario", "cod_Preferencia");


--
-- TOC entry 2756 (class 2606 OID 17614)
-- Name: Cidade cod_Cidade; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cidade"
    ADD CONSTRAINT "cod_Cidade" UNIQUE ("cod_Cidade");


--
-- TOC entry 2734 (class 2606 OID 17606)
-- Name: Diario cod_Diario; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Diario"
    ADD CONSTRAINT "cod_Diario" UNIQUE ("cod_Diario");


--
-- TOC entry 2760 (class 2606 OID 17618)
-- Name: Estado cod_Estado; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Estado"
    ADD CONSTRAINT "cod_Estado" UNIQUE ("cod_Estado");


--
-- TOC entry 2728 (class 2606 OID 17604)
-- Name: Usuario cod_Usuario; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "cod_Usuario" UNIQUE ("cod_Usuario");


--
-- TOC entry 2752 (class 2606 OID 17610)
-- Name: Atracao seq_Atracao_Visitada; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Atracao"
    ADD CONSTRAINT "seq_Atracao_Visitada" UNIQUE ("seq_Atracao");


--
-- TOC entry 2747 (class 2606 OID 17608)
-- Name: Foto seq_Foto; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Foto"
    ADD CONSTRAINT "seq_Foto" UNIQUE ("seq_Foto");


--
-- TOC entry 2764 (class 2606 OID 17647)
-- Name: Comentario seq_comentario; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Comentario"
    ADD CONSTRAINT seq_comentario UNIQUE ("seq_Comentario");


--
-- TOC entry 2732 (class 1259 OID 17593)
-- Name: IX_Relationship1; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "IX_Relationship1" ON public."Diario" USING btree ("cod_Usuario_Autor");


--
-- TOC entry 2750 (class 1259 OID 17595)
-- Name: fki_Key13; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Key13" ON public."Atracao" USING btree (cod_tipo_atracao);


--
-- TOC entry 2745 (class 1259 OID 17596)
-- Name: fki_Relashionship16; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship16" ON public."Foto" USING btree (seq_dia);


--
-- TOC entry 2741 (class 1259 OID 17597)
-- Name: fki_Relashionship18; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship18" ON public."Dia_Atracao" USING btree ("seq_Atracao");


--
-- TOC entry 2742 (class 1259 OID 17598)
-- Name: fki_Relashionship19; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship19" ON public."Dia_Atracao" USING btree (seq_dia);


--
-- TOC entry 2784 (class 1259 OID 17599)
-- Name: fki_Relashionship20; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship20" ON public."Usuario_Preferencia" USING btree ("cod_Usuario");


--
-- TOC entry 2785 (class 1259 OID 17600)
-- Name: fki_Relashionship21; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship21" ON public."Usuario_Preferencia" USING btree ("cod_Preferencia");


--
-- TOC entry 2729 (class 1259 OID 17723)
-- Name: fki_Relashionship22; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relashionship22" ON public."Usuario" USING btree (cod_cidade);


--
-- TOC entry 2777 (class 1259 OID 17594)
-- Name: fki_Relationship15 -> Usuario; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_Relationship15 -> Usuario" ON public."Avaliacao_Comentario" USING btree ("cod_Usuario_Avaliador");


--
-- TOC entry 2788 (class 2606 OID 17692)
-- Name: Dia_Atracao Relashionship; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Dia_Atracao"
    ADD CONSTRAINT "Relashionship" FOREIGN KEY ("seq_Atracao") REFERENCES public."Atracao"("seq_Atracao");


--
-- TOC entry 2797 (class 2606 OID 17650)
-- Name: Avaliacao_Comentario Relashionship15; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Comentario"
    ADD CONSTRAINT "Relashionship15" FOREIGN KEY ("seq_Comentario") REFERENCES public."Comentario"("seq_Comentario");


--
-- TOC entry 2790 (class 2606 OID 17685)
-- Name: Foto Relashionship16; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Foto"
    ADD CONSTRAINT "Relashionship16" FOREIGN KEY (seq_dia) REFERENCES public."Dia"(seq_dia);


--
-- TOC entry 2789 (class 2606 OID 17697)
-- Name: Dia_Atracao Relashionship19; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Dia_Atracao"
    ADD CONSTRAINT "Relashionship19" FOREIGN KEY (seq_dia) REFERENCES public."Dia"(seq_dia);


--
-- TOC entry 2798 (class 2606 OID 17706)
-- Name: Usuario_Preferencia Relashionship20; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario_Preferencia"
    ADD CONSTRAINT "Relashionship20" FOREIGN KEY ("cod_Usuario") REFERENCES public."Usuario"("cod_Usuario");


--
-- TOC entry 2799 (class 2606 OID 17711)
-- Name: Usuario_Preferencia Relashionship21; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario_Preferencia"
    ADD CONSTRAINT "Relashionship21" FOREIGN KEY ("cod_Preferencia") REFERENCES public."Preferencia"(cod_preferencia);


--
-- TOC entry 2786 (class 2606 OID 17718)
-- Name: Usuario Relashionship22; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "Relashionship22" FOREIGN KEY (cod_cidade) REFERENCES public."Cidade"("cod_Cidade");


--
-- TOC entry 2787 (class 2606 OID 17621)
-- Name: Diario Relationship1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Diario"
    ADD CONSTRAINT "Relationship1" FOREIGN KEY ("cod_Usuario_Autor") REFERENCES public."Usuario"("cod_Usuario");


--
-- TOC entry 2793 (class 2606 OID 17636)
-- Name: Cidade Relationship10; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cidade"
    ADD CONSTRAINT "Relationship10" FOREIGN KEY ("cod_Estado") REFERENCES public."Estado"("cod_Estado");


--
-- TOC entry 2792 (class 2606 OID 17672)
-- Name: Atracao Relationship13; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Atracao"
    ADD CONSTRAINT "Relationship13" FOREIGN KEY (cod_tipo_atracao) REFERENCES public."Tipo_Atracao"(cod_tipo_atracao);


--
-- TOC entry 2796 (class 2606 OID 17641)
-- Name: Avaliacao_Comentario Relationship15; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Comentario"
    ADD CONSTRAINT "Relationship15" FOREIGN KEY ("cod_Usuario_Avaliador") REFERENCES public."Usuario"("cod_Usuario");


--
-- TOC entry 2794 (class 2606 OID 17626)
-- Name: Comentario Relationship3; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Comentario"
    ADD CONSTRAINT "Relationship3" FOREIGN KEY ("cod_Autor_Comentario") REFERENCES public."Usuario"("cod_Usuario");


--
-- TOC entry 2795 (class 2606 OID 17631)
-- Name: Avaliacao_Diario Relationship4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Avaliacao_Diario"
    ADD CONSTRAINT "Relationship4" FOREIGN KEY ("cod_Usuario_Avaliador") REFERENCES public."Usuario"("cod_Usuario");


--
-- TOC entry 2791 (class 2606 OID 17663)
-- Name: Atracao foreign_key01; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Atracao"
    ADD CONSTRAINT foreign_key01 FOREIGN KEY ("cod_Cidade_Atracao") REFERENCES public."Cidade"("cod_Cidade");


-- Completed on 2018-07-24 10:30:41

--
-- PostgreSQL database dump complete
--

