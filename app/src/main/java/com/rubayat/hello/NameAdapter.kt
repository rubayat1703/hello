package com.rubayat.hello

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rubayat.hello.databinding.ItemListBinding
import java.util.Locale


class NameAdapter(val names: List<Contact>): RecyclerView.Adapter<itemViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): itemViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return itemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {

        holder.binding.apply {
            names[position].apply {
                nameTv.text = name
                nmbrTv.text = mobile

                if(!image.isNullOrEmpty()){
                    imageTv.load(image)
                }else{
                    imageTv.gone()
                    initialtext.visible()
                    initialtext.text = name.first().uppercaseChar().toString()
                }
                callBtn.setOnClickListener {
                    val intent = Intent(Intent.ACTION_DIAL)
                    intent.data = Uri.parse("tel: ${mobile}")
                    it.context.startActivity(intent)

                }
            }
        }
    }
    override fun getItemCount(): Int {
        return names.size
    }
}