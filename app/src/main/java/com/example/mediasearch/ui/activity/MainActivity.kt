package com.example.mediasearch.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mediasearch.R
import com.example.mediasearch.app
import com.example.mediasearch.databinding.ActivityMainBinding
import com.example.mediasearch.di.AppModule
import com.example.mediasearch.di.DaggerAppComponent
import com.example.mediasearch.ui.adapter.TrackListAdapter
import org.json.JSONArray
import org.json.JSONException
import java.io.IOException
import java.nio.charset.Charset
import java.util.*
import kotlin.collections.ArrayList
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var sectionName = arrayOf<String>("Section1","Section2","Section3","Section4","Section5","Section6","Section7","Section8","Section9","Section10")
    var sectionPhoto1 = arrayOf<Int>(R.drawable.img1, R.drawable.img2,R.drawable.img3, R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10)
    var sectionPhoto2= arrayOf<Int>(R.drawable.img10,R.drawable.img9,R.drawable.img8,R.drawable.img7,R.drawable.img6,R.drawable.img5,R.drawable.img4,R.drawable.img3, R.drawable.img2,R.drawable.img1)
    var sectionPhoto3= arrayOf<Int>(R.drawable.img8,R.drawable.img9,R.drawable.img10,R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img7,R.drawable.img4,R.drawable.img5,R.drawable.img6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        app.appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(application))
            .build()

        app.appComponent.inject(this)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val linearLayoutManager = LinearLayoutManager(applicationContext)
        binding.recyclerView.layoutManager = linearLayoutManager
        setAdapter()
    }

    private fun setAdapter() {
        val customAdapter = TrackListAdapter(this@MainActivity,  sectionName, sectionPhoto1,sectionPhoto2,sectionPhoto3)
        binding.recyclerView.adapter = customAdapter
    }

}
