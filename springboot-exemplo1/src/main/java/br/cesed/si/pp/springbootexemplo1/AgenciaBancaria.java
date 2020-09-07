package br.cesed.si.pp.springbootexemplo1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class AgenciaBancaria 
{
	@Id
	private int numAgencia;
	private String nome;
	@OneToMany
	private List<Conta> contas;
}
