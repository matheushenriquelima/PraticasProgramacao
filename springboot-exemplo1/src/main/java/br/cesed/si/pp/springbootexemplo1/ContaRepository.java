package br.cesed.si.pp.springbootexemplo1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer>
{
	Conta findById(int id);
}
