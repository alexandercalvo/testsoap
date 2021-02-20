package org.learning;

import java.util.List;

import javax.jws.WebService;

import org.learning.domain.Targeta;

@WebService
public interface TargetaDigital {

	public Targeta crearTargetaDigital(Targeta targeta);
	public List<Targeta> obtenerTargetas();
	public Targeta findTatgetaByNumber(String numero);
	public Targeta findNameClient(String name);
	
}
