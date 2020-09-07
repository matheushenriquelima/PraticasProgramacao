package br.cesed.si.pp.springbootexemplo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity @Data @Table
public class Conta 
{	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int numeroDaConta;
	@ManyToOne
	private AgenciaBancaria agencia;
	private String titular;
	private long cpf;
	private double saldo;
}

