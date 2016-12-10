class Woodwind extends Wind{
    int numReeds;
    private static boolean hasReed1;
    String a;
    Boolean b;


    Woodwind(String name, String sound, String lowRange, String highRange, int numReeds) {

        super(name,sound,lowRange,highRange,hasReed1);
        this.numReeds=numReeds;
        if (numReeds==1) {
            this.hasReed1=true;
            this.a="single";
        }
        else if (numReeds==2) {
            this.hasReed1=true;
            this.a="double";
        }
        else this.hasReed1=false;

    }

    boolean isSingleReed(){
        if (numReeds==1){
            b=true;
        }
        return b;
    }

    //boolean isDoubleReed(int value){}

    //boolean isWoodwind(){};

    public String  toString(){ return super.toString()+ "is a "+ a +" reed woodwind ";}

}