package com.kleploytech.vidyalekha.adapater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kleploytech.vidyalekha.R;
import com.kleploytech.vidyalekha.module.*;

import java.util.ArrayList;

public class stdadapater extends RecyclerView.Adapter<stdadapater.stdviweholder> {

    Context context;
    ArrayList<Stdmodel> stdmodel;

    public stdadapater(Context context, ArrayList<Stdmodel> stdmodel){
        this.context=context;
        this.stdmodel=stdmodel;
    }


    @NonNull
    @Override
    public stdviweholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.studentrecyc,parent,false);
        return new stdviweholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull stdviweholder holder, int position) {
       stdmodel.get(position);


    }

    @Override
    public int getItemCount() {
        return stdmodel.size();
    }

    public class stdviweholder extends RecyclerView.ViewHolder{
        TextView reg,name,sem,phone;


        public stdviweholder(@NonNull View itemView) {
            super(itemView);
            reg=itemView.findViewById(R.id.reg);
            name=itemView.findViewById(R.id.name);
            sem=itemView.findViewById(R.id.sem);
            phone=itemView.findViewById(R.id.phone);
        }
    }
}
