public class Mothra extends Kaiju implements IRoar, IAttack, IMove {



    public Mothra(int healthValue, int attackValue) {

        super(healthValue, attackValue);

    }

    public String roar() {

        return "eeeeeeeeeeeeekkkkkk";
    }

    public void attack(int enemyHealthvalue, int attackvalue){



    }

    public void attack(Vehicle vehicle){

        if (vehicle.getHealthValue()< this.attackValue){

            vehicle.healthValue = 0;


        }
        else

            vehicle.healthValue = vehicle.getHealthValue() - this.attackValue;



    }

    public String move(int distance){

        return String.format("Flapped %s meters", distance);
    }
}
