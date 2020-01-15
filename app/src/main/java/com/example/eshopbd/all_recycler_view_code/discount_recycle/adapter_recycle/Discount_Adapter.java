package com.example.eshopbd.all_recycler_view_code.discount_recycle.adapter_recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.discount_recycle.model_recycle.DiscountModel;

import java.util.ArrayList;

public class Discount_Adapter extends RecyclerView.Adapter<Discount_Adapter.ViewHolder_Discount> {
    private Context context ;
    private ArrayList<DiscountModel>discountModels;

    public Discount_Adapter(Context context, ArrayList<DiscountModel> discountModels) {
        this.context = context;
        this.discountModels = discountModels;
    }

    @NonNull
    @Override
    public ViewHolder_Discount onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View discount_product = layoutInflater.inflate(R.layout.discount_display_layout,parent,false);
        return new  ViewHolder_Discount(discount_product);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Discount holder, int position) {
  holder.Discount_product_name.setText(discountModels.get(position).getDiscount_product_name());
  holder.product_discount_image.setImageResource(discountModels.get(position).getImage_discount_product());
 holder.current_price.setText(discountModels.get(position).getDiscount_count_current_price());
  holder.previous_price.setText(discountModels.get(position).getDiscount_product_previous_price());
  holder.Product_discount_real.setText( discountModels.get(position).getDiscount_real());
    }

    @Override
    public int getItemCount() {
        return discountModels.size();
    }

    class ViewHolder_Discount extends RecyclerView.ViewHolder{
      TextView Discount_product_name,Product_discount_real,previous_price,current_price;
      ImageView product_discount_image;

        public ViewHolder_Discount(@NonNull View itemView) {
            super(itemView);
            Discount_product_name = itemView .findViewById(R.id.discount_product_name);
            Product_discount_real =itemView.findViewById(R.id.discount_real);
            previous_price = itemView.findViewById(R.id.discount_product_previous_price);
            current_price = itemView.findViewById(R.id.discount_product_current_price);
            product_discount_image = itemView.findViewById(R.id.discount_product_image);
        }
    }
}
