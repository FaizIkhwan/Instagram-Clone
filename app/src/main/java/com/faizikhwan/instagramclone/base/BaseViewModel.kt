package com.faizikhwan.instagramclone.base

import androidx.lifecycle.ViewModel
import com.faizikhwan.instagramclone.di.component.DaggerViewModelInjector
import com.faizikhwan.instagramclone.di.component.ViewModelInjector
import com.faizikhwan.instagramclone.di.module.NetworkModule
import com.faizikhwan.instagramclone.ui.activity.ActivityViewModel
import com.faizikhwan.instagramclone.ui.camera.CameraViewModel
import com.faizikhwan.instagramclone.ui.discover.DiscoverViewModel
import com.faizikhwan.instagramclone.ui.home.HomeViewModel
import com.faizikhwan.instagramclone.ui.profile.ProfileViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is ActivityViewModel -> injector.inject(this)
            is CameraViewModel -> injector.inject(this)
            is DiscoverViewModel -> injector.inject(this)
            is HomeViewModel -> injector.inject(this)
            is ProfileViewModel -> injector.inject(this)
        }
    }
}
