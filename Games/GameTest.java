package sample.Games;


class GameTest {
    public static void main(String[] args) {
        assertName();
        noEqualsName();
    }

    private static void assertName() {
        Player player1 = new Player("Grishanin");
        Player player2 = new Player("Grishanin");

        Assertions.assertName(player1.getName(), player2.getName());
    }

    private static void noEqualsName() {
        Player player1 = new Player("Grishanin2");
        Player player2 = new Player("Grishanin");

        Assertions.noEqualsName(player1.getName(), player2.getName());
    }
 }
//     Player.getName();
//     if 7


//        game.playGame();
//        String name1=;
//        String name2=Player2;

//        dice.roll();
//        int resultat7= dice.roll();
//        Assertions.asserttrue7(resultat7<7);
