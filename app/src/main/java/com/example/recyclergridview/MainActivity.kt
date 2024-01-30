package com.example.recyclergridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setups what things look like
        recyclerView = findViewById(R.id.recyclerView)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL,false)

        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        // get our data to show in the layout we just set up
        arrayList = setupData()

        // pass all the data into the adapter so we get something the layout can interpret
        thisAdapter = MyAdapter(applicationContext, arrayList)

        // tell recyclerView to use the adapter we just created
        recyclerView.adapter = thisAdapter


    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.alask_mal, "Alaskan Malamute"))
        items.add(MyModel(R.drawable.aus_shep, "Australian Shepherd"))
        items.add(MyModel(R.drawable.basset, "Basset Hound"))
        items.add(MyModel(R.drawable.beagle, "Beagle"))
        items.add(MyModel(R.drawable.basset, "Basset Hound"))
        items.add(MyModel(R.drawable.bichon, "Bichon"))
        items.add(MyModel(R.drawable.bulldog, "Bulldog"))
        items.add(MyModel(R.drawable.bulmas, "Bullmastiff"))
        items.add(MyModel(R.drawable.chihua, "Chihuahua"))
        items.add(MyModel(R.drawable.chow, "Chow Chow"))
        items.add(MyModel(R.drawable.cocker_span, "Cocker Spaniel"))
        items.add(MyModel(R.drawable.collie, "Border Collie"))
        items.add(MyModel(R.drawable.corgi, "Welsh Corgi"))
        items.add(MyModel(R.drawable.dachs, "Dachshund"))
        items.add(MyModel(R.drawable.dober, "Doberman"))
        items.add(MyModel(R.drawable.french_bull, "French Bulldog"))
        items.add(MyModel(R.drawable.germ_shep, "German Shepherd"))
        items.add(MyModel(R.drawable.gold_ret, "Golden Retriever"))
        items.add(MyModel(R.drawable.husky, "Siberian Husky"))
        items.add(MyModel(R.drawable.jack_rus, "Jack Russell Terrier"))
        items.add(MyModel(R.drawable.lab_ret, "Labrador Retriever"))
        items.add(MyModel(R.drawable.maltese, "Maltese"))
        items.add(MyModel(R.drawable.pit, "Pitbull"))
        items.add(MyModel(R.drawable.pom, "Pomeranian"))
        items.add(MyModel(R.drawable.rott, "Rottweiler"))
        items.add(MyModel(R.drawable.samoyed, "Samoyed"))
        items.add(MyModel(R.drawable.sheltie, "Sheltie"))
        items.add(MyModel(R.drawable.york_terrier, "Yorkshire Terrier"))

        return items
    }
}