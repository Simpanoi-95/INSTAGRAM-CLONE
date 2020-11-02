package com.example.instaclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()
    }


    fun setupViewPager(){
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter
        bottomNav.setOnNavigationItemSelectedListener { item->
            return@setOnNavigationItemSelectedListener when(item.itemId){
                R.id.home->{
                    viewPager.currentItem = 0
                    true
                }
                R.id.search->{
                    viewPager.currentItem = 1
                    true
                }
                R.id.add->{
                    viewPager.currentItem = 2
                    true
                }
                R.id.favorite->{
                    viewPager.currentItem = 3
                    true
                }
                R.id.person->{
                    viewPager.currentItem = 4
                    true
                }
                else->{
                    false
                }
            }
        }
    }
}