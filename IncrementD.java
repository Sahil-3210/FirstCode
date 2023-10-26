public class IncrementD {
    public static void main(String[] args) {
        int k = 2;
        // System.out.println(k++);
        // System.out.println(++k);
        // System.out.println(k--);
        // System.out.println(k++);
        // System.out.println(++k);
        // System.out.println(k--);
        // System.out.println(--k);
        // System.out.println(k);
        // System.out.println(k++);
        System.out.println((k++) - (++k) + (k--) - (k++) + (++k) - (k--) + (--k) + (k) + (k--) - (k) + (--k) + (k++));  //8 is the output.
    }
}
