
package Latihan5;

/**
 *
 * @author ASUS
 */
class Truck {
    //kelas truk memiliki tiga bidang
    public int cadence;
    public int gear;
    public int speed;
        //kelas truk memiliki satu konstruktor
    public Truck (int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //kelas truk memiliki 4 method
    public void setCadence (int newValue){
        cadence = newValue;
    }
    public void setGear (int newValue){
        gear = newValue;
    }
    public void applyBrake(int decrement){
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
    }
}
