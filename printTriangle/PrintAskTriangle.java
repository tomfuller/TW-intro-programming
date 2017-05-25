public class PrintAskTriangle {

    public static void main (String[] args) {
        int number = 3;
        PrintAskTriangle askTriangle = new PrintAskTriangle();
        askTriangle.printTriangle(number);
    }

    public void printTriangle(int number) {
        String line = "";
        for (int i = 0; i < number; i++) {
            line += "*";
            System.out.println(line);
        }
    }
}