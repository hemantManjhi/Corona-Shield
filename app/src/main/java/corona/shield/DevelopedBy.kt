package corona.shield

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DevelopedBy : AppCompatActivity() {

    var linky1: ImageView? = null
    var linky2: ImageView? = null
    var linky3: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developed_by)

        linky1 = findViewById(R.id.linke)
        linky1?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.linkedin.com/in/hemant-manjhi/"))
            startActivity(intent)
        })
        linky2 = findViewById(R.id.youtube)
        linky2?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.youtube.com/c/HEMANTMANJHI/"))
            startActivity(intent)
        })
        linky3 = findViewById(R.id.insta)
        linky3?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.instagram.com/heyman_021/"))
            startActivity(intent)
        })

    }
}
