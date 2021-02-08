package br.com.alura.forum.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class LoginForm {

	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
