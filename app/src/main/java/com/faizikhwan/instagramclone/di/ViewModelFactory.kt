package com.faizikhwan.instagramclone.di

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.faizikhwan.instagramclone.ui.activity.ActivityViewModel
import com.faizikhwan.instagramclone.ui.camera.CameraViewModel
import com.faizikhwan.instagramclone.ui.discover.DiscoverViewModel
import com.faizikhwan.instagramclone.ui.home.HomeViewModel
import com.faizikhwan.instagramclone.ui.profile.ProfileViewModel

class ViewModelFactory(
    private val context: Context,
    fragment: Fragment? = null): ViewModelProvider.Factory{

    var application: Application = (context as Activity).application

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // Instantiate and assign relevant utility into the corresponding ViewModels
        when {
            modelClass.isAssignableFrom(ActivityViewModel::class.java) -> {
                return ActivityViewModel() as T
            }

            modelClass.isAssignableFrom(CameraViewModel::class.java) -> {
                return CameraViewModel() as T
            }

            modelClass.isAssignableFrom(DiscoverViewModel::class.java) -> {
                return DiscoverViewModel() as T
            }

            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                return HomeViewModel() as T
            }

            modelClass.isAssignableFrom(ProfileViewModel::class.java) -> {
                return ProfileViewModel() as T
            }
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}