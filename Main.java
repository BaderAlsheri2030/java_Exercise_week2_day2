import java.util.Scanner;
public class Main {

    //1
    public static void smallestValue(int n1,int n2, int n3){

    if (n1 < n2 && n1 < n3) {
        System.out.println("The smallest value is "+(double)n1);
    }
    else if (n2 < n1 && n2 < n1) {
        System.out.println("The smallest value is "+(double)n2);

    }
    else if (n3< n1 && n3 <n1){
        System.out.println("The smallest value is "+(double)n3);

    }
    else System.out.println("Numbers are equal");

    }
    //2
    public static void checkNumber(int n1){
    if (n1 > 0 ){
        System.out.println("The number is positive ");
    }
    if (n1 == 0) {
        System.out.println("The number is zero");
    }
    if (n1 < 0) {
        System.out.println("the number is negative");
    }
    }



    //3
    public static void passWord(char[] str,char[] str2,char[] str3,String p){
        int j =0;
        int l =0;
        int n=0;
        boolean x =false;
        if (p.length() >= 8){

            for (char item : str) {
                if (p.charAt(j) == item) {
                    j++;
                    x = true;
                    continue;

                }
            }
            for (char value : str2) {
                if (p.charAt(l) == value) {
                    l++;
                    x = true;
                    continue;
                }
            }
            for (char c : str3) {
                if (p.charAt(n) == c) {
                    n++;
                    x = true;
                    continue;

                }
            }
        }



        if (x){
            System.out.println(p + " password is valid");

        }
        else System.out.println("Password is invalid");

    }


    //1
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner input =new Scanner(System.in);
        System.out.println("Input  first number");
        n1 = input.nextInt();
        System.out.println("Input  second number");
        n2 = input.nextInt();
        System.out.println("Input  third number");
        n3 = input.nextInt();

        smallestValue(n1,n2,n3);


        //2
        System.out.println("Input a number ");
        int n4 = input.nextInt();
        checkNumber(n4);


        //3
        char[] alphabetLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] alphabetUpper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println("Input a password (You are agreeing to the above Terms and conditions.): )");
        String p = input.next();
        passWord(alphabetLower,alphabetUpper,numbers,p);

    }
}