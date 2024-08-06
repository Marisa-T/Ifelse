import java.util.ArrayList;
import java.util.List;

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

    public String snowAmount(int number) {
        if (number > 8 || number == 6){
            return "The amount of snow this winter was(cm): " + number;}
        else {
            return "The forecast snow is(cm): " + number;}

    }

    public String numberParameter(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    public static void switchCase(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;


        }
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;

    }

    public static int findLargestNumber(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
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

    public int addAllNumbers(int a) {
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public float addAndCalculateAverageOfNumbers(int a) {
        int sum = 0;
        int nr = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
            nr = nr + 1;
        }
        return (float) sum / nr;
    }

    public static void displayPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }


    }

    public int[] populateArray(int length){
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;

    }

    public  int[] populateEvenNumbers(int length) {
        int[] evenNumbers = new int[length];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[index++] = i;
            }
        }
        return evenNumbers;
    }

    public double averageOfNumbersInArray (int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }



}

