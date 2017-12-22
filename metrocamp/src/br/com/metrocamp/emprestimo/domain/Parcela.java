/** 
 * Disciplina: Programa��o Orientada a Objetos                                 
 * Professor:  Jos� Perini                                                     
 * Assunto:    POO � Projeto Pr�tico � Avalia��o M2 / 2� Bimestre
 *                                                            
 * Grupo:      Andr� Queiroz          RA: 1510010198
 *             Raiany de Ara�jo       RA: 1510000693
 *             Rodrigo Sene           RA: 1510030133                                                                     
 */
package br.com.metrocamp.emprestimo.domain;

import java.time.LocalDate;

public class Parcela {

	private double valor;
	private LocalDate dataPagamento;
	private double valorAtraso;
	private SituacaoParcela situacaoParcela;
	private LocalDate dataVencimento;  
	
	
	public Parcela(double valor, LocalDate dataVencimento) {
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoParcela = SituacaoParcela.NOVO;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getValorAtraso() {
		return valorAtraso;
	}
	public void setValorAtraso(double valorAtraso) {
		this.valorAtraso = valorAtraso;
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
			this.dataVencimento = dataVencimento;
	}
	
	public SituacaoParcela getSituacaoParcela(){
		return this.situacaoParcela;
	}
	
	public void pagar(LocalDate dataPagamento){
		
		if(this.getSituacaoParcela() != SituacaoParcela.PAGO){
			throw new RuntimeException("A parcela já foi paga!");
		}
		
		this.dataPagamento = dataPagamento;
		
		this.situacaoParcela = SituacaoParcela.PAGO;
		if (dataPagamento.compareTo(dataVencimento) > 0){
			this.situacaoParcela = SituacaoParcela.PGP_ATRASO;
			
		}
		
				
		
	}
}


