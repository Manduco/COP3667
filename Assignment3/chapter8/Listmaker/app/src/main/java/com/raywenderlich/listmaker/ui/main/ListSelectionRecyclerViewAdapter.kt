package com.raywenderlich.listmaker.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.listmaker.TaskList
import com.raywenderlich.listmaker.databinding.ListSelectionViewHolderBinding


class ListSelectionRecyclerViewAdapter(private val lists : MutableList<TaskList>) :
    RecyclerView.Adapter<ListSelectionViewHolder>() {

    //val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): ListSelectionViewHolder {
        //1
        val binding = ListSelectionViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        //2
        return ListSelectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return lists.size
    }
    override fun onBindViewHolder(holder: ListSelectionViewHolder,
                                  position: Int) {
        holder.binding.itemNumber.text = (position + 1).toString()
        holder.binding.itemString.text = lists[position].name
    }
    fun listsUpdated() {
        notifyItemInserted(lists.size-1)
    }

}