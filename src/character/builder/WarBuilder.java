package character.builder;

import character.entity.CharacterStyle;

public class WarBuilder extends CharacterBuilder {

    @Override
    void buildStyle() {
        this.character.setStyle(CharacterStyle.WAR);
    }

    @Override
    void buildStrength() {
        this.character.setStrength(100);
    }

    @Override
    void buildIntelect() {
        this.character.setIntellect(20);
    }

    @Override
    void buildAgility() {
        this.character.setAgility(20);
    }
}
