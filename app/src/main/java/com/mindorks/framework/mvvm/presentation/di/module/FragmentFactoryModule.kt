package com.mindorks.framework.mvvm.presentation.di.module

import androidx.fragment.app.Fragment
import com.mindorks.framework.mvvm.presentation.ui.main.view.ExampleApiShowFragment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FragmentFactoryModule {

    @Binds
    @IntoMap
    @FragmentKey(ExampleApiShowFragment::class)
    abstract fun bindExampleApiShowFragment(fragment: ExampleApiShowFragment): Fragment

//    @Binds
//    @IntoMap
//    @FragmentKey(SecondScreenFragment::class)
//    abstract fun bindSecondScreenFragment(fragment: SecondScreenFragment): Fragment
//
//    @Binds
//    @IntoMap
//    @FragmentKey(ThirdScreenFragment::class)
//    abstract fun bindThirdScreenFragment(fragment: ThirdScreenFragment): Fragment
}