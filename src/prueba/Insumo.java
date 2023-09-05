package prueba;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Insumo implements Facturable {

	private String nombre;
	private double porcGanancia;
	private double precioLista;
	private Tipo tipo;

	public double getMontoFacturacion() {	
		double precio = Matematica.sumarPorcentaje(precioLista, porcGanancia);
		precio = Matematica.sumarPorcentaje(precio, Facturable.IVA);
		return precio;
	}

}