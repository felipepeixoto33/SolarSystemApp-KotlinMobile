package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Planet

class UserAdapter(val users: List<Planet>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    //This class will 'adapt' the output to match what the 'user_item_list' layout.

    private var listener: OnUserItemClickListener? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        //This method will create the containers that will be showing on the screen.

        //'parent' what does it represent?

        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item_list, parent, false)
        /*
        Gets our layout and transforms it into code with 'LayoutInflater', then the
        'inflate' method will generate the object that we can render in the screen.
         */
        return UserViewHolder(view, listener)
        //Now, we call this method to bind the components to their respective values.

    }

    override fun getItemCount(): Int {
        //The adapter needs to know how many itens it will need to work with.
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        //This method will be actualizing the content of the cards while the user moves the screen.
        holder.iName.text = users[position].name
        holder.iDescription.text = users[position].description

        when(holder.iName.text.toString().toLowerCase()) {

            "mercury" -> holder.iImage.setImageResource(R.drawable.mercury)
            "venus" -> holder.iImage.setImageResource(R.drawable.venus)
            "earth" -> holder.iImage.setImageResource(R.drawable.earth)
            "mars" -> holder.iImage.setImageResource(R.drawable.mars)
            "jupiter" -> holder.iImage.setImageResource(R.drawable.jupiter)
            "saturn" -> holder.iImage.setImageResource(R.drawable.saturn)
            "uranus" -> holder.iImage.setImageResource(R.drawable.uranus)
            "neptune" -> holder.iImage.setImageResource(R.drawable.neptune)
            "pluto" -> holder.iImage.setImageResource(R.drawable.pluto)
            "ceres" -> holder.iImage.setImageResource(R.drawable.ceres)
            "makemake" -> holder.iImage.setImageResource(R.drawable.makemake)
            "haumea" -> holder.iImage.setImageResource(R.drawable.haumea)
            "eris" -> holder.iImage.setImageResource(R.drawable.eris)

        }
    }

    fun setOnUserItemListener(listener: OnUserItemClickListener) {
        this.listener = listener
    }

    class UserViewHolder(val view: View, listener: OnUserItemClickListener?) : RecyclerView.ViewHolder(view) {
        // This class represents each one of the cards that we have at our layout.
        val iName: TextView = view.findViewById(R.id.user_item_textview_name)  //This will receive the textview that represents the names.
        val iDescription: TextView = view.findViewById(R.id.user_item_textview_description) //... description.
        val iImage: ImageView = view.findViewById(R.id.user_item_imageview_planet)

        init {
                view.setOnClickListener {
                    listener?.onClick(it, adapterPosition)
            } //Everytime the user click on a list, this is executed. It executes the 'onClick' function of our interface.
        }
    }
}