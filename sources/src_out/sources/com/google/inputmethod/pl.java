package com.google.inputmethod;

import android.os.LocaleList;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/pl;", "Lcom/google/android/eb9;", "<init>", "()V", "Landroid/os/LocaleList;", "a", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Lcom/google/android/g77;", "b", "Lcom/google/android/g77;", "lastLocaleList", "Lcom/google/android/gic;", "c", "Lcom/google/android/gic;", "lock", "()Lcom/google/android/g77;", "current", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pl implements eb9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LocaleList lastPlatformLocaleList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LocaleList lastLocaleList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final gic lock = new gic();

    @Override // com.google.inputmethod.eb9
    public LocaleList a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new e77(localeList.get(i)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }
}
