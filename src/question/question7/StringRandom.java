package question.question7;

public class StringRandom {

    static String[] strings = new String[] { // size = 4
            "aaa", // 0
            "bbb", // 1
            "ccc", // 2
            "zzz"  // 3
    };

    static String randomString() {
        double random = Math.random() * (strings.length - 1);
        int index = (int) Math.round(random);
        return strings[index];
    }

    static String randomCharacterString() {
        String result = "";
        for(int i = 0; i < 10; i++) {
            char c = (char)('a' + (Math.random() * 25));
            result += c;
        }
        return result;
    }

    static void randomExample() {
        int x = strings.length - 1;

        for(int i = 0; i < 15; i++)
            System.out.println((Math.random() * x));
    }

    static void convertationExample() {
        System.out.println((int)25.85);
        System.out.println((int)15.5000000);
        System.out.println((int)65.99999999);
        System.out.println((int)100.0000);
        System.out.println((int)29.32125421321);
        System.out.println((int)500.32125421321);
    }

    public static void main(String[] args) {
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
        System.out.println(randomString());
    }
}
