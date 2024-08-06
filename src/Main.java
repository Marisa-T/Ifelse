import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogicalOp logicalOp = new LogicalOp();
        Calculator calculator = new Calculator();
        Print print = new Print();


        //if else ex 4
        String result = logicalOp.compareText("Evozon");
        System.out.println(result);

        //if else ex 5
        System.out.println(logicalOp.compareTextAndNumber("Evozon", 3));
        System.out.println(logicalOp.compareTextAndNumber("Evozon", 9));
        System.out.println(logicalOp.compareTextAndNumber("Pantofi", 9));

        //if else ex 6
        System.out.println(logicalOp.snowAmount(11));
        System.out.println(logicalOp.snowAmount(6));
        System.out.println(logicalOp.snowAmount(3));

        //if else ex 7
        System.out.println(logicalOp.numberParameter(5));
        System.out.println(logicalOp.numberParameter(4));
        System.out.println(logicalOp.numberParameter(1));

        //if else ex 8
        LogicalOp.switchCase(3);
        LogicalOp.switchCase(5);

        //if else ex 9
        System.out.println(LogicalOp.isNumberEven(6));
        System.out.println(LogicalOp.isNumberEven(13));

        //if else ex 10
        System.out.println((LogicalOp.isEligibleToVote(15)));
        System.out.println((LogicalOp.isEligibleToVote(18)));
        System.out.println((LogicalOp.isEligibleToVote(31)));

        //if else ex 11
        System.out.println(LogicalOp.findLargestNumber(12, 19, 42));
        System.out.println(LogicalOp.findLargestNumber(57, 14, 98));

        //for loops ex 2
        LogicalOp.countToMinusHundred(7);

        //for loops ex 3
        LogicalOp.countBetweenNumbers(13, 113);

        //for loops ex 4
        LogicalOp.countFromSmallToLarge(98, 1);

        //for loops ex 5
        LogicalOp.displayEvenNumbers();

        //for loops ex 6
        LogicalOp.displayOddNumbers();

        //for loops ex 7
        System.out.println(logicalOp.addAllNumbers(95));

        //for loops ex 8
        System.out.println(logicalOp.addAndCalculateAverageOfNumbers(79));

        //for loops ex 9
        LogicalOp.displayPattern();

        //arrays ex 2
        int[] myArray = logicalOp.populateArray(100);
        print.printArray(myArray);

        //arrays ex 3
        int[] evenNumbers = logicalOp.populateEvenNumbers(50);
        print.printEvenNumb(evenNumbers);

        //arrays ex 4
        int[] numbers = {14, 22, 30, 49, 61};
        double average = logicalOp.averageOfNumbersInArray(numbers);
        System.out.println(average);

        //lists ex 1






    }



}