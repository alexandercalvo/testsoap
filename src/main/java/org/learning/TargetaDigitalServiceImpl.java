package org.learning;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.learning.domain.Targeta;
@WebService(endpointInterface = "org.learning.TargetaDigital")
public class TargetaDigitalServiceImpl implements TargetaDigital {
private static List<Targeta> targetas = new ArrayList<Targeta>();
	@Override
	public Targeta crearTargetaDigital(Targeta targeta) {
		//if(targetas.size()>0) {
		targeta.setId(targetas.size()+1);
		targetas.add(targeta);
		/*}else {
			targeta.setId(0);
			targetas.add(targeta);
		}*/
		return targeta;
	}

	@Override
	public List<Targeta> obtenerTargetas() {
		
		return targetas;
	}

	@Override
	public Targeta findTatgetaByNumber(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Targeta findNameClient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
