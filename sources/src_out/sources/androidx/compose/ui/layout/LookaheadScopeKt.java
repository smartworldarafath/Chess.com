package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.google.android.ps4;
import com.google.inputmethod.dud;
import com.google.inputmethod.kn6;
import com.google.inputmethod.pp1;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.ua7;
import com.google.inputmethod.wa7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\r\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/wa7;", "", "content", "a", "(Lcom/google/android/ps4;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/kn6;", "coordinates", "sourceCoordinates", "Lcom/google/android/rn8;", "relativeToSource", "", "includeMotionFrameOfReference", "b", "(Lcom/google/android/wa7;Lcom/google/android/kn6;Lcom/google/android/kn6;JZ)J", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/o$a;", "Lkotlin/jvm/functions/Function2;", "defaultPlacementApproachInProgress", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LookaheadScopeKt {
    private static final Function2<o.a, kn6, Boolean> a = new Function2<o.a, kn6, Boolean>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(o.a aVar, kn6 kn6Var) {
            return Boolean.FALSE;
        }
    };

    public static final void a(final ps4<? super wa7, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(441837433);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(ps4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(441837433, i2, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:49)");
            }
            Object objR = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                Function0 function0 = null;
                objR = new i(function0, i3, function0);
                dVarF.L(objR);
            }
            i iVar = (i) objR;
            Object objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final LayoutNode invoke() {
                        return new LayoutNode(true, 0, 2, null);
                    }
                };
                dVarF.L(objR2);
            }
            Function0 function1 = (Function0) objR2;
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.E()) {
                dVarF.W(function1);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.e(dVarC, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                public final void a(LayoutNode layoutNode) {
                    layoutNode.g2(true);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((LayoutNode) obj);
                    return Unit.a;
                }
            });
            dud.i(dVarC, iVar, new Function2<LayoutNode, i, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                public final void a(final LayoutNode layoutNode, i iVar2) {
                    iVar2.a(new Function0<kn6>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final kn6 invoke() {
                            LayoutNode layoutNodeC0 = layoutNode.C0();
                            Intrinsics.g(layoutNodeC0);
                            return layoutNodeC0.b0().v();
                        }
                    });
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((LayoutNode) obj, (i) obj2);
                    return Unit.a;
                }
            });
            ps4Var.invoke(iVar, dVarF, Integer.valueOf((i2 << 3) & 112));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(androidx.compose.p004runtime.d dVar2, int i4) {
                    LookaheadScopeKt.a(ps4Var, dVar2, saa.a(i | 1));
                }
            });
        }
    }

    public static final long b(wa7 wa7Var, kn6 kn6Var, kn6 kn6Var2, long j, boolean z) {
        kn6 kn6VarF = wa7Var.f(kn6Var);
        kn6 kn6VarF2 = wa7Var.f(kn6Var2);
        if (kn6VarF instanceof ua7) {
            return ((ua7) kn6VarF).f0(kn6VarF2, j, z);
        }
        return kn6VarF2 instanceof ua7 ? rn8.e(((ua7) kn6VarF2).f0(kn6VarF, j, z) ^ (-9223372034707292160L)) : kn6VarF.f0(kn6VarF, j, z);
    }
}
