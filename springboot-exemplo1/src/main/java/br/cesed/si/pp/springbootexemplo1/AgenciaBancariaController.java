package br.cesed.si.pp.springbootexemplo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AgenciaBancariaController {

	@Autowired
	private AgenciaBancariaRepository repository;
	
	@GetMapping("/agencia-bancaria")
	public List<AgenciaBancaria> listarAgencias(){
		return repository.findAll();
	}
	@GetMapping("/agencia-bancaria/{id}")
	public AgenciaBancaria listarAgencia(@PathVariable(value="id") int id ) 
	{
		return repository.findById(id);
	}
	@PostMapping("/agencia-bancaria")
	public AgenciaBancaria adicionarAgencia(@RequestBody AgenciaBancaria agencia){
		return repository.save(agencia);
	}
	@PutMapping("/agencia-bancaria")
	public AgenciaBancaria atualizarAgencia(@RequestBody AgenciaBancaria agencia){
		return repository.save(agencia);
	}
	@DeleteMapping("/agencia-bancaria")
	public void removerAgencia(@RequestBody AgenciaBancaria agencia) {
		repository.delete(agencia);
	}
	
}
