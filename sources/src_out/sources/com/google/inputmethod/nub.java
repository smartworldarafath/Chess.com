package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/kub;", "Lcom/google/android/sea;", "rememberManager", "", "g", "(Lcom/google/android/kub;Lcom/google/android/sea;)V", "e", "", "child", "", "group", "", "Lcom/google/android/iq1;", "c", "(Lcom/google/android/kub;Ljava/lang/Object;I)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nub {
    public static final List<ComposeStackTraceFrame> c(kub kubVar, Object obj, int i) {
        return (kubVar.getIsClosed() || kubVar.p()) ? m.p() : gub.f(kubVar.getTable().getAddressSpace(), i, obj, new un3(kubVar));
    }

    public static /* synthetic */ List d(kub kubVar, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = kubVar.getCurrent();
        }
        return c(kubVar, obj, i);
    }

    public static final void e(final kub kubVar, final sea seaVar) {
        kubVar.O(kubVar.getCurrent(), new kub.a() { // from class: com.google.android.mub
            @Override // com.google.android.kub.a
            public final boolean a(int i, int i2, Object obj) {
                return nub.f(kubVar, seaVar, i, i2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(kub kubVar, sea seaVar, int i, int i2, Object obj) {
        if (obj instanceof aq1) {
            kubVar.f(i);
            if (i2 != 0) {
                return false;
            }
            seaVar.h((aq1) obj);
            return false;
        }
        if (obj instanceof ena) {
            return false;
        }
        if (obj instanceof zea) {
            seaVar.e((zea) obj);
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        ((b0) obj).A();
        return true;
    }

    public static final void g(kub kubVar, final sea seaVar) {
        kubVar.O(kubVar.getCurrent(), new kub.a() { // from class: com.google.android.lub
            @Override // com.google.android.kub.a
            public final boolean a(int i, int i2, Object obj) {
                return nub.h(seaVar, i, i2, obj);
            }
        });
        kub.D(kubVar, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(sea seaVar, int i, int i2, Object obj) {
        if (obj instanceof aq1) {
            seaVar.c((aq1) obj);
        }
        if (obj instanceof zea) {
            seaVar.e((zea) obj);
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        ((b0) obj).A();
        return false;
    }
}
