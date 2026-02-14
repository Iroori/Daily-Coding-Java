import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // participant, completion 배열과 비교하여 일치하지 하지않을때 answer에 넣기
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i =0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        return participant[i];
    }
}