class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] lang = {"aya","ye","woo","ma"};
        
        // 1. babbling에 lang 이 포함되어 있어? -> 지워 -> 개수세
        for(String b : babbling){
            for(String l : lang){
                b = b.replace(l, " ");
                
            }
            if(b.trim().length()==0){
                answer++;
            }
        }
        
        return answer;
    }
}