package Math;

public class Sqrt{
    public int mySqrt(int x) {
        if(x == 0) return 0;
        double x1 = x*0.5, x2 = x1;
        
        do{
            x1 = x2;
            x2 = (x1 + x/x1)/2;
        } while(Math.abs(x1-x2) >= 1);

        return (int)x2;
    }
}