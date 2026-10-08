package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/av6;", "Lcom/google/android/ct6$a;", "Lkotlin/Function1;", "", "", "key", "type", "Lkotlin/Function2;", "Lcom/google/android/lr6;", "", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "getType", "c", "Lcom/google/android/rs4;", "()Lcom/google/android/rs4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class av6 implements ct6.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<Integer, Object> type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final rs4<lr6, Integer, d, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public av6(Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function2, rs4<? super lr6, ? super Integer, ? super d, ? super Integer, Unit> rs4Var) {
        this.key = function1;
        this.type = function2;
        this.item = rs4Var;
    }

    public final rs4<lr6, Integer, d, Integer, Unit> a() {
        return this.item;
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
