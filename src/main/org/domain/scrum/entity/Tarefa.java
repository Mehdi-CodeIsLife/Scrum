package org.domain.scrum.entity;

// Generated 12/04/2012 11:02:58 by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Tarefa generated by hbm2java
 */
@Entity
@Table(name = "tarefa", catalog = "scrum")
public class Tarefa implements java.io.Serializable {

	private Integer idTarefa;
	private Usuario usuario;
	private Sprint sprint;
	private Projeto projeto;
	private String texto;
	private BigDecimal ponto;
	private Date inicio;
	private Date fim;

	public Tarefa() {
	}

	public Tarefa(Usuario usuario, Sprint sprint, Projeto projeto, String texto) {
		this.usuario = usuario;
		this.sprint = sprint;
		this.projeto = projeto;
		this.texto = texto;
	}

	public Tarefa(Usuario usuario, Sprint sprint, Projeto projeto,
			String texto, BigDecimal ponto, Date inicio, Date fim) {
		this.usuario = usuario;
		this.sprint = sprint;
		this.projeto = projeto;
		this.texto = texto;
		this.ponto = ponto;
		this.inicio = inicio;
		this.fim = fim;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tarefa", unique = true, nullable = false)
	public Integer getIdTarefa() {
		return this.idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	@NotNull
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sprint", nullable = false)
	@NotNull
	public Sprint getSprint() {
		return this.sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_projeto", nullable = false)
	@NotNull
	public Projeto getProjeto() {
		return this.projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Column(name = "texto", nullable = false, length = 800)
	@NotNull
	@Length(max = 800)
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Column(name = "ponto", precision = 5, scale = 1)
	public BigDecimal getPonto() {
		return this.ponto;
	}

	public void setPonto(BigDecimal ponto) {
		this.ponto = ponto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "inicio", length = 19)
	public Date getInicio() {
		return this.inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fim", length = 19)
	public Date getFim() {
		return this.fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

}