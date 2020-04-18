package com.example.ca_whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class chat_adapter_home extends RecyclerView.Adapter<chat_adapter_home.MyViewHolder> {

    Context context;
    List<chat_home> mhome;

    public chat_adapter_home(Context context, List<chat_home> mhome) {
        this.context = context;
        this.mhome = mhome;
    }

    @NonNull
    @Override
    public chat_adapter_home.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.my_list,parent,false);
        final MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull chat_adapter_home.MyViewHolder holder, int position) {
        holder.mName.setText(mhome.get(position).getName());
        holder.mTime.setText(mhome.get(position).getTime());
        holder.mImageView.setImageResource(mhome.get(position).getImageView());
        holder.mDesc.setText(mhome.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return mhome.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final Context mContext;
        private TextView mName;
        private  TextView mTime;
        private TextView mDesc;
        private ImageView mImageView;
        private LinearLayout ll;

        public MyViewHolder (View itemView){

            super(itemView);
            mName = itemView.findViewById(R.id.mylist_Name);
            mTime = itemView.findViewById(R.id.mylist_time);
            mDesc = itemView.findViewById(R.id.mylist_desc);
            mImageView = itemView.findViewById(R.id.mylist_img);
            ll=itemView.findViewById(R.id.my_list);

            mContext = itemView.getContext();
            ll.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (getLayoutPosition()){
                case 0:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 8:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
                case 9:
                    Toast.makeText(mContext, "clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
