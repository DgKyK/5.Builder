package character.builder;

import character.entity.CharacterStyle;

public class WizardBuilder extends CharacterBuilder {
    @Override
    public void buildStyle() {
        this.character.setStyle(CharacterStyle.WIZARD);
    }

    @Override
    public void buildStrength() {
        this.character.setStrength(20);
    }

    @Override
    public void buildIntelect() {
        this.character.setIntellect(100);
    }

    @Override
    public void buildAgility() {
        this.character.setAgility(20);
    }
}
