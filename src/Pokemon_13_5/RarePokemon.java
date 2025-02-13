package Pokemon_13_5;

public class RarePokemon extends Pokemon {
    private String attack = "double kick";

    public RarePokemon() {}

    public RarePokemon(String type, int id) {
        super(type, id);
        if (this.getType().equals("electric")) {
            this.attack = "super attack";
        }
        else if (this.getType().equals("psychic ")){
            this.attack = "ultimate  attack";
        }

    }
    public String toString() {
        return String.format("%s:%s:%b", this.getIdentification(), this.attack, this.hasTrainer());
    }
}
