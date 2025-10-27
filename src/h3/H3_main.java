package h3;

public class H3_main {
    public static void main(String[] args){
        int i=140, j=150, k=-10;
        k = -10;
        if (i > j) {
            if (i > 200) {
                if (j > 100) {
                    k = 3;
                } else {
                    k=2;
                }
            } else {
                if (j > 100) {
                } else {
                    k=1;
                }
            }
        } else {
            if (i > 200){
            } else {
                if (j > 100){
                } else {
                    k=4;
                }
            }
        }
        System.out.println(k);
    }
}
