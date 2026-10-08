package com.google.inputmethod;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.sp0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/sp0;", "Lcom/google/android/ega;", "renderEffect", "", "radiusX", "radiusY", "Lcom/google/android/i5d;", "edgeTreatment", "<init>", "(Lcom/google/android/ega;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/RenderEffect;", "b", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ega;", "c", "F", "d", "e", "I", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurEffect extends ega {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final ega renderEffect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float radiusX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float radiusY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int edgeTreatment;

    public /* synthetic */ BlurEffect(ega egaVar, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(egaVar, f, f2, i);
    }

    @Override // com.google.inputmethod.ega
    /* JADX INFO: renamed from: b */
    protected RenderEffect getAndroidRenderEffect() {
        return sga.a.a(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) other;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && i5d.f(this.edgeTreatment, blurEffect.edgeTreatment) && Intrinsics.e(this.renderEffect, blurEffect.renderEffect);
    }

    public int hashCode() {
        ega egaVar = this.renderEffect;
        return ((((((egaVar != null ? egaVar.hashCode() : 0) * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + i5d.g(this.edgeTreatment);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) i5d.h(this.edgeTreatment)) + ')';
    }

    private BlurEffect(ega egaVar, float f, float f2, int i) {
        super(null);
        this.renderEffect = egaVar;
        this.radiusX = f;
        this.radiusY = f2;
        this.edgeTreatment = i;
    }
}
