package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

public class AtualizacaoTopicoForm {
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String mensagem;

	public Topico converter(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);
		topico.setTitulo(titulo);
		topico.setMensagem(mensagem);
		return topico;
	}

}
