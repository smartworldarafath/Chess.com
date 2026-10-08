package com.google.inputmethod;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class s02 {

    static class a {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static class b {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, s02.k(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class c {
        static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    protected s02() {
    }

    public static int a(Context context, String str) {
        mm8.d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return zj8.d(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return a.a(context);
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(context);
        }
        return null;
    }

    public static int d(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList e(Context context, int i) {
        return mla.e(context.getResources(), i, context.getTheme());
    }

    public static Drawable f(Context context, int i) {
        return context.getDrawable(i);
    }

    @Deprecated
    public static File[] g(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] h(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File i(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static <T> T j(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    static String k(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (t59.b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (t59.b(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return m(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 == 0 || (i3 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? d.a(context, broadcastReceiver, intentFilter, str, handler, i3) : b.a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean n(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void o(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void p(Context context, Intent intent) {
        b.b(context, intent);
    }
}
