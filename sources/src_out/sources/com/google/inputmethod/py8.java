package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/py8;", "Lcom/google/android/ct6$a;", "Lkotlin/Function1;", "", "", "key", "Lkotlin/Function2;", "Lcom/google/android/kz8;", "", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/google/android/rs4;", "()Lcom/google/android/rs4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class py8 implements ct6.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final rs4<kz8, Integer, d, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public py8(Function1<? super Integer, ? extends Object> function1, rs4<? super kz8, ? super Integer, ? super d, ? super Integer, Unit> rs4Var) {
        this.key = function1;
        this.item = rs4Var;
    }

    public final rs4<kz8, Integer, d, Integer, Unit> a() {
        return this.item;
    }

    @Override // com.google.android.ct6.a
    public Function1<Integer, Object> getKey() {
        return this.key;
    }
}
