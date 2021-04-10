package br.com.faculdadedelta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.faculdadedelta.cadastroFornecedor.model.Fornecedor;
import br.com.faculdadedelta.repository.FornecedorRepository;

@Controller
public class ListaController {
	
	@Autowired
	private FornecedorRepository fr;
	
	@RequestMapping("/listaFornecedor")
	public ModelAndView listar() {
		ModelAndView modelView = new ModelAndView("listaFornecedor");
		Iterable<Fornecedor> fornecedores = fr.findAll();
		modelView.addObject("fornecedores", fornecedores);
		return modelView;
	}

	
}
