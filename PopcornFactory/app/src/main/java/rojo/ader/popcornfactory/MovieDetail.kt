package rojo.ader.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val imageView : ImageView = findViewById(R.id.movie_image_detail)
        val titulo : TextView = findViewById(R.id.movie_title_detail)
        val detail: TextView = findViewById(R.id.movie_text_detail)

        titulo.setText(intent.getStringExtra("titulo"))
        imageView.setImageResource(intent.getIntExtra("header",0))
        detail.setText(intent.getStringExtra("sinopsis"))
    }
}