package VVVCO;

import java.util.Scanner;

public class Driverclascar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Roda : ");
        String numWheels=in.nextLine();
        System.out.println("Masukkan Harga : ");
        double price=in.nextInt();

        System.out.println("Pilih 1.Car atau 2.Bicycle : ");
        int pilihan=in.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukkan Jumlah Pintu : ");
            int numDoors=in.nextInt();
            System.out.println("Masukkan Electric atau tidak : ");
            boolean isElectric=in.nextBoolean();
            System.out.println("Masukkan Tipe Atap : ");
            String roofType=in.nextLine();
            in.nextLine();

            Car c = new Car(numDoors, isElectric, price, numWheels);
            Convertible r = new Convertible(roofType);
            c.print();
            r.print();

        }else if (pilihan == 2) {
            System.out.println("Masukkan Tipe Sepeda : ");
            String bikeType=in.nextLine();

            Bicycle b = new Bicycle();
            b.print();
        }

        System.out.println("Diskon 1.ya atau 2.tidak : ");
        int diskon=in.nextInt();

        if (diskon == 1  ) {
            System.out.println("Berapa Persen : ");
            int persen = in.nextInt();
            System.out.println("Masukkan Harga Awal : ");
            int hargaAwal = in.nextInt();

            for (int i = 1; i >=diskon; i--) {
                System.out.println("Masukkan Diskon");
                diskon = in.nextInt();
            }
            diskon = hargaAwal-persen;
            System.out.println("Harga Awal " +hargaAwal);
            System.out.println("Diskon " +diskon);

            
            in.nextLine();
        }else if (diskon == 2) {
            System.out.println();
}
}
}
