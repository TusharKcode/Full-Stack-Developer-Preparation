package Java.Interfaces.Practice;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void displayStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void displayStates(){
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

public class Interface {
    public static void main(String[] args) {
        Bike bk = new Bike();
        bk.changeGear(1);
        bk.speedUp(4);
        bk.applyBrakes(3);
        System.out.println("----- Bike Present State: -----");
        bk.displayStates();

        Bicycle bcl = new Bicycle();
        bcl.changeGear(2);
        bcl.speedUp(3);
        bcl.applyBrakes(1);
        System.out.println("----- Bicycle Present State: -----");
        bcl.displayStates();
    }
}
