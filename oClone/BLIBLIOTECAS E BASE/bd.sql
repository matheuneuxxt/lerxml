--
-- PostgreSQL database dump
--

-- Dumped from database version 9.1.3
-- Dumped by pg_dump version 9.1.3
-- Started on 2017-05-22 20:09:26

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 163 (class 3079 OID 11639)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1861 (class 0 OID 0)
-- Dependencies: 163
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 161 (class 1259 OID 16394)
-- Dependencies: 5
-- Name: cidade; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cidade (
    id integer NOT NULL,
    nome character varying(50),
    uf character varying(2)
);


ALTER TABLE public.cidade OWNER TO postgres;

--
-- TOC entry 162 (class 1259 OID 16399)
-- Dependencies: 5
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente (
    matricula integer NOT NULL,
    nome character varying(50),
    nascimento character varying(10)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 1854 (class 0 OID 16394)
-- Dependencies: 161
-- Data for Name: cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY cidade (id, nome, uf) FROM stdin;
1	Ibiruba	RS
2	Soledade	RS
\.


--
-- TOC entry 1855 (class 0 OID 16399)
-- Dependencies: 162
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY cliente (matricula, nome, nascimento) FROM stdin;
1745	Joao da Silva	11/01/1990
1988	Felipe da Silveira	11/05/1983
1788	Renata da Silva	10/01/1991
1966	Pedro da Silva	15/05/1990
1969	Dimas Oliveira	11/05/1988
1967	Bianca de Medeiros	10/01/1997
\.


--
-- TOC entry 1851 (class 2606 OID 16398)
-- Dependencies: 161 161
-- Name: cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cidade
    ADD CONSTRAINT cidade_pkey PRIMARY KEY (id);


--
-- TOC entry 1853 (class 2606 OID 16403)
-- Dependencies: 162 162
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (matricula);


--
-- TOC entry 1860 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2017-05-22 20:09:27

--
-- PostgreSQL database dump complete
--

