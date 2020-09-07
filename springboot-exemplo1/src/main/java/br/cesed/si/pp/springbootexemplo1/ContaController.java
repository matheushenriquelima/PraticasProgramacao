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
public class ContaController {
	
	@Autowired
	private ContaService service;
	@Autowired
	private ContaRepository repository;
	
	@PostMapping("/conta")
	public Conta criarNovaConta(@RequestBody Conta novaConta) {
		return service.salvarConta(novaConta);
	}
	@GetMapping("/conta")
	public List<Conta> listarContas(){
		return service.listarTodasContas();
	}
	@GetMapping("/conta/{id}")
	public Conta listarConta(@PathVariable(value= "id") int id){
		return repository.findById(id);
		
	}
	@DeleteMapping("/conta")
	public void removerConta(Conta conta) {
		service.removerConta(conta);
	}
	
	@PutMapping("/conta")
	public Conta atualizarConta(@RequestBody Conta conta) {
		return service.atualizarConta(conta);
	}
	
}
