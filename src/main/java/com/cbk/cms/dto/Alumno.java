package com.cbk.cms.dto;

public class Alumno {
	private int id;
	private String nombre;
	private String app;
	private String apm;

	public Alumno(int id, String nombre, String app, String apm) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

}
