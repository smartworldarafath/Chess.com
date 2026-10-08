package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/id3;", "Lcom/google/android/yea;", "Lkotlin/Function1;", "Lcom/google/android/kd3;", "Lcom/google/android/jd3;", "effect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "d", "()V", "f", "e", "a", "Lkotlin/jvm/functions/Function1;", "b", "Lcom/google/android/jd3;", "onDispose", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class id3 implements yea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<kd3, jd3> effect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private jd3 onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public id3(Function1<? super kd3, ? extends jd3> function1) {
        this.effect = function1;
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        this.onDispose = (jd3) this.effect.invoke(vn3.a);
    }

    @Override // com.google.inputmethod.yea
    public void e() {
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        jd3 jd3Var = this.onDispose;
        if (jd3Var != null) {
            jd3Var.dispose();
        }
        this.onDispose = null;
    }
}
