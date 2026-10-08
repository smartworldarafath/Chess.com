package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010$R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b%\u0010)R\u001a\u0010-\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b,\u0010+\u001a\u0004\b\u001d\u0010)R\u0014\u0010/\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$¨\u00060"}, d2 = {"Lcom/google/android/os9;", "T", "", "Lcom/google/android/zr1;", "compositionLocal", "value", "", "explicitNull", "Lcom/google/android/bxb;", "mutationPolicy", "Lcom/google/android/o58;", "state", "Lkotlin/Function1;", "Lcom/google/android/as1;", "compute", "isDynamic", "<init>", "(Lcom/google/android/zr1;Ljava/lang/Object;ZLcom/google/android/bxb;Lcom/google/android/o58;Lkotlin/jvm/functions/Function1;Z)V", "h", "()Lcom/google/android/os9;", "a", "Lcom/google/android/zr1;", "b", "()Lcom/google/android/zr1;", "Z", "c", "Lcom/google/android/bxb;", "e", "()Lcom/google/android/bxb;", "d", "Lcom/google/android/o58;", "f", "()Lcom/google/android/o58;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "i", "()Z", "g", "Ljava/lang/Object;", "providedValue", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime$annotations", "effectiveValue", "j", "isStatic", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class os9<T> {
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zr1<T> compositionLocal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean explicitNull;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final bxb<T> mutationPolicy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58<T> state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<as1, T> compute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isDynamic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final T providedValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean canOverride = true;

    /* JADX WARN: Multi-variable type inference failed */
    public os9(zr1<T> zr1Var, T t, boolean z, bxb<T> bxbVar, o58<T> o58Var, Function1<? super as1, ? extends T> function1, boolean z2) {
        this.compositionLocal = zr1Var;
        this.explicitNull = z;
        this.mutationPolicy = bxbVar;
        this.state = o58Var;
        this.compute = function1;
        this.isDynamic = z2;
        this.providedValue = t;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final zr1<T> b() {
        return this.compositionLocal;
    }

    public final Function1<as1, T> c() {
        return this.compute;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final T d() throws KotlinNothingValueException {
        if (this.explicitNull) {
            return null;
        }
        o58<T> o58Var = this.state;
        if (o58Var != null) {
            return o58Var.getValue();
        }
        T t = this.providedValue;
        if (t != null) {
            return t;
        }
        e.c("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final bxb<T> e() {
        return this.mutationPolicy;
    }

    public final o58<T> f() {
        return this.state;
    }

    public final T g() {
        return this.providedValue;
    }

    public final os9<T> h() {
        this.canOverride = false;
        return this;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final boolean j() {
        return (this.explicitNull || g() != null) && !this.isDynamic;
    }
}
