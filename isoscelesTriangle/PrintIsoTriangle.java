public class PrintIsoTriangle {

    public static void main (String[] args) {
        PrintIsoTriangle isoTriangle = new PrintIsoTriangle();
        int number = 3;
        isoTriangle.printTriangle(number);
    }

    public void printTriangle(int number) {
        String line = "*";
        int paddingNum = number;
        for (int i = 0; i < number; i++){
            paddingNum -= 1;
            String spaces = new String(new char[paddingNum]).replace("\0", " ");
            System.out.println(spaces + line);
            line += "**";
        }
    }
}
