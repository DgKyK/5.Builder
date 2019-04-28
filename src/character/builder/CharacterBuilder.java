package character.builder;

import character.entity.Character;

public abstract class CharacterBuilder {
    protected Character character = new Character();

    abstract void buildStyle();
    abstract void buildStrength();
    abstract void buildIntelect();
    abstract void buildAgility();
    public Character getCharacter() {
        return character;
    }
}
