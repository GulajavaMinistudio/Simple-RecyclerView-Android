package daeng.apps.belajarrecyclerview;

/**
 * Created by Isfahani on 05-Agu-16.
 */
public class ItemObject {
    public String judul;
    public String harga;

    public ItemObject(String judul, String harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }
}
