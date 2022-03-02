public class Utils {

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ignore) {
            return false;
        }
    }
}
