package basicPrograms;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num = 11;
        boolean isPrime=true;

        for(int i=2; i<Math.sqrt(num);i++){
            if(num%2==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);


    }
}
