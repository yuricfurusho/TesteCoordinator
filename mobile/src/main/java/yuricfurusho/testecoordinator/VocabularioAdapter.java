package yuricfurusho.testecoordinator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by live on 12/06/15.
 */
public class VocabularioAdapter extends RecyclerView.Adapter<VocabularioAdapter.ViewHolder> {
    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tTexto;

        public ViewHolder(View view) {
            super(view);
            tTexto = (TextView) view.findViewById(R.id.tTexto);
        }
    }

    public VocabularioAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public VocabularioAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_vocabulario, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tTexto.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}