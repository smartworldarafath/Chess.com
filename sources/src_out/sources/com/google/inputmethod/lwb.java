package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/lwb;", "", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<Object, Unit> writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    public lwb() {
        Function1 function1 = null;
        this(function1, function1, 3, function1);
    }

    public final Function1<Object, Unit> a() {
        return this.readObserver;
    }

    public final Function1<Object, Unit> b() {
        return this.writeObserver;
    }

    public lwb(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        this.readObserver = function1;
        this.writeObserver = function2;
    }

    public /* synthetic */ lwb(Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2);
    }
}
