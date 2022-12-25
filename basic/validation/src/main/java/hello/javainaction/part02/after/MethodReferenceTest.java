package hello.javainaction.part02.after;

public class MethodReferenceTest {
    public static  boolean isValidName(String string) {
        return Character.isUpperCase(string.charAt(0));
    }
}
