public class Solution {
    public static boolean isPrime (int number) {
        if ( (number > 2 && number % 2 == 0) || number <= 1){
            return false;
        }

        for (int i =2 ; i < Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(31));
    }
}
