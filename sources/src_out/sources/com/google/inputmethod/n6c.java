package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lcom/google/android/n6c;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "Lcom/google/android/f43;", "density", "<init>", "(Lcom/google/android/f43;)V", "", "value", "", "d", "(Ljava/lang/Object;)I", "", "l", "()V", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "", "t", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z", "k", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "Lcom/google/android/kx1;", "J", "s", "()J", "v", "(J)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "Landroidx/compose/ui/unit/LayoutDirection;", "r", "()Landroidx/compose/ui/unit/LayoutDirection;", "u", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "", "n", "Ljava/util/List;", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "baselineNeeded", "o", "Z", "dirtyBaselineNeededWidgets", "", "p", "Ljava/util/Set;", "baselineNeededWidgets", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class n6c extends State {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long rootIncomingConstraints;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<Object> baselineNeeded;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean dirtyBaselineNeededWidgets;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Set<ConstraintWidget> baselineNeededWidgets;

    public n6c(f43 f43Var) {
        Intrinsics.checkNotNullParameter(f43Var, "density");
        this.density = f43Var;
        this.rootIncomingConstraints = nx1.b(0, 0, 0, 0, 15, null);
        this.baselineNeeded = new ArrayList();
        this.dirtyBaselineNeededWidgets = true;
        this.baselineNeededWidgets = new LinkedHashSet();
    }

    @Override // androidx.constraintlayout.core.state.State
    public int d(Object value) {
        return value instanceof ff3 ? this.density.O1(((ff3) value).getValue()) : super.d(value);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void l() {
        ConstraintWidget constraintWidgetA;
        HashMap<Object, bca> map = this.b;
        Intrinsics.checkNotNullExpressionValue(map, "mReferences");
        Iterator<Map.Entry<Object, bca>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            bca value = it.next().getValue();
            if (value != null && (constraintWidgetA = value.a()) != null) {
                constraintWidgetA.x0();
            }
        }
        this.b.clear();
        HashMap<Object, bca> map2 = this.b;
        Intrinsics.checkNotNullExpressionValue(map2, "mReferences");
        map2.put(State.j, this.e);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.l();
    }

    public final LayoutDirection r() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.x("layoutDirection");
        throw null;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public final boolean t(ConstraintWidget constraintWidget) {
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            Iterator<T> it = this.baselineNeeded.iterator();
            while (it.hasNext()) {
                bca bcaVar = this.b.get(it.next());
                ConstraintWidget constraintWidgetA = bcaVar == null ? null : bcaVar.a();
                if (constraintWidgetA != null) {
                    this.baselineNeededWidgets.add(constraintWidgetA);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }

    public final void u(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void v(long j) {
        this.rootIncomingConstraints = j;
    }
}
