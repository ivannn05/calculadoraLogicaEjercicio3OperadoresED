package calculadoraLogicaEjercicio3Operadores.Controladores;

import java.util.Scanner;

import calculadoraLogicaEjercicio3Operadores.Servicios.OperativaImplementacion;
import calculadoraLogicaEjercicio3Operadores.Servicios.OperativaInterfaz;
import calculadoraLogicaEjercicio3Operadores.Servicios.peticionesImplementacion;
import calculadoraLogicaEjercicio3Operadores.Servicios.peticionesInterfaz;

public class Inicio 
{
		public static void main(String[] args)
		{ String exp1, exp2;
		peticionesInterfaz pi = new peticionesImplementacion();
		 OperativaInterfaz oi = new OperativaImplementacion();

		 boolean esCerrar = false;
		 int opcionSeleccionada;
			Scanner conectarTeclado = new Scanner (System.in);
		 while (!esCerrar)
		 {
		     opcionSeleccionada = pi.mostrarMenuYSeleccionarOpcion(conectarTeclado);
		     switch (opcionSeleccionada)
		     {
		         case 0:
		             esCerrar = true;
		             break;
		         case 1:
		             exp1 = pi.solicitarExpresion( conectarTeclado);
		             exp2 = pi.solicitarExpresion(conectarTeclado);
		             oi.compararIgualdadExpresiones(exp1,exp2);
		             break;
		         case 2:
		             exp1 = pi.solicitarExpresion(conectarTeclado);
		             exp2 = pi.solicitarExpresion(conectarTeclado);
		             oi.compararDesigualdadExpresiones(exp1,exp2);
		             break;
		         default:
		        	 System.out.println("Opción incorrecta");
		             break;

			
		     }
		 }}}


