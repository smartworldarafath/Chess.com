package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.h0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0019\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/h0;", "Landroidx/compose/ui/text/font/k;", "", "resId", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "Landroidx/compose/ui/text/font/w$d;", "variationSettings", "Landroidx/compose/ui/text/font/r;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/x;ILandroidx/compose/ui/text/font/w$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "d", "c", "Landroidx/compose/ui/text/font/x;", "()Landroidx/compose/ui/text/font/x;", "e", "Landroidx/compose/ui/text/font/w$d;", "()Landroidx/compose/ui/text/font/w$d;", "f", "a", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceFont implements k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int resId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FontWeight weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final w.d variationSettings;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int loadingStrategy;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, w.d dVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, dVar, i3);
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: b, reason: from getter */
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.k
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w.d getVariationSettings() {
        return this.variationSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.e(getWeight(), resourceFont.getWeight()) && t.f(getStyle(), resourceFont.getStyle()) && Intrinsics.e(this.variationSettings, resourceFont.variationSettings) && r.e(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().getWeight()) * 31) + t.g(getStyle())) * 31) + r.f(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) t.h(getStyle())) + ", loadingStrategy=" + ((Object) r.g(getLoadingStrategy())) + ')';
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, w.d dVar, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = dVar;
        this.loadingStrategy = i3;
    }
}
