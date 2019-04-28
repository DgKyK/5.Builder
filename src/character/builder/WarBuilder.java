package character.builder;

import character.entity.CharacterStyle;

public class WarBuilder extends CharacterBuilder {

    @Override
    public void buildStyle() {
        this.character.setStyle(CharacterStyle.WAR);
    }

    @Override
    public void buildStrength() {
        this.character.setStrength(100);
    }

    @Override
    public void buildIntelect() {
        this.character.setIntellect(20);
    }

    @Override
    public void buildAgility() {
        this.character.setAgility(20);
    }
}
