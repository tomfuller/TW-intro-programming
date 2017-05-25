public class PrintAstLine {

    public static void main (String[] args) {
        int number = 8;
        PrintAstLine ast = new PrintAstLine();
        ast.printLine(number);
    }

    public void printLine(int number) {
        String line = "";
        for (int i = 0; i < number; i++) {
            line += "*";
        }
        System.out.println(line);
    }
}