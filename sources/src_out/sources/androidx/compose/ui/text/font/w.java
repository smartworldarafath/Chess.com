package androidx.compose.ui.text.font;

import com.google.android.r2c;
import com.google.inputmethod.ax5;
import com.google.inputmethod.f43;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0015\u0013\u0007\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0010\"\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/w;", "", "<init>", "()V", "", "value", "Landroidx/compose/ui/text/font/w$a;", "b", "(F)Landroidx/compose/ui/text/font/w$a;", "", "c", "(I)Landroidx/compose/ui/text/font/w$a;", "Landroidx/compose/ui/text/font/x;", "weight", "Landroidx/compose/ui/text/font/t;", "style", "", "settings", "Landroidx/compose/ui/text/font/w$d;", "a", "(Landroidx/compose/ui/text/font/x;I[Landroidx/compose/ui/text/font/w$a;)Landroidx/compose/ui/text/font/w$d;", "d", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final w a = new w();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/w$a;", "", "Lcom/google/android/f43;", "density", "", "b", "(Lcom/google/android/f43;)F", "", "c", "()Z", "needsDensity", "", "a", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/w$b;", "Landroidx/compose/ui/text/font/w$c;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        String getAxisName();

        float b(f43 density);

        /* JADX INFO: renamed from: c */
        boolean getNeedsDensity();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/font/w$b;", "Landroidx/compose/ui/text/font/w$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;F)V", "Lcom/google/android/f43;", "density", "b", "(Lcom/google/android/f43;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "F", "getValue", "()F", "c", "Z", "()Z", "needsDensity", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final float value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean needsDensity;

        public b(String str, float f) {
            this.axisName = str;
            this.value = f;
        }

        @Override // androidx.compose.ui.text.font.w.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.w.a
        public float b(f43 density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.w.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(getAxisName(), bVar.getAxisName()) && this.value == bVar.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/w$c;", "Landroidx/compose/ui/text/font/w$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;I)V", "Lcom/google/android/f43;", "density", "", "b", "(Lcom/google/android/f43;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "I", "getValue", "c", "Z", "()Z", "needsDensity", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean needsDensity;

        public c(String str, int i) {
            this.axisName = str;
            this.value = i;
        }

        @Override // androidx.compose.ui.text.font.w.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.w.a
        public float b(f43 density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.w.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.e(getAxisName(), cVar.getAxisName()) && this.value == cVar.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/w$d;", "", "", "Landroidx/compose/ui/text/font/w$a;", "settings", "<init>", "([Landroidx/compose/ui/text/font/w$a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "needsDensity", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<a> settings;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean needsDensity;

        public d(a... aVarArr) {
            boolean z = false;
            for (a aVar : aVarArr) {
                String axisName = aVar.getAxisName();
                int i = 0;
                for (a aVar2 : aVarArr) {
                    if (Intrinsics.e(aVar2.getAxisName(), axisName)) {
                        i++;
                    }
                }
                if (!(i == 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(axisName);
                    sb.append("' must be unique. Actual [");
                    ArrayList arrayList = new ArrayList();
                    for (a aVar3 : aVarArr) {
                        if (Intrinsics.e(aVar3.getAxisName(), axisName)) {
                            arrayList.add(aVar3);
                        }
                    }
                    sb.append(arrayList);
                    sb.append(']');
                    ax5.a(sb.toString());
                }
                z = z || aVar.getNeedsDensity();
            }
            this.settings = kotlin.collections.f.w1(aVarArr);
            this.needsDensity = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final List<a> b() {
            return this.settings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.e(this.settings, ((d) other).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private w() {
    }

    public final d a(FontWeight weight, int style, a... settings) {
        r2c r2cVar = new r2c(3);
        r2cVar.a(c(weight.q()));
        r2cVar.a(b(style));
        r2cVar.b(settings);
        return new d((a[]) r2cVar.d(new a[r2cVar.c()]));
    }

    public final a b(float value) {
        boolean z = false;
        if (0.0f <= value && value <= 1.0f) {
            z = true;
        }
        if (!z) {
            ax5.a("'ital' must be in 0.0f..1.0f. Actual: " + value);
        }
        return new b("ital", value);
    }

    public final a c(int value) {
        boolean z = false;
        if (1 <= value && value < 1001) {
            z = true;
        }
        if (!z) {
            ax5.a("'wght' value must be in [1, 1000]. Actual: " + value);
        }
        return new c("wght", value);
    }
}
