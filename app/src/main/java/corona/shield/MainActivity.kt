package corona.shield

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var CoronaPreventionButton: Button? = null
    var CoronaSymptomsButton: Button? = null
    var WhyAyurvedaButton: Button? = null
    var YogaandExercisesButton: Button? = null
    var ImmunityBoostingButton: Button? = null
    var GoodLifeStyleButton: Button? = null
    var CovidCareButton: Button? = null
    var ForMoreButton: Button? = null
    var DeveloperButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Corona Shield"

        CoronaPreventionButton = findViewById(R.id.coronaPrevention)
        CoronaSymptomsButton = findViewById(R.id.coronaSymptoms)
        WhyAyurvedaButton = findViewById(R.id.whyAyurveda)
        YogaandExercisesButton = findViewById(R.id.yogaAndExercise)
        ImmunityBoostingButton = findViewById(R.id.immunityBoosting)
        GoodLifeStyleButton = findViewById(R.id.goodLifeStyle)
        CovidCareButton = findViewById(R.id.covidCare)
        ForMoreButton = findViewById(R.id.forMore)
        DeveloperButton = findViewById(R.id.developer)

        CoronaPreventionButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, CoronaPrevention::class.java)
            startActivity(clickIntent)
        })
        CoronaSymptomsButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, CoronaSymptoms::class.java)
            startActivity(clickIntent)
        })
        WhyAyurvedaButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, WhyAyurveda::class.java)
            startActivity(clickIntent)
        })
        YogaandExercisesButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, YogaAndExercises::class.java)
            startActivity(clickIntent)
        })
        ImmunityBoostingButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ImmunityBoosting::class.java)
            startActivity(clickIntent)
        })
        GoodLifeStyleButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, GoodLifestyle::class.java)
            startActivity(clickIntent)
        })
        CovidCareButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, CovidCare::class.java)
            startActivity(clickIntent)
        })
        ForMoreButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ForMore::class.java)
            startActivity(clickIntent)
        })
        DeveloperButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, DevelopedBy::class.java)
            startActivity(clickIntent)
        })
    }
}


