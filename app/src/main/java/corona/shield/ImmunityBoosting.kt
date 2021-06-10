package corona.shield

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import corona.shield.immunity.*

class ImmunityBoosting : AppCompatActivity() {

    var Gmb: Button? = null
    var AyurvediButton: Button? = null
    var SimpleAyurvedicButton: Button? = null
    var CoughButton: Button? = null
    var OtherMeasuresButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_immunity_boosting)

        Gmb = findViewById(R.id.generalMeasures)
        AyurvediButton = findViewById(R.id.ayurvedicImmunity)
        SimpleAyurvedicButton = findViewById(R.id.simpleAyurvedic)
        CoughButton = findViewById(R.id.durinDrycough)
        OtherMeasuresButton = findViewById(R.id.otherMeasures)


        Gmb?.setOnClickListener({
        var clickIntent = Intent(this@ImmunityBoosting, ImmunityGeneralMeasures::class.java)
        startActivity(clickIntent)
        })
        AyurvediButton?.setOnClickListener({
        var clickIntent = Intent(this@ImmunityBoosting, ImmunityAyurvedicImmunity::class.java)
        startActivity(clickIntent)
        })
        SimpleAyurvedicButton?.setOnClickListener({
        var clickIntent = Intent(this@ImmunityBoosting, ImmunitySimpleAyurvedic::class.java)
        startActivity(clickIntent)
        })
        CoughButton?.setOnClickListener({
        var clickIntent = Intent(this@ImmunityBoosting, ImmunityDuringDryCough::class.java)
        startActivity(clickIntent)
        })
        OtherMeasuresButton?.setOnClickListener({
        var clickIntent = Intent(this@ImmunityBoosting, ImmunityOtherMeasures::class.java)
        startActivity(clickIntent)
        })
    }
}
