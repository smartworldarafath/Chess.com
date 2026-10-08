package androidx.p008glance.p009appwidget;

import androidx.p008glance.p009appwidget.proto.LayoutProto$DimensionType;
import com.google.inputmethod.ia3;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/n;", "", "<init>", "()V", "Lcom/google/android/ia3;", "dimension", "Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "a", "(Lcom/google/android/ia3;)Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n {
    public static final n a = new n();

    private n() {
    }

    public final LayoutProto$DimensionType a(ia3 dimension) {
        return dimension instanceof ia3.b ? LayoutProto$DimensionType.EXPAND : LayoutProto$DimensionType.WRAP;
    }
}
