package androidx.compose.ui.graphics;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.inputmethod.bfb;
import com.google.inputmethod.bo6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.mq1;
import com.google.inputmethod.nfb;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r16;
import com.google.inputmethod.xkb;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0006*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\tR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/bfb;", "Landroidx/compose/ui/b$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "layerBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "n3", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "p", "Lkotlin/jvm/functions/Function1;", "m3", "()Lkotlin/jvm/functions/Function1;", "o3", "", "q", "Z", "o1", "()Z", "isImportantForBounds", "Q2", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockGraphicsLayerModifier extends androidx.compose.ui.b.c implements androidx.compose.ui.node.c, bfb {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private Function1<? super m, Unit> block;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean isImportantForBounds;

    public BlockGraphicsLayerModifier(Function1<? super m, Unit> function1) {
        this.block = function1;
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        boolean lastClip;
        xkb shape;
        if (mq1.isGraphicsLayerShapeSemanticsEnabled) {
            NodeCoordinator nodeCoordinatorL = y23.l(this, ni8.a(2));
            if (nodeCoordinatorL.getWasLayerBlockInvoked()) {
                xkb lastShape = nodeCoordinatorL.getLastShape();
                lastClip = nodeCoordinatorL.getLastClip();
                shape = lastShape;
            } else {
                if (l.a == null) {
                    l.a = new s();
                } else {
                    s sVar = l.a;
                    Intrinsics.g(sVar);
                    sVar.Q();
                }
                s sVar2 = l.a;
                Intrinsics.g(sVar2);
                sVar2.R(nodeCoordinatorL.getLayoutNode().getDensity());
                sVar2.W(r16.e(nodeCoordinatorL.a()));
                androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
                androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
                Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
                androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
                try {
                    this.block.invoke(sVar2);
                    Unit unit = Unit.a;
                    companion.l(gVarD, gVarE, function1G);
                    shape = sVar2.getShape();
                    lastClip = sVar2.getClip();
                } catch (Throwable th) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th;
                }
            }
            if (lastClip) {
                SemanticsPropertiesKt.t0(nfbVar, shape);
            }
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j) {
        final androidx.compose.ui.layout.o oVarR0 = dj7Var.r0(j);
        return androidx.compose.ui.layout.j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<androidx.compose.ui.layout.o.a, Unit>() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.layout.o.a) obj);
                return Unit.a;
            }

            public final void invoke(androidx.compose.ui.layout.o.a aVar) {
                androidx.compose.ui.layout.o.a.d0(aVar, oVarR0, 0, 0, 0.0f, this.m3(), 4, null);
            }
        }, 4, null);
    }

    public final Function1<m, Unit> m3() {
        return this.block;
    }

    public final void n3() {
        bo6.e(this, this.block);
    }

    @Override // com.google.inputmethod.bfb
    /* JADX INFO: renamed from: o1, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    public final void o3(Function1<? super m, Unit> function1) {
        this.block = function1;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.block + ')';
    }
}
