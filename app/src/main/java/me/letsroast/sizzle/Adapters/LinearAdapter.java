package me.letsroast.sizzle.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import me.letsroast.sizzle.R;

/**
 * Created by Eric on 11/19/2015.
 */
public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.ViewHolder> {
    private ArrayList<String> mDataset;

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtContent;
        public Button btnUpvote;
        public Button btnDownvote;
        public Button btnReport;

        public ViewHolder(View v) {
            super(v);
            txtContent = (TextView) v.findViewById(R.id.txtComment);
            btnReport = (Button) v.findViewById(R.id.btnReport);
            btnUpvote = (Button) v.findViewById(R.id.btnUpvote2);
            btnDownvote = (Button) v.findViewById(R.id.btnDownvote2);
        }
    }

    public void add(int position, String item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }

    public LinearAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public LinearAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LinearAdapter.ViewHolder holder, int position) {
        holder.txtContent.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
