class Woodwind extends Wind{
    int numReeds;
    private static boolean hasReed1=true;



    Woodwind(String name, String sound, String lowRange, String highRange, int numReeds) {
        super(name,sound,lowRange,highRange,hasReed1);
        this.numReeds=numReeds;

    }

    boolean isSingleReed(){
        if (numReeds==1)
            return true;
        else
            return false;
    }

    boolean isDoubleReed(){
        if (numReeds==2)
            return true;
        else
            return false;
}

    Boolean isWoodwind(){
        return super.isWoodwind();
    }

    public String  toString(){
        return super.toString()+ "is a "+ (isSingleReed() ? "single" : "") +(isDoubleReed() ? "double" : "")+(super.hasReed() ? " reed " : "") +(isWoodwind() ? "woodwind" : "");
    }
}