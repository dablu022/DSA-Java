class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
          char  ss = s.charAt(i);
         if(!st.isEmpty() && br(ss,st)) st.pop();
         else st.push(ss);
           
        }
        return st.size()==0;
    }
    public static boolean br(char s,Stack<Character> st){
             if(s==')' && st.peek()==('(')) return true;
             if(s==']' && st.peek()==('[')) return true;
             if(s=='}' && st.peek()==('{')) return true;
             return false;


    }
}