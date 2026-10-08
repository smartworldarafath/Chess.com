package androidx.p008glance.layout;

import androidx.p008glance.g;
import com.google.inputmethod.jq3;
import com.google.inputmethod.rp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: renamed from: androidx.glance.layout.b, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/glance/layout/b;", "Lcom/google/android/jq3;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "d", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "Landroidx/glance/layout/a;", "e", "Landroidx/glance/layout/a;", "h", "()Landroidx/glance/layout/a;", "i", "(Landroidx/glance/layout/a;)V", "contentAlignment", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableBox extends jq3 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g modifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private Alignment contentAlignment;

    public EmittableBox() {
        super(0, false, 3, null);
        this.modifier = g.INSTANCE;
        this.contentAlignment = Alignment.INSTANCE.e();
    }

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a, reason: from getter */
    public g getModifier() {
        return this.modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        this.modifier = gVar;
    }

    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.b(getModifier());
        emittableBox.contentAlignment = this.contentAlignment;
        List<rp3> listD = emittableBox.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return emittableBox;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final void i(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public String toString() {
        return "EmittableBox(modifier=" + getModifier() + ", contentAlignment=" + this.contentAlignment + "children=[\n" + c() + "\n])";
    }
}
