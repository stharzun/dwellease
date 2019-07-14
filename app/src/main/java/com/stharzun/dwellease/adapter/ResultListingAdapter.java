package com.stharzun.dwellease.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.stharzun.dwellease.R;
import com.stharzun.dwellease.data.Module;

import java.util.ArrayList;

/**
 * Created by Arjun Shrestha on 7/14/19.
 * arjunshrestha.com.np
 * stharzun@gmail.com
 */
public class ResultListingAdapter extends RecyclerView.Adapter<ResultListingAdapter.ViewHolder> {
    private ArrayList<Module> data;

    public ResultListingAdapter(ArrayList<Module> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_result, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Context context = viewHolder.itemView.getContext();
        Glide.with(context).load(this.data.get(i).getLandlordProfileImage()).apply(new RequestOptions().error(R.drawable.user)).into(viewHolder.landLordImage);
        Glide.with(context).load(this.data.get(i).getImage()).apply(new RequestOptions().error(R.drawable.hotel)).into(viewHolder.image);

        viewHolder.landLordName.setText(this.data.get(i).getLandlordName());
        viewHolder.name.setText(this.data.get(i).getName());
        viewHolder.type.setText(this.data.get(i).getType());
        viewHolder.street.setText(this.data.get(i).getStreet());
        viewHolder.bedRoom.setText(this.data.get(i).getNoOfBed() + " bedrooms");
        viewHolder.bathRoom.setText(this.data.get(i).getNoOfBathroom() + " bathrooms");
        viewHolder.sqFt.setText(this.data.get(i).getSqFt() + " sq. ft.");
        viewHolder.months.setText(this.data.get(i).getLeaseTerm() + " months");
        viewHolder.price.setText("$" + this.data.get(i).getMonthlyRent() + " / month");
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView landLordImage, image;
        private TextView landLordName, name, type, street, bedRoom, bathRoom, sqFt, months, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            landLordImage = itemView.findViewById(R.id.landlord_image);
            image = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            type = itemView.findViewById(R.id.type);
            street = itemView.findViewById(R.id.street);
            bedRoom = itemView.findViewById(R.id.bedRoom);
            bathRoom = itemView.findViewById(R.id.bathRoom);
            sqFt = itemView.findViewById(R.id.sqFt);
            months = itemView.findViewById(R.id.month);
            price = itemView.findViewById(R.id.price);
            landLordName = itemView.findViewById(R.id.landlord_name);
        }
    }
}
