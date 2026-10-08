package com.google.inputmethod;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.google.android.ubd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class yl4 {
    private static final dd7<c, ProviderInfo> a = new dd7<>(2);
    private static final Comparator<byte[]> b = new Comparator() { // from class: com.google.android.xl4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yl4.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {
        private final ContentProviderClient a;

        b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // com.google.android.yl4.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // com.google.android.yl4.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {
        String a;
        String b;
        List<List<byte[]>> c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.a, cVar.a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(zl4 zl4Var, Resources resources) {
        return zl4Var.b() != null ? zl4Var.b() : dm4.c(resources, zl4Var.c());
    }

    static nm4.a e(Context context, List<zl4> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        String strH;
        Typeface typefaceH;
        ubd.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                zl4 zl4Var = list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = znd.h((strH = zl4Var.h()))) == null || znd.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), zl4Var, context.getResources());
                    if (providerInfoF == null) {
                        return nm4.a.b(1, null);
                    }
                    arrayList.add(g(context, zl4Var, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new nm4.b[]{new nm4.b(strH, zl4Var.i())});
                }
            }
            return nm4.a.a(0, arrayList);
        } finally {
            ubd.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, zl4 zl4Var, Resources resources) throws PackageManager.NameNotFoundException {
        ubd.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(zl4Var, resources);
            c cVar = new c(zl4Var.e(), zl4Var.f(), listD);
            ProviderInfo providerInfoD = a.d(cVar);
            if (providerInfoD != null) {
                ubd.f();
                return providerInfoD;
            }
            String strE = zl4Var.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(zl4Var.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + zl4Var.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, b);
            for (int i = 0; i < listD.size(); i++) {
                ArrayList arrayList = new ArrayList(listD.get(i));
                Collections.sort(arrayList, b);
                if (c(listB, arrayList)) {
                    a.f(cVar, providerInfoResolveContentProvider);
                    ubd.f();
                    return providerInfoResolveContentProvider;
                }
            }
            ubd.f();
            return null;
        } catch (Throwable th) {
            ubd.f();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.google.android.yl4$a] */
    /* JADX WARN: Type inference failed for: r19v7 */
    static nm4.b[] g(Context context, zl4 zl4Var, String str, CancellationSignal cancellationSignal) {
        ?? r19;
        a aVar;
        ubd.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ubd.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{zl4Var.g()}, null, cancellationSignal);
                        ubd.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                arrayList2.add(new nm4.b(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3)), columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorB.getInt(columnIndex6) == 1, zl4Var.i(), i));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (nm4.b[]) arrayList.toArray(new nm4.b[0]);
                    } finally {
                        ubd.f();
                    }
                } catch (Throwable th) {
                    th = th;
                    r19 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r19.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r19 = aVarA;
            }
        } catch (Throwable th3) {
            ubd.f();
            throw th3;
        }
    }
}
