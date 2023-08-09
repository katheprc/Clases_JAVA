package vof;

public class prueba1 {
		
	public static void main(String[] args) {
		
		
		System.out.println((2+2) == 4);
		System.out.println("");
		System.out.println(!((2+2) == 4));
		
		//----------------------------------
		
		boolean HoyLlueve = true;            
        
		if (HoyLlueve) {                        // -> entrás al bloque porque es true                                           ==if(hoyllueve == true)  me estas diciendo la verdad
			System.out.println(HoyLlueve);
		}
		
		System.out.println("");
		
		if(!HoyLlueve)   {                     //-> no entras, ya que te estoy negando el true                                == if (hoyllueve == false)  me estas diciendo mentira
			System.out.println(!HoyLlueve);
		} else {
			System.out.println(!HoyLlueve);
		}
		
		//	----------------------------------------

		HoyLlueve = false; 

		if(HoyLlueve == true) {                                             //-> no entra porque es falsa y va directo al else                               == if(hoyllueve == true) es falso
			System.out.println(HoyLlueve);
		
		}
		if(HoyLlueve == false) {                                            //-> entra porque es verdadero, yo al decirte que hoy llueve negando el false    == if(hoyllueve == false) es verdadero
		
			System.out.println(!HoyLlueve);
		}
		
		// false  =   false
		// !false =   true
		
		// true   =   true
		// !true  =   false
		
	}
	
}
