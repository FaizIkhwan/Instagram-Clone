package com.faizikhwan.instagramclone.di.component

import com.faizikhwan.instagramclone.di.module.NetworkModule
import com.faizikhwan.instagramclone.ui.activity.ActivityViewModel
import com.faizikhwan.instagramclone.ui.camera.CameraViewModel
import com.faizikhwan.instagramclone.ui.discover.DiscoverViewModel
import com.faizikhwan.instagramclone.ui.home.HomeViewModel
import com.faizikhwan.instagramclone.ui.profile.ProfileViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {
    fun inject(activityViewModel: ActivityViewModel)
    fun inject(cameraViewModel: CameraViewModel)
    fun inject(discoverViewModel: DiscoverViewModel)
    fun inject(homeViewModel: HomeViewModel)
    fun inject(profileViewModel: ProfileViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}