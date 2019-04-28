package character.entity;

public class Character {
    private CharacterStyle style;
    private int intellect;
    private int strength;
    private int agility;

    public Character() {
        style = CharacterStyle.NONE;
    }

    public void setStyle(CharacterStyle style) {
        this.style = style;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "character.entity.Character{" +
                "style=" + style +
                ", intellect=" + intellect +
                ", strength=" + strength +
                ", agility=" + agility +
                '}';
    }
}

