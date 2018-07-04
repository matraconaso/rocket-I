
public class Rocket {
    String rocketId;
    int propellants;

    public Rocket(String rocketId, int propellants) throws excepcionNew {
        if(rocketId.length()!=8) {
            throw new excepcionNew("Error: ID is incorrect");
        }else{
            this.rocketId = rocketId;
        }
        if(propellants <=0) {
            throw new excepcionNew("Error: propellant amount incorrect");
        }else{
            this.propellants = propellants;
        }



    }
    public class excepcionNew extends Exception {
        public excepcionNew(String msg) {
            super(msg);
        }
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
