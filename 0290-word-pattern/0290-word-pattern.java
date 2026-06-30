class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character,String> cw=new HashMap<>();
        Map<String,Character> wc=new HashMap<>();
       
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=words[i];
            if(cw.containsKey(c)){
                if(!cw.get(c).equals(w)) return false;
            }
            else{
                cw.put(c,w);
            }
        
           if(wc.containsKey(w)){
                if(wc.get(w)!=c) return false;
           }
            else{
                wc.put(w,c);
            }
            

        }
        return true;

    }
}