package sample.Games;

class DiceImplTest {
    public static void main(String[] args) {
        Dice dice = new DiceImpl();

        int result = dice.roll();

        Assertions.asserttrue7(result < 7);
        Assertions.asserttrue0(result > 0);
    }
}