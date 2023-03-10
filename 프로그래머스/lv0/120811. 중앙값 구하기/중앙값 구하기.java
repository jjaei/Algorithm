import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            int num = array.length/2;
               answer = array[num];
        }
        return answer;
    }
}