class Keyboard extends Instrument {

    boolean pedals;

    Keyboard(String name, String sound, String lowRange, String highRange, boolean pedals){
        super(name,sound,lowRange,highRange);
        this.pedals=pedals;
    }

    boolean hasPedals(){
        if(pedals)
            return true;
        else return false;
    }


    Boolean isKeyboard() {
        return super.isKeyboard();
    }

    public String  toString(){
        return super.toString()+ "is a"+ (hasPedals() ? " pedalled " : "") + (isKeyboard() ? " keyboard" : "")+" instrument ";
    } // Take a look at this. " ternary operator" is used here to do the simple and clean return.
}