package daeng.apps.belajarrecyclerview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.DecimalFormat;
import java.util.List;

import daeng.apps.belajarrecyclerview.Holder.HolderRecycler;
import daeng.apps.belajarrecyclerview.ItemObject;
import daeng.apps.belajarrecyclerview.R;

/**
 * Created by Isfahani on 05-Agu-16.
 */
public class AdapterRecycler extends RecyclerView.Adapter<HolderRecycler> {

    private List<ItemObject> recyclerList;
    private Context context;

    public AdapterRecycler(Context context, List<ItemObject> recyclerList) {
        this.context = context;
        this.recyclerList = recyclerList;
    }

    @Override
    public HolderRecycler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carditem, null);
        return new HolderRecycler(view);
    }

    @Override
    public void onBindViewHolder(HolderRecycler holder, int position) {
        holder.txtJudul.setText(recyclerList.get(position).judul);
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String harga = formatter.format(Integer.valueOf(recyclerList.get(position).harga));
        holder.txtHarga.setText("Rp. " + harga + ",-");
    }

    @Override
    public int getItemCount() {
        return recyclerList.size();
    }
}
