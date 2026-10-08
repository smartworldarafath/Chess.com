package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.inputmethod.am8;
import com.google.inputmethod.e58;
import com.google.inputmethod.i05;
import com.google.inputmethod.pkb;
import com.google.inputmethod.zw5;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/draw/j;", "Lcom/google/android/i05;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "b", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "c", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "e", "Lcom/google/android/e58;", "a", "Lcom/google/android/e58;", "allocatedGraphicsLayers", "value", "Lcom/google/android/i05;", "d", "()Lcom/google/android/i05;", "f", "(Lcom/google/android/i05;)V", "graphicsContext", "Lcom/google/android/pkb;", "()Lcom/google/android/pkb;", "shadowContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j implements i05 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private e58<GraphicsLayer> allocatedGraphicsLayers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private i05 graphicsContext;

    @Override // com.google.inputmethod.i05
    public pkb a() {
        i05 i05Var = this.graphicsContext;
        if (!(i05Var != null)) {
            zw5.c("GraphicsContext not provided");
        }
        return i05Var.a();
    }

    @Override // com.google.inputmethod.i05
    public GraphicsLayer b() {
        i05 i05Var = this.graphicsContext;
        if (!(i05Var != null)) {
            zw5.c("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerB = i05Var.b();
        e58<GraphicsLayer> e58Var = this.allocatedGraphicsLayers;
        if (e58Var == null) {
            this.allocatedGraphicsLayers = am8.g(graphicsLayerB);
            return graphicsLayerB;
        }
        e58Var.n(graphicsLayerB);
        return graphicsLayerB;
    }

    @Override // com.google.inputmethod.i05
    public void c(GraphicsLayer layer) {
        i05 i05Var = this.graphicsContext;
        if (i05Var != null) {
            i05Var.c(layer);
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i05 getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void e() {
        e58<GraphicsLayer> e58Var = this.allocatedGraphicsLayers;
        if (e58Var != null) {
            Object[] objArr = e58Var.content;
            int i = e58Var._size;
            for (int i2 = 0; i2 < i; i2++) {
                c((GraphicsLayer) objArr[i2]);
            }
            e58Var.u();
        }
    }

    public final void f(i05 i05Var) {
        e();
        this.graphicsContext = i05Var;
    }
}
