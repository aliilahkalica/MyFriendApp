package com.example.myfriendapp

import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myfriendapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        tampilMyFriendsFragment()
    }

    private fun gantiFragment(
        fragmentManager: FragmentManager,
        fragment: Fragment, frameId: Int
    ){
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId,fragment)

        transaction.commit()
    }
    fun tampilMyFriendsFragment(){
        gantiFragment(supportFragmentManager, MyFriendsFragment.newInstance(), R.id.contentFrame)
    }
    fun tampilMyFriendsAddFragment(){
        gantiFragment(supportFragmentManager, MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }

}