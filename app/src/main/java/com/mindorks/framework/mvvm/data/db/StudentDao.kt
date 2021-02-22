package com.mindorks.framework.mvvm.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mindorks.framework.mvvm.data.db.entity.Student

@Dao
interface StudentDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insert(student: Student) : Long

    @Query("select * From student ORDER BY studentId ASC")
    fun  fetch() : LiveData<MutableList<Student>>

}