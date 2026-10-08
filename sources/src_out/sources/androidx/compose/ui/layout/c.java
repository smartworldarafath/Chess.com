package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/c;", "Landroidx/compose/ui/layout/p;", "", "rulers", "<init>", "([Landroidx/compose/ui/layout/p;)V", "", "toString", "()Ljava/lang/String;", "b", "[Landroidx/compose/ui/layout/p;", "Landroidx/compose/ui/layout/VerticalRuler;", "c", "Landroidx/compose/ui/layout/VerticalRuler;", "()Landroidx/compose/ui/layout/VerticalRuler;", "left", "Landroidx/compose/ui/layout/HorizontalRuler;", "d", "Landroidx/compose/ui/layout/HorizontalRuler;", "()Landroidx/compose/ui/layout/HorizontalRuler;", "top", "e", "a", "right", "f", "bottom", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c implements p {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final p[] rulers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final VerticalRuler left;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HorizontalRuler top;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final VerticalRuler right;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final HorizontalRuler bottom;

    public c(p[] pVarArr) {
        this.rulers = pVarArr;
        VerticalRuler.Companion companion = VerticalRuler.INSTANCE;
        int length = pVarArr.length;
        VerticalRuler[] verticalRulerArr = new VerticalRuler[length];
        for (int i = 0; i < length; i++) {
            verticalRulerArr[i] = this.rulers[i].getLeft();
        }
        this.left = companion.b(verticalRulerArr);
        HorizontalRuler.Companion companion2 = HorizontalRuler.INSTANCE;
        int length2 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr = new HorizontalRuler[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            horizontalRulerArr[i2] = this.rulers[i2].getTop();
        }
        this.top = companion2.a(horizontalRulerArr);
        VerticalRuler.Companion companion3 = VerticalRuler.INSTANCE;
        int length3 = this.rulers.length;
        VerticalRuler[] verticalRulerArr2 = new VerticalRuler[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            verticalRulerArr2[i3] = this.rulers[i3].getRight();
        }
        this.right = companion3.c(verticalRulerArr2);
        HorizontalRuler.Companion companion4 = HorizontalRuler.INSTANCE;
        int length4 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr2 = new HorizontalRuler[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            horizontalRulerArr2[i4] = this.rulers[i4].getBottom();
        }
        this.bottom = companion4.b(horizontalRulerArr2);
    }

    @Override // androidx.compose.ui.layout.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public VerticalRuler getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.layout.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public VerticalRuler getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.layout.p
    /* JADX INFO: renamed from: c, reason: from getter */
    public HorizontalRuler getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.layout.p
    /* JADX INFO: renamed from: d, reason: from getter */
    public HorizontalRuler getTop() {
        return this.top;
    }

    public String toString() {
        return kotlin.collections.f.P0(this.rulers, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null);
    }
}
