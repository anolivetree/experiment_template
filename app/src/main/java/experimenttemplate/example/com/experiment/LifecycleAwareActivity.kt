package experimenttemplate.example.com.experiment

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log

abstract class LifecycleAwareActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onCreate(persistable)")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onPostCreate")
        super.onPostCreate(savedInstanceState)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onPostCreate(persistable)")
        super.onPostCreate(savedInstanceState, persistentState)
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onAttachFragment")
        super.onAttachFragment(fragment)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onRestoreInstanceState(persistable)")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onRestart() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onResume")
        super.onResume()
    }

    override fun onResumeFragments() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onResumeFragments")
        super.onResumeFragments()
    }

    override fun onPostResume() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onPostResume")
        super.onPostResume()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onSaveInstanceState(persistable)")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onPause() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onDestroy")
        super.onDestroy()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onActivityResult")
        super.onActivityResult(requestCode, resultCode, data)
    }

}