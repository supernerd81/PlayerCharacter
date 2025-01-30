import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @Test
    void getX_null() {
        int expect = 0;
        int actual = PlayerCharacter.getX();
        Assertions.assertEquals(expect, actual);
    }

}
