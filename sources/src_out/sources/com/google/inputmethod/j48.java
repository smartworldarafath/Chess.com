package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/j48;", "Lcom/google/android/oe2;", "", "Lcom/google/android/oe2$c;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Lcom/google/android/oe2;)V", "T", "key", "t", "", "c", "(Lcom/google/android/oe2$c;Ljava/lang/Object;)V", "a", "(Lcom/google/android/oe2$c;)Ljava/lang/Object;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j48 extends CreationExtras {
    /* JADX WARN: Illegal instructions before constructor call */
    public j48() {
        CreationExtras creationExtras = null;
        this(creationExtras, 1, creationExtras);
    }

    @Override // com.google.inputmethod.CreationExtras
    public <T> T a(CreationExtras.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(CreationExtras.c<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, t);
    }

    public j48(Map<CreationExtras.c<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "initialExtras");
        b().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j48(CreationExtras creationExtras) {
        this((Map<CreationExtras.c<?>, ? extends Object>) creationExtras.b());
        Intrinsics.checkNotNullParameter(creationExtras, "initialExtras");
    }

    public /* synthetic */ j48(CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreationExtras.b.c : creationExtras);
    }
}
