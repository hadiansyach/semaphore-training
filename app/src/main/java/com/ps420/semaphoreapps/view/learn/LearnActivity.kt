package com.ps420.semaphoreapps.view.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.model.LearnData

class LearnActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var adapter : LearnAdapter? = null
    private var listSemaphore = mutableListOf<LearnData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        listSemaphore = ArrayList()

        recyclerView = findViewById<RecyclerView>(R.id.rvLearn)
        adapter = LearnAdapter(this@LearnActivity, listSemaphore)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = adapter

        showListSemaphore()
    }

    private fun showListSemaphore() {
        var semaphore = LearnData("A", R.drawable.sign_a)
        listSemaphore.add(semaphore)
        semaphore = LearnData("B", R.drawable.sign_b)
        listSemaphore.add(semaphore)
        semaphore = LearnData("C", R.drawable.sign_c)
        listSemaphore.add(semaphore)
        semaphore = LearnData("D", R.drawable.sign_d)
        listSemaphore.add(semaphore)
        semaphore = LearnData("E", R.drawable.sign_e)
        listSemaphore.add(semaphore)
        semaphore = LearnData("F", R.drawable.sign_f)
        listSemaphore.add(semaphore)
        semaphore = LearnData("G", R.drawable.sign_f)
        listSemaphore.add(semaphore)
        semaphore = LearnData("H", R.drawable.sign_h)
        listSemaphore.add(semaphore)
        semaphore = LearnData("I", R.drawable.sign_i)
        listSemaphore.add(semaphore)
        semaphore = LearnData("J", R.drawable.sign_j)
        listSemaphore.add(semaphore)
        semaphore = LearnData("K", R.drawable.sign_k)
        listSemaphore.add(semaphore)
        semaphore = LearnData("L", R.drawable.sign_l)
        listSemaphore.add(semaphore)
        semaphore = LearnData("M", R.drawable.sign_m)
        listSemaphore.add(semaphore)
        semaphore = LearnData("N", R.drawable.sign_n)
        listSemaphore.add(semaphore)
        semaphore = LearnData("O", R.drawable.sign_o)
        listSemaphore.add(semaphore)
        semaphore = LearnData("P", R.drawable.sign_p)
        listSemaphore.add(semaphore)
        semaphore = LearnData("Q", R.drawable.sign_q)
        listSemaphore.add(semaphore)
        semaphore = LearnData("R", R.drawable.sign_r)
        listSemaphore.add(semaphore)
        semaphore = LearnData("S", R.drawable.sign_s)
        listSemaphore.add(semaphore)
        semaphore = LearnData("T", R.drawable.sign_t)
        listSemaphore.add(semaphore)
        semaphore = LearnData("U", R.drawable.sign_u)
        listSemaphore.add(semaphore)
        semaphore = LearnData("V", R.drawable.sign_v)
        listSemaphore.add(semaphore)
        semaphore = LearnData("W", R.drawable.sign_w)
        listSemaphore.add(semaphore)
        semaphore = LearnData("X", R.drawable.sign_x)
        listSemaphore.add(semaphore)
        semaphore = LearnData("Y", R.drawable.sign_y)
        listSemaphore.add(semaphore)
        semaphore = LearnData("Z", R.drawable.sign_z)
        listSemaphore.add(semaphore)
    }
}