package br.cesed.si.pp.springbootexemplo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service @Validated
public class ContaService 
{	
	@Autowired
	private ContaRepository repository;
	
	public Conta salvarConta(@RequestBody Conta novaConta) {
		return repository.save(novaConta);
	}
		
	public List<Conta> listarTodasContas(){
		return repository.findAll();	
	}
	
	public void removerConta(@RequestBody Conta conta) {
		repository.delete(conta);
	}
	public Conta atualizarConta(@RequestBody Conta conta) 
	{	
		return repository.save(conta);
	}
	
}