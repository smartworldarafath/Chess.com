package com.google.inputmethod;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00180\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/od3;", "Lcom/google/android/qya;", "saveableStateRegistry", "Lkotlin/Function0;", "", "onDispose", "<init>", "(Lcom/google/android/qya;Lkotlin/jvm/functions/Function0;)V", "d", "()V", "", "key", "", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "valueProvider", "Lcom/google/android/qya$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/android/qya$a;", "value", "", "a", "(Ljava/lang/Object;)Z", "", "", "c", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class od3 implements qya {
    private final /* synthetic */ qya a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Unit> onDispose;

    public od3(qya qyaVar, Function0<Unit> function0) {
        this.a = qyaVar;
        this.onDispose = function0;
    }

    @Override // com.google.inputmethod.qya
    public boolean a(Object value) {
        return this.a.a(value);
    }

    @Override // com.google.inputmethod.qya
    public qya.a b(String key, Function0<? extends Object> valueProvider) {
        return this.a.b(key, valueProvider);
    }

    @Override // com.google.inputmethod.qya
    public Map<String, List<Object>> c() {
        return this.a.c();
    }

    public final void d() {
        this.onDispose.invoke();
    }

    @Override // com.google.inputmethod.qya
    public Object f(String key) {
        return this.a.f(key);
    }
}
