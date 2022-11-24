package reflection;

public class SecondTarget extends FirstTarget {
    public String target1 = "1";
    private String target2 = "2";

    public SecondTarget() {
    }

    private SecondTarget(String target) {
        target1 = target;
    }

    public int method4(int n) {
        System.out.println("method4: " + n);
        return n;
    }

    private int method5(int n) {
        System.out.println("method5: " + n);
        return n;
    }
}
