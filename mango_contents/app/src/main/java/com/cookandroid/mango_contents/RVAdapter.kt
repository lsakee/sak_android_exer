package com.cookandroid.mango_contents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

//메인액티비티만들고 rva만들기
class RVAdapter(val context: Context, val List:MutableList<ContentsModel>) :RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recy_item,parent,false)
        return ViewHolder(v)
    }

    interface ItemClick{
        fun onClick(view:View,position: Int)
    }
    var  itemClick:ItemClick?=null


    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        if(itemClick!=null){
            holder?.itemView.setOnClickListener { v->
                itemClick!!.onClick(v,position)
            }
        }
        holder.bindItmes(List[position])
    }

    override fun getItemCount(): Int {
        return List.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItmes(item:ContentsModel){
            val rv_img=itemView.findViewById<ImageView>(R.id.rvImageArea)
            val rv_text=itemView.findViewById<TextView>(R.id.rvTextArea)


            //이미지 출력하기
            rv_text.text=item.titleText
            Glide.with(context)
                .load(item.ImageUrl)
                .into(rv_img)
        }
    }


}