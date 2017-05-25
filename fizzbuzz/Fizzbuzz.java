public class Fizzbuzz {

    public static void main (String[] args) {
        Fizzbuzz fizz = new Fizzbuzz();
        fizz.fizzbuzzHundred();

    }

    public String fizzbuzz(int number) {
        if(number % 3 == 0 && number % 5 ==0) {
            return "Fizzbuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        else {
            return number + "";
        }
    }

    public void fizzbuzzHundred() {
        for (int i = 0; i < 101; i++) {
            System.out.println(fizzbuzz(i));
        }
    }
}