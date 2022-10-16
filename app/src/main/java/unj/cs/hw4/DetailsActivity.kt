package unj.cs.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    lateinit var coffeeImage: ImageView
    lateinit var coffeeTitle: TextView
    lateinit var coffeeDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        coffeeImage = findViewById(R.id.iv_details_image)
        coffeeTitle = findViewById(R.id.tv_details_title)
        coffeeDesc = findViewById(R.id.tv_details_desc)

        coffeeImage.setImageResource(intent.getIntExtra("image", 0))
        coffeeTitle.text = intent.getStringExtra("title")
        coffeeDesc.text = intent.getStringExtra("description")
    }

}