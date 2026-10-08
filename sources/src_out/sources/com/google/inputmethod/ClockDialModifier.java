package com.google.inputmethod;

import androidx.compose.p002material3.AnalogTimePickerState;
import androidx.compose.p002material3.ClockDialNode;
import androidx.compose.p002material3.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.xf1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/google/android/xf1;", "Lcom/google/android/uy7;", "Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/m2;", "selection", "Lcom/google/android/kr;", "", "animationSpec", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILcom/google/android/kr;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/material3/ClockDialNode;", "node", "", "e", "(Landroidx/compose/material3/ClockDialNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/material3/AnalogTimePickerState;", "Z", "f", "I", "g", "Lcom/google/android/kr;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClockDialModifier extends uy7<ClockDialNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final AnalogTimePickerState state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean autoSwitchToMinute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int selection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final kr<Float> animationSpec;

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i, kr krVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z, i, krVar);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ClockDialNode a() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec, null);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ClockDialNode node) {
        node.E3(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) other;
        return Intrinsics.e(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && m2.f(this.selection, clockDialModifier.selection) && Intrinsics.e(this.animationSpec, clockDialModifier.animationSpec);
    }

    public int hashCode() {
        return (((((this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute)) * 31) + m2.g(this.selection)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) m2.h(this.selection)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i, kr<Float> krVar) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i;
        this.animationSpec = krVar;
    }
}
