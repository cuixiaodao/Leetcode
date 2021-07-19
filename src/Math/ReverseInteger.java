package Math;
public class ReverseInteger{
    public int reverse(int x) {
        int ans = 0, q;
        do{
            q = x % 10;
            if((x>0 && (Integer.MAX_VALUE - q)/10.0 < ans) ||
                    (x<0 && (Integer.MIN_VALUE - q)/10.0 > ans))
                return 0;

            ans = ans*10 + q;
            x = x / 10; // how neg acts?
        } while(x != 0);

        return ans;
    }    
}