package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import com.google.android.r43;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001aU\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0015\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00110\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "T", "", "inputs", "Lcom/google/android/k0b;", "saver", "", "key", "Lkotlin/Function0;", "init", "j", "([Ljava/lang/Object;Lcom/google/android/k0b;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;II)Ljava/lang/Object;", "l", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "k", "([Ljava/lang/Object;Lcom/google/android/k0b;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "stateSaver", "Lcom/google/android/o58;", "i", "([Ljava/lang/Object;Lcom/google/android/k0b;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)Lcom/google/android/o58;", "inner", "f", "(Lcom/google/android/k0b;)Lcom/google/android/k0b;", "Lcom/google/android/qya;", "value", "", "n", "(Lcom/google/android/qya;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/String;", "", "a", "I", "MaxSupportedRadix", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dfa {
    private static final int a = 36;

    public static final String e(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> k0b<o58<T>, o58<Object>> f(final k0b<T, ? extends Object> k0bVar) {
        Intrinsics.h(k0bVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return n0b.e(new Function2() { // from class: com.google.android.afa
            public final Object invoke(Object obj, Object obj2) {
                return dfa.g(k0bVar, (o0b) obj, (o58) obj2);
            }
        }, new Function1() { // from class: com.google.android.bfa
            public final Object invoke(Object obj) {
                return dfa.h(k0bVar, (o58) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 g(k0b k0bVar, o0b o0bVar, o58 o58Var) {
        if (!(o58Var instanceof axb)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        axb axbVar = (axb) o58Var;
        Object objA = k0bVar.a(o0bVar, axbVar.getValue());
        if (objA == null) {
            return null;
        }
        bxb policy = axbVar.getPolicy();
        Intrinsics.h(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return p0.i(objA, policy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 h(k0b k0bVar, o58 o58Var) {
        Object objB;
        if (!(o58Var instanceof axb)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        axb axbVar = (axb) o58Var;
        if (axbVar.getValue() != 0) {
            T value = axbVar.getValue();
            Intrinsics.g(value);
            objB = k0bVar.b(value);
        } else {
            objB = null;
        }
        bxb policy = axbVar.getPolicy();
        Intrinsics.h(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
        o58 o58VarI = p0.i(objB, policy);
        Intrinsics.h(o58VarI, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
        return o58VarI;
    }

    public static final <T> o58<T> i(Object[] objArr, k0b<T, ? extends Object> k0bVar, Function0<? extends o58<T>> function0, d dVar, int i) {
        if (e.k()) {
            e.o(-746165481, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:203)");
        }
        o58<T> o58Var = (o58) j(Arrays.copyOf(objArr, objArr.length), f(k0bVar), null, function0, dVar, ((i << 3) & 7168) | 384, 0);
        if (e.k()) {
            e.n();
        }
        return o58Var;
    }

    @r43
    public static final <T> T j(Object[] objArr, k0b<T, ? extends Object> k0bVar, String str, Function0<? extends T> function0, d dVar, int i, int i2) {
        Object[] objArr2;
        final T t;
        Object objF;
        if ((i2 & 2) != 0) {
            k0bVar = n0b.f();
        }
        final k0b<T, ? extends Object> k0bVar2 = k0bVar;
        int i3 = i2 & 4;
        Object objInvoke = null;
        if (i3 != 0) {
            str = null;
        }
        if (e.k()) {
            e.o(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jB = pp1.b(dVar, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jB, CharsKt.checkRadix(a));
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        final String str2 = str;
        Intrinsics.h(k0bVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final qya qyaVar = (qya) dVar.v(tya.g());
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            if (qyaVar != null && (objF = qyaVar.f(str2)) != null) {
                objInvoke = k0bVar2.b(objF);
            }
            if (objInvoke == null) {
                objInvoke = function0.invoke();
            }
            objArr2 = objArr;
            Object byaVar = new bya(k0bVar2, qyaVar, str2, objInvoke, objArr2);
            dVar.L(byaVar);
            objR = byaVar;
        } else {
            objArr2 = objArr;
        }
        final bya byaVar2 = (bya) objR;
        Object objC = byaVar2.c(objArr2);
        if (objC == null) {
            objC = function0.invoke();
        }
        boolean zT = dVar.T(byaVar2) | ((((i & 112) ^ 48) > 32 && dVar.T(k0bVar2)) || (i & 48) == 32) | dVar.T(qyaVar) | dVar.x(str2) | dVar.T(objC) | dVar.T(objArr2);
        Object objR2 = dVar.R();
        if (zT || objR2 == companion.a()) {
            final Object[] objArr3 = objArr2;
            t = (T) objC;
            Object obj = new Function0() { // from class: com.google.android.cfa
                public final Object invoke() {
                    return dfa.m(byaVar2, k0bVar2, qyaVar, str2, t, objArr3);
                }
            };
            dVar.L(obj);
            objR2 = obj;
        } else {
            t = (T) objC;
        }
        vn3.i((Function0) objR2, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return t;
    }

    public static final <T> T k(Object[] objArr, k0b<T, ? extends Object> k0bVar, Function0<? extends T> function0, d dVar, int i) {
        if (e.k()) {
            e.o(674689872, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:175)");
        }
        T t = (T) j(Arrays.copyOf(objArr, objArr.length), k0bVar, null, function0, dVar, (i & 112) | 384 | ((i << 3) & 7168), 0);
        if (e.k()) {
            e.n();
        }
        return t;
    }

    public static final <T> T l(Object[] objArr, Function0<? extends T> function0, d dVar, int i) {
        if (e.k()) {
            e.o(1564532345, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t = (T) j(Arrays.copyOf(objArr, objArr.length), n0b.f(), null, function0, dVar, ((i << 6) & 7168) | 384, 0);
        if (e.k()) {
            e.n();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(bya byaVar, k0b k0bVar, qya qyaVar, String str, Object obj, Object[] objArr) {
        byaVar.h(k0bVar, qyaVar, str, obj, objArr);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(qya qyaVar, Object obj) {
        String strE;
        if (obj == null || qyaVar.a(obj)) {
            return;
        }
        if (obj instanceof axb) {
            axb axbVar = (axb) obj;
            if (axbVar.getPolicy() == p0.k() || axbVar.getPolicy() == p0.t() || axbVar.getPolicy() == p0.q()) {
                strE = "MutableState containing " + axbVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strE = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strE = e(obj);
        }
        throw new IllegalArgumentException(strE);
    }
}
