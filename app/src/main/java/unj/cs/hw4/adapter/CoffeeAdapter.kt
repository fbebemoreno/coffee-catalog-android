package unj.cs.hw4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.R
import unj.cs.hw4.data.Coffee

class CoffeeAdapter(private val coffeeList: ArrayList<Coffee>): RecyclerView.Adapter<CoffeeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = coffeeList[position]
        holder.coffeeImage.setImageResource(item.imageResourceId)
        holder.coffeeTitle.text = item.title
        holder.coffeeDesc.text = item.description
    }

    override fun getItemCount(): Int = coffeeList.size

    class MyViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val coffeeImage: ImageView = ItemView.findViewById(R.id.iv_coffee_image)
        val coffeeTitle: TextView = ItemView.findViewById(R.id.tv_coffee_title)
        val coffeeDesc: TextView = ItemView.findViewById(R.id.tv_coffee_desc)
    }

}