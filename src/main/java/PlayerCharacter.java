public class PlayerCharacter {
    public static int positionX = 0;
    public static int positionY = 0;

    public static int getX() {
        return PlayerCharacter.positionX;
    }

    public static int getY() {
        return PlayerCharacter.positionY;
    }

    public static int move(char arg) {

        int returns;

        switch(arg) {
            case 'W':
                positionY++;
                returns = getY();
                break;

            case 'S':
                positionY--;
                returns = getY();
                break;

            case 'D':
                positionX++;
                returns = getX();
                break;

            case 'A':
                positionX--;
                returns = getX();
                break;

            default:
                returns = 60;
        }

        return returns;
    }
}
