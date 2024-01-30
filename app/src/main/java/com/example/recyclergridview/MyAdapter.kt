package com.example.recyclergridview

import android.content.ClipData.Item
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// adapts the display and data. translates the data to conform to the recycler view widget
class MyAdapter (var context: Context, var arrayList: ArrayList<MyModel>):
                RecyclerView.Adapter<MyAdapter.ItemHolder>(){

    /*
    create ItemHolder class first before implementing so it adds ItemHolder to onCreateViewHolder
    and onBindViewHolder
    */
    class ItemHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var tile_text = itemView.findViewById<TextView>(R.id.txt_tile)
    }

    // tells program what you're going to view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemholder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_items, parent, false)
        // return variable you assigned to the LayoutInflater
        return ItemHolder(itemholder)

    }

    // binds things to positions
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var myCard: MyModel = arrayList.get(position)

        holder.icons.setImageResource(myCard.iconsCard!!)
        holder.tile_text.text = myCard.iconsText

        holder.tile_text.setOnClickListener{
            Toast.makeText(context, myCard.iconsText, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}