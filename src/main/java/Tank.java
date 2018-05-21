public class Tank extends Vehicle implements IFire{


    public Tank(String type, int healthvalue, int attackValue){

        super(type, healthvalue,attackValue);
    }

    public void fire(Kaiju kaiju){

        if (kaiju.getHealthValue()< this.attackValue){

            kaiju.healthValue = 0;

        }
        else

            kaiju.healthValue = kaiju.getHealthValue() - this.attackValue;
    }


}


