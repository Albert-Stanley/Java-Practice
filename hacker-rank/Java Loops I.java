import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);    
        }
        scanner.close();
    }
}
