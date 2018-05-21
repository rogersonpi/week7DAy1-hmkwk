public class Godzilla extends Kaiju implements IRoar, IAttack{

    public Godzilla (int healthValue, int attackValue){

        super(healthValue, attackValue);

    }

    public String roar() {

        return "Grrraaaaaarrrr";
    }

    public void attack(Vehicle vehicle){

        if (vehicle.getHealthValue()< this.attackValue){

            vehicle.healthValue = 0;


        }
        else

           vehicle.healthValue = vehicle.getHealthValue() - this.attackValue;



    }

    public String move(int distance){

        return String.format("Stomped $s", distance);
    }
}
