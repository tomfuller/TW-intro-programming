import java.util.*;
public class PrintNameDiamond {

    public static void main (String[] args) {
        PrintNameDiamond nameDiamond = new PrintNameDiamond();
        int number = 3;
        nameDiamond.printDiamond(number);
    }

    public void printDiamond(int number) {
        String line = "*";
        int padding = number - 1;
        ArrayList<String> diamond = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            String space = new String(new char[padding--]).replace("\0", " ");
            int size = diamond.size();
            diamond.add(size/2, space + line);
            diamond.add(size/2, space + line);
            line += "**";
        }
        diamond.remove(diamond.size()/2);
        diamond.remove(diamond.size()/2);
        diamond.add(diamond.size()/2, "Tom");
        for (String lines: diamond) {
            System.out.println(lines);
        }
    }
}