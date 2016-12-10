class Percussion extends Instrument {

    boolean strike;

    Percussion(String name, String sound, String lowRange, String highRange, boolean strike){
        super(name,sound,lowRange,highRange);
        this.strike=strike;
    }

    boolean Struck(){
        if(strike)
            return true;
        else
            return false;
    }

    Boolean isStrings(){
        return super.isStrings();
    }

    public String  toString(){
        return super.toString()+ "is a"+ (Struck() ? " struck" : "") + (isPercussion() ? " percussion" : "")+" instrument ";
    } // Take a look at this. " ternary operator" is used here to do the simple and clean return.

}