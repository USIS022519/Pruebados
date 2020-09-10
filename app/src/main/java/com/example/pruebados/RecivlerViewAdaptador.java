package com.example.pruebados;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecivlerViewAdaptador extends RecyclerView.Adapter<RecivlerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Codigo, descripcion, precio;
        ImageView cocacola;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Codigo = (TextView) itemView.findViewById(R.id.tvCodigo);
            descripcion = (TextView) itemView.findViewById(R.id.tvDescripcion);
            precio = (TextView) itemView.findViewById(R.id.tvprecio);
            cocacola = (ImageView)itemView.findViewById(R.id.imgproducto);
        }
    }
    public List<Datos> datosList;

    public RecivlerViewAdaptador(List<Datos> datosList) {
        this.datosList = datosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_menus,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Codigo.setText(datosList.get(position).getCodigo());
        holder.descripcion.setText(datosList.get(position).getDescripcion());
        holder.precio.setText(datosList.get(position).getPrecio());
    }

    @Override
    public int getItemCount() {
        return datosList.size();
    }
}
