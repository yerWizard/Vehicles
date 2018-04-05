package vehicles;

public class Vehicle {

	private static int VELOCITAT_MAXIMA = 120;

	private int cilindrada;
	private int portes;
	private int velocitat_actual;

	public Vehicle(){

		this.velocitat_actual = 0;
	}

	public void accelerar(){

		if(this.velocitat_actual <= this.VELOCITAT_MAXIMA){
			this.velocitat_actual += 10;
		}

	}

	public void desaccelerar(){

		if(this.velocitat_actual >= 10){
			this.velocitat_actual -= 10;
		}

	}


}
