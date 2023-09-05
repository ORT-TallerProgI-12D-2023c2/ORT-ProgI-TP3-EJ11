package prueba;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Historial {

	private ArrayList<Facturable> facturables;

	public double montoTotalFacturado() {
		double montoTotal = 0;
		for (Facturable fact : facturables) {
			montoTotal += fact.getMontoFacturacion();
		}
		return montoTotal;
	}

	public int cantServiciosSimples() {
		int cant = 0;
		for (Facturable fact : facturables) {
			if (fact instanceof ServicioDeReparacion) {
				ServicioDeReparacion sdr = (ServicioDeReparacion) fact;	
				if ( sdr.esSimple() ) {
					cant++;
				}
			}
		}
		return cant;
	}

}