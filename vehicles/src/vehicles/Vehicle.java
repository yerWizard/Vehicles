package vehicles;

public class Vehicle {

	private static int VELOCITAT_MAXIMA = 120;

	private int cilindrada;
	private int portes;
	private int velocitat_actual;

	private int marxes;
	private int marxa_actual;

	public Vehicle(){

		this.velocitat_actual = 0;
		this.marxes = 5;
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

	public void pujaMarxa(){

		if(this.marxes >= 0 && this.marxes < 5){
			this.marxa_actual ++;
		}

	}

	public void baixaMarxa(){

		if(this.marxes <= 5 && this.marxes > 0){
			this.marxa_actual --;
		}

	}
	

}
