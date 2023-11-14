package calculadoraLogicaEjercicio3Operadores.Servicios;

import java.util.Scanner;

public class peticionesImplementacion implements peticionesInterfaz
{

    public int mostrarMenuYSeleccionarOpcion(Scanner conectarTeclado)
    {
    	 int opcionIntroducida;

        System.out.println("0. Cerrar");
        System.out.println("1. Comparación con igualdad");
        System.out.println("2. Compraración con desigualdad");
        System.out.println("Solicite una opción: ");
       
        opcionIntroducida=conectarTeclado.nextInt(); 
		  return opcionIntroducida;
    }
    
    public String solicitarExpresion(Scanner conectarTeclado)
    {
        String expresion;

        System.out.println("Escriba una expresión de texto: ");
        expresion =conectarTeclado.next(); 

        return expresion;
    }

	
}
