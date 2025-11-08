package com.example.rickandmortyapp.presintation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.databinding.ActivityMainBinding

class CharactersAdapter(val list: ArrayList<CharactersItem>): RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharactersAdapter.CharactersViewHolder {
return CharactersViewHolder(CharactersitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(
        holder: CharactersAdapter.CharactersViewHolder,
        position: Int
    ) {
        holder.OnBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class CharactersViewHolder(private val binding: CharactersItem): RecyclerView.ViewHolder(binding.root){

        fun OnBind(){

        }

    }

}