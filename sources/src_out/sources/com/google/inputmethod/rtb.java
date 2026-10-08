package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0015"}, d2 = {"Lcom/google/android/rtb;", "T", "", "Landroidx/compose/runtime/d;", "composer", "b", "(Landroidx/compose/runtime/d;)Landroidx/compose/runtime/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/d;", "getComposer$annotations", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rtb<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final d composer;

    private /* synthetic */ rtb(d dVar) {
        this.composer = dVar;
    }

    public static final /* synthetic */ rtb a(d dVar) {
        return new rtb(dVar);
    }

    public static <T> d b(d dVar) {
        return dVar;
    }

    public static boolean c(d dVar, Object obj) {
        return (obj instanceof rtb) && Intrinsics.e(dVar, ((rtb) obj).getComposer());
    }

    public static int d(d dVar) {
        return dVar.hashCode();
    }

    public static String e(d dVar) {
        return "SkippableUpdater(composer=" + dVar + ')';
    }

    public boolean equals(Object other) {
        return c(this.composer, other);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ d getComposer() {
        return this.composer;
    }

    public int hashCode() {
        return d(this.composer);
    }

    public String toString() {
        return e(this.composer);
    }
}
