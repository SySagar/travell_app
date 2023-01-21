package com.example.travellapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(private val dataa: ArrayList<CardData>,private val context : Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


//	fun RecyclerViewAdapter(context: Context, data: ArrayList<CardData?>) {
//		val context = context
//		this.data = data
//	}




	private val kode = arrayOf("d116df5",
		"36ffc75", "f5cfe78", "5b87628",
		"db8d14e", "9913dc4", "e120f96",
		"466251b")



	override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
		val v = LayoutInflater.from(viewGroup.context)
			.inflate(R.layout.card, viewGroup, false)
		return ViewHolder(v)
	}

	override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
		val (imageId, txt) = dataa.get(position)
		viewHolder.itemImg.setImageResource(imageId)
		viewHolder.itemName.text = txt
		viewHolder.save.setOnClickListener{

		}

	}

	override fun getItemCount(): Int {
		return kode.size
	}

	inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

		var itemImg : ImageView
		var itemName: TextView
		var save: ImageView

		init {
			itemImg = itemView.findViewById(R.id.itemImg)
			itemName = itemView.findViewById(R.id.itemName)
			save = itemView.findViewById(R.id.saved)

//			itemView.setOnClickListener {
//				var position: Int = getAdapterPosition()
//				val context = itemView.context
////				val intent = Intent(context, DetailPertanyaan::class.java).apply {
////					putExtra("NUMBER", position)
////					putExtra("CODE", itemKode.text)
////					putExtra("CATEGORY", itemKategori.text)
////					putExtra("CONTENT", itemIsi.text)
////				}
////				context.startActivity(intent)
//			}

		}
	}
}