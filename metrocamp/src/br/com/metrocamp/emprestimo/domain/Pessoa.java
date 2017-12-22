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

public abstract class Pessoa {

	protected String nome; 
	protected String rg; 
	protected String cpf; 

	public Pessoa(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
}
