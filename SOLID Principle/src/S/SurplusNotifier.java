public class SurplusNotifier {
    public static void consoleLogNotify(String message) {
        System.out.println(message);
    }

    public static void jsonNotify(String message) {
        System.out.println("{ message: " + message + " }");
    }
}
