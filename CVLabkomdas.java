public class CVLabkomdas {

    private final int HARGA_JAKET_A = 100000;
    private final int HARGA_JAKET_B = 125000;
    private final int HARGA_JAKET_C = 175000;

    private final int DISKON_JAKET_A = 95000;
    private final int DISKON_JAKET_B = 120000;
    private final int DISKON_JAKET_C = 160000;

    public int hitungTotalA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_A;
        } else {
            return jumlah * HARGA_JAKET_A;
        }
    }

    public int hitungTotalB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_B;
        } else {
            return jumlah * HARGA_JAKET_B;
        }
    }

    public int hitungTotalC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_JAKET_C;
        } else {
            return jumlah * HARGA_JAKET_C;
        }
    }

    public static void main(String[] args) {
        CVLabkomdas labkomdas = new CVLabkomdas();

        int jumlahA = 105;
        int jumlahB = 50;
        int jumlahC = 110;

        int totalA = labkomdas.hitungTotalA(jumlahA);
        int totalB = labkomdas.hitungTotalB(jumlahB);
        int totalC = labkomdas.hitungTotalC(jumlahC);

        int totalKeseluruhan = totalA + totalB + totalC;

        System.out.println("Total Harga Jaket A: Rp " + totalA);
        System.out.println("Total Harga Jaket B: Rp " + totalB);
        System.out.println("Total Harga Jaket C: Rp " + totalC);
        System.out.println("Total Pembayaran Keseluruhan: Rp " + totalKeseluruhan);
    }
}
