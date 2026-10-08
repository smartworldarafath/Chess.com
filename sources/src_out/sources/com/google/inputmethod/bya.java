package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006("}, d2 = {"Lcom/google/android/bya;", "T", "Lcom/google/android/o0b;", "Lcom/google/android/yea;", "Lcom/google/android/k0b;", "", "saver", "Lcom/google/android/qya;", "registry", "", "key", "value", "", "inputs", "<init>", "(Lcom/google/android/k0b;Lcom/google/android/qya;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "", "g", "()V", "h", "", "a", "(Ljava/lang/Object;)Z", "d", "f", "e", "c", "([Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/google/android/k0b;", "b", "Lcom/google/android/qya;", "Ljava/lang/String;", "Ljava/lang/Object;", "[Ljava/lang/Object;", "Lcom/google/android/qya$a;", "Lcom/google/android/qya$a;", "entry", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "valueProvider", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bya<T> implements o0b, yea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private k0b<T, Object> saver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private qya registry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String key;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private T value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Object[] inputs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private qya.a entry;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function0<Object> valueProvider = new Function0() { // from class: com.google.android.aya
        public final Object invoke() {
            return bya.i(this.a);
        }
    };

    public bya(k0b<T, Object> k0bVar, qya qyaVar, String str, T t, Object[] objArr) {
        this.saver = k0bVar;
        this.registry = qyaVar;
        this.key = str;
        this.value = t;
        this.inputs = objArr;
    }

    private final void g() {
        qya qyaVar = this.registry;
        if (this.entry == null) {
            if (qyaVar != null) {
                dfa.n(qyaVar, this.valueProvider.invoke());
                this.entry = qyaVar.b(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(bya byaVar) {
        k0b<T, Object> k0bVar = byaVar.saver;
        T t = byaVar.value;
        if (t != null) {
            return k0bVar.a(byaVar, t);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    @Override // com.google.inputmethod.o0b
    public boolean a(Object value) {
        qya qyaVar = this.registry;
        return qyaVar == null || qyaVar.a(value);
    }

    public final T c(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        g();
    }

    @Override // com.google.inputmethod.yea
    public void e() {
        qya.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        qya.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void h(k0b<T, Object> saver, qya registry, String key, T value, Object[] inputs) {
        boolean z;
        boolean z2 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.e(this.key, key)) {
            z2 = z;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        qya.a aVar = this.entry;
        if (aVar == null || !z2) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.entry = null;
        g();
    }
}
