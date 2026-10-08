package androidx.core.p006view;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "a", "allViews", "core-ktx"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewKt {
    public static final Sequence<View> a(View view) {
        return d.b(new ggb(view, null));
    }

    public static final Sequence<ViewParent> b(View view) {
        return d.q(view.getParent(), ViewKt$ancestors$1.a);
    }
}
