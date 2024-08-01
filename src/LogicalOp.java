public class LogicalOp {
    public String compareText(String text) {
        if ("Evozon".equals(text)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String compareTextAndNumber(String text, int number) {
        if (text.equals("Evozon") && number <= 3)
            return text + " " + number;
        else if (!text.equals("Evozon") && number >= 4)
            return number + " " + text;
        else
            return "No condition was met";
    }


    public static void countToMinusHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public static void countBetweenNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public static void countFromSmallToLarge(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }

        }


    }
    public static void displayEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }


        }
    }

    public static void displayOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }


        }
    }
    }