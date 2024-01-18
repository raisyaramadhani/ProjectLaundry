public class customer {
    private String nama;
    private int telp;
    private String alamat;


    public customer(String newNama){
    this.nama = newNama;
}
    public void setTelp (int newTelp){
        telp = newTelp;
    }
    public void setAlamat (String newAlamat){
        alamat = newAlamat;
    }

    public String getNama(){
        return nama;
    }

    public int getTelp(){
        return telp;
    }

    public String getAlamat(){
        return alamat;
    }
}
