package com.atSistemas.entidades;

import java.util.List;

import com.atSistemas.enums.Estado;

public class Superheroe extends Entidad {

	private Estado estado;
	private List<Poder> poderes;
	private Universo universoo;

	@Override
	public Integer getId() {
		return super.getId();
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	public void matar() {

	}

	public void resucitar() {

	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Poder> getPoderes() {
		return poderes;
	}

	public void addPoder(Poder poder) {
		this.poderes.add(poder);
	}

	public Universo getUniverso() {
		return universo;
	}

	public void setUniverso(Universo universo) {
		this.universo = universo;
	}

	@Override
	public String toString() {
		return "Superheroe [getId()=" + getId() + ", getNombre()=" + getNombre() + "]";
	}

}
