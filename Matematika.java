public class Matematika {

    public static int penjumlahan(int a, int b) {
        return a + b;
    }
    public static int pengurangan(int a, int b) {
        return a - b;
    }
    public int perkalian(int a, int b) {
        return a * b;
    }
    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return (double) a / b;
    }
    public void sederhana(int pembilang, int penyebut) {
        int gcd = cariFPB(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Hasil penyederhanaan: " + pembilang + "/" + penyebut);
    }
    private int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public static void main(String[] args) {

        int hasilTambah = Matematika.penjumlahan(10, 5);
        int hasilKurang = Matematika.pengurangan(10, 5);

        System.out.println("Penjumlahan: " + hasilTambah);
        System.out.println("Pengurangan: " + hasilKurang);

        Matematika mtk = new Matematika();
        int hasilKali = mtk.perkalian(10, 5);
        double hasilBagi = mtk.pembagian(10, 5);

        System.out.println("Perkalian: " + hasilKali);
        System.out.println("Pembagian: " + hasilBagi);

        mtk.sederhana(20, 60);
    }
}
