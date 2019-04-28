package character.builder;

import character.entity.CharacterStyle;

public class AssassinBuilder extends CharacterBuilder {
    @Override
    public void buildStyle() {
        this.character.setStyle(CharacterStyle.ASSASSIN);
    }

    @Override
    public void buildStrength() {
        this.character.setStrength(50);
    }

    @Override
    public void buildIntelect() {
        this.character.setIntellect(20);
    }

    @Override
    public void buildAgility() {
        this.character.setAgility(100);
    }
}
