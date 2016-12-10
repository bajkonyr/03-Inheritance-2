class Brass extends Instrument {

    boolean valved;

    Brass(String name, String sound, String lowRange, String highRange, boolean valved){
        super(name,sound,lowRange,highRange);
        this.valved=valved;
    }

    boolean hasValves(){
        if(valved) {
            return true;
        }
        else return false;
    }

    boolean hasSlide(){
        if(!valved){
            return false;
        }
        else return true;
    }
    Boolean isBrass() {             //This is unbelievable!!! In order to use daddy's method, child must write method type with CAPITAL letter!!!!!!!!!!! This took me 50 min to realize!
        return super.isBrass();
    }

    public String  toString(){
        return super.toString()+ "is a"+ (hasValves() ? " valved " : "") + (hasSlide() ? "" : " slide ") +(isBrass() ? "brass" : "")+" instrument ";
    } // Take a look at this. " ternary operator" is used here to do the simple and clean return.
}