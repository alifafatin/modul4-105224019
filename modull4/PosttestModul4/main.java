import java.util.Scanner;

class Pelanggan {
    String nama;
    String notelp;
    double saldo;

    public Pelanggan(String nama, String notelp) {
        this.nama = nama;
        this.notelp = notelp;
        this.saldo = 0;
        System.out.println("akun berhasil : " + this.nama);
    }

    public void isiDana(double nominal) {
        if (nominal >= 10000) {
            this.saldo += nominal;
            System.out.println("struk");
            System.out.println("nominal: Rp " + nominal);
            System.out.println("status : berhasil");
        } else {
            System.out.println("setor minimum adalah Rp 10.000");
        }
    }

    public void bayarTagihan(double tagihan) {
        if (this.saldo >= tagihan) {
            this.saldo -= tagihan;
            System.out.println("pelunasan tagihan sebesar Rp " + tagihan + " berhasil.");
        } else {
            System.out.println("saldo gak mencukupi untuk tagihan Rp " + tagihan);
        }
    }

    public void tampilkanSaldo() {
        System.out.println("Sisa Saldo " + this.nama + " (081234567): Rp " + this.saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pelanggan user = new Pelanggan("Anton", "081234567");

        System.out.print("masukin nominal setoran pertama: ");
        user.isiDana(input.nextDouble());

        System.out.print("masukin nominal tagihan listrik: ");
        user.bayarTagihan(input.nextDouble());

        System.out.print("masukin nominal setoran kedua: ");
        user.isiDana(input.nextDouble());

        System.out.print("coba bayar tagihan listrik lagi: ");
        user.bayarTagihan(input.nextDouble());

        System.out.println("status akhir");
        user.tampilkanSaldo();

        input.close();
    }
}