package br.edu.ifpb.pweb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String autor;
	private Date publicado;
	private int paginas;
	public Livro() {
		//A JPA precisadeumconstrutordefault
	}
	public Livro(String titulo, String autor, Date publicado, int paginas) {
		this.titulo= titulo;
		this.autor= autor;
		this.publicado= publicado;
		this.paginas= paginas;
	}
}