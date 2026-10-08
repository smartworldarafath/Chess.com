package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/ujd;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ujd<T, V extends ur> implements tjd<T, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<T, V> convertToVector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<V, T> convertFromVector;

    /* JADX WARN: Multi-variable type inference failed */
    public ujd(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function2) {
        this.convertToVector = function1;
        this.convertFromVector = function2;
    }

    @Override // com.google.inputmethod.tjd
    public Function1<T, V> a() {
        return this.convertToVector;
    }

    @Override // com.google.inputmethod.tjd
    public Function1<V, T> b() {
        return this.convertFromVector;
    }
}
