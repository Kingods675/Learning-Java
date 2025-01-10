package Instrument_Information;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields
    private int numOfStrings;
    private int numOfFrets;
    private boolean instrumentIsBowed;
    // TODO: Define mutator methods -
    //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
    public void setNumOfStrings(int numOfString) {
        this.numOfStrings = numOfString;
    }

    public void setNumOfFrets(int numOfFrets) {
        this.numOfFrets = numOfFrets;
    }

    public void setIsBowed(boolean instrumentIsBowed) {
        this.instrumentIsBowed = instrumentIsBowed;
    }

    // TODO: Define accessor methods -
    //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
    public int getNumOfStrings() {
        return numOfStrings;
    }

    public int getNumOfFrets() {
        return numOfFrets;
    }

    public boolean getIsBowed() {
        return instrumentIsBowed;
    }
}


