package character.builder;
import character.entity.Character;

public class Director {

    public static Character createCharacter(CharacterBuilder builder) {
        builder.buildStyle();
        builder.buildAgility();
        builder.buildIntelect();
        builder.buildStrength();
        return builder.getCharacter();
    }

}
