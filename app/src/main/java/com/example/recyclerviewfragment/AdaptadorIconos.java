package com.example.recyclerviewfragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AdaptadorIconos extends RecyclerView.Adapter<AdaptadorIconos.ViewHolderIconos>{

    ArrayList<Iconos> listIconos;

    public AdaptadorIconos(ArrayList<Iconos> listIconos){
        this.listIconos = listIconos;
    }

    @Override
    public ViewHolderIconos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_icons,null,false);

        return new ViewHolderIconos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderIconos holder, int position) {
        holder.textotitulo.setText(listIconos.get(position).getTitulo());
        holder.i.setImageResource(listIconos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listIconos.size();
    }

    public class ViewHolderIconos extends RecyclerView.ViewHolder {

        TextView textotitulo;
        ImageView i;


        public ViewHolderIconos(View itemView) {
            super(itemView);

            textotitulo = (TextView) itemView.findViewById(R.id.idtitulo);
            i = (ImageView) itemView.findViewById(R.id.img_xml);
        }
    }
}
