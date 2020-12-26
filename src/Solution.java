import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringOrigin = "";
        String stringNew = "";
        stringNew += string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > stringNew.charAt(stringNew.length() - 1)) stringNew += string.charAt(i);
            else if (string.charAt(i) < stringNew.charAt(stringNew.length() - 1)) {
                if (stringNew.length() > stringOrigin.length()) {
                    stringOrigin = stringNew;
                }
                stringNew = "";
                stringNew += string.charAt(i);
            }
        }
        System.out.println(stringOrigin.length()>stringNew.length()?stringOrigin:stringNew);
    }
}
