public class Vehicle{
    String type;
    int healthValue;
    int attackValue;


    public Vehicle (String type, int healthvalue, int attackValue){
        this.type = type;
        this.healthValue = healthvalue;
        this.attackValue = attackValue;
    }

    public String getType(){

        return this.type;
    }

    public int getHealthValue(){

        return healthValue;
    }


}
