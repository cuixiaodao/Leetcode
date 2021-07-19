package Math;

public class CountPrimes{
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n+1];

        int cnt = 0;
        for(int i=2; i< n; i++){
            if(!notPrime[i]){
                cnt++;

                int p = i;
                if(i < Math.sqrt(n))
                    while ((p += i) < n+1)
                        notPrime[p] = true;
            }
        }

        return cnt;
    }
}