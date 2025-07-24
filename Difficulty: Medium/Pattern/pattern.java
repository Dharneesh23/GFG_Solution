class Solution {
    void printDiamond(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int s =1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--)
        {
            for(int s =1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
