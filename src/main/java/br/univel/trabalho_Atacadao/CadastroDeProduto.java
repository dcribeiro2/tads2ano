package br.univel.trabalho_Atacadao;

import java.math.BigDecimal;

public class CadastroDeProduto {
	private int id;
	private int cdBarras;
	private double Estoque;
	private int categoria;
	private String descricao;
	private BigDecimal custo;
	private BigDecimal margemdelucro;
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCdBarras() {
		return cdBarras;
	}
	public void setCdBarras(int cdBarras) {
		this.cdBarras = cdBarras;
	}
	public double getEstoque() {
		return Estoque;
	}
	public void setEstoque(double estoque) {
		Estoque = estoque;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getCusto() {
		return custo;
	}
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
	public BigDecimal getMargemdelucro() {
		return margemdelucro;
	}
	public void setMargemdelucro(BigDecimal margemdelucro) {
		this.margemdelucro = margemdelucro;
	}
	
	

}
