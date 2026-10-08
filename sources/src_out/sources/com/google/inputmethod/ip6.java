package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import com.google.android.rs4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001Bg\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/google/android/ip6;", "Lcom/google/android/ct6$a;", "Lkotlin/Function1;", "", "", "key", "Lkotlin/Function2;", "Lcom/google/android/wp6;", "Lcom/google/android/q15;", "span", "type", "Lcom/google/android/up6;", "", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;)V", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "c", "getType", "d", "Lcom/google/android/rs4;", "()Lcom/google/android/rs4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ip6 implements ct6.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<wp6, Integer, q15> span;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<Integer, Object> type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rs4<up6, Integer, d, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public ip6(Function1<? super Integer, ? extends Object> function1, Function2<? super wp6, ? super Integer, q15> function2, Function1<? super Integer, ? extends Object> function3, rs4<? super up6, ? super Integer, ? super d, ? super Integer, Unit> rs4Var) {
        this.key = function1;
        this.span = function2;
        this.type = function3;
        this.item = rs4Var;
    }

    public final rs4<up6, Integer, d, Integer, Unit> a() {
        return this.item;
    }

    public final Function2<wp6, Integer, q15> b() {
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
