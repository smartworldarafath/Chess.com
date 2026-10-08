package com.google.inputmethod;

import androidx.compose.p004runtime.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/ks9;", "T", "Lcom/google/android/zr1;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/os9;", "value", "Lcom/google/android/c1e;", "f", "(Lcom/google/android/os9;)Lcom/google/android/c1e;", "c", "(Ljava/lang/Object;)Lcom/google/android/os9;", "d", "e", "previous", "b", "(Lcom/google/android/os9;Lcom/google/android/c1e;)Lcom/google/android/c1e;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ks9<T> extends zr1<T> {
    public ks9(Function0<? extends T> function0) {
        super(function0, null);
    }

    private final c1e<T> f(os9<T> value) {
        if (!value.getIsDynamic()) {
            if (value.c() != null) {
                return new ComputedValueHolder(value.c());
            }
            return value.f() != null ? new DynamicValueHolder(value.f()) : new StaticValueHolder(value.d());
        }
        o58<T> o58VarF = value.f();
        if (o58VarF == null) {
            T tG = value.g();
            bxb<T> bxbVarE = value.e();
            if (bxbVarE == null) {
                bxbVarE = p0.t();
            }
            o58VarF = p0.i(tG, bxbVarE);
        }
        return new DynamicValueHolder(o58VarF);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.inputmethod.zr1
    public c1e<T> b(os9<T> value, c1e<T> previous) {
        ComputedValueHolder computedValueHolder;
        StaticValueHolder staticValueHolder;
        DynamicValueHolder dynamicValueHolder = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder = (DynamicValueHolder) previous;
                dynamicValueHolder.b().setValue(value.d());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.j()) {
                staticValueHolder = (StaticValueHolder) previous;
                if (Intrinsics.e(value.d(), staticValueHolder.b())) {
                    Object obj = computedValueHolder;
                    obj = staticValueHolder;
                    dynamicValueHolder = (c1e<T>) obj;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            computedValueHolder = (ComputedValueHolder) previous;
            if (value.c() == computedValueHolder.b()) {
                Object obj2 = computedValueHolder;
                obj2 = staticValueHolder;
                dynamicValueHolder = (c1e<T>) obj2;
            }
        }
        return dynamicValueHolder == null ? f(value) : dynamicValueHolder;
    }

    public abstract os9<T> c(T value);

    public final os9<T> d(T value) {
        return c(value);
    }

    public final os9<T> e(T value) {
        return c(value).h();
    }
}
