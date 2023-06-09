package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.campusconnect_aiactr.*
import com.example.campusconnect_aiactr.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bnView=findViewById<BottomNavigationView>(R.id.bnView)
        loadFragment(HomeFragment(),true)




        bnView.setOnNavigationItemSelectedListener {

            when (it.itemId){
                R.id.home -> {
                    loadFragment(HomeFragment(),false)
                    true

                }
                R.id.faculty -> {
                loadFragment(FacultyFragment(),false)
                true
            }
                R.id.notice -> {
                    loadFragment(NoticeFragment(),false)
                    true
                }

                R.id.student -> {
                    loadFragment(StudentFragment(),false)
                    true
                }
                R.id.other -> {
                    loadFragment(OthersFragment(),false)
                    true
                }
                else -> false
            }


        }

    }
    private  fun loadFragment(fragment: Fragment,flag:Boolean){
        val transaction = supportFragmentManager.beginTransaction()
        /*transaction.replace(R.id.container,fragment)*/
        if (flag){
            transaction.add(R.id.container,fragment)
        }
        else  {
            transaction.replace(R.id.container,fragment)
        }
        transaction.commit()
    }
}















