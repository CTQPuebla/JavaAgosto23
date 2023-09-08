package com.msproductos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENTO")
public class DepartamentoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="deptoAuto")
	@SequenceGenerator(name="deptoAuto", sequenceName="SQ_DEPARTAMENTOS", allocationSize=1)
	
	@Column(name="DEPTO_ID",columnDefinition="NUMBER")
	private int depto_id;
	
	@Column(name="EMPLEADO_ID",columnDefinition="NUMBER")
	private int empleado_id;
	
	@Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	private String nombre;

	public int getDepto_id() {
		return depto_id;
	}

	public void setDepto_id(int depto_id) {
		this.depto_id = depto_id;
	}

	public int getEmpleado_id() {
		return empleado_id;
	}

	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
