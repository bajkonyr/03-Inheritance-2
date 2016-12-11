
class Instrument  {
    String name, sound, lowRange, highRange;


    Instrument(String name, String sound, String lowRange, String highRange) {
        this.name=name;
        this.sound=sound;
        this.lowRange=lowRange;
        this.highRange=highRange;
    }

    String getName() {
        return name;

    }
    String play(){
        return sound;

    }
    String getLowRange(){
        return lowRange;

    }
    String getHighRange(){
        return highRange;

    }

    Boolean isWind() {
        if (name=="clarinet" || name=="trumpet" || name=="trombone" || name=="oboe")
            return true;
        else
            return false;
    }
    Boolean isWoodwind(){
        if (name=="clarinet" || name=="oboe")
            return true;
        return false;
    }

    Boolean isBrass() {
        if (name=="trumpet" || name=="trombone")
            return true;

        else return false;
    }

    Boolean isKeyboard() {
        if (name=="harpsichord" || name=="piano")
            return true;
        else
            return false;
    }

    Boolean isPercussion(){
        if (name=="harp" || name=="timpani")
            return true;
        else
            return false;
    }

    Boolean isStrings(){
        if (name=="violin" || name=="guitar")
            return true;
        else
            return false;
    }

    public String toString(){return"A " + name+ " makes the sound '"+sound+"', and has the range "+lowRange+"-" +highRange+", and "; }


}