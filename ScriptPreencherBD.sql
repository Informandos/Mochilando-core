-- Atração
insert into atracao (seq_atracao, cod_cidade_atracao, cod_tipo_atracao, nom_atracao, nro_latitude, nro_longitude) values (1, 1, 1, 'Praça da Liberdade', 1, 1);
insert into atracao (seq_atracao, cod_cidade_atracao, cod_tipo_atracao, nom_atracao, nro_latitude, nro_longitude) values (2, 2, 2, 'Parque Ibirapuera', 2, 2);
insert into atracao (seq_atracao, cod_cidade_atracao, cod_tipo_atracao, nom_atracao, nro_latitude, nro_longitude) values (3, 3, 2, 'Cristo Redentor', 3, 3);

-- Avaliação Comentário
insert into avaliacao_comentario (seq_avaliacao, seq_comentario, cod_usuario, avaliacao) values (1, 1, 1, 'N');
insert into avaliacao_comentario (seq_avaliacao, seq_comentario, cod_usuario, avaliacao) values (2, 2, 2, 'P');
insert into avaliacao_comentario (seq_avaliacao, seq_comentario, cod_usuario, avaliacao) values (3, 3, 3, 'P');

-- Avaliação Diário
insert into avaliacao_diario (seq_avaliacao, cod_diario, cod_usuario, avaliacao) values (1, 1, 1, 'P');
insert into avaliacao_diario (seq_avaliacao, cod_diario, cod_usuario, avaliacao) values (2, 2, 2, 'N');
insert into avaliacao_diario (seq_avaliacao, cod_diario, cod_usuario, avaliacao) values (3, 3, 3, 'N');

-- Cidade
insert into cidade (cod_cidade, cod_estado, nom_cidade) values (1, 1, 'Belo Horizonte');
insert into cidade (cod_cidade, cod_estado, nom_cidade) values (2, 2, 'São Paulo');
insert into cidade (cod_cidade, cod_estado, nom_cidade) values (3, 3, 'Rio de Janeiro');

-- Comentário
insert into comentario (seq_comentario, cod_diario, cod_autor_comentario, dat_publicacao, txt_comentario) values (1, 1, 3, '2018-05-06', 'Que legal');
insert into comentario (seq_comentario, cod_diario, cod_autor_comentario, dat_publicacao, txt_comentario) values (2, 2, 1, '2018-06-05', 'Top');
insert into comentario (seq_comentario, cod_diario, cod_autor_comentario, dat_publicacao, txt_comentario) values (3, 3, 2, '2018-04-08', 'Que bonito');

-- Dia
insert into dia (seq_dia, cod_diario, txt_dia, ordem_dia, data_dia) values (1, 1, 1, 'Dia na Praça da Liberdade', '2018-05-06');
insert into dia (seq_dia, cod_diario, txt_dia, ordem_dia, data_dia) values (2, 2, 1, 'Dia visitando o Parque Ibirapuera', '2018-06-05');
insert into dia (seq_dia, cod_diario, txt_dia, ordem_dia, data_dia) values (3, 3, 1, 'Dia conhecendo o Cristo Redentor', '2018-04-08');

-- Dia Atração
insert into dia_atracao (seq_dia_atracao, seq_atarcao, seq_dia) values (1, 1, 1);
insert into dia_atracao (seq_dia_atracao, seq_atarcao, seq_dia) values (2, 2, 2);
insert into dia_atracao (seq_dia_atracao, seq_atarcao, seq_dia) values (3, 3, 3);

-- Diário
insert into diario (cod_diario, cod_usuario, nom_diario, dat_publicacao, dat_inicio_viagem, dat_fim_viagem, txt_diario) values (1, 1, 'Viagem à Belo Horizonte-MG', '2018-05-05', '2018-05-05', '2018-05-12');
insert into diario (cod_diario, cod_usuario, nom_diario, dat_publicacao, dat_inicio_viagem, dat_fim_viagem, txt_diario) values (2, 2, 'Viagem à São Paulo-SP', '2018-06-04', '2018-06-04', '2018-06-11');
insert into diario (cod_diario, cod_usuario, nom_diario, dat_publicacao, dat_inicio_viagem, dat_fim_viagem, txt_diario) values (3, 3, 'Viagem ao Ria de Janeiro-RJ', '2018-04-07', '2018-04-07', '2018-04-14');

-- Estado
insert into estado (cod_estado, sigla, nom_estado) values (1, 'MG', 'Minas Gerais');
insert into estado (cod_estado, sigla, nom_estado) values (2, 'SP', 'São Paulo');
insert into estado (cod_estado, sigla, nom_estado) values (3, 'RJ', 'Rio de Janeiro');

-- Foto
insert into foto (seq_foto, seq_dia, foto) values (1, 1, lo_import('C:\Users\lucca\Desktop\imagensBD\pl.jpg'));
insert into foto (seq_foto, seq_dia, foto) values (2, 2, lo_import('C:\Users\lucca\Desktop\imagensBD\pi.jpg'));
insert into foto (seq_foto, seq_dia, foto) values (3, 3, lo_import('C:\Users\lucca\Desktop\imagensBD\cr.jpg'));

-- Tag
insert into tag (cod_tag, desc_tag) values (1, 'Belo Horizonte');
insert into tag (cod_tag, desc_tag) values (2, 'São Paulo');
insert into tag (cod_tag, desc_tag) values (3, 'Rio de Janeiro');

-- Tag Diário
insert into tag_diario (seq_tag_diario, cod_diario, cod_tag) values (1, 1, 1);
insert into tag_diario (seq_tag_diario, cod_diario, cod_tag) values (2, 2, 1);
insert into tag_diario (seq_tag_diario, cod_diario, cod_tag) values (3, 3, 1);

-- Tipo Atração
insert into tipo_atracao (cod_tipo_atracao, desc_tipo_atracao) values (1, 'Praça');
insert into tipo_atracao (cod_tipo_atracao, desc_tipo_atracao) values (2, 'Parque');
insert into tipo_atracao (cod_tipo_atracao, desc_tipo_atracao) values (3, 'Sete Maravilhas do Mundo Moderno');

-- Usuário
-- Senha: 1234567
insert into usuario (cod_usuario, nom_usuario, sobrenome_usuario, txt_email, txt_senha, img_perfil, sexo, dat_nascimento, cod_cidade) values (1, 'João', 'da Silva', 'joaosilva@email.com', 'fcea920f7412b5da7be0cf42b8c93759', lo_import('C:\Users\lucca\Desktop\imagensBD\joao.jpg'), 'M', '1990-03-07', 3);
-- Senha: 7654321
insert into usuario (cod_usuario, nom_usuario, sobrenome_usuario, txt_email, txt_senha, img_perfil, sexo, dat_nascimento, cod_cidade) values (2, 'Pedro', 'Alvares', 'pedroalvares@email.com', 'f0898af949a373e72a4f6a34b4de9090', lo_import('C:\Users\lucca\Desktop\imagensBD\pedro.jpg'), 'M', '1994-11-26', 1);
-- Senha: 1357926
insert into usuario (cod_usuario, nom_usuario, sobrenome_usuario, txt_email, txt_senha, img_perfil, sexo, dat_nascimento, cod_cidade) values (3, 'Maria', 'Pereira', 'mariapereira@email.com', '50cc5c8c54e4ddcfa4ef839dfec7f6a2', lo_import('C:\Users\lucca\Desktop\imagensBD\maria.jpg'), 'F', '1996-07-30', 3);

-- Usuário Tag
insert into usuario_tag (seq_usuario_tag, cod_usuario, cod_tag) values (1, 1, 1);
insert into usuario_tag (seq_usuario_tag, cod_usuario, cod_tag) values (2, 2, 2);
insert into usuario_tag (seq_usuario_tag, cod_usuario, cod_tag) values (3, 3, 3);