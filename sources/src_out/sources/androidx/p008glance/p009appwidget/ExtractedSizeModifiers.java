package androidx.p008glance.p009appwidget;

import androidx.p008glance.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.glance.appwidget.f, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/glance/appwidget/f;", "", "Landroidx/glance/g;", "sizeModifiers", "nonSizeModifiers", "<init>", "(Landroidx/glance/g;Landroidx/glance/g;)V", "a", "()Landroidx/glance/g;", "b", "c", "(Landroidx/glance/g;Landroidx/glance/g;)Landroidx/glance/appwidget/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/g;", "f", "e", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class ExtractedSizeModifiers {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final g sizeModifiers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final g nonSizeModifiers;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtractedSizeModifiers() {
        g gVar = null;
        this(gVar, gVar, 3, gVar);
    }

    public static /* synthetic */ ExtractedSizeModifiers d(ExtractedSizeModifiers extractedSizeModifiers, g gVar, g gVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = extractedSizeModifiers.sizeModifiers;
        }
        if ((i & 2) != 0) {
            gVar2 = extractedSizeModifiers.nonSizeModifiers;
        }
        return extractedSizeModifiers.c(gVar, gVar2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getSizeModifiers() {
        return this.sizeModifiers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getNonSizeModifiers() {
        return this.nonSizeModifiers;
    }

    public final ExtractedSizeModifiers c(g sizeModifiers, g nonSizeModifiers) {
        return new ExtractedSizeModifiers(sizeModifiers, nonSizeModifiers);
    }

    public final g e() {
        return this.nonSizeModifiers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedSizeModifiers)) {
            return false;
        }
        ExtractedSizeModifiers extractedSizeModifiers = (ExtractedSizeModifiers) other;
        return Intrinsics.e(this.sizeModifiers, extractedSizeModifiers.sizeModifiers) && Intrinsics.e(this.nonSizeModifiers, extractedSizeModifiers.nonSizeModifiers);
    }

    public final g f() {
        return this.sizeModifiers;
    }

    public int hashCode() {
        return (this.sizeModifiers.hashCode() * 31) + this.nonSizeModifiers.hashCode();
    }

    public String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.sizeModifiers + ", nonSizeModifiers=" + this.nonSizeModifiers + ')';
    }

    public ExtractedSizeModifiers(g gVar, g gVar2) {
        this.sizeModifiers = gVar;
        this.nonSizeModifiers = gVar2;
    }

    public /* synthetic */ ExtractedSizeModifiers(g gVar, g gVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? g.INSTANCE : gVar, (i & 2) != 0 ? g.INSTANCE : gVar2);
    }
}
