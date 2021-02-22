package com.mindorks.framework.mvvm.presentation.di.module

import android.content.Context
import com.mindorks.framework.mvvm.data.db.StudentDB
import com.mindorks.framework.mvvm.data.db.StudentDao
import com.mindorks.framework.mvvm.data.repository.RoomDBRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DBModule {

    @Provides
    fun provideStudentDao(@ApplicationContext appContext: Context): StudentDao {
        return StudentDB.getInstance(appContext).studentDao
    }

    @Provides
    fun provideStudentDBRepository(studentDao: StudentDao) = RoomDBRepository(studentDao)
}


//https://codelabs.developers.google.com/codelabs/android-hilt/#6
//https://github.com/google-developer-training/android-kotlin-fundamentals-apps/blob/master/RecyclerViewFundamentals/app/src/main/java/com/example/android/trackmysleepquality/sleeptracker/SleepTrackerFragment.kt