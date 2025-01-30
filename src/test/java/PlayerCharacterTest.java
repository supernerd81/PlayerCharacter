import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {


    @BeforeEach
    void resetAllXY() {
        PlayerCharacter.positionX = 0;
        PlayerCharacter.positionY = 0;
    }

    @Test
    void getX_null() {
        int expect = 0;
        int actual = PlayerCharacter.getX();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void getY_null() {
        int expect = 0;
        int actual = PlayerCharacter.getY();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void movedUp_onPressed_key_W_PositionY_PlusOne() {
        char given = 'W';
        int expect = 1;
        int actual = PlayerCharacter.move(given);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void movedUp_onPressed_key_S_PositionY_MinusOne() {
        char given = 'S';
        int expect = -1;
        int actual = PlayerCharacter.move(given);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void movedUp_onPressed_key_A_PositionX_MinusOne() {
        char given = 'A';
        int expect = -1;
        int actual = PlayerCharacter.move(given);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void movedUp_onPressed_key_D_PositionX_PlusOne() {
        char given = 'D';
        int expect = 1;
        int actual = PlayerCharacter.move(given);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void moved_returns42_WhenNotPressed_ASDW() {
        char given = 'G';
        int expect = 60;
        int actual = PlayerCharacter.move(given);

        Assertions.assertEquals(expect, actual);
    }
}
