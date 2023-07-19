import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0,end = str.length()-1;
        System.out.println(isPalindrome(str, start, end));
        sc.close();
    }

    static int isPalindrome(String str,int start,int end) {
        if(start > end) {
            return 1;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return 0;
        }
        return isPalindrome(str,start+1,end-1);
    }
}