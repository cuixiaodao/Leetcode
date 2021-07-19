public class KMP {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        KMP kmp = new KMP();
        String str = "abababdafdasabcfdfeaba";
        String pattern = "abc";
        System.out.println(kmp.kmp(str, pattern));
    }

    void getNext(String pattern, int next[]) {
        int j = 0;
        int k = -1;
        int len = pattern.length();
        next[0] = -1;

        while (j < len - 1) {
            if (k == -1 || pattern.charAt(k) == pattern.charAt(j))
                next[++j] = ++k;
            else k = next[k];
        }
    }

    int kmp(String s, String pattern) {
        int i = 0;
        int j = 0;
        int slen = s.length();
        int plen = pattern.length();

        int[] next = new int[plen];

        getNext(pattern, next);

        while (i < slen && j < plen) {

            if (s.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            else if(next[j] == -1) {
                i++;
                j = 0;
            }
            else j = next[j];


            if (j == plen)
                return i - j;
        }
        return -1;
    }
}
