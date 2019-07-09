package com.example.no7902;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class IconAdapter extends RecyclerView.Adapter<IconAdapter.ViewHolder> {

    private List<Icon> mIconList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView iconName;

        public ViewHolder(View view){
            super(view);
            iconImage = (ImageView) view.findViewById(R.id.imageView);
            iconName = (TextView) view.findViewById(R.id.textView);
        }
    }

    public IconAdapter(List<Icon> iconList){
        mIconList = iconList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.red, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Icon icon = mIconList.get(position);
        holder.iconImage.setImageResource(icon.getImageId());
        holder.iconName.setText(icon.getName());
    }


    @Override
    public int getItemCount() {
        return mIconList.size();
    }
}
