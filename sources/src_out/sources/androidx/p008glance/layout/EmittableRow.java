package androidx.p008glance.layout;

import androidx.p008glance.g;
import com.google.inputmethod.jq3;
import com.google.inputmethod.rp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: renamed from: androidx.glance.layout.d, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001e\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/glance/layout/d;", "Lcom/google/android/jq3;", "<init>", "()V", "Lcom/google/android/rp3;", "copy", "()Lcom/google/android/rp3;", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/g;", "d", "Landroidx/glance/g;", "a", "()Landroidx/glance/g;", "b", "(Landroidx/glance/g;)V", "modifier", "Landroidx/glance/layout/a$b;", "e", "I", "h", "()I", "setHorizontalAlignment-uMT2-20", "(I)V", "horizontalAlignment", "Landroidx/glance/layout/a$c;", "f", "i", "setVerticalAlignment-Je2gTW8", "verticalAlignment", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmittableRow extends jq3 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g modifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int horizontalAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int verticalAlignment;

    public EmittableRow() {
        super(0, false, 3, null);
        this.modifier = g.INSTANCE;
        Alignment.Companion companion = Alignment.INSTANCE;
        this.horizontalAlignment = companion.c();
        this.verticalAlignment = companion.d();
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
        EmittableRow emittableRow = new EmittableRow();
        emittableRow.b(getModifier());
        emittableRow.horizontalAlignment = this.horizontalAlignment;
        emittableRow.verticalAlignment = this.verticalAlignment;
        List<rp3> listD = emittableRow.d();
        List<rp3> listD2 = d();
        ArrayList arrayList = new ArrayList(m.A(listD2, 10));
        Iterator<T> it = listD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rp3) it.next()).copy());
        }
        listD.addAll(arrayList);
        return emittableRow;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public String toString() {
        return "EmittableRow(modifier=" + getModifier() + ", horizontalAlignment=" + ((Object) Alignment.b.i(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.c.i(this.verticalAlignment)) + ", children=[\n" + c() + "\n])";
    }
}
