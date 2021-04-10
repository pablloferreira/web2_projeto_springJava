 package br.com.faculdadedelta.cadastroFornecedor.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable {
		
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String cpf_Cnpj; 
		private String nome; 
		private String area_Produtos;
		private String telefone; 
		private String email;
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCpf_Cnpj() {
			return cpf_Cnpj;
		}
		public void setCpf_Cnpj(String cpf_Cnpj) {
			this.cpf_Cnpj = cpf_Cnpj;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getArea_Produtos() {
			return area_Produtos;
		}
		public void setArea_Produtos(String area_Produtos) {
			this.area_Produtos = area_Produtos;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}

