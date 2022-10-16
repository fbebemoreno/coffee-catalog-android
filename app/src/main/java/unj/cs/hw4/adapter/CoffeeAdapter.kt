package unj.cs.hw4.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.DetailsActivity
import unj.cs.hw4.R
import unj.cs.hw4.data.Coffee

class CoffeeAdapter(private val coffeeList: ArrayList<Coffee>): RecyclerView.Adapter<CoffeeAdapter.MyViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = coffeeList[position]
        holder.coffeeImage.setImageResource(item.imageResourceId)
        holder.coffeeTitle.text = item.title
        holder.coffeeDesc.text = item.description

        holder.card.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)
                .putExtra("image", item.imageResourceId)
                .putExtra("title", item.title)
                .putExtra("description", item.description)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = coffeeList.size

    class MyViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val coffeeImage: ImageView = ItemView.findViewById(R.id.iv_coffee_image)
        val coffeeTitle: TextView = ItemView.findViewById(R.id.tv_coffee_title)
        val coffeeDesc: TextView = ItemView.findViewById(R.id.tv_coffee_desc)

        val card: CardView = ItemView.findViewById(R.id.list_item_card)
    }

}