package br.cesed.si.pp.springbootexemplo1;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface AgenciaBancariaRepository extends JpaRepositoryImplementation<AgenciaBancaria, Integer> 
{
	AgenciaBancaria findById(int id);
}
