package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/google/android/gx8;", "Lcom/google/android/uy7;", "Lcom/google/android/qx8;", "Lcom/google/android/ff3;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lcom/google/android/qx8;", "node", "e", "(Lcom/google/android/qx8;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "getTop-D9Ej5fM", "setTop-0680j_4", "f", "getEnd-D9Ej5fM", "setEnd-0680j_4", "g", "getBottom-D9Ej5fM", "setBottom-0680j_4", "h", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "i", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gx8 extends uy7<qx8> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    public /* synthetic */ gx8(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public qx8 a() {
        return new qx8(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(qx8 node) {
        node.r3(this.start);
        node.s3(this.top);
        node.p3(this.end);
        node.o3(this.bottom);
        node.q3(this.rtlAware);
    }

    public boolean equals(Object other) {
        gx8 gx8Var = other instanceof gx8 ? (gx8) other : null;
        return gx8Var != null && ff3.k(this.start, gx8Var.start) && ff3.k(this.top, gx8Var.top) && ff3.k(this.end, gx8Var.end) && ff3.k(this.bottom, gx8Var.bottom) && this.rtlAware == gx8Var.rtlAware;
    }

    public int hashCode() {
        return (((((((ff3.l(this.start) * 31) + ff3.l(this.top)) * 31) + ff3.l(this.end)) * 31) + ff3.l(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gx8(float f, float f2, float f3, float f4, boolean z, Function1<? super jz5, Unit> function1) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        this.inspectorInfo = function1;
        boolean z2 = true;
        boolean z3 = f >= 0.0f || Float.isNaN(f);
        float f5 = this.top;
        boolean z4 = z3 & (f5 >= 0.0f || Float.isNaN(f5));
        float f6 = this.end;
        boolean z5 = z4 & (f6 >= 0.0f || Float.isNaN(f6));
        float f7 = this.bottom;
        if (f7 < 0.0f && !Float.isNaN(f7)) {
            z2 = false;
        }
        if (!z5 || !z2) {
            xw5.a("Padding must be non-negative");
        }
    }
}
