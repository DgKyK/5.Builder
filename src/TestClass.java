import character.builder.*;
import character.entity.Character;

public class TestClass {
    public static void main(String[] args) {
        CharacterBuilder builder = new WizardBuilder();
        Character myCharacter = Director.createCharacter(builder);
        System.out.println(myCharacter);
    }
}
