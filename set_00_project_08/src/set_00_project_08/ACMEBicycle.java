package set_00_project_08;

import set_00_project_08.Bicycle;

public class ACMEBicycle implements Bicycle{

	int cadence = 0;
    int speed = 0;
    int gear = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

	public void changeCadence(int newValue) {
         cadence = newValue;
    }

	public void changeGear(int newValue) {
         gear = newValue;
    }

	public void speedUp(int increment) {
         speed = speed + increment;   
    }

	public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

	public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }

}
