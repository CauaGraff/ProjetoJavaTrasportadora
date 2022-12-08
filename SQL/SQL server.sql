create table OrdemServico(
	id int not null AUTO_INCREMENT PRIMARY KEY,
	destino text,
	kmViagem decimal(10,2),
	valor decimal(10,2),
	id_veiculo int,
	id_parceiro int
	);

create table Veiculo(
	id int NOT NULL,
	placa char(7),
	kilometragem decimal(10,2),
	cor varchar(40),
	ano int,
	marca varchar(40),
	numChassi char(17),
	id_motorista int,
	id_reboque int
);


create table Multa(
	id int not null AUTO_INCREMENT PRIMARY KEY,
	lo varchar(40),
	dataMulta dateTime,
	id_veiculo int,
	id_motorista int
);

create table Motorista (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	dataNasc date,
	endereco text,
	cpf char(11),
	cnh char(9)
);

create table Reboque (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	placa char(7),
	renavam char(11),
	ano int,
	capacidade decimal(10,2)
);

create table Abastecidas (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	valor decimal(10,2),
	tipoProduto varchar(40),
	quantidade int,
	id_veiculo int,
	id_conta int
);

create table Contas (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	valor decimal(10,2),
	nf int,
	cte int
);

create table Manutencao (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	valro decimal(10,2),
	dataManutencao date,
	id_conta int
);

create table Parceiros (
	id int not null AUTO_INCREMENT PRIMARY KEY,
	razaoSocial varchar(40),
	servicoPrestado varchar(40),
	cnpj char(14),
	produto varchar(40)
);

/* PRIMARY KEYS  - CHAVES PRIMARIAS */
ALTER TABLE OrdemServico 
ADD CONSTRAINT PK_OrdemServico 
PRIMARY KEY(id);

alter table Abastecidas
	add constraint PK_Abastecidas
		primary key(id);

alter table Contas
	add constraint PK_Contas
		primary key(id);

alter table Manutencao
	add constraint PK_Manutencao
		primary key(id);

alter table Motorista
	add constraint PK_Motorista
		primary key(id);

alter table Multa
	add constraint PK_Multa
		primary key(id);

alter table Parceiros
	add constraint PK_Parceiros
		primary key(id);

alter table Reboque
	add constraint PK_Reboque
		primary key(id);

alter table Veiculo
	add constraint PK_Veiculo
		primary key(id);

/* FOREIGN KEYS - CHAVES ESTRANGEIRAS */
ALTER TABLE Abastecidas 
	ADD CONSTRAINT FK_Abastecidas 
		FOREIGN KEY (id_veiculo)
			REFERENCES Veiculo (id);

ALTER TABLE Abastecidas 
	ADD CONSTRAINT FK_Contas 
		FOREIGN KEY (id_conta)
			REFERENCES Contas (id);

ALTER TABLE Manutencao 
	ADD CONSTRAINT FK_Contas_Manutencao 
		FOREIGN KEY (id_conta)
			REFERENCES Contas (id);

ALTER TABLE Multa 
	ADD CONSTRAINT FK_Veiculo_Multa 
		FOREIGN KEY (id_veiculo)
			REFERENCES Veiculo (id);

ALTER TABLE Multa 
	ADD CONSTRAINT FK_Motorista_Multa 
		FOREIGN KEY (id_motorista)
			REFERENCES Veiculo (id);

ALTER TABLE OrdemServico 
	ADD CONSTRAINT FK_Veiculo_OrdemServico
		FOREIGN KEY (id_veiculo)
			REFERENCES Veiculo (id);

ALTER TABLE OrdemServico 
	ADD CONSTRAINT FK_Parceiro_OrdemServico
		FOREIGN KEY (id_parceiro)
			REFERENCES Parceiros (id);

ALTER TABLE Veiculo 
	ADD CONSTRAINT FK_Motorista_Veiculo
		FOREIGN KEY (id_motorista)
			REFERENCES Motorista (id);

ALTER TABLE Veiculo 
	ADD CONSTRAINT FK_reboque_Veiculo
		FOREIGN KEY (id_reboque)
			REFERENCES Reboque (id);

ALTER TABLE Motorista
ADD nome varchar(40);