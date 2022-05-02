package com.example.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.list.databinding.ItemProfileBinding

class ProfileAdapter(private val profiles : List<Profile>) :
        RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(
            ItemProfileBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false,
            )
        )
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bind(profiles[position])
        holder.binding.switch1.setOnCheckedChangeListener { compoundButton, isChecked ->
            profiles[position].switch = !isChecked
        }
    }

    override fun getItemCount(): Int {
        return profiles.size
    }

    class ProfileViewHolder(val binding: ItemProfileBinding) :
            RecyclerView.ViewHolder(binding.root){

                fun bind(profile : Profile) {
                    binding.tvName.text = profile.name
                    binding.switch1.isChecked = profile.switch
                }
            }


}