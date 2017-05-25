public class PrintAskLineVertical {

    public static void main (String[] args) {
        PrintAskLineVertical printVertLine = new PrintAskLineVertical();
        int number = 3;
        printVertLine.printLine(number);
    }

    public void printLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }
}