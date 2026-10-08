package androidx.compose.ui;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.ZIndexNode, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/ZIndexNode;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "", "zIndex", "<init>", "(F)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "toString", "()Ljava/lang/String;", "p", "F", "m3", "()F", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZIndexModifier extends b.c implements androidx.compose.ui.node.c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private float zIndex;

    public ZIndexModifier(float f) {
        this.zIndex = f;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(j);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                aVar.w(oVarR0, 0, 0, this.getZIndex());
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void n3(float f) {
        this.zIndex = f;
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}
