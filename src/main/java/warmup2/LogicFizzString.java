package warmup2;

public class LogicFizzString {
    public String fizzString(String str) {
        if (str.substring(0).startsWith("f") && str.substring(str.length() - 1).endsWith("b")) {
            return "FizzBuzz";
        } else if (str.substring(str.length() - 1).endsWith("b")) {
            return "Buzz";
        } else if (str.substring(0).startsWith("f")) {
            return "Fizz";


        }
        return str;

    }
}
