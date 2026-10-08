package com.google.inputmethod;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class eob {
    private static volatile bob<?> a;
    private static volatile List<unb> b;

    private static class a {
        static String a(List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    private eob() {
    }

    static boolean a(Context context, znb znbVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = znbVar.i;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamL = iconCompat.l(context);
        if (inputStreamL == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamL)) == null) {
            return false;
        }
        znbVar.i = i == 6 ? IconCompat.c(bitmapDecodeStream) : IconCompat.d(bitmapDecodeStream);
        return true;
    }

    public static List<znb> b(Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new znb.b(context, it.next()).a());
        }
        return arrayList;
    }

    public static int c(Context context) {
        di9.g(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    private static String d(List<znb> list) {
        int iH = -1;
        String strC = null;
        for (znb znbVar : list) {
            if (znbVar.h() > iH) {
                strC = znbVar.c();
                iH = znbVar.h();
            }
        }
        return strC;
    }

    private static List<unb> e(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((unb) Class.forName(string, false, eob.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    private static bob<?> f(Context context) {
        if (a == null) {
            try {
                a = (bob) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, eob.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new bob.a();
            }
        }
        return a;
    }

    public static List<znb> g(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return znb.b(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return znb.b(context, arrayList);
    }

    public static boolean h(Context context, znb znbVar) {
        di9.g(context);
        di9.g(znbVar);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && znbVar.j(1)) {
            Iterator<unb> it = e(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(znbVar));
            }
            return true;
        }
        int iC = c(context);
        if (iC == 0) {
            return false;
        }
        if (i <= 29) {
            a(context, znbVar);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(znbVar.k());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iC) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(znbVar.k()));
        }
        bob<?> bobVarF = f(context);
        try {
            List<znb> listB = bobVarF.b();
            if (listB.size() >= iC) {
                bobVarF.d(Arrays.asList(d(listB)));
            }
            bobVarF.a(Arrays.asList(znbVar));
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Iterator<unb> it2 = e(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(znbVar));
            }
            l(context, znbVar.c());
        }
    }

    public static void i(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        f(context).c();
        Iterator<unb> it = e(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void j(Context context, List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        f(context).d(list);
        Iterator<unb> it = e(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    private static List<znb> k(List<znb> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (znb znbVar : list) {
            if (znbVar.j(i)) {
                arrayList.remove(znbVar);
            }
        }
        return arrayList;
    }

    public static void l(Context context, String str) {
        di9.g(context);
        di9.g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<unb> it = e(context).iterator();
        while (it.hasNext()) {
            it.next().d(Collections.singletonList(str));
        }
    }

    public static boolean m(Context context, List<znb> list) {
        di9.g(context);
        di9.g(list);
        List<znb> listK = k(list, 1);
        ArrayList arrayList = new ArrayList(listK.size());
        Iterator<znb> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        f(context).c();
        f(context).a(listK);
        for (unb unbVar : e(context)) {
            unbVar.a();
            unbVar.b(list);
        }
        return true;
    }
}
