package com.tms.app.homework11

import com.tms.app.homework11.database.DataDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DataRepository(
    private val dataDao: DataDao
) {

    fun getData(): Flow<List<Data>> = dataDao.getInfo().map { dataEntity ->
        dataEntity.map { dataEntity -> Data(dataEntity.message, dataEntity.date) }
    }


}


