package vehicle;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        bus bus = new bus("N 4571 DF", 30, 65);
        truk truk = new truk("B 8861 GS", 1, 300);
        dataDriver data = new dataDriver();

        while (true) {
            System.out.println("Pilih Kendaraan");
            System.out.println("1. Bus");
            System.out.println("2. Truk");
            System.out.println("3. Selesai");
            System.out.print("Pilihan: ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                while (true) {
                        System.out.println("Opsi Kendaraan");
                        System.out.println("1. Tambah penumpang\n2. Turunkan penumpang\n3. Tambah bagasi\n4. Kurangi bagasi\n5. Cek supir\n6. Cek penumpang\n7. Cek bagasi\n8. Exit");
                        System.out.print("Pilihan: ");
                        int opsi = in.nextInt();
                        int jumlah;
                        int berat;
                        String nama;
                        String license;
                        switch (opsi) {
                            case 1:
                                System.out.print("Masukkan jumlah penumpang naik: ");
                                jumlah = in.nextInt();
                                bus.penumpangNaik(jumlah);
                                break;
                            case 2:
                                System.out.print("Masukkan jumlah penumpang turun: ");
                                jumlah = in.nextInt();
                                bus.penumpangTurun(jumlah);
                                break;
                            case 3:
                                System.out.print("Masukkan berat benda yang ingin dimasukkan(kg): ");
                                berat = in.nextInt();
                                bus.tambahBagasi(berat);
                                break;
                            case 4:
                                System.out.print("Masukkan berat benda yang ingin diturunkan(kg): ");
                                berat = in.nextInt();
                                bus.kurangiBagasi(berat);
                                break;
                            case 5:
                                in.nextLine();
                                System.out.print("Nama supir: ");
                                nama = in.nextLine();
                                System.out.print("Nomor SIM: ");
                                license = in.nextLine();
                                driver driver = new driver(nama, license);
                                data.setDriver(driver);
                                data.getDriver(nama, license);
                                if(driver!=null){
                                    System.out.println("Data supir");
                                    System.out.println("Nama supir: "+driver.getNama());
                                    System.out.println("Nomor SIM: "+driver.getLicense());
                                    System.out.println("Kendaraan: Bus");
                                    System.out.println("Plat nomor: "+bus.getPlat());
                                    System.out.println("Kapasitas penumpang kendaraan: "+bus.getjumlahPenumpang());
                                }else{
                                    System.out.println("Supir tidak terdaftar");
                                }
                                break;
                            case 6:
                                bus.cekPenumpang();
                                break;
                            case 7:
                                bus.cekBagasi();
                                break;
                            case 8:
                                return;
                            default:
                                break;
                        }
                        continue;
                    }
                case 2:
                while (true) {
                    System.out.println("Opsi Kendaraan");
                    System.out.println("1. Tambah penumpang\n2. Turunkan penumpang\n3. Tambah muatan\n4. Kurangi muatan\n5. Cek supir\n6. Cek penumpang\n7. Cek muatan\n8. Exit");
                    System.out.print("Pilihan: ");
                    int opsi = in.nextInt();
                    int jumlah;
                    int berat;
                    String nama;
                    String license;
                    switch (opsi) {
                        case 1:
                            System.out.print("Masukkan jumlah penumpang naik: ");
                            jumlah = in.nextInt();
                            truk.penumpangNaik(jumlah);
                            break;
                        case 2:
                            System.out.print("Masukkan jumlah penumpang turun: ");
                            jumlah = in.nextInt();
                            truk.penumpangTurun(jumlah);
                            break;
                        case 3:
                            System.out.print("Masukkan berat muatan(kg): ");
                            berat = in.nextInt();
                            truk.tambahMuatan(berat);
                            break;
                        case 4:
                            System.out.print("Masukkan berat muatan yang ingin diturunkan(kg): ");
                            berat = in.nextInt();
                            truk.kurangiMuatan(berat);
                            break;
                        case 5:
                            in.nextLine();
                            System.out.print("Nama supir: ");
                            nama = in.nextLine();
                            System.out.print("Nomor SIM: ");
                            license = in.nextLine();
                            driver driver = new driver(nama, license);
                            data.setDriver(driver);
                            data.getDriver(nama, license);
                            if(driver!=null){
                                System.out.println("Data supir");
                                    System.out.println("Nama supir: "+driver.getNama());
                                    System.out.println("Nomor SIM: "+driver.getLicense());
                                    System.out.println("Kendaraan: Truk");
                                    System.out.println("Plat nomor: "+truk.getPlat());
                                    System.out.println("Kapasitas penumpang kendaraan: "+truk.getjumlahPenumpang());
                            }else{
                                System.out.println("Supir tidak terdaftar");
                            }
                            break;
                        case 6:
                            truk.cekPenumpang();
                            break;
                        case 7:
                            truk.cekMuatan();
                            break;
                        case 8:
                            return;
                        default:
                            break;
                    }
                    continue;
                }
                case 3:
                    System.out.println("Anda keluar");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue;
            }    
        }
    }
}
