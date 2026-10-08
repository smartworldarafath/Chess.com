package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.nr0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/google/android/nr0;", "Lcom/google/android/uy7;", "Lcom/google/android/mr0;", "Lcom/google/android/ff3;", "width", "Lcom/google/android/qu0;", "brush", "Lcom/google/android/xkb;", "shape", "<init>", "(FLcom/google/android/qu0;Lcom/google/android/xkb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lcom/google/android/mr0;", "node", "", "e", "(Lcom/google/android/mr0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidth-D9Ej5fM", "()F", "Lcom/google/android/qu0;", "getBrush", "()Lcom/google/android/qu0;", "f", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends uy7<mr0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final qu0 brush;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final xkb shape;

    public /* synthetic */ BorderModifierNodeElement(float f, qu0 qu0Var, xkb xkbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, qu0Var, xkbVar);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public mr0 a() {
        return new mr0(this.width, this.brush, this.shape, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(mr0 node) {
        node.E3(this.width);
        node.Z1(this.brush);
        node.R0(this.shape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return ff3.k(this.width, borderModifierNodeElement.width) && Intrinsics.e(this.brush, borderModifierNodeElement.brush) && Intrinsics.e(this.shape, borderModifierNodeElement.shape);
    }

    public int hashCode() {
        return (((ff3.l(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) ff3.m(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f, qu0 qu0Var, xkb xkbVar) {
        this.width = f;
        this.brush = qu0Var;
        this.shape = xkbVar;
    }
}
