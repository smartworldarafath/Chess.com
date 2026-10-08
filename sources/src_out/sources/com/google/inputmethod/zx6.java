package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001Bc\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/android/zx6;", "Lcom/google/android/ct6$a;", "Lkotlin/Function1;", "", "", "key", "type", "Lcom/google/android/w4c;", "span", "Lkotlin/Function2;", "Lcom/google/android/fy6;", "", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "getType", "c", "d", "Lcom/google/android/rs4;", "()Lcom/google/android/rs4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zx6 implements ct6.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<Integer, Object> type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<Integer, w4c> span;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rs4<fy6, Integer, d, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public zx6(Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function2, Function1<? super Integer, w4c> function3, rs4<? super fy6, ? super Integer, ? super d, ? super Integer, Unit> rs4Var) {
        this.key = function1;
        this.type = function2;
        this.span = function3;
        this.item = rs4Var;
    }

    public final rs4<fy6, Integer, d, Integer, Unit> a() {
        return this.item;
    }

    public final Function1<Integer, w4c> b() {
        return this.span;
    }

    @Override // com.google.android.ct6.a
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @Override // com.google.android.ct6.a
    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
