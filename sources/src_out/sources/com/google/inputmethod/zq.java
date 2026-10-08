package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/google/android/zq;", "T", "Lcom/google/android/ur;", "V", "", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Lcom/google/android/ur;", "", "b", "(J)Z", "c", "()J", "durationNanos", "Lcom/google/android/tjd;", "d", "()Lcom/google/android/tjd;", "typeConverter", "f", "()Ljava/lang/Object;", "targetValue", "a", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface zq<T, V extends ur> {
    boolean a();

    default boolean b(long playTimeNanos) {
        return playTimeNanos >= c();
    }

    long c();

    tjd<T, V> d();

    T e(long playTimeNanos);

    T f();

    V g(long playTimeNanos);
}
