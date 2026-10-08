package com.google.inputmethod;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/hod;", "", "Lcom/google/android/q6c;", "resolveResult", "next", "<init>", "(Lcom/google/android/q6c;Lcom/google/android/hod;)V", "a", "Lcom/google/android/q6c;", "b", "Lcom/google/android/hod;", "c", "Ljava/lang/Object;", "getInitial", "()Ljava/lang/Object;", "initial", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "typeface", "", "()Z", "isStaleResolvedFont", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hod {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final q6c<Object> resolveResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final hod next;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object initial;

    public hod(q6c<? extends Object> q6cVar, hod hodVar) {
        this.resolveResult = q6cVar;
        this.next = hodVar;
        this.initial = q6cVar.getValue();
    }

    public final Typeface a() {
        Object obj = this.initial;
        Intrinsics.h(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.resolveResult.getValue() != this.initial) {
            return true;
        }
        hod hodVar = this.next;
        return hodVar != null && hodVar.b();
    }
}
