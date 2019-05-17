package control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import modelo.empresa.DineroEstado;
import modelo.poblacion.EstadoSer;
import modelo.poblacion.Ser;
import utilesglobal.Utilies;

public class Poblacion {

	private ArrayList<Ser> poblacion = new ArrayList<Ser>();
	private int id = 0;
	private int jubilados = 0;
	private int trabajadores = 0;
	private int menores = 0;
	private int fallecidos = 0;

	public Poblacion(int menoresInicial, int trabajadoresIncial, int jubiladosInicial) {

		for (int i = 0; i < menoresInicial; i++) {
			poblacion.add(new Ser(this.id, Utilies.obtenerAleatorio(0, 17), EstadoSer.menor));
			this.id++;
		}
		for (int i = 0; i < trabajadoresIncial; i++) {
			poblacion.add(new Ser(this.id, Utilies.obtenerAleatorio(18, 65), EstadoSer.trabajador));
			this.id++;
		}
		for (int i = 0; i < jubiladosInicial; i++) {
			poblacion.add(new Ser(this.id, 65, EstadoSer.jubilado));
			this.id++;
		}
	}

	/**
	 * 
	 * @param tipo
	 * @return lista con el mismo tipo que la entrada
	 */
	public ArrayList<Ser> obtenerDemandantes(EstadoSer tipo) {
		
		return null;

	}

	/**
	 * Elimina muertos y pilla ahorros
	 * 
	 * @param DineroEstado
	 * @return listaid de trabajadores muertos para elimnarlos de la sede
	 */
	public ArrayList<Integer> eliminarMuertos(DineroEstado capital) {
		this.fallecidos++;
		return null;

	}

	/**
	 * @return lista de los nuevos jubilados para eliminarlos de la sede
	 */
	public ArrayList<Integer> actualizarPoblacion() {
		return null;

	}

	/**
	 * Metodo que me dice cuanto puede pagarle y le paga
	 * 
	 * @param capital
	 */
	public void pagarMenores(DineroEstado capital) {
		
	}

	public void pagarDemandantes(DineroEstado capital) {
		
	}

	public void pagarTrabajadores(DineroEstado capital) {

	}

	public void pagarJubilados(DineroEstado capital) {

	}

	/**
	 * @param tipo
	 * @return cantidad de sere de ese tipo
	 */
	public int numeroTipoSeres(EstadoSer tipo) {
		int resultado = 0;
		for (Ser ser : poblacion) {
			if (ser.getTipoEstado() == tipo) {
				resultado++;
			}
		}
		return resultado;
	}

	/**
	 * envejece a la poblacion 1 año
	 */
	public ArrayList<Ser> envejecerPoblacion() {

		for (int i = 0; i < poblacion.size(); i++) {
			int edad = poblacion.get(i).getEdad();
			poblacion.get(i).setEdad(edad++);
		}
		return poblacion;

	}

	/**
	 * 
	 * @param nacimiento
	 */
	public ArrayList<Ser> generarMenor(int nacimiento) {

		for (int i = 0; i < nacimiento; i++) {
			poblacion.add(new Ser(this.id, 0, EstadoSer.menor));
			this.id++;
		}
		return poblacion;
	}

	/**
	 * actualizar la lista de demandantes
	 * 
	 * @param genteDespedida(de
	 *            la sede)
	 */
	public void despedirTrabajador(ArrayList<Integer> genteDespedida) {

	}

	public ArrayList<Ser> getPoblacion() {
		return poblacion;
	}

	public int getJubilados() {
		return jubilados;
	}

	public int getTrabajadores() {
		return trabajadores;
	}

	public int getMenores() {
		return menores;
	}

	public int getFallecidos() {
		return fallecidos;
	}
}
