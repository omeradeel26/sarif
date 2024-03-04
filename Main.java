public class Main {
    public static void f(int ch) {
        int chx = -1;
        if (ch >= 0x0fff0) {
            if (!((ch >= 0x0FF10 && ch <= 0x0FF19) ||
                  (ch >= 0x0FF21 && ch <= 0x0FF3A) ||
                  (ch >= 0x0FF41 && ch <= 0x0FF5A))) {
                ch = chx;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("error");
    }
}
