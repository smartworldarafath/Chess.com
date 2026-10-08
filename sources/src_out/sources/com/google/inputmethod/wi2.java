package com.google.inputmethod;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class wi2 {
    private final ui5 a;
    private final ComponentName b;
    private final Context c;

    class a extends yi2 {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // com.google.inputmethod.yi2
        public final void onCustomTabsServiceConnected(ComponentName componentName, wi2 wi2Var) {
            wi2Var.h(0L);
            this.b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends ti5.a {
        private Handler a = new Handler(Looper.getMainLooper());
        final /* synthetic */ vi2 b;

        class a implements Runnable {
            final /* synthetic */ Bundle a;

            a(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onUnminimized(this.a);
            }
        }

        /* JADX INFO: renamed from: com.google.android.wi2$b$b, reason: collision with other inner class name */
        class RunnableC0131b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Bundle b;

            RunnableC0131b(int i, Bundle bundle) {
                this.a = i;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onNavigationEvent(this.a, this.b);
            }
        }

        class c implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            c(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.extraCallback(this.a, this.b);
            }
        }

        class d implements Runnable {
            final /* synthetic */ Bundle a;

            d(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onMessageChannelReady(this.a);
            }
        }

        class e implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            e(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onPostMessage(this.a, this.b);
            }
        }

        class f implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Uri b;
            final /* synthetic */ boolean c;
            final /* synthetic */ Bundle d;

            f(int i, Uri uri, boolean z, Bundle bundle) {
                this.a = i;
                this.b = uri;
                this.c = z;
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onRelationshipValidationResult(this.a, this.b, this.c, this.d);
            }
        }

        class g implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ Bundle c;

            g(int i, int i2, Bundle bundle) {
                this.a = i;
                this.b = i2;
                this.c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onActivityResized(this.a, this.b, this.c);
            }
        }

        class h implements Runnable {
            final /* synthetic */ Bundle a;

            h(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onWarmupCompleted(this.a);
            }
        }

        class i implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;
            final /* synthetic */ int d;
            final /* synthetic */ int e;
            final /* synthetic */ Bundle f;

            i(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = i5;
                this.f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onActivityLayout(this.a, this.b, this.c, this.d, this.e, this.f);
            }
        }

        class j implements Runnable {
            final /* synthetic */ Bundle a;

            j(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.onMinimized(this.a);
            }
        }

        b(vi2 vi2Var) {
            this.b = vi2Var;
        }

        @Override // com.google.inputmethod.ti5
        public void D0(int i2, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new RunnableC0131b(i2, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void T1(Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new j(bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void W1(Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new a(bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void m2(String str, Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new e(str, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void o2(Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new d(bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void p2(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new f(i2, uri, z, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void r(int i2, int i3, int i4, int i5, int i6, Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new i(i2, i3, i4, i5, i6, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void v0(int i2, int i3, Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new g(i2, i3, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void x1(String str, Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new c(str, bundle));
        }

        @Override // com.google.inputmethod.ti5
        public void y1(Bundle bundle) throws RemoteException {
            if (this.b == null) {
                return;
            }
            this.a.post(new h(bundle));
        }

        @Override // com.google.inputmethod.ti5
        public Bundle z(String str, Bundle bundle) throws RemoteException {
            vi2 vi2Var = this.b;
            if (vi2Var == null) {
                return null;
            }
            return vi2Var.extraCallbackWithResult(str, bundle);
        }
    }

    wi2(ui5 ui5Var, ComponentName componentName, Context context) {
        this.a = ui5Var;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, yi2 yi2Var) {
        yi2Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, yi2Var, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private ti5.a c(vi2 vi2Var) {
        return new b(vi2Var);
    }

    public static String d(Context context, List<String> list) {
        return e(context, list, false);
    }

    public static String e(Context context, List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    private cj2 g(vi2 vi2Var, PendingIntent pendingIntent) {
        boolean zY0;
        ti5.a aVarC = c(vi2Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zY0 = this.a.v1(aVarC, bundle);
            } else {
                zY0 = this.a.Y0(aVarC);
            }
            if (zY0) {
                return new cj2(this.a, aVarC, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public cj2 f(vi2 vi2Var) {
        return g(vi2Var, null);
    }

    public boolean h(long j) {
        try {
            return this.a.r0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
