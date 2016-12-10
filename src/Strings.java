class Strings extends Instrument {
    Strings(String name, String sound, String lowRange, String highRange, boolean bowed){
        super(name,sound,lowRange,highRange);
        this.bowed=bowed;
    }

    boolean isBowed(){
        if(bowed)
            return true;
        else
            return false;
    }

    boolean isPlucked(){
        if(!bowed)
            return false;
        else return true;
    }

    Boolean isStrings(){
        return super.isStrings();
    }

    public String  toString(){
        return super.toString()+ "is a"+ (isBowed() ? " bowed " : "") + (isPlucked() ? "" : " plucked ") +(isStrings() ? "string" : "")+" instrument ";
    } // Take a look at this. " ternary operator" is used here to do the simple and clean return.

    boolean bowed;
}
