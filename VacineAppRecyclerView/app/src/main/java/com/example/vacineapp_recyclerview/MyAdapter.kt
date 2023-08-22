package com.example.vacineapp_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccineList:ArrayList<VaccineModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_view,parent,false);

        return MyViewHolder(v);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineName.setText(vaccineList[position].name)
        holder.vaccineimage.setImageResource(vaccineList[position].img)
    }

    override fun getItemCount(): Int {
       return vaccineList.size
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
         var vaccineimage:ImageView
         var vaccineName:TextView

        init {
            vaccineimage=itemView.findViewById(R.id.imageView)
            vaccineName=itemView.findViewById(R.id.text1)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,"You choose: ${vaccineList[adapterPosition].name}",Toast.LENGTH_SHORT).show()
            }
        }
    }
}