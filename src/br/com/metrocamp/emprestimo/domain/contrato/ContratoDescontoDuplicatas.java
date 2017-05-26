/** 
 * Disciplina: Programa��o Orientada a Objetos                                 
 * Professor:  Jos� Perini                                                     
 * Assunto:    POO � Projeto Pr�tico � Avalia��o M2 / 2� Bimestre
 *                                                            
 * Grupo:      Andr� Queiroz          RA: 1510010198
 *             Raiany de Ara�jo       RA: 1510000693
 *             Rodrigo Sene           RA: 1510030133                                                                     
 */
package br.com.metrocamp.emprestimo.domain.contrato;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import br.com.metrocamp.emprestimo.domain.CalculoMultaParcela;
import br.com.metrocamp.emprestimo.domain.Cliente;
import br.com.metrocamp.emprestimo.domain.Gerente;
import br.com.metrocamp.emprestimo.domain.Parcela;
import br.com.metrocamp.emprestimo.domain.SituacaoContrato;
import br.com.metrocamp.emprestimo.domain.SituacaoParcela;

public class ContratoDescontoDuplicatas extends Contrato implements CalculoMultaParcela{

	public ContratoDescontoDuplicatas(Cliente cliente, Gerente gerente, LocalDate dataInicio, LocalDate dataFim,
			BigDecimal valor) {
		super(cliente, gerente, dataInicio, dataFim, valor);
	
	}
	
	public Cliente getCliente() {
		return super.cliente;
	
	}
	public void setCliente(Cliente cliente) {
		super.cliente = cliente;
	}
	public Gerente getGerente() {
		return super.gerente;
	}
	public void setGerente(Gerente gerente) {
		super.gerente = gerente;
	}
	public SituacaoContrato getSituacao() {
		return super.situacao;
	}
	public void setSituacao(SituacaoContrato situacao) {
		super.situacao = situacao;
	}
	public LocalDate getDataInicio() {
		return super.dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		super.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return super.dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		super.dataFim = dataFim;
	}
	public BigDecimal getValor() {
		return super.valor;
	}
	public void setValor(BigDecimal valor) {
		super.valor = valor;
	}
	public List<Parcela> getParcelas() {
		return Collections.unmodifiableList(super.parcelas);
	}

	@Override
	public void incluiParcela(Parcela parcela) {
		
		if(parcela.getDataVencimento().compareTo(this.getDataFim()) > 0){
			throw new RuntimeException("A data da parcela não deve ser maior que a data de vencimento do contrato");
		}
		if(parcela.getDataVencimento().compareTo(this.dataInicio) < 0){
			throw new RuntimeException("A data da parcela não deve ser menor que a data de inicio do contrato");
		}
		if(parcela.getSituacaoParcela() != SituacaoParcela.NOVO){
			throw new RuntimeException("A situação da parcela não deve ser diferente de A vercer.");
		}
		super.parcelas.add(parcela);
	}
	
	@Override
	public double calculoMultaParcela(Parcela parcela) {
		
		return parcela.getValor() * 0.05;
	}


		

}
