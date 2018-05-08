package experimenttemplate.example.com.experiment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : LifecycleAwareActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startActivity2Button).setOnClickListener {
            startActivityForResult(Intent(this, Activity2::class.java), 0)
        }
        findViewById<Button>(R.id.startActivity3Button).setOnClickListener {
            startActivityForResult(Intent(this, Activity3::class.java), 0)
        }
        findViewById<Button>(R.id.replaceFragment1Button).setOnClickListener {
            val f = Fragment1()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, f).addToBackStack(null).commit()
        }
        findViewById<Button>(R.id.addFragment1Button).setOnClickListener {
            val f = Fragment1()
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, f).addToBackStack(null).commit()
        }
    }


}
