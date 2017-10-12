// check if string is palindrome

import java.util.*;
import java.io.*;

public class PalindromeString{
    public static boolean isStringPalindrome(String str){
        if(str.length() == 0){
            return true;
        }
        int start = 0;
        int end = str.length()-1;
        if(str.length()%2 == 0){
            while(start < str.length() && end > 0){
                if(str.charAt(start) == str.charAt(end)){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else{
            boolean odd = false;
            while(start < str.length() && end > 0){
                if(str.charAt(start) == str.charAt(end)){
                    start++;
                    end--;
                }
                else if(odd == false){
                    odd = true;
                    start++;
                }
                else{
                    return false;
                }
                return true;
            }

        }
        return false;
    }

    //alt better solution
    public static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            else{
                start++;
                end++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isStringPalindrome(str));
    }
}