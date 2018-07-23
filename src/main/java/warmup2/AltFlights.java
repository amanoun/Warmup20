package warmup2;

public class AltFlights {

    public String altPairs(String str) {
        if (str.isEmpty()) {
            return str;
        }

        StringBuilder stringo = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + 4) {

            int nextIndex = i + 2;
            if (nextIndex >= str.length()) {
                stringo.append(str.substring(i));
            } else {
                stringo.append(str.substring(i, nextIndex));
            }

        }
        return stringo.toString();
    }
}
