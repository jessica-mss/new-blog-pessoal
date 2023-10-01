package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_postagens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo titulo é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter entre 5 e 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo texto é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo titulo deve conter entre 10 e 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	
}
