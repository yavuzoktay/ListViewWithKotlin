package com.yavuzoktay.listviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {

    var listView: ListView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.listView)

        var adapter=UserListAdapter(this,createData())
        listView?.adapter=adapter

        adapter.notifyDataSetChanged()
    }

    private fun createData(): ArrayList<User> {
        var result=ArrayList<User>()

        for (i in 0..9){
            var user= User("Yavuz","Welcome")
            result.add(user)

        }


        return result

    }
}
