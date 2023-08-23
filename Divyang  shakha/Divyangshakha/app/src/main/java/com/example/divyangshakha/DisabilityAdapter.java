package com.example.divyangshakha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DisabilityAdapter  extends  RecyclerView.Adapter<DisabilityAdapter.ViewHolder>
{
    @NonNull
    Context context;
    ArrayList<disabilityModel> arrcontact;
    DisabilityAdapter(Context context, ArrayList<disabilityModel> arrcontact)
    {
        this.context=context;
        this.arrcontact=arrcontact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.disability,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrcontact.get(position).img);
        holder.txtDisability.setText(arrcontact.get(position).disability);

    }

    @Override
    public int getItemCount() {
        return arrcontact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtDisability;
        ImageView img;
        LinearLayout row;
        public ViewHolder(View itemView)
        {
            super(itemView);
            this.txtDisability=itemView.findViewById(R.id.txtDisability);

            this.img=itemView.findViewById(R.id.img);
            row=itemView.findViewById(R.id.row);
        }
    }

}
