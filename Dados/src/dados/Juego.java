package dados;

public class Juego {
		
	int [] jugador1 = new int[6];
	int [] jugador2 = new int[6];
	
	
	public void Comenzar() {
		
		int dado1;
		int dado2;
		int contador1 = 0;
		int contador2 = 0;
		boolean ganador = false;
		
		while(!ganador) {
			
			dado1=(int)(Math.random()*6 + 1);
			dado2=(int)(Math.random()*6 + 1);
			
			if((dado1==dado2)&&(jugador1[dado1-1]==0)) {
				jugador1[dado1-1]=dado1;
				contador1++;
				if(contador1==6) {
					ganador = true; 
					break;
				}
				}
			dado1=(int)(Math.random()*6 + 1);
			dado2=(int)(Math.random()*6 + 1);
			
			if((dado1==dado2)&&(jugador2[dado1-1]==0)){
				jugador2[dado1-1]=dado1;
				contador2++;
				if(contador2==6) {
					ganador = true;
				}
			}
		}
		System.out.println("El jugador 1 tiene "+contador1+" parejas.");

		System.out.println("El jugador 2 tiene "+contador2+" parejas.");
		
		if(contador1>contador2) {
			System.out.println("El jugador 1 es el ganador.");
		}else { 
			System.out.println("El jugador 2 es el ganador.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}