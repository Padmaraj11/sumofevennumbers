public class maximum  {
    public static int max(int[] values) {
        int i, a = values[0];
        for (i=1;i<values.length;i++) {
            if (a<values[i]) {
                a=values[i];
            }
        }
        return a;
    }
}
