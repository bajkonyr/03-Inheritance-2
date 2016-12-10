
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
        boolean a =false;
        if (name=="clarinet" || name=="trumpet" || name=="trombone" || name=="oboe")
            a=true;
        return a;
    }
    Boolean isWoodwind(){
        boolean a =false;
        if (name=="clarinet" || name=="oboe")
            a=true;
        return a;
    }

    Boolean isBrass() {

        if (name=="trumpet" || name=="trombone")
            return true;

        else return false;
    }

    Boolean isKeyboard() {

        boolean a =false;
        if (name=="harpsichord" || name=="piano")
            a=true;
        return a;
    }
    Boolean isPercussion(){
        boolean a =false;
        if (name=="harp" || name=="timpani")
            a=true;
        return a;
    }

    Boolean isStrings(){
        boolean a =false;
        if (name=="violin" || name=="guitar")
            a=true;
        return a;
    }

    public String toString(){return"A " + name+ " makes the sound '"+sound+"', and has the range "+lowRange+"-" +highRange+", and "; }

}