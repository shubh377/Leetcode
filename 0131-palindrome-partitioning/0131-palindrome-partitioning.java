class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        
        List<String> curr=new ArrayList<>();
        func(0,s,list,curr);
        return list;
    }
    
    public static void func(int index,String s,List<List<String>> list,List<String> curr){
        
        if (index==s.length()){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i=index;i<s.length();i++){
            
            if (isPalindrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                func(i+1,s,list,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String s,int i,int j){
        
        while(i<=j){
            
            if (s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        
        return true;
    } 
}