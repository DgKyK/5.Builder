package character.builder;

import character.entity.CharacterStyle;

public class WizardBuilder extends CharacterBuilder {
    @Override
    void buildStyle() {
        this.character.setStyle(CharacterStyle.WIZARD);
    }

    @Override
    void buildStrength() {
        this.character.setStrength(20);
    }

    @Override
    void buildIntelect() {
        this.character.setIntellect(100);
    }

    @Override
    void buildAgility() {
        this.character.setAgility(20);
    }
}
