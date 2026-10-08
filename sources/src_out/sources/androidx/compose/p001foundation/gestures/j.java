package androidx.compose.p001foundation.gestures;

import com.google.inputmethod.cx5;
import com.google.inputmethod.dg3;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001a\u0010.\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010&¨\u0006/"}, d2 = {"Landroidx/compose/foundation/gestures/j;", "T", "Lcom/google/android/dg3;", "", "keys", "", "anchors", "<init>", "(Ljava/util/List;[F)V", "", "j", "([F)F", "i", "anchor", "c", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "b", "(F)Ljava/lang/Object;", "searchUpwards", "a", "(FZ)Ljava/lang/Object;", "f", "()F", "e", "", "index", "g", "(I)Ljava/lang/Object;", "k", "(I)F", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "[F", "I", "h", "size", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j<T> implements dg3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<T> keys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float[] anchors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends T> list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        if (!(list.size() == fArr.length)) {
            cx5.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + f.t1(fArr));
        }
        this.size = fArr.length;
    }

    private final float i(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int iU0 = f.u0(fArr);
        int i = 1;
        if (1 <= iU0) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == iU0) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    private final float j(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int iU0 = f.u0(fArr);
        int i = 1;
        if (1 <= iU0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == iU0) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    @Override // com.google.inputmethod.dg3
    public T a(float position, boolean searchUpwards) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f2 = fArr[i];
            int i4 = i3 + 1;
            float f3 = searchUpwards ? f2 - position : position - f2;
            if (f3 < 0.0f) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if (f3 <= f) {
                i2 = i3;
                f = f3;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }

    @Override // com.google.inputmethod.dg3
    public T b(float position) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        float f = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(position - fArr[i]);
            if (fAbs <= f) {
                i2 = i3;
                f = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }

    @Override // com.google.inputmethod.dg3
    public float c(T anchor) {
        int iIndexOf = this.keys.indexOf(anchor);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf >= fArr.length) ? ((Number) AnchoredDraggableKt.b.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    @Override // com.google.inputmethod.dg3
    public boolean d(T anchor) {
        return this.keys.indexOf(anchor) != -1;
    }

    @Override // com.google.inputmethod.dg3
    public float e() {
        return i(this.anchors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return Intrinsics.e(this.keys, jVar.keys) && Arrays.equals(this.anchors, jVar.anchors) && getSize() == jVar.getSize();
    }

    @Override // com.google.inputmethod.dg3
    public float f() {
        return j(this.anchors);
    }

    public T g(int index) {
        return (T) m.C0(this.keys, index);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    public float k(int index) {
        float[] fArr = this.anchors;
        return (index < 0 || index >= fArr.length) ? ((Number) AnchoredDraggableKt.b.invoke(Integer.valueOf(index))).floatValue() : fArr[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g(i));
            sb2.append('=');
            sb2.append(k(i));
            sb.append(sb2.toString());
            if (i < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        return sb.toString();
    }
}
