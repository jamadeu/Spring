package br.com.alura.forum.config;

public class ErroFormularioDto {

	private String campo;
	private String mensagem;

	public ErroFormularioDto(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
	}

	public String getCampo() {
		return campo;
	}

	public String getMensagem() {
		return mensagem;
	}
}
