package BinarySearch;

public class ValidPerfectSquare{
    public boolean isPerfectSquare(int num) {
        if(num == 0) return true;
        double x0, x1 = num;
        do{
            x0 = x1;
            x1 = 0.5*(x0 + num/x0);
        } while(Math.abs(x1 - x0) > 1);
        
        x1 = Math.floor(x1);
        return x1*x1 == num;
    }
}