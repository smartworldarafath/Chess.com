package androidx.p008glance.p009appwidget;

import androidx.p008glance.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/g;", "", "a", "(Landroidx/glance/g;)Z", "isSelectableGroup", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RadioButtonKt {
    public static final boolean a(g gVar) {
        return gVar.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.RadioButtonKt$isSelectableGroup$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return false;
            }
        });
    }
}
