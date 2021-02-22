package com.mindorks.framework.mvvm.data.repository

import com.mindorks.framework.mvvm.data.db.entity.Student
import com.mindorks.framework.mvvm.data.db.StudentDao
import javax.inject.Inject

class RoomDBRepository @Inject constructor(private val studentDao: StudentDao) {
    suspend fun insertStudentData(student: Student) = studentDao.insert(student)

    suspend fun fetchStudents() = studentDao.fetch()
}