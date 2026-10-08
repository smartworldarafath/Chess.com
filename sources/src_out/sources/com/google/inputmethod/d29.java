package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/google/android/d29;", "Lcom/google/android/uy7;", "Lcom/google/android/f29;", "", "fraction", "Lcom/google/android/q6c;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLcom/google/android/q6c;Lcom/google/android/q6c;Ljava/lang/String;)V", "d", "()Lcom/google/android/f29;", "node", "", "e", "(Lcom/google/android/f29;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "getFraction", "()F", "Lcom/google/android/q6c;", "getWidthState", "()Lcom/google/android/q6c;", "f", "getHeightState", "g", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d29 extends uy7<f29> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final q6c<Integer> widthState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final q6c<Integer> heightState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String inspectorName;

    public d29(float f, q6c<Integer> q6cVar, q6c<Integer> q6cVar2, String str) {
        this.fraction = f;
        this.widthState = q6cVar;
        this.heightState = q6cVar2;
        this.inspectorName = str;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f29 a() {
        return new f29(this.fraction, this.widthState, this.heightState);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(f29 node) {
        node.o3(this.fraction);
        node.q3(this.widthState);
        node.p3(this.heightState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d29)) {
            return false;
        }
        d29 d29Var = (d29) other;
        return this.fraction == d29Var.fraction && Intrinsics.e(this.widthState, d29Var.widthState) && Intrinsics.e(this.heightState, d29Var.heightState);
    }

    public int hashCode() {
        q6c<Integer> q6cVar = this.widthState;
        int iHashCode = (q6cVar != null ? q6cVar.hashCode() : 0) * 31;
        q6c<Integer> q6cVar2 = this.heightState;
        return ((iHashCode + (q6cVar2 != null ? q6cVar2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    public /* synthetic */ d29(float f, q6c q6cVar, q6c q6cVar2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : q6cVar, (i & 4) != 0 ? null : q6cVar2, str);
    }
}
