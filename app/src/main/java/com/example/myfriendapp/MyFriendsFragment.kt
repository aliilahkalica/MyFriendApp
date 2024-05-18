package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFriendsFragment : Fragment() {
    companion object{
        fun newInstance() : MyFriendsFragment{
            return MyFriendsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.my_friends_fragment, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    override fun onDestroy() {
        super.onDestroy()
        clearFindViewByIdCache()
    }
    private fun initView(){
    }

    private fun clearFindViewByIdCache() {
        TODO("Not yet implemented")
    }
}