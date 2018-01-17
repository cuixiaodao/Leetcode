package Backtracking;

public class CNUniqueDigits{
    
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int cmbs[] = {10,81,648,4536,27216,136080,544320,1632960,3265920,3265920};
        int ret = 0;
        int minN = Math.min(n, cmbs.length);
        for(int i=0; i<minN; i++)
            ret += cmbs[i];
        return ret;
    }   
    
    // public static void main(String args[]){
    //     CNUniqueDigits t = new CNUniqueDigits();
    //     System.out.println(t.countNumbersWithUniqueDigits(11));
    // }
}