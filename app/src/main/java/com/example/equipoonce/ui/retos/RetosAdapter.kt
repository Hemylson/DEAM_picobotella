package com.example.equipoonce.ui.retos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.equipoonce.data.local.RetoEntity
import com.example.equipoonce.databinding.ItemRetoBinding

class RetosAdapter(
    private val onEdit: (RetoEntity) -> Unit,
    private val onDelete: (RetoEntity) -> Unit
) : ListAdapter<RetoEntity, RetosAdapter.RetoViewHolder>(DiffCallback) {

    inner class RetoViewHolder(private val binding: ItemRetoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(reto: RetoEntity) {
            // TODO: enlazar campos del reto con las vistas de item_reto.xml
            binding.btnEditarReto.setOnClickListener { onEdit(reto) }
            binding.btnEliminarReto.setOnClickListener { onDelete(reto) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetoViewHolder {
        val binding = ItemRetoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RetoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RetoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object DiffCallback : DiffUtil.ItemCallback<RetoEntity>() {
        override fun areItemsTheSame(oldItem: RetoEntity, newItem: RetoEntity) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: RetoEntity, newItem: RetoEntity) =
            oldItem == newItem
    }
}
