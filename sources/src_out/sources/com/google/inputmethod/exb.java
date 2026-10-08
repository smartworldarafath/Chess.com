package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.qjd;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.l0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0016\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"$\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u0010 \u0012\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/android/i79;", "Lcom/google/android/cxb;", "Landroidx/compose/runtime/snapshots/g;", "parent", "", "readonly", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Lcom/google/android/lwb;", "", "f", "(Lcom/google/android/i79;Landroidx/compose/runtime/snapshots/g;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "a", "b", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "result", "observerMap", "c", "(Lcom/google/android/i79;Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Ljava/util/Map;)V", "snapshot", "e", "(Landroidx/compose/runtime/snapshots/g;)V", "Landroidx/collection/ScatterSet;", "Lcom/google/android/a7c;", "changes", "d", "(Landroidx/compose/runtime/snapshots/g;Landroidx/collection/ScatterSet;)V", "Lcom/google/android/i79;", "getObservers$annotations", "()V", "observers", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class exb {
    private static i79<? extends cxb> a;

    public static final void c(i79<? extends cxb> i79Var, g gVar, g gVar2, Map<cxb, lwb> map) {
        int size = i79Var.size();
        for (int i = 0; i < size; i++) {
            cxb cxbVar = i79Var.get(i);
            cxbVar.a(gVar2, gVar, map != null ? map.get(cxbVar) : null);
        }
    }

    public static final void d(g gVar, ScatterSet<a7c> scatterSet) {
        Set<? extends Object> setE;
        i79<? extends cxb> i79Var = a;
        if (i79Var == null || i79Var.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setE = m4b.a(scatterSet)) == null) {
            setE = l0.e();
        }
        int size = i79Var.size();
        for (int i = 0; i < size; i++) {
            i79Var.get(i).c(gVar, setE);
        }
    }

    public static final void e(g gVar) {
        i79<? extends cxb> i79Var = a;
        if (i79Var != null) {
            int size = i79Var.size();
            for (int i = 0; i < size; i++) {
                i79Var.get(i).d(gVar);
            }
        }
    }

    public static final Pair<lwb, Map<cxb, lwb>> f(i79<? extends cxb> i79Var, g gVar, boolean z, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        int size = i79Var.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            cxb cxbVar = i79Var.get(i);
            lwb lwbVarB = cxbVar.b(gVar, z);
            if (lwbVarB != null) {
                function1 = g(lwbVarB.a(), function1);
                function2 = g(lwbVarB.b(), function2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(cxbVar, lwbVarB);
            }
        }
        return qjd.a(new lwb(function1, function2), linkedHashMap);
    }

    private static final Function1<Object, Unit> g(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: com.google.android.dxb
            public final Object invoke(Object obj) {
                return exb.h(function1, function2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.a;
    }
}
