package hello.javainaction.part02.after;

public class Letter {
    public static String addHeader(String text) {
        return "from the love msg " + text;
    }

    public static String addFooter(String text) {
        return text + " Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("the", "hjaja");
    }

}
