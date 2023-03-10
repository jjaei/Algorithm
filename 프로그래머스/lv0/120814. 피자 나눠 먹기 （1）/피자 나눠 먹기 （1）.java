class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;
        if(n%pizza!=0){
            answer = (n/pizza)+1;
        } else {
            answer =n/pizza;
        }
        return answer;
    }
}