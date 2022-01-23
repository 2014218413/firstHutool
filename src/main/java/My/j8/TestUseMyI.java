package My.j8;

public class TestUseMyI {
    public static void main(String[] args) {
        UseMyI useMyI = new UseMyI();

        useMyI.op((i,i2) -> {
            return i+i2;
        },"name","address");
    }
}
