package com.example.app_listgridspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.MyViewHolder> {

    private List<City> cities;
    private Context context;

    public CityAdapter(List<City> cities, Context context) {
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_city, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        City currentCity = cities.get(position);
        holder.cityName.setText(currentCity.getName());
        holder.cityImage.setImageResource(currentCity.getImageResId());

        // Clic simple : Afficher le nom (Question 5)
        holder.itemView.setOnClickListener(v ->
                Toast.makeText(context, "Ville sélectionnée : " + currentCity.getName(), Toast.LENGTH_SHORT).show());

        // Clic long : Opérations CRUD avec AlertDialog (Question 8)
        holder.itemView.setOnLongClickListener(v -> {
            showOptionsDialog(position);
            return true;
        });
    }

    private void showOptionsDialog(int position) {
        String[] options = {"Modifier", "Supprimer"};
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Choisissez une action")
                .setItems(options, (dialog, which) -> {
                    if (which == 1) { // Supprimer
                        cities.remove(position);
                        notifyItemRemoved(position);
                        Toast.makeText(context, "Ville supprimée", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(context, "Action Modifier (à implémenter)", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    @Override
    public int getItemCount() { return cities.size(); }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView cityImage;
        TextView cityName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cityImage = itemView.findViewById(R.id.img_city);
            cityName = itemView.findViewById(R.id.txt_city_name);
        }
    }
}
