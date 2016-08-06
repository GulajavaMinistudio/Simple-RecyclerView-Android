package daeng.apps.belajarrecyclerview.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import daeng.apps.belajarrecyclerview.R;

/**
 * Created by Isfahani on 05-Agu-16.
 */
public class HolderRecycler extends RecyclerView.ViewHolder {

    public TextView txtJudul, txtHarga;

    public HolderRecycler(View itemView) {
        super(itemView);
        txtJudul = (TextView) itemView.findViewById(R.id.txtJudul);
        txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
    }
}
