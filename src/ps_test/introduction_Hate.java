package ps_test;

public class introduction_Hate {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int[] solution(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
            .filter(i-> i%2 !=0)
            .toArray();
    }
}
class Solution2{
    public int[] solution(int n){
        
        int count =0;

        for(int i =0; i<n; i++){
            if(i % 2 !=0){
                count++;
            }
        }
        int [] answer = new int[count];
        int inx =0;
        
        for(int i=0; i<=n; i++){
            if( i%2!=0){
                answer[inx++] = i;
            }
        }

        return answer;
    }
}