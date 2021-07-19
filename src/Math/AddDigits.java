
package Math;
public class AddDigits{
    public int addDigits(int num) {       
        while(num/10 != 0)            
            num = sumDigits(num);
        return num;
    } 

    private int sumDigits(int n){
        int newN = 0;
        do{
            newN += n%10;
            n /= 10;
        } while(n != 0);
        return newN;
    }
}