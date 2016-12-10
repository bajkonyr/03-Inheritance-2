class InstrumentApp {
    public static void main(String [] args) throws Exception {
        Woodwind clarinet = new Woodwind("clarinet", "toot", "E3", "C7", 1);
        System.out.println(clarinet);
        Woodwind oboe = new Woodwind("oboe", "doooot", "Bb3", "A6", 2);
        System.out.println(oboe);
        Brass trumpet = new Brass("trumpet", "blare", "F#3", "D6", true);
        System.out.println(trumpet);
        Brass trombone = new Brass("trombone", "waaah", "E2", "F5", false);
        System.out.println(trombone);
        Strings violin = new Strings("violin", "sigh", "E2", "F5", true);
        System.out.println(violin);
        Strings guitar = new Strings("guitar", "twang","E3", "E6", false);
        System.out.println(guitar);
        Percussion timpani = new Percussion("timpani", "boom", "D2", "A2", true);
        System.out.println(timpani);
        Percussion harp = new Percussion("harp", "pling", "Cb1", "F#7", false);
        System.out.println(harp);
        Keyboard piano = new Keyboard("piano", "plink", "A0", "C8", true);
        System.out.println(piano);
        Keyboard harpsichord = new Keyboard("harpsichord", "ting", "F1", "F6", false);
        System.out.println(harpsichord);
        System.out.println();

        // Now we'll assign them to an array of Instrument

        Instrument [] instruments = new Instrument[10];
        instruments[0] = clarinet;
        instruments[1] = oboe;
        instruments[2] = trumpet;
        instruments[3] = trombone;
        instruments[4] = violin;
        instruments[5] = guitar;
        instruments[6] = timpani;
        instruments[7] = harp;
        instruments[8] = piano;
        instruments[9] = harpsichord;

        System.out.println("Printing the objects");
        System.out.println("--------------------");
        for (Instrument instrument : instruments) 	// same as 'for int (i = 0; i < instruments.length; i++) Instrument instrument = instruments[i]'
            System.out.println(instrument);
        System.out.println();

        System.out.println("Categorizing the objects");
        System.out.println("------------------------");
        for (Instrument instrument : instruments) 	// same as 'for int (i = 0; i < instruments.length; i++) Instrument instrument = instruments[i]'
            System.out.println(instrument.getName() + ": " +
                    " isPercussion: " + instrument.isPercussion() +
                    " isKeyboard: " + instrument.isKeyboard() +
                    " isWind: " + instrument.isWind() +
                    " isWoodwind: " + instrument.isWoodwind() +
                    " isBrass: " + instrument.isBrass() +
                    " isString: " + instrument.isStrings());
        System.out.println();

        System.out.println("Playing the objects");
        System.out.println("-------------------");
        for (Instrument instrument : instruments) 	// same as 'for int (i = 0; i < instruments.length; i++) Instrument instrument = instruments[i]'
            System.out.println("A " + instrument.getName() + " goes " + instrument.play());
        System.out.println();

        System.out.println("Discovering the lowest and highest ranges");
        System.out.println("-----------------------------------------");
        Instrument low = instruments[0], high = instruments[0];
        for (int i = 1; i < instruments.length; i++) {
            if (compare(instruments[i].getLowRange(), low.getLowRange()) < 0) low = instruments[i];
            if (compare(instruments[i].getHighRange(), high.getHighRange()) > 0) high= instruments[i];
        }
        System.out.println("instrument with low range: " + low.getName());
        System.out.println("instrument with high range: " + high.getName());
        System.out.println();
    }

    static int compare(String range1, String range2) throws Exception {
        String note1 = range1.substring(0, range1.length()-1);
        String note2 = range2.substring(0, range2.length()-1);
        int octave1 = Integer.parseInt(range1.substring(range1.length()-1));
        int octave2 = Integer.parseInt(range2.substring(range2.length()-1));

        int noteVal1 = getNoteVal(note1, octave1);
        int noteVal2 = getNoteVal(note2, octave2);

        if (octave1 < octave2) return -1;
        else if (octave1 > octave2) return 1;
        else return 0;
    }

    static int getNoteVal(String note, int octave) throws Exception {
        int val;
        switch (note.charAt(0)) {
            case 'C': val = 0; break;
            case 'D': val = 2; break;
            case 'E': val = 4; break;
            case 'F': val = 5; break;
            case 'G': val = 7; break;
            case 'A': val = 9; break;
            case 'B': val = 11; break;
            default : throw new Exception("Bad note " + note + " in getNoteVal");
        }

        if (note.endsWith("#")) val = (val+1) % 12;
        if (note.endsWith("b")) val = (val-1) % 12;

        return val + (octave*12);
    }
}