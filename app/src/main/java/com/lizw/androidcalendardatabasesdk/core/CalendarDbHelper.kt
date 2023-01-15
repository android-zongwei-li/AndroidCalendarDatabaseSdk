package com.lizw.androidcalendardatabasesdk.core

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.pm.PackageManager
import android.database.DatabaseUtils
import android.provider.BaseColumns
import android.provider.CalendarContract.*
import androidx.annotation.StringDef
import androidx.appcompat.app.ActionBar
import androidx.core.content.ContextCompat

/**
 *
 * author: zongwei.li created on: 2023/1/15
 */
class CalendarDbHelper {

    fun queryCalendar(context: Context, @CalendarColumns x: String) {
        val cursor = context.contentResolver.query(Calendars.CONTENT_URI,
            null,
            null,
            null,
            null)
        if (cursor == null) {
            return
        }


        cursor.close()
    }
}

fun Activity.noPermission(@Permissions permission: String): Boolean {
    return ContextCompat.checkSelfPermission(this,
        Manifest.permission.READ_CALENDAR) != PackageManager.PERMISSION_GRANTED
}