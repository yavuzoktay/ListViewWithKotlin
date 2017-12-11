package com.yavuzoktay.listviewwithkotlin

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by Yavuz on 12.12.2017.
 */
class UserListAdapter(private var activity: Activity,private var items:ArrayList<User>): BaseAdapter() {
    private class ViewHolder(row:View?){
        var txtName:TextView?=null
        var txtComment:TextView?=null

        init {
            this.txtName=row?.findViewById(R.id.txtName)
            this.txtComment=row?.findViewById(R.id.txtComment)
        }
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:  View?
        val viewHolder: ViewHolder
        if (convertView==null)
        {
            val inflater=activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=inflater.inflate(R.layout.user_list,null)
            viewHolder=ViewHolder(view)
            view?.tag=viewHolder
        }
        else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }

        var user=items[position]
        viewHolder.txtName?.text=user.name
        viewHolder.txtComment?.text=user.comment

        return view as View

    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

}