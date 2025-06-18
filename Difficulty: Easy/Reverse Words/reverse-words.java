class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        s = s.trim();
        int vc =0;
        for(int i=0;i<s.length();i++)
        {
            vc++;
            if(s.charAt(i)==' ')
            {
                while(i<s.length()-1 && s.charAt(i+1)==' ')
                {
                    i++;
                }
            }
        }
        char[]arr = new char[vc];
        int index =0;
        for(int i=0;i<s.length();i++)
        {
            arr[index] = s.charAt(i);
            index++;
            if(s.charAt(i)==' ')
            {
                while(i<s.length()-1 && s.charAt(i+1)==' ')
                {
                    i++;
                }
            }
        }
        int start = 0;
        int end = arr.length-1;
        reverse(arr,start,end);
        start =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
            {
                end = i-1;
                reverse(arr,start,end);
                start = i+1;
            }
        }
        reverse(arr,start,arr.length-1);
        return String.valueOf(arr);
    }
    public void reverse(char[]arr,int start,int end)
    {
        while(start<end)
        {
            char temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
