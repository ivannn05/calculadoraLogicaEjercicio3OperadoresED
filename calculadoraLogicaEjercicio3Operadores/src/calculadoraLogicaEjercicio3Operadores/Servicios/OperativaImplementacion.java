package calculadoraLogicaEjercicio3Operadores.Servicios;

public class OperativaImplementacion implements OperativaInterfaz
{

	
	public void compararIgualdadExpresiones(String expresion1, String expresion2) 
	{
        if (expresion1.equals(expresion2))
        {
        	System.out.println("[IGUALDAD] - Las expresiones son iguales");
        }
        else
        {
        	System.out.println("[DESIGUALDAD] - Las expresiones no son iguales");
        }
	
		
	}

	
	public void compararDesigualdadExpresiones(String expresion1, String expresion2)
	{
		  if (!expresion1.equals(expresion2))
		  {
			  System.out.println("[DESIGUALDAD] - Las expresiones no son iguales");
		  }
		  else
		  {
			  System.out.println("[IGUALDAD] - Las expresiones son iguales");
		  }
		
	
	}

}
