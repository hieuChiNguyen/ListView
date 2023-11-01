package com.example.listviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val items: ArrayList<Gmail> = arrayListOf()
    private val mAdapter: Adapter = Adapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setLogo(R.drawable.menu)

        repeat(10) {
            items.add(
                Gmail(
                    account = "hieuhockotlin.com.vn",
                    title = "Kotlin is so amazing!",
                    content = "Today we will learn about ListView",
                    time = "08:00 AM",
                    logoPath = "",
                    isMark = false
                )
            )
        }

        findViewById<ListView>(R.id.list_view).adapter = mAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }
}

