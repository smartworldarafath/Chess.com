package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/gwc;", "start", "stop", "", "fraction", "b", "(Lcom/google/android/gwc;Lcom/google/android/gwc;F)Lcom/google/android/gwc;", "Lcom/google/android/ei1;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", "d", "(FLkotlin/jvm/functions/Function0;)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hsc {
    public static final gwc b(gwc gwcVar, gwc gwcVar2, float f) {
        boolean z = gwcVar instanceof BrushStyle;
        if (!z && !(gwcVar2 instanceof BrushStyle)) {
            return gwc.INSTANCE.b(ki1.h(gwcVar.getValue(), gwcVar2.getValue(), f));
        }
        if (!z || !(gwcVar2 instanceof BrushStyle)) {
            return (gwc) wzb.e(gwcVar, gwcVar2, f);
        }
        BrushStyle su0Var = (BrushStyle) gwcVar;
        BrushStyle su0Var2 = (BrushStyle) gwcVar2;
        return gwc.INSTANCE.a((qu0) wzb.e(su0Var.h(), su0Var2.h(), f), rh7.b(su0Var.getAlpha(), su0Var2.getAlpha(), f));
    }

    public static final long c(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : ei1.p(j, ei1.s(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f, Function0<Float> function0) {
        return Float.isNaN(f) ? ((Number) function0.invoke()).floatValue() : f;
    }
}
