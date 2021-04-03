package br.com.faculdadedelta.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.faculdadedelta.cadastroFornecedor.model.Fornecedor;

public interface FornecedorRepository extends CrudRepository<Fornecedor, String> {
	Fornecedor findById(int id);
	
	
}
