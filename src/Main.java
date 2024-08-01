//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogicalOp logicalOp = new LogicalOp();

        //if else ex 4
        String result = logicalOp.compareText("Evozon");
        System.out.println(result);

        //if else ex 5
        System.out.println(logicalOp.compareTextAndNumber("Evozon", 3));
        System.out.println(logicalOp.compareTextAndNumber("Evozon", 9));
        System.out.println(logicalOp.compareTextAndNumber("Pantofi", 9));

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





    }



}