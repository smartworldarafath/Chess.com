package androidx.compose.ui.graphics.colorspace;

import com.google.inputmethod.f16;
import com.google.inputmethod.o48;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/android/o48;", "Landroidx/compose/ui/graphics/colorspace/f;", "a", "Lcom/google/android/o48;", "()Lcom/google/android/o48;", "Connectors", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    private static final o48<f> a;

    static {
        e eVar = e.a;
        int id = eVar.G().getId();
        int id2 = eVar.G().getId();
        j.Companion companion = j.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        a = f16.d(id | (id2 << 6) | (companion.b() << 12), f.INSTANCE.c(eVar.G()), eVar.G().getId() | (eVar.D().getId() << 6) | (companion.b() << 12), new f(eVar.G(), eVar.D(), companion.b(), defaultConstructorMarker), eVar.D().getId() | (eVar.G().getId() << 6) | (companion.b() << 12), new f(eVar.D(), eVar.G(), companion.b(), defaultConstructorMarker));
    }

    public static final o48<f> a() {
        return a;
    }
}
