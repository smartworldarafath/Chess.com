package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/google/android/i3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/j3e;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)J", "", "c", "()I", "durationMillis", "f", "delayMillis", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i3e<V extends ur> extends j3e<V> {
    @Override // com.google.inputmethod.f3e
    default long b(V initialValue, V targetValue, V initialVelocity) {
        return ((long) (f() + c())) * 1000000;
    }

    int c();

    int f();
}
