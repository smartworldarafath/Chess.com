package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/google/android/b9d;", "Lcom/google/android/uy7;", "Lcom/google/android/h9d;", "", "value", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lcom/google/android/hpa;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLcom/google/android/r48;Lcom/google/android/av5;ZZLcom/google/android/hpa;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Lcom/google/android/h9d;", "node", "e", "(Lcom/google/android/h9d;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "Lcom/google/android/r48;", "f", "Lcom/google/android/av5;", "g", "h", "i", "Lcom/google/android/hpa;", "j", "Lkotlin/jvm/functions/Function1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b9d extends uy7<h9d> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final r48 interactionSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final av5 indicationNodeFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final hpa role;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Function1<Boolean, Unit> onValueChange;

    public /* synthetic */ b9d(boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, r48Var, av5Var, z2, z3, hpaVar, function1);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h9d a() {
        return new h9d(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(h9d node) {
        node.y4(this.value, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onValueChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || b9d.class != other.getClass()) {
            return false;
        }
        b9d b9dVar = (b9d) other;
        return this.value == b9dVar.value && Intrinsics.e(this.interactionSource, b9dVar.interactionSource) && Intrinsics.e(this.indicationNodeFactory, b9dVar.indicationNodeFactory) && this.useLocalIndication == b9dVar.useLocalIndication && this.enabled == b9dVar.enabled && Intrinsics.e(this.role, b9dVar.role) && this.onValueChange == b9dVar.onValueChange;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        r48 r48Var = this.interactionSource;
        int iHashCode2 = (iHashCode + (r48Var != null ? r48Var.hashCode() : 0)) * 31;
        av5 av5Var = this.indicationNodeFactory;
        int iHashCode3 = (((((iHashCode2 + (av5Var != null ? av5Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        hpa hpaVar = this.role;
        return ((iHashCode3 + (hpaVar != null ? hpa.n(hpaVar.getValue()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b9d(boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, hpa hpaVar, Function1<? super Boolean, Unit> function1) {
        this.value = z;
        this.interactionSource = r48Var;
        this.indicationNodeFactory = av5Var;
        this.useLocalIndication = z2;
        this.enabled = z3;
        this.role = hpaVar;
        this.onValueChange = function1;
    }
}
