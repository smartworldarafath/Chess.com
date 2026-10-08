package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/y;", "Landroidx/compose/ui/layout/x;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getName", "Landroidx/compose/ui/layout/p;", "c", "Landroidx/compose/ui/layout/p;", "a", "()Landroidx/compose/ui/layout/p;", "current", "d", "maximum", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y implements x {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final p current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final p maximum;

    public y(String str) {
        this.name = str;
        this.current = r.a(str);
        this.maximum = r.a(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.x
    /* JADX INFO: renamed from: a, reason: from getter */
    public p getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.x
    /* JADX INFO: renamed from: b, reason: from getter */
    public p getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
