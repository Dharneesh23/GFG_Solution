//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.reverseDigits(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev =0;
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            while(n!=0)
            {
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
            }
        }
        return rev;
    }
}