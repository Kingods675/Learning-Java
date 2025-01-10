package Pokemon_13_5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public abstract class Pokemon {
    private String type;
    private int id = 0;
    private String[] validTypes = {"psychic", "water", "fire", "electric"};
    private boolean hasTrainer;
    private String attack = "kick";

    public Pokemon() {}

    public Pokemon(String type, int id) {
        for (String validType : validTypes) {
            if (type.toLowerCase().equals(validType)) {
                this.type = type.toLowerCase();
                break;
            }
        }
        if (id >= 1 && id <= 1000){
            if (id % 42 != 0 && id % 73 !=0) {
                this.id = id;
            }
        }

    }

    public int getUniqueID() {
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    public String getIdentification() {
        return String.format("%s%d", this.type, this.id);
    }

    public boolean hasTrainer() {
        return hasTrainer;
    }

    public boolean setTrainer() {
        return hasTrainer = true;
    }



    public boolean removeTrainer() {
        if (this.hasTrainer) {
            hasTrainer = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%b", this.getIdentification(), this.attack, this.hasTrainer());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id && hasTrainer == pokemon.hasTrainer && Objects.equals(type, pokemon.type) && Objects.deepEquals(validTypes, pokemon.validTypes);
    }

}
