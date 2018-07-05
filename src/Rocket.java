
public class Rocket {
    String rocketId;
    int propellants;

    public Rocket(String rocketId, int propellants) throws Exception {
        if(rocketId.length()!=8) {
            throw new Exception("Error: ID is incorrect");
        }
        this.rocketId = rocketId;

        if(propellants <=0) {
            throw new Exception("Error: propellant amount incorrect");
        }
        this.propellants = propellants;
    }

    public String getRocketId() {
        return rocketId;
    }

    public int getPropellants() {
        return propellants;
    }


    public void rocketPrint(){
        System.out.println(" id:" + rocketId + " Propellants amount: " + propellants);
    }

}
