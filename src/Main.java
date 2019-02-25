public class Main {

    public static void main(String[] args) {

        BinSearch binSerach= new BinSearch();
        String s = "abcefg";
        System.out.println(s.length());
        boolean result = binSerach.search(s , 'd');
        System.out.println(result);

    }
}
