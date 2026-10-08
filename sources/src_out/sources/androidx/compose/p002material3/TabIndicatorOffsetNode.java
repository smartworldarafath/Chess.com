package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p002material3.TabIndicatorOffsetNode;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.rw0;
import com.google.inputmethod.TabPosition;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00109\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108¨\u0006<"}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/q6c;", "", "Lcom/google/android/nkc;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "Lcom/google/android/xa4;", "Lcom/google/android/ff3;", "animationSpec", "<init>", "(Lcom/google/android/q6c;IZLcom/google/android/xa4;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Lcom/google/android/q6c;", "getTabPositionsState", "()Lcom/google/android/q6c;", "u3", "(Lcom/google/android/q6c;)V", "q", "I", "getSelectedTabIndex", "()I", "t3", "(I)V", "r", "Z", "getFollowContentSize", "()Z", "s3", "(Z)V", "s", "Lcom/google/android/xa4;", "o3", "()Lcom/google/android/xa4;", "r3", "(Lcom/google/android/xa4;)V", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/qr;", "t", "Landroidx/compose/animation/core/Animatable;", "offsetAnimatable", "u", "widthAnimatable", "v", "Lcom/google/android/ff3;", "initialOffset", "w", "initialWidth", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabIndicatorOffsetNode extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private q6c<? extends List<TabPosition>> tabPositionsState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int selectedTabIndex;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean followContentSize;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private xa4<ff3> animationSpec;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Animatable<ff3, qr> offsetAnimatable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Animatable<ff3, qr> widthAnimatable;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private ff3 initialOffset;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private ff3 initialWidth;

    public TabIndicatorOffsetNode(q6c<? extends List<TabPosition>> q6cVar, int i, boolean z, xa4<ff3> xa4Var) {
        this.tabPositionsState = q6cVar;
        this.selectedTabIndex = i;
        this.followContentSize = z;
        this.animationSpec = xa4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p3(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q3(o oVar, j jVar, float f, o.a aVar) {
        o.a.z(aVar, oVar, jVar.O1(f), 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(final j jVar, dj7 dj7Var, long j) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return j.Q1(jVar, 0, 0, null, new Function1() { // from class: com.google.android.ekc
                public final Object invoke(Object obj) {
                    return TabIndicatorOffsetNode.p3((o.a) obj);
                }
            }, 4, null);
        }
        float contentWidth = this.followContentSize ? this.tabPositionsState.getValue().get(this.selectedTabIndex).getContentWidth() : this.tabPositionsState.getValue().get(this.selectedTabIndex).getWidth();
        if (this.initialWidth != null) {
            Animatable<ff3, qr> animatable = this.widthAnimatable;
            if (animatable == null) {
                ff3 ff3Var = this.initialWidth;
                Intrinsics.g(ff3Var);
                Animatable<ff3, qr> animatable2 = new Animatable<>(ff3Var, w2e.L(ff3.INSTANCE), null, null, 12, null);
                this.widthAnimatable = animatable2;
                animatable = animatable2;
            }
            if (!ff3.k(contentWidth, animatable.k().getValue())) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0204TabIndicatorOffsetNode$measure$2(animatable, contentWidth, this, null), 3, (Object) null);
            }
        } else {
            this.initialWidth = ff3.e(contentWidth);
        }
        float left = this.tabPositionsState.getValue().get(this.selectedTabIndex).getLeft();
        if (this.initialOffset != null) {
            Animatable<ff3, qr> animatable3 = this.offsetAnimatable;
            if (animatable3 == null) {
                ff3 ff3Var2 = this.initialOffset;
                Intrinsics.g(ff3Var2);
                Animatable<ff3, qr> animatable4 = new Animatable<>(ff3Var2, w2e.L(ff3.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = animatable4;
                animatable3 = animatable4;
            }
            if (!ff3.k(left, animatable3.k().getValue())) {
                rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0205TabIndicatorOffsetNode$measure$3(animatable3, left, this, null), 3, (Object) null);
            }
        } else {
            this.initialOffset = ff3.e(left);
        }
        if (jVar.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable<ff3, qr> animatable5 = this.offsetAnimatable;
            if (animatable5 != null) {
                left = animatable5.m().getValue();
            }
        } else {
            Animatable<ff3, qr> animatable6 = this.offsetAnimatable;
            if (animatable6 != null) {
                left = animatable6.m().getValue();
            }
            left = ff3.i(-left);
        }
        Animatable<ff3, qr> animatable7 = this.widthAnimatable;
        if (animatable7 != null) {
            contentWidth = animatable7.m().getValue();
        }
        final o oVarR0 = dj7Var.r0(kx1.d(j, jVar.O1(contentWidth), jVar.O1(contentWidth), 0, 0, 12, null));
        final float f = left;
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.fkc
            public final Object invoke(Object obj) {
                return TabIndicatorOffsetNode.q3(oVarR0, jVar, f, (o.a) obj);
            }
        }, 4, null);
    }

    public final xa4<ff3> o3() {
        return this.animationSpec;
    }

    public final void r3(xa4<ff3> xa4Var) {
        this.animationSpec = xa4Var;
    }

    public final void s3(boolean z) {
        this.followContentSize = z;
    }

    public final void t3(int i) {
        this.selectedTabIndex = i;
    }

    public final void u3(q6c<? extends List<TabPosition>> q6cVar) {
        this.tabPositionsState = q6cVar;
    }
}
