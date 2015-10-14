package com.cbk.cms.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbk.cms.dto.Alumno;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnosRest {
	
	@RequestMapping(method = RequestMethod.GET)
	public Alumno getAlumno() {
		return new Alumno(1, "Federico", "Farias", "Sanchez");
	}
	
}
