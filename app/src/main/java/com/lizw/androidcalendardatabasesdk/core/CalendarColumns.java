package com.lizw.androidcalendardatabasesdk.core;

import android.provider.CalendarContract;

import androidx.annotation.IntDef;
import androidx.annotation.StringDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author: zongwei.li created on: 2023/1/15
 */
@Retention(RetentionPolicy.SOURCE)
@StringDef({
        CalendarContract.Calendars._ID,
        CalendarColumns.x
})
public @interface CalendarColumns {
    String x = "xxxxxxxx";
}
