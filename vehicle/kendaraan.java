package vehicle;

import java.util.ArrayList;

public class kendaraan{
    protected String nomorPlat;
    protected int jumlahPenumpang;

    //constructor dari class kendaraan
    kendaraan(String noPlat, int jumlahPenumpang){
        this.nomorPlat = noPlat;
        this.jumlahPenumpang = jumlahPenumpang;
    }
    public void penumpangNaik(int jumlahPenumpang){

    }
    public void penumpangTurun(int jumlahPenumpang){

    }
    //method untuk mendapatkan plat nomor kendaraan
    String getPlat(){
        return nomorPlat;
    }
    //method untuk mendapat jumlah penumpang kendaraan
    int getjumlahPenumpang(){
        return jumlahPenumpang;
    }
}
class bus extends kendaraan{
    private int kapasitasBagasi;

    int penumpangNow = 0;
    int bagasiNow = 0;

    //constructor dari class bus yang merupakan turunan dari kelas kendaraan
    bus(String noPlat, int jumlahPenumpang, int kapasitasBagasi){
        super(noPlat, jumlahPenumpang);
        this.kapasitasBagasi = kapasitasBagasi;
    }
    //method untuk menambah jumlah penumpang
    public void penumpangNaik(int naik){
        penumpangNow += naik;
        if(penumpangNow<=jumlahPenumpang){
            System.out.println("Berhasil naik");
        }else if(penumpangNow>jumlahPenumpang){
            penumpangNow -= naik;
            System.out.println("Maaf, bus penuh");
        }
    }
    //method untuk menurunkan penumpang
    public void penumpangTurun(int turun){
        penumpangNow -= turun;
        if(penumpangNow>=0){
            System.out.println("Berhasil turun");
        }else if(penumpangNow<0){
            penumpangNow += turun;
            System.out.println("Jumlah penumpang tidak boleh negatif");
        }
    }
    //method untuk menambah barang pada bagasi
    public void tambahBagasi(int berat){
        bagasiNow += berat;
        if(bagasiNow<=kapasitasBagasi){
            System.out.println("Berhasil ditambah");
        }else if(bagasiNow>kapasitasBagasi){
            bagasiNow -= berat;
            System.out.println("Maaf, bagasi penuh");
        }
    }
    //method untuk mengurangi barang pada bagasi
    public void kurangiBagasi(int berat){
        bagasiNow -= berat;
        if(bagasiNow>=0){
            System.out.println("Berhasil diturunkan");
        }else if(bagasiNow<0){
            bagasiNow += berat;
            System.out.println("Kapasitas bagasi tidak boleh negatif");
        }
    }
    //method untuk cek penumpang
    public void cekPenumpang(){
        System.out.println("Jumlah penumpang max\t: "+jumlahPenumpang);
        System.out.println("Penumpang saat ini\t: "+penumpangNow);
    }
    //method untuk cek bagasi
    public void cekBagasi(){
        System.out.println("Kapasitas bagasi maksimal: "+kapasitasBagasi+" kg");
        System.out.println("Bagasi sekarang: "+bagasiNow+" kg");
    }
}
class truk extends kendaraan{
    private int kapasitasMuatan;

    int penumpangNow = 0;
    int muatanNow = 0;

    //constructor dari class truk yang merupakan turunan dari kelas kendaraan
    truk(String platNomor, int jumlahPenumpang, int kapasitasMuatan){
        super(platNomor, jumlahPenumpang);
        this.kapasitasMuatan = kapasitasMuatan;
    }
    //method untuk menambah jumlah penumpang
    public void penumpangNaik(int naik){
        penumpangNow += naik;
        if(penumpangNow<=jumlahPenumpang){
            System.out.println("Berhasil naik");
        }else if(penumpangNow>jumlahPenumpang){
            penumpangNow -= naik;
            System.out.println("Maaf, truk penuh");
        }
    }
    //method untuk menurunkan penumpang
    public void penumpangTurun(int turun){
        penumpangNow -= turun;
        if(penumpangNow>=0){
            System.out.println("Berhasil turun");
        }else if(penumpangNow<0){
            penumpangNow += turun;
            System.out.println("Jumlah penumpang tidak boleh negatif");
        }
    }
    //method untuk menambah muatan
    public void tambahMuatan(int berat){
        muatanNow += berat;
        if(muatanNow<=kapasitasMuatan){
            System.out.println("Berhasil ditambah");
        }else if(muatanNow>kapasitasMuatan){
            muatanNow -= berat;
            System.out.println("Muatan terlalu berat");
        }
    }
    //method untuk mengurangi muatan
    public void kurangiMuatan(int berat){
        muatanNow -= berat;
        if(muatanNow>=0){
            System.out.println("Berhasil diturunkan");
        }else if(muatanNow<0){
            muatanNow += berat;
            System.out.println("Berat muatan tidak bisa negatif");
        }
    }
    //method untuk cek penumpang
    public void cekPenumpang(){
        System.out.println("Jumlah penumpang max\t: "+jumlahPenumpang);
        System.out.println("Penumpang saat ini\t: "+penumpangNow);
    }
    //method untuk cek muatan
    public void cekMuatan(){
        System.out.println("Kapasitas muatan maksimal: "+kapasitasMuatan+" kg");
        System.out.println("Muatan sekarang: "+muatanNow+" kg");
    }
}
class driver{
    private String nama;
    private String noLicense;

    //constructor dari class driver
    driver(String nama, String license){
        this.nama = nama;
        this.noLicense = license;
    }
    //method untuk mendapatkan nama driver
    String getNama(){
        return nama;
    }
    //method untuk mendapatkan nomor license driver
    String getLicense(){
        return noLicense;
    }
}
class dataDriver{
    ArrayList<driver> daftarDriver;

    //constructor dari class dataDriver
    dataDriver(){
        daftarDriver = new ArrayList<>();
        daftarDriver.add(new driver("Adi", "223451"));
        daftarDriver.add(new driver("Dhika", "224892"));
    }
    //method untuk set nama driver
    void setDriver(driver supir){
        daftarDriver.add(supir);
    }
    //method untuk cek kesesuaian nama dan nomor license driver
    driver getDriver(String nama, String license){
        for(driver supir : daftarDriver){
            if(supir.getNama().equals(nama)&&supir.getLicense().equals(license)){
                return supir;
            }
        }return null;
    }
}