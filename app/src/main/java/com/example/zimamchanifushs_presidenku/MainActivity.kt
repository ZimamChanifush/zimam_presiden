package com.example.zimamchanifushs_presidenku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // variabel recycler
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.ListData)
        var data = ArrayList<Datagambar>()
        data.add(Datagambar(R.drawable.soekarno, "Ir Soekarno","(1945-1967)"))
        data.add(Datagambar(R.drawable.soeharto, "Ir Soeharto","(1967-1998)"))
        data.add(Datagambar(R.drawable.bjhabibie, "Ir Bj Habibie","(1998-1999)"))
        data.add(Datagambar(R.drawable.gusdur, "Ir Abdurrahman Wahid","(1999-2001)"))
        data.add(Datagambar(R.drawable.megawati, "Megawati Soekarno Putri","(2001-2004)"))
        data.add(Datagambar(R.drawable.sby, "Ir Susilo Bambang Yudhoyono","(2004-2009; 2009-2014)"))
        data.add(Datagambar(R.drawable.jokowi, "Ir Joko Widodo","(2014-2019;2019-2024"))

        // menambahkan data kedalam adapter
        recyclerAdapter = Adapter(data)
        // menambahkan layout manager
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // memanggil adapter
        recyclerView.adapter = recyclerAdapter
        // menampilkan data ke layout
        recyclerView.layoutManager = layoutManager
    }

}