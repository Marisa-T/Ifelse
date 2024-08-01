public class ex5 {


    public class StringNumberComparison {
        public static void main(String[] args) {
            String inputText1 = "Evozon";
            int inputNumber1 = 2;
            System.out.println(compareTextAndNumber(inputText1, inputNumber1));

            String inputText2 = "Hello";
            int inputNumber2 = 4;
            System.out.println(compareTextAndNumber(inputText2, inputNumber2));
        }

        public static String compareTextAndNumber(String text, int number) {
            if ("Evozon".equals(text) && number <= 3) {
                return text + number;
            } else if (!"Evozon".equals(text) && number >= 4) {
                return number + text;
            } else {
                return "Condition not met";
            }
        }
    }
}
