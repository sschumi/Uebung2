public class H2_main {
    public static void main(String[] args){
        int i=15, j=7, k= 9, min = 0, max = 0;
        if (i < j){
            if (i < k) {
                min = i;
            }
        } else if (j < i){
            if (j < k) {
                min = j;
            }
        } else if (k < i){
            if (k < j){
                min = k;
            }
        }
        if (i > j){
            if (i > k) {
                max = i;
            }
        } else if (j > i){
            if (j > k) {
                max = j;
            }
        } else if (k > i){
            if (k > j){
                max = k;
            }
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }
}
