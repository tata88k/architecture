package com.pacific.data.db

import androidx.room.Dao
import androidx.room.Query
import com.pacific.data.db.entities.DbUser

@Dao
interface UserDao : AppDao<DbUser> {

    @Query("SELECT * FROM user WHERE _id =:id")
    fun get(id: Int): DbUser?
}