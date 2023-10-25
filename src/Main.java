import java.util.ArrayList;

public class Main {
    public static boolean AsalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Asal2CarpaniVarMi(int sayi) {
        for (int i = 2; i <= sayi / 2; i++) {
            if (AsalMi(i) && AsalMi(sayi - i)) {
                return true;
            }
        }
        return false;
    }

    public static void SayiChenAsaliMi(int sayi, ArrayList<String> tablo) {
        if (sayi >= 10 && sayi <= 99) {
            if (AsalMi(sayi)) {
                tablo.add(sayi + "      Asal bir sayıdır.");
            } else if (Asal2CarpaniVarMi(sayi)) {
                tablo.add(sayi + "      Chen Asalıdır.");
            } else {
                tablo.add(sayi + "      Chen Asalı değildir.");
            }
        }
    }

    public static void TumunuYazdir() {
        ArrayList<String> tablo = new ArrayList<>();
        for (int p = 10; p <= 99; p++) {
            SayiChenAsaliMi(p + 2, tablo);
        }
        System.out.println("Sayı Aralığı: 10 - 99");
        System.out.println("Sayı\tDurum");
        System.out.println("----\t-----");
        for (String satir : tablo) {
            System.out.println(satir);
        }
    }

    public static void main(String[] args) {
        TumunuYazdir();
    }
}
