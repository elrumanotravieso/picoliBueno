package modelo.poblacion;

import modelo.empresa.DineroEstado;
import utilesglobal.Utilies;

public class Ser {
	private String nombre = Utilies.obtenerNombre();
	private int id = 0;
	private int edad = 0;
	private float ahorro = 0;
	private float esperanzaVida;

	private EstadoSer tipoEstado;

	public Ser(int id) {
		super();
		this.id = id;
		this.esperanzaVida = Utilies.obtenerAleatorio(90);
		this.tipoEstado = EstadoSer.menor;
	}

	public Ser(int id, int edad, EstadoSer tipoEstado) {
		super();
		this.id = id;
		this.edad = edad;
		this.esperanzaVida = Utilies.obtenerAleatorio(this.edad, 90);
		this.tipoEstado = tipoEstado;
	}
	

	
	public void pagarNVmenor(double sueldo) {
		
	}

	public void pagarNVtrabajador(double sueldo, DineroEstado dineroEstado) {

	}

	public void pagarNVdemandante(double sueldo) {

	}

	public void pagarNVjubilado(double sueldo) {

	}

	private void reducirEV(double restos) {

	}

	public boolean isPalmado() {
		return false;

	}

	/**
	 * @return lo que le queda por pagar
	 */
	public double obtenerNVnecesario() {
		return ahorro;

	}

	public void setEsperanzaVida(float esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	public int getEdad() {
		return edad;
	}

	public float getAhorro() {
		return ahorro;
	}

	public EstadoSer getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(EstadoSer tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	public int getId() {
		return id;
	}
	public float getEsperanzaVida() {
		return esperanzaVida;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
