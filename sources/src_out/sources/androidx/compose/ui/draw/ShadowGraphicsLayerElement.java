package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.m;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/¨\u00062"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Lcom/google/android/ff3;", "elevation", "Lcom/google/android/xkb;", "shape", "", "clip", "Lcom/google/android/ei1;", "ambientColor", "spotColor", "<init>", "(FLcom/google/android/xkb;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/m;", "", "e", "()Lkotlin/jvm/functions/Function1;", "d", "()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "node", "B", "(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "o", "()F", "Lcom/google/android/xkb;", "y", "()Lcom/google/android/xkb;", "f", "Z", "n", "()Z", "g", "J", "k", "()J", "h", "A", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends uy7<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float elevation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final xkb shape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long ambientColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f, xkb xkbVar, boolean z, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, xkbVar, z, j, j2);
    }

    private final Function1<m, Unit> e() {
        return new Function1<m, Unit>() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement$createBlock$1
            {
                super(1);
            }

            public final void a(m mVar) {
                mVar.s(mVar.x2(this.this$0.getElevation()));
                mVar.R0(this.this$0.getShape());
                mVar.l(this.this$0.getClip());
                mVar.E(this.this$0.getAmbientColor());
                mVar.I(this.this$0.getSpotColor());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        };
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void c(BlockGraphicsLayerModifier node) {
        node.o3(e());
        node.n3();
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier a() {
        return new BlockGraphicsLayerModifier(e());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return ff3.k(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.e(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && ei1.r(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && ei1.r(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((ff3.l(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + ei1.x(this.ambientColor)) * 31) + ei1.x(this.spotColor);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) ff3.m(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) ei1.y(this.ambientColor)) + ", spotColor=" + ((Object) ei1.y(this.spotColor)) + ')';
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final xkb getShape() {
        return this.shape;
    }

    private ShadowGraphicsLayerElement(float f, xkb xkbVar, boolean z, long j, long j2) {
        this.elevation = f;
        this.shape = xkbVar;
        this.clip = z;
        this.ambientColor = j;
        this.spotColor = j2;
    }
}
