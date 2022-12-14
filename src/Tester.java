public class Tester {
    public static void main(String[] args) {
        String string1 = "I Like to code near the Lake with my friend Luke";

        string1 = string1.replaceAll("L[^u]ke", "BLA");

        System.out.println(string1);
    }
}
