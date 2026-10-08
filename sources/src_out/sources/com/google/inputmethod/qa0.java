package com.google.inputmethod;

import com.google.android.r43;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/qa0;", "", "<init>", "()V", "", "id", "", "value", "", "b", "(ILjava/lang/String;)Lkotlin/Unit;", "", "Lcom/google/android/pa0;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qa0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, pa0> children = new LinkedHashMap();

    public final Map<Integer, pa0> a() {
        return this.children;
    }

    public final Unit b(int id, String value) {
        Function1<String, Unit> function1C;
        pa0 pa0Var = this.children.get(Integer.valueOf(id));
        if (pa0Var == null || (function1C = pa0Var.c()) == null) {
            return null;
        }
        function1C.invoke(value);
        return Unit.a;
    }
}
