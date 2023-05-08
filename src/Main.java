public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myIndex = service.index(1.55, 60);
        System.out.println(myIndex);
    }
}
