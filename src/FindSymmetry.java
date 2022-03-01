public class FindSymmetry {
    public static void main(String[] args) {
        checkSymmetry("abcgebdgcda");
    }

    public static void checkSymmetry(String a) {
        String[] b = a.split("");
        for (int i = 0; i < b.length/2; i++) {
            if (b[i].equals(b[b.length - i - 1])) {
                System.out.println(b[i]);
            }
        }
    }
}
