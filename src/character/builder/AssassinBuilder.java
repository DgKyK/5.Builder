package character.builder;

import character.entity.CharacterStyle;

public class AssassinBuilder extends CharacterBuilder {
    @Override
    void buildStyle() {
        this.character.setStyle(CharacterStyle.ASSASSIN);
    }

    @Override
    void buildStrength() {
        this.character.setStrength(50);
    }

    @Override
    void buildIntelect() {
        this.character.setIntellect(20);
    }

    @Override
    void buildAgility() {
        this.character.setAgility(100);
    }
}
