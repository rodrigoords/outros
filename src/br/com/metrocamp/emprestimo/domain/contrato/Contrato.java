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
import java.util.ArrayList;
import java.util.List;

import br.com.metrocamp.emprestimo.domain.Cliente;
import br.com.metrocamp.emprestimo.domain.Gerente;
import br.com.metrocamp.emprestimo.domain.Parcela;
import br.com.metrocamp.emprestimo.domain.SituacaoContrato;

abstract class Contrato{
	
	protected Cliente cliente;
	protected Gerente gerente;
	protected SituacaoContrato situacao;
	protected LocalDate dataInicio;
	protected LocalDate dataFim;
	protected BigDecimal valor; 
	protected List <Parcela> parcelas = new ArrayList<>();
		
	protected Contrato( Cliente cliente, Gerente gerente, LocalDate dataInicio, LocalDate dataFim, BigDecimal valor){
		
					this.cliente = cliente; 
					this.gerente = gerente;
					this.dataInicio = dataInicio; 
					this.situacao = SituacaoContrato.NOVO; 
					this.dataFim = dataFim; 
					this.valor = valor; 
		}
	
	public abstract void incluiParcela(Parcela parcela);

	@Override
	public String toString() {
		return "Contrato [cliente=" + cliente + "\n gerente=" + gerente + "\n situacao=" + situacao + "\n dataInicio="
				+ dataInicio + "\n dataFim=" + dataFim + "\n valor=" + valor + " \n Quantidade Parcelas= " + parcelas.size()+"]";
	}
	
	
}
	