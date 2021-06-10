package corona.shield

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class YogaAndExercises : AppCompatActivity() {

    var linky1: ImageView? = null
    var linky2: ImageView? = null
    var linky3: ImageView? = null
    var linky4: ImageView? = null
    var linky5: ImageView? = null
    var linky6: ImageView? = null
    var linky7: ImageView? = null
    var linky8: ImageView? = null
    var linky9: ImageView? = null
    var linky10: ImageView? = null
    var linky11: ImageView? = null
    var linky12: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga_and_exercises)

        linky1 = findViewById(R.id.yoga1)
        linky1?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/z5geOHSmO5c"))
            startActivity(intent)
        })

        linky2 = findViewById(R.id.yoga2)
        linky2?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/YViDOR6F2YI"))
            startActivity(intent)
        })

        linky3 = findViewById(R.id.yoga3)
        linky3?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/RF9Pqki-OWs"))
            startActivity(intent)
        })

        linky4 = findViewById(R.id.yoga4)
        linky4?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/13s3AtwJnfI"))
            startActivity(intent)
        })

        linky5 = findViewById(R.id.yoga5)
        linky5?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/AQ82gywz84U"))
            startActivity(intent)
        })
        linky6 = findViewById(R.id.yoga6)
        linky6?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/QXmAye4dQ4M"))
            startActivity(intent)
        })
        linky7 = findViewById(R.id.yoga7)
        linky7?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/51Jw3_NlrDk"))
            startActivity(intent)
        })
        linky8 = findViewById(R.id.yoga8)
        linky8?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/ak9Uko57xWY"))
            startActivity(intent)
        })
        linky9 = findViewById(R.id.yoga9)
        linky9?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/UVy8MSbmN_0"))
            startActivity(intent)
        })
        linky10 = findViewById(R.id.yoga10)
        linky10?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/S6VOTHuZgZk"))
            startActivity(intent)
        })
        linky11 = findViewById(R.id.yoga11)
        linky11?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/VjOdd8608Jc"))
            startActivity(intent)
        })
        linky12 = findViewById(R.id.yoga12)
        linky12?.setOnClickListener({
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://youtu.be/gmA1dAJ68jg"))
            startActivity(intent)
        })
    }
}
