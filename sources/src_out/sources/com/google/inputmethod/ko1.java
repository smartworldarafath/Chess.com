package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p005internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"", "bits", "slot", "a", "(II)I", "g", "(I)I", "d", "Lcom/google/android/qaa;", "other", "", "f", "(Lcom/google/android/qaa;Lcom/google/android/qaa;)Z", "Landroidx/compose/runtime/d;", "composer", "key", "tracked", "", "block", "Lcom/google/android/do1;", "b", "(Landroidx/compose/runtime/d;IZLjava/lang/Object;)Lcom/google/android/do1;", "c", "(IZLjava/lang/Object;)Lcom/google/android/do1;", "e", "(IZLjava/lang/Object;Landroidx/compose/runtime/d;I)Lcom/google/android/do1;", "Ljava/lang/Object;", "lambdaKey", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ko1 {
    private static final Object a = new Object();

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final do1 b(d dVar, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        dVar.V(Integer.rotateLeft(i, 1), a);
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z, obj);
            dVar.L(composableLambdaImpl);
        } else {
            Intrinsics.h(objR, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objR;
            composableLambdaImpl.D(obj);
        }
        dVar.Z();
        return composableLambdaImpl;
    }

    public static final do1 c(int i, boolean z, Object obj) {
        return new ComposableLambdaImpl(i, z, obj);
    }

    public static final int d(int i) {
        return a(2, i);
    }

    public static final do1 e(int i, boolean z, Object obj, d dVar, int i2) {
        if (e.k()) {
            e.o(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = new ComposableLambdaImpl(i, z, obj);
            dVar.L(objR);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objR;
        composableLambdaImpl.D(obj);
        if (e.k()) {
            e.n();
        }
        return composableLambdaImpl;
    }

    public static final boolean f(qaa qaaVar, qaa qaaVar2) {
        if (qaaVar == null) {
            return true;
        }
        if (!(qaaVar instanceof b0) || !(qaaVar2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) qaaVar;
        return !b0Var.u() || Intrinsics.e(qaaVar, qaaVar2) || Intrinsics.e(b0Var.getAnchor(), ((b0) qaaVar2).getAnchor());
    }

    public static final int g(int i) {
        return a(1, i);
    }
}
