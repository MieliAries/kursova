package com.example.kursova

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import com.example.kursova.fragments.adapters.ViewPagerAdapter
import com.example.kursova.fragments.AllianceFragment
import com.example.kursova.fragments.HordeFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()

    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HordeFragment(), "Horde")
        adapter.addFragment(AllianceFragment(), "Alliance")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}