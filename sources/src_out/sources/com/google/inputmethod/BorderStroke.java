package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.or0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/or0;", "", "Lcom/google/android/ff3;", "width", "Lcom/google/android/qu0;", "brush", "<init>", "(FLcom/google/android/qu0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "Lcom/google/android/qu0;", "()Lcom/google/android/qu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorderStroke {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final qu0 brush;

    public /* synthetic */ BorderStroke(float f, qu0 qu0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, qu0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qu0 getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) other;
        return ff3.k(this.width, borderStroke.width) && Intrinsics.e(this.brush, borderStroke.brush);
    }

    public int hashCode() {
        return (ff3.l(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) ff3.m(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f, qu0 qu0Var) {
        this.width = f;
        this.brush = qu0Var;
    }
}
