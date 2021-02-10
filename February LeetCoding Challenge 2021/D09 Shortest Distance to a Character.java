class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int cPos = -n;
    
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == c) {
                cPos = i;
            }
            arr[i] = i - cPos;
        }
        
        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == c) {
                cPos = i;
            }
            
            arr[i] = Math.min(arr[i], Math.abs(i-cPos));
        }
        
        return arr;
    }
    
}