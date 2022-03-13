create table regiao (
	id int auto_increment primary key,
    	regiao varchar(20),
    	total_exames int
);

create table faixa_etaria (
	id int auto_increment primary key,
	faixa_i int,
	faixa_n int,
	descricao varchar(50)
);

create table incidencia_exame (
	id int auto_increment primary key,
	regiao_id int,
	mes int,
	faixa_id int,
	qnt_exames int
);

alter table incidencia_exame add constraint fk_incidencia_exame foreign key (regiao_id) references regiao (id);
alter table incidencia_exame add constraint fk_faixa_etaria foreign key (faixa_id) references faixa_etaria (id);

INSERT INTO regiao (regiao,total_exames) VALUES ('Norte','44');
INSERT INTO regiao (regiao,total_exames) VALUES ('Nordeste','13832');
INSERT INTO regiao (regiao,total_exames) VALUES ('Sudeste','89657');
INSERT INTO regiao (regiao,total_exames) VALUES ('Sul','122');
INSERT INTO regiao (regiao,total_exames) VALUES ('Centro-Oeste','2581');

INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('0','10','Até 10 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('11','14','Entre 11 e 14 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('15','19','Entre 15 e 19 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('20','24','Entre 20 e 24 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('25','29','Entre 25 e 29 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('30','34','Entre 30 e 34 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('35','39','Entre 35 e 39 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('40','44','Entre 40 e 44 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('45','49','Entre 45 e 49 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('50','54','Entre 50 e 54 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('55','59','Entre 55 e 59 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('60','64','Entre 60 e 64 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('65','69','Entre 65 e 69 anos');
INSERT INTO faixa_etaria (faixa_i,faixa_n,descricao) VALUES ('70','150','Acima de 70');

INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,5,2,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,5,4,2);
