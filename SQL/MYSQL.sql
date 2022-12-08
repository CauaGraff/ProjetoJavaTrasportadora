CREATE TABLE abastecidas (
  id integer() NOT NULL,
  valor decimal(10,2),
  tipoProduto varchar(40),
  quantidade integer(),
  id_veiculo integer(),
  id_conta integer()
);

CREATE TABLE contas (
  id integer() NOT NULL,
  valor decimal(10,2),
  nf integer(),
  cte integer(),
  tipo char(1),
  descricao varchar(40)
);

CREATE TABLE manutencao (
  id integer() NOT NULL,
  valro decimal(10,2),
  dataManutencao date ,
  contaId integer() NOT NULL
);

CREATE TABLE motorista (
  id integer() NOT NULL,
  nome varchar(40),
  dataNasc date ,
  endereco text ,
  cpf char() ,
  cnh char(9)
);

CREATE TABLE multa (
  id integer() NOT NULL,
  lo varchar(40),
  dataMulta date ,
  id_veiculo integer(),
  valor decimal(10,2),
  contaId integer()
);

CREATE TABLE ordemservico (
  id integer() NOT NULL,
  destino text ,
  kmViagem decimal(10,2),
  valor decimal(10,2) ,
  id_veiculo integer(),
  id_parceiro integer()
  );

CREATE TABLE parceiros (
  id integer() NOT NULL,
  razaoSocial varchar(40) ,
  servicoPrestado varchar(40),
  cnpj char(14),
  produto varchar(40)  
);

CREATE TABLE reboque (
  id integer() NOT NULL,
  placa char(7) DEFAULT NULL,
  renavam char() DEFAULT NULL,
  ano integer() DEFAULT NULL,
  capacidade decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE veiculo (
  id integer() NOT NULL,
  placa char(7) DEFAULT NULL,
  kilometragem decimal(10,2) DEFAULT NULL,
  cor varchar(40) DEFAULT NULL,
  ano integer() DEFAULT NULL,
  marca varchar(40) DEFAULT NULL,
  numChassi char(17) DEFAULT NULL,
  id_motorista integer() DEFAULT NULL,
  id_reboque integer() DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE abastecidas
  ADD PRIMARY KEY (id),
  ADD KEY FK_Abastecidas (id_veiculo),
  ADD KEY FK_Contas (id_conta);

ALTER TABLE contas
  ADD PRIMARY KEY (id);

ALTER TABLE manutencao
  ADD PRIMARY KEY (id),
  ADD KEY fk_Manutencao_Conta (contaId);

ALTER TABLE motorista
  ADD PRIMARY KEY (id);

ALTER TABLE multa
  ADD PRIMARY KEY (id),
  ADD KEY FK_Veiculo_Multa (id_veiculo),
  ADD KEY fk_Multa_Conta (contaId);

ALTER TABLE ordemservico
  ADD PRIMARY KEY (id),
  ADD KEY FK_Veiculo_OrdemServico (id_veiculo),
  ADD KEY FK_Parceiro_OrdemServico (id_parceiro);

ALTER TABLE parceiros
  ADD PRIMARY KEY (id);

ALTER TABLE reboque
  ADD PRIMARY KEY (id);

ALTER TABLE veiculo
  ADD PRIMARY KEY (id),
  ADD KEY FK_Motorista_Veiculo (id_motorista),
  ADD KEY FK_reboque_Veiculo (id_reboque);

ALTER TABLE abastecidas
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE contas
  MODIFY id integer() NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

ALTER TABLE manutencao
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE motorista
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE multa
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE ordemservico
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE parceiros
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE reboque
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE veiculo
  MODIFY id integer() NOT NULL AUTO_INCREMENT;

ALTER TABLE abastecidas
  ADD CONSTRAINT FK_Abastecidas FOREIGN KEY (id_veiculo) REFERENCES veiculo (id),
  ADD CONSTRAINT FK_Contas FOREIGN KEY (id_conta) REFERENCES contas (id);

ALTER TABLE manutencao
  ADD CONSTRAINT fk_Manutencao_Conta FOREIGN KEY (contaId) REFERENCES contas (id);

ALTER TABLE multa
  ADD CONSTRAINT FK_Veiculo_Multa FOREIGN KEY (id_veiculo) REFERENCES veiculo (id),
  ADD CONSTRAINT fk_Multa_Conta FOREIGN KEY (contaId) REFERENCES contas (id);

ALTER TABLE ordemservico
  ADD CONSTRAINT FK_Parceiro_OrdemServico FOREIGN KEY (id_parceiro) REFERENCES parceiros (id),
  ADD CONSTRAINT FK_Veiculo_OrdemServico FOREIGN KEY (id_veiculo) REFERENCES veiculo (id);

ALTER TABLE veiculo
  ADD CONSTRAINT FK_Motorista_Veiculo FOREIGN KEY (id_motorista) REFERENCES motorista (id),
  ADD CONSTRAINT FK_reboque_Veiculo FOREIGN KEY (id_reboque) REFERENCES reboque (id);

