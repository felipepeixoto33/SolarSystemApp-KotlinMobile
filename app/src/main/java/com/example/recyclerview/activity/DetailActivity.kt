package com.example.recyclerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerview.R
import com.example.recyclerview.repository.PlanetsRepository

class DetailActivity : AppCompatActivity() {

    private lateinit var dImage: ImageView
    private lateinit var dName: TextView
    private lateinit var dDescription: TextView
    private lateinit var dSize: TextView
    private lateinit var dOrbit: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        dImage = findViewById(R.id.detail_activity_imageview_planet_image)
        dName = findViewById(R.id.detail_activity_textview_planet_name)
        dDescription = findViewById(R.id.detail_activity_textview_planet_description)
        dSize = findViewById(R.id.detail_activity_textview_planet_size)
        dOrbit = findViewById(R.id.detail_activity_textview_planet_orbit)


        //Setting info.

        val pos = intent.getIntExtra("position", -1) //Retorna a posicao que o item clicado passou para o Intent.

        val planets = PlanetsRepository.getAllPlanets()

        when(planets[pos].name.toLowerCase()) {

            "mercury" -> dImage.setImageResource(R.drawable.mercury)
            "venus" -> dImage.setImageResource(R.drawable.venus)
            "earth" -> dImage.setImageResource(R.drawable.earth)
            "mars" -> dImage.setImageResource(R.drawable.mars)
            "jupiter" -> dImage.setImageResource(R.drawable.jupiter)
            "saturn" -> dImage.setImageResource(R.drawable.saturn)
            "uranus" -> dImage.setImageResource(R.drawable.uranus)
            "neptune" -> dImage.setImageResource(R.drawable.neptune)
            "pluto" -> dImage.setImageResource(R.drawable.pluto)
            "ceres" -> dImage.setImageResource(R.drawable.ceres)
            "makemake" -> dImage.setImageResource(R.drawable.makemake)
            "haumea" -> dImage.setImageResource(R.drawable.haumea)
            "eris" -> dImage.setImageResource(R.drawable.eris)

        }

        dName.setText(planets[pos].name)
        dDescription.setText("Description:\n ${planets[pos].description}")
        dSize.setText("Size:\n ${planets[pos].size}")
        dOrbit.setText("Orbit Distance:\n ${planets[pos].orbitDistance}")

    }



}