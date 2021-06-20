package rojo.ader.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.getmeIn_button)

        button.setOnClickListener {
            var intent:Intent = Intent(this,CatalogActivity::class.java)
            this.startActivity(intent)
        }
    }
}