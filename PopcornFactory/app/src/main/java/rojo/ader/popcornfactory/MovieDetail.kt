package rojo.ader.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val imageView: ImageView = findViewById(R.id.movie_image_detail)
        val titulo: TextView = findViewById(R.id.movie_title_detail)
        val detail: TextView = findViewById(R.id.movie_text_detail)
        val seatsLeft: TextView = findViewById(R.id.seats_left)
        val buyTickets: Button = findViewById(R.id.but_tickets)

        var id = -1

        titulo.setText(intent.getStringExtra("titulo"))
        imageView.setImageResource(intent.getIntExtra("header", 0))
        detail.setText(intent.getStringExtra("sinopsis"))
        seatsLeft.setText("${intent.getIntExtra("numberSeats")} seats available")
        id = intent.getIntExtra("pos")

        if (intent.getIntExtra("numberSeats") == 0) {
            buyTickets.isActivated = false;
        } else {
            buyTickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelectionActivity::class.java)

                intent.putExtra("movie",id)
                intent.putExtra("name",intent.getStringExtra("titulo"))

            }
        }

    }
}