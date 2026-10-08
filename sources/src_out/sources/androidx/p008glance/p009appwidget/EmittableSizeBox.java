package androidx.p008glance.p009appwidget;

import androidx.p008glance.g;
import com.google.inputmethod.btb;
import com.google.inputmethod.jf3;
import com.google.inputmethod.jq3;
import com.google.inputmethod.rp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: renamed from: androidx.glance.appwidget.e, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/glance/appwidget/e;", "Lcom/google/android/jq3;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/jf3;", "d", "J", "h", "()J", "j", "(J)V", "size", "Landroidx/glance/appwidget/m;", "e", "Landroidx/glance/appwidget/m;", "i", "()Landroidx/glance/appwidget/m;", "k", "(Landroidx/glance/appwidget/m;)V", "sizeMode", "Landroidx/glance/g;", "<anonymous parameter 0>", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableSizeBox extends jq3 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private long size;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private m sizeMode;

    public EmittableSizeBox() {
        super(0, false, 3, null);
        this.size = jf3.INSTANCE.a();
        this.sizeMode = m.c.a;
    }

    @Override // com.google.inputmethod.rp3
    /* JADX INFO: renamed from: a */
    public g getModifier() {
        g modifier;
        rp3 rp3Var = (rp3) m.j1(d());
        return (rp3Var == null || (modifier = rp3Var.getModifier()) == null) ? btb.b(g.INSTANCE) : modifier;
    }

    @Override // com.google.inputmethod.rp3
    public void b(g gVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // com.google.inputmethod.rp3
    public rp3 copy() {
        EmittableSizeBox emittableSizeBox = new EmittableSizeBox();
        emittableSizeBox.size = this.size;
        emittableSizeBox.sizeMode = this.sizeMode;
        List<rp3> listD = emittableSizeBox.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return emittableSizeBox;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m getSizeMode() {
        return this.sizeMode;
    }

    public final void j(long j) {
        this.size = j;
    }

    public final void k(m mVar) {
        this.sizeMode = mVar;
    }

    public String toString() {
        return "EmittableSizeBox(size=" + ((Object) jf3.j(this.size)) + ", sizeMode=" + this.sizeMode + ", children=[\n" + c() + "\n])";
    }
}
