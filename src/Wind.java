class Wind extends Instrument {

    boolean hasReed;

    Wind(String name, String sound, String lowRange, String highRange, boolean hasAReed) {
        super(name,sound,lowRange,highRange);
        this.hasReed=hasAReed;
    }

    //boolean hasReed(){hasReed=false;}

    // boolean isWind(){};
}