public class JenisLaundry {
    private String JenisLaundry;
    private int harga;

    public JenisLaundry(String jenisLaundry, int harga){
        this.JenisLaundry = jenisLaundry;
        this.harga = harga;
    }

    public int hitungTotal(int harga, int jumlah){
        return harga * jumlah;
    }
}
