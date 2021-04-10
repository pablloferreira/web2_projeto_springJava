package br.com.faculdadedelta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.faculdadedelta.cadastroFornecedor.model.Fornecedor;
import br.com.faculdadedelta.repository.FornecedorRepository;

@Controller
public class ControllerFornecedor {
		
		@RequestMapping(value="/formFornecedor", method = RequestMethod.GET )
		
		public String form() {
			return "formFornecedor";
		}
		
		@Autowired
		private FornecedorRepository fr;
		
		@RequestMapping(value="/formFornecedor", method = RequestMethod.POST)
		public String form(Fornecedor fornecedor) {
			fr.save(fornecedor);
			return "formFornecedor";
		}
		
		@GetMapping("/delete/{id}")
		public String deletarFornecedor(@PathVariable("id") int id) {
			Fornecedor fornecedor = fr.findById(id);
			fr.delete(fornecedor);
			return "redirect:/formFornecedor";
		}
		
}