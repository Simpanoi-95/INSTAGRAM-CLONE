package com.example.instaclone.Fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.MainActivity
import com.example.instaclone.R
import com.example.instaclone.StoriesAdapter
import com.example.instaclone.Story
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbar)
        //(activity as MainActivity?)!!.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showStories()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_home,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
             fun showStories(){
             val storiesList=ArrayList<Story>()
             storiesList.add(Story(imageUrl = " https://via.placeholder.com/150/92c952",username = "Ada"))
             storiesList.add(Story(imageUrl = " https://via.placeholder.com/150/771796",username = "Lesarge"))
             storiesList.add(Story(imageUrl = " https://via.placeholder.com/150/24f355",username = "Sheillah"))
             storiesList.add(Story(imageUrl = "https://via.placeholder.com/150/d32776",username = "Simpanoi"))
             storiesList.add(Story(imageUrl = "https://via.placeholder.com/150/f66b97",username = "Governor"))
              val storiesAdapter=StoriesAdapter(storiesList)
             rvstories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
             rvstories.adapter=storiesAdapter
     }
    }


    }
