package corona.shield

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForMore : AppCompatActivity() {

    var linkwho : Button? = null
    var linkayush : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_more)

        linkwho = findViewById(R.id.who)
        linkwho?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public"))
            startActivity(intent)
        })

        linkayush = findViewById(R.id.ayush)
        linkayush?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://yoga.ayush.gov.in/yoga/"))
            startActivity(intent)
        })

    }
}
