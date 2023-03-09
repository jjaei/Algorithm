class Solution {
    public int solution(int slice, int n) {
        int pizza = n/slice;
        
        if(n%slice!=0) {
            pizza = pizza+1;
        } else {
            pizza = pizza;
        }
        return  pizza;
    }
}