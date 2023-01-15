package com.lizw.androidcalendardatabasesdk.core;

import android.Manifest;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * author: zongwei.li created on: 2023/1/16
 */
@RequiresApi(api = Build.VERSION_CODES.P)
@Retention(RetentionPolicy.SOURCE)
@StringDef({
        Manifest.permission.ACCEPT_HANDOVER,
        Manifest.permission.READ_CALENDAR,
        Manifest.permission.WRITE_CALENDAR,
})
public @interface Permissions {
    String ACCEPT_HANDOVER = Manifest.permission.ACCEPT_HANDOVER;
}
