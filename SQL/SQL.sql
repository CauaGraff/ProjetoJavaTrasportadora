create database PorjetoTransportadora
go

use ProjetoTransportadora
go

create table OrdemServico(
	id int IDENTITY(1,1) not null,
	destino text,
	kmViagem float(2),
	valor float(2)
	
	)