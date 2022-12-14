package br.com.gandata.api.dto;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(name = "Categoria")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoriaDto extends RepresentationModel<CategoriaDto>{
	
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String nome;

	@Getter @Setter
	private String descricao;
}
