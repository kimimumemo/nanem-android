package com.example.nanem.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nanem.*
import com.example.nanem.data.ListDogAdapter
import com.example.nanem.data.Tanah
import com.example.nanem.data.dataTanah

class JenisTanahActivity : AppCompatActivity() {
    private lateinit var rvDog: RecyclerView
    var list : ArrayList<(Tanah)> = arrayListOf()
    private var title: String = "Jenis Tanah"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_tanah)
        setActionBarTitle(title)

        val actionbar = supportActionBar
        actionbar!!.title= "Jenis Tanah"

        rvDog = findViewById(R.id.rv_dog)
        rvDog.setHasFixedSize(true)

        list.addAll(dataTanah.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDog.layoutManager = LinearLayoutManager(this)
        val listDogAdapter = ListDogAdapter(list)
        rvDog.adapter = listDogAdapter

        listDogAdapter.setOnItemClickCallback(object :
            ListDogAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Tanah) {
                showSelectedDog(data)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun showSelectedDog(dog: Tanah) {
        Toast.makeText(this, "Kamu memilih " + dog.name, Toast.LENGTH_SHORT).show()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_JenisTanah -> {
                title = "Jenis Tanah"
                showRecyclerList()
            }

            R.id.action_about -> {
                val iAbout = Intent(this@JenisTanahActivity, AboutUs::class.java)
                startActivity(iAbout)
            }
        }
        setActionBarTitle(title)
    }

}