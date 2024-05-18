package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFriendsAddFragment : Fragment() {
    companion object{
        fun newInstance() : MyFriendsAddFragment{
            return MyFriendsAddFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_friends_add_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        fabAddFriend.setOnClickListener{
            (activity as MainActivity).tampilMyFriendsAddFragment() }
        btnSave.setOnClickListener{
            (activity as MainActivity).tampilMyFriendsAddFragment()}
    }

    override fun onDestroy() {
        super.onDestroy()
        clearFindViewByIdCache()
    }

    private fun clearFindViewByIdCache() {
        TODO("Not yet implemented")
    }
}