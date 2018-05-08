package experimenttemplate.example.com.experiment

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class LifecycleAwareFragment: Fragment() {
    override fun onAttach(context: Context?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onInflate(context: Context?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onInflate")
        super.onInflate(context, attrs, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onDetach")
        super.onDetach()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.i(resources.getString(R.string.app_name), this.javaClass.name + " onActivityResult")
        super.onActivityResult(requestCode, resultCode, data)
    }

}