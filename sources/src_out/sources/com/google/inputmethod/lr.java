package com.google.inputmethod;

import androidx.compose.p000animation.core.RepeatMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%\u001a%\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010(\u001a1\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"T", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "data", "b", "(Lcom/google/android/tjd;Ljava/lang/Object;)Lcom/google/android/ur;", "", "durationMillis", "delayMillis", "Lcom/google/android/vl3;", "easing", "Lcom/google/android/rjd;", "k", "(IILcom/google/android/vl3;)Lcom/google/android/rjd;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Lcom/google/android/w2c;", "i", "(FFLjava/lang/Object;)Lcom/google/android/w2c;", "Lkotlin/Function1;", "Lcom/google/android/zj6$b;", "", "init", "Lcom/google/android/zj6;", "f", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/zj6;", "Lcom/google/android/kk3;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Lcom/google/android/y5c;", "initialStartOffset", "Lcom/google/android/ov5;", "d", "(Lcom/google/android/kk3;Landroidx/compose/animation/core/RepeatMode;J)Lcom/google/android/ov5;", "Lcom/google/android/dwb;", "g", "(I)Lcom/google/android/dwb;", "Lcom/google/android/kr;", "animationSpec", "", "startDelayNanos", "c", "(Lcom/google/android/kr;J)Lcom/google/android/kr;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends ur> V b(tjd<T, V> tjdVar, T t) {
        if (t == null) {
            return null;
        }
        return (V) tjdVar.a().invoke(t);
    }

    public static final <T> kr<T> c(kr<T> krVar, long j) {
        return new w5c(krVar, j);
    }

    public static final <T> ov5<T> d(kk3<T> kk3Var, RepeatMode repeatMode, long j) {
        return new ov5<>(kk3Var, repeatMode, j, null);
    }

    public static /* synthetic */ ov5 e(kk3 kk3Var, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = y5c.c(0, 0, 2, null);
        }
        return d(kk3Var, repeatMode, j);
    }

    public static final <T> zj6<T> f(Function1<? super zj6.b<T>, Unit> function1) {
        zj6.b bVar = new zj6.b();
        function1.invoke(bVar);
        return new zj6<>(bVar);
    }

    public static final <T> dwb<T> g(int i) {
        return new dwb<>(i);
    }

    public static /* synthetic */ dwb h(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return g(i);
    }

    public static final <T> w2c<T> i(float f, float f2, T t) {
        return new w2c<>(f, f2, t);
    }

    public static /* synthetic */ w2c j(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return i(f, f2, obj);
    }

    public static final <T> rjd<T> k(int i, int i2, vl3 vl3Var) {
        return new rjd<>(i, i2, vl3Var);
    }

    public static /* synthetic */ rjd l(int i, int i2, vl3 vl3Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            vl3Var = em3.d();
        }
        return k(i, i2, vl3Var);
    }
}
