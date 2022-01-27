package com.project.android.viewpager

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.project.android.R

class ViewPagerAdapter(private var title: List<String>,private var details:List<String>,private var images:List<Int>)
    : RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

   class Pager2ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
       val imageView:ImageView=itemView.findViewById(R.id.image)

       init {
           imageView.setOnClickListener {
               val position:Int=adapterPosition
               Toast.makeText(itemView.context,"Your Clicked item is${position+1}",Toast.LENGTH_SHORT).show()

           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pager2ViewHolder {
            return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false))
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])



    }

    override fun getItemCount(): Int {
       return images.size
    }
}