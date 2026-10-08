package androidx.compose.ui.graphics.colorspace;

import com.google.inputmethod.ki1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b'\u0018\u0000 62\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0010¢\u0006\u0004\b&\u0010'J'\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\u0014J\u0019\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0011\u0010\u0017J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b1\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b\u0010\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010/R\u0011\u00107\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010/R\u0014\u0010:\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "", "", "name", "Landroidx/compose/ui/graphics/colorspace/b;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component", "", "f", "(I)F", "e", "r", "g", "b", "", "k", "(FFF)[F", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lcom/google/android/ei1;", "n", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "h", "J", "()J", "c", "I", "d", "componentCount", "i", "()Z", "isSrgb", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int id;

    public /* synthetic */ c(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public final float[] a(float x, float y, float z) {
        float[] fArr = new float[b.f(this.model)];
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        return b(fArr);
    }

    public abstract float[] b(float[] v);

    public final int c() {
        return b.f(this.model);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float e(int component);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        c cVar = (c) other;
        if (this.id == cVar.id && Intrinsics.e(this.name, cVar.name)) {
            return b.e(this.model, cVar.model);
        }
        return false;
    }

    public abstract float f(int component);

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + b.g(this.model)) * 31) + this.id;
    }

    /* JADX INFO: renamed from: i */
    public boolean getIsSrgb() {
        return false;
    }

    public long j(float v0, float v1, float v2) {
        float[] fArrK = k(v0, v1, v2);
        float f = fArrK[0];
        float f2 = fArrK[1];
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public final float[] k(float r, float g, float b) {
        return l(new float[]{r, g, b});
    }

    public abstract float[] l(float[] v);

    public float m(float v0, float v1, float v2) {
        return k(v0, v1, v2)[2];
    }

    public long n(float x, float y, float z, float a, c colorSpace) {
        float[] fArrA = a(x, y, z);
        return ki1.a(fArrA[0], fArrA[1], fArrA[2], a, colorSpace);
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) b.h(this.model)) + ')';
    }

    private c(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
