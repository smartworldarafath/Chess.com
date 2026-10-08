package com.google.inputmethod;

import androidx.compose.p001foundation.MagnifierNode;
import androidx.compose.p001foundation.u;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/google/android/od7;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/MagnifierNode;", "Lkotlin/Function1;", "Lcom/google/android/f43;", "Lcom/google/android/rn8;", "sourceCenter", "magnifierCenter", "Lcom/google/android/jf3;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lcom/google/android/ff3;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/u;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/u;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/MagnifierNode;", "node", "e", "(Landroidx/compose/foundation/MagnifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "f", "g", "F", "h", "Z", "i", "J", "j", "k", "l", "m", "Landroidx/compose/foundation/u;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class od7 extends uy7<MagnifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<f43, rn8> sourceCenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<f43, rn8> magnifierCenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<jf3, Unit> onSizeChanged;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float zoom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean useTextDefault;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean clippingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final u platformMagnifierFactory;

    public /* synthetic */ od7(Function1 function1, Function1 function2, Function1 function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, function3, f, z, j, f2, f3, z2, uVar);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MagnifierNode a() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(MagnifierNode node) throws KotlinNothingValueException {
        node.x3(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof od7)) {
            return false;
        }
        od7 od7Var = (od7) other;
        return this.sourceCenter == od7Var.sourceCenter && this.magnifierCenter == od7Var.magnifierCenter && this.zoom == od7Var.zoom && this.useTextDefault == od7Var.useTextDefault && jf3.f(this.size, od7Var.size) && ff3.k(this.cornerRadius, od7Var.cornerRadius) && ff3.k(this.elevation, od7Var.elevation) && this.clippingEnabled == od7Var.clippingEnabled && this.onSizeChanged == od7Var.onSizeChanged && Intrinsics.e(this.platformMagnifierFactory, od7Var.platformMagnifierFactory);
    }

    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        Function1<f43, rn8> function1 = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + jf3.i(this.size)) * 31) + ff3.l(this.cornerRadius)) * 31) + ff3.l(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        Function1<jf3, Unit> function2 = this.onSizeChanged;
        return ((iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private od7(Function1<? super f43, rn8> function1, Function1<? super f43, rn8> function2, Function1<? super jf3, Unit> function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar) {
        this.sourceCenter = function1;
        this.magnifierCenter = function2;
        this.onSizeChanged = function3;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = uVar;
    }
}
