package io.bluetrace.xexcovid.streetpass.persistence

import android.content.Context
import io.bluetrace.xexcovid.streetpass.persistence.StreetPassRecord
import io.bluetrace.xexcovid.streetpass.persistence.StreetPassRecordDatabase

class StreetPassRecordStorage(val context: Context) {

    val recordDao = StreetPassRecordDatabase.getDatabase(context).recordDao()

    suspend fun saveRecord(record: StreetPassRecord) {
        recordDao.insert(record)
    }

    fun nukeDb() {
        recordDao.nukeDb()
    }

    fun getAllRecords(): List<StreetPassRecord> {
        return recordDao.getCurrentRecords()
    }

    suspend fun purgeOldRecords(before: Long) {
        recordDao.purgeOldRecords(before)
    }
}
