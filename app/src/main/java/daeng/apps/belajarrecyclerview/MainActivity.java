package daeng.apps.belajarrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import daeng.apps.belajarrecyclerview.Adapter.AdapterRecycler;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lst_data;
    private LinearLayoutManager layoutManager;
    private List<ItemObject> itemObjects;
    private AdapterRecycler adapterRecycler;
    private TextView txtTotalHarga;

    Integer total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Casting Object
        lst_data = (RecyclerView) findViewById(R.id.lst_data);
        txtTotalHarga = (TextView) findViewById(R.id.txtTotalHarga);
        // customize recyclerview
        layoutManager = new LinearLayoutManager(getApplicationContext());
        lst_data.setLayoutManager(layoutManager);
        lst_data.setHasFixedSize(true);

        itemObjects = new ArrayList<>();
        itemObjects.add(new ItemObject("Sepatu", "3000"));
        itemObjects.add(new ItemObject("Sandal", "5000"));

        adapterRecycler = new AdapterRecycler(getApplicationContext(), itemObjects);
        lst_data.setAdapter(adapterRecycler);

        for (int i = 0; i < adapterRecycler.getItemCount(); i++) {
            total = total + Integer.valueOf(itemObjects.get(i).getHarga());
            DecimalFormat formatter = new DecimalFormat("#,###,###");
            String harga = formatter.format(total);
            txtTotalHarga.setText("Rp. " + harga + ",-");
        }
    }
}
