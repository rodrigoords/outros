/**
 * Disciplina: Programa��o Orientada a Objetos                                 
 * Professor:  Jos� Perini                                                     
 * Assunto:    POO � Projeto Pr�tico � Avalia��o M2 / 2� Bimestre
 *
 * Grupo:      Andr� Queiroz          RA: 1510010198
 *             Raiany de Ara�jo       RA: 1510000693
 *             Rodrigo Sene           RA: 1510030133                                                                     
 */

package br.com.metrocamp.emprestimo.teste;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.metrocamp.emprestimo.domain.Cliente;
import br.com.metrocamp.emprestimo.domain.Gerente;
import br.com.metrocamp.emprestimo.domain.Parcela;
import br.com.metrocamp.emprestimo.domain.contrato.ContratoMultiparcelado;

public class TesteEmprestimo {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Rodrigo Sene");
		Gerente gerente = new Gerente("André");
		
		Parcela parcela = new Parcela(300, LocalDate.of(2017, 5, 30));
		Parcela parcela2 = new Parcela(300, LocalDate.of(2017, 6, 30));
		
		
		LocalDate dataInicioContrato = LocalDate.of(2017, 4, 30);
		LocalDate dataVencimentoContrato = LocalDate.of(2017, 6, 30);
		
		ContratoMultiparcelado contratoMultiparcelado = new ContratoMultiparcelado(cliente, gerente, dataInicioContrato, dataVencimentoContrato, new BigDecimal("600"));
		
		contratoMultiparcelado.incluiParcela(parcela);
		contratoMultiparcelado.incluiParcela(parcela2);
		
		System.out.println(contratoMultiparcelado);
	}

}
