package com.br.utfpr.tsi.delegacia.web.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	private String chassi;
	
	@OneToOne
	private Placa emplacamento;
	
	@ManyToOne
	private BoletimFurto envolvidoEm;
	
	private int anoFabricacao;
	private String cor;
	private String marca;
	private String tipoVeiculo;

}
