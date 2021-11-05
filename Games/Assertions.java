package sample.Games;

public class Assertions {
    public static void assertName(String name1, String name2) {
        if (name1.equals(name2)) {
            throw new AssertionError("У игроков огроков одинаковые имена");
        }
    }

    public static void noEqualsName(String name1, String name2) {
        if (!name1.equals(name2)) {
            System.out.println("Крутые имена. Играйте!");
        }
    }

    public static void asserttrue7(boolean actual7) {
        if (!actual7) {
            throw new AssertionError("Значение больше 7");
        }
    }

    public static void asserttrue0(boolean actual0) {
        if (!actual0) {
            throw new AssertionError(String.format("Значение меньше 0", actual0));
        }
    }

    public static void assertEquals(Class<? extends Throwable> expected, Class<? extends Throwable> actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
        }
    }

    public static void assertThrows(Class<? extends Throwable> expected, Runnable code) {
        Throwable actual = null;
        try {
            code.run();
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            throw new AssertionError("Given code does not throw any exception");
        }

        if (!actual.getClass().equals(expected)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected.getSimpleName(), actual.getClass().getSimpleName()));
        }
    }

}