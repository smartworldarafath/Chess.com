package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/d;", "Landroidx/compose/ui/layout/x;", "", "name", "", "rulers", "<init>", "(Ljava/lang/String;[Landroidx/compose/ui/layout/x;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getName", "c", "[Landroidx/compose/ui/layout/x;", "getRulers", "()[Landroidx/compose/ui/layout/x;", "Landroidx/compose/ui/layout/p;", "d", "Landroidx/compose/ui/layout/p;", "a", "()Landroidx/compose/ui/layout/p;", "current", "e", "maximum", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d implements x {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final x[] rulers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final p current;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final p maximum;

    public d(String str, x[] xVarArr) {
        this.name = str;
        this.rulers = xVarArr;
        p.Companion companion = p.INSTANCE;
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (x xVar : xVarArr) {
            arrayList.add(xVar.getCurrent());
        }
        p[] pVarArr = (p[]) arrayList.toArray(new p[0]);
        this.current = r.b(companion, (p[]) Arrays.copyOf(pVarArr, pVarArr.length));
        p.Companion companion2 = p.INSTANCE;
        x[] xVarArr2 = this.rulers;
        ArrayList arrayList2 = new ArrayList(xVarArr2.length);
        for (x xVar2 : xVarArr2) {
            arrayList2.add(xVar2.getMaximum());
        }
        p[] pVarArr2 = (p[]) arrayList2.toArray(new p[0]);
        this.maximum = r.b(companion2, (p[]) Arrays.copyOf(pVarArr2, pVarArr2.length));
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

    public String toString() {
        String str = this.name;
        return str == null ? kotlin.collections.f.P0(this.rulers, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null) : str;
    }
}
