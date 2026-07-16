class Solution {

    int count = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0)
            return 0;
        
        for(int i=0;i<s.length();i++){
            func(i,i,s);
            func(i,i+1,s);
        }

        return count;
    }

    public void func(int i, int j, String s){

        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
}