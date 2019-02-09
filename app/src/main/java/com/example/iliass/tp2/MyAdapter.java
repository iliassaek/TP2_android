package com.example.iliass.tp2;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter{

    ArrayList Etablissements;
    Context context;


    // for getting the data from Activity "Mylist"
    public MyAdapter(Context context, ArrayList Etab) {
        this.context = context;
        this.Etablissements = Etab;

    }


    @Override

    //inflate the layout item xml and pass it to View Holder
    //associer notre adapter à notre vu
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);

    }

    //
    @Override
    //set the data in the view’s by way of ViewHolder.
    //affecte les données aux widgets de la vue
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final Etablissement Etab= (Etablissement) Etablissements.get(position);

        ((MyViewHolder)    holder).name.setText(Etab.getname());
        ((MyViewHolder)    holder).label.setText(Etab.getlabel());
        ((MyViewHolder)    holder).img.setImageResource(Etab.getimage());


        ((MyViewHolder)    holder).display(Etab);


    }

    @Override
    public int getItemCount() {

        return Etablissements.size();
    }


    //get the reference of item view's
    public class MyViewHolder extends RecyclerView.ViewHolder  {
        TextView label;
        TextView name;
        ImageView img;
        private Etablissement currentEtab;
        public MyViewHolder(final View itemView) {
            super(itemView);
            label = itemView.findViewById(R.id.label);
            name = itemView.findViewById(R.id.name);
            img=  itemView.findViewById(R.id.img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentEtab.getlabel())
                            .show();
                }
            });

        }

        public void display(Etablissement Etab) {
            currentEtab = Etab;
            name.setText(Etab.getname());
            label.setText(Etab.getlabel());
            img.setImageResource(Etab.getimage());



        }


    }





}
