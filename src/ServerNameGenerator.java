public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjs = { "attractive", "helpful", "icy", "nice", "obnoxious", "refined", "scrawny", "tinkling", "uneven", "yummy" };
        String[] nouns = { "airline", "banana", "clock", "flowers", "hero", "light", "mountain", "photograph", "socks", "web" };

        System.out.println("Here is your server name: " + randomString(adjs) + "-" + randomString(nouns));
    }

    public static String randomString(String[] a) {
        int randomNum = (int) Math.floor(Math.random() * a.length);
        String s = a[randomNum];

        return s;
    }
}
