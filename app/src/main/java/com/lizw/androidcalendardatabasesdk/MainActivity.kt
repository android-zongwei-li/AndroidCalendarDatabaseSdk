package com.lizw.androidcalendardatabasesdk

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.lizw.androidcalendardatabasesdk.core.Permissions
import com.lizw.androidcalendardatabasesdk.core.noPermission

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (noPermission(Permissions.ACCEPT_HANDOVER)
            || ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_CALENDAR) != PackageManager.PERMISSION_GRANTED
        ) {
            registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { resultMap ->

//                CalendarDbHelper().queryCalendar(this, "")

            }.launch(arrayOf(Manifest.permission.READ_CALENDAR, Manifest.permission.WRITE_CALENDAR))
        }
    }
}