package androidx.compose.p001foundation;

import android.os.Build;
import android.view.View;
import com.google.inputmethod.f43;
import com.google.inputmethod.gb9;
import com.google.inputmethod.hb9;
import com.google.inputmethod.ib9;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/u;", "", "Landroid/view/View;", "view", "", "useTextDefault", "Lcom/google/android/jf3;", "size", "Lcom/google/android/ff3;", "cornerRadius", "elevation", "clippingEnabled", "Lcom/google/android/f43;", "density", "", "initialZoom", "Lcom/google/android/gb9;", "a", "(Landroid/view/View;ZJFFZLcom/google/android/f43;F)Lcom/google/android/gb9;", "b", "()Z", "canUpdateZoom", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.foundation.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/u$a;", "", "<init>", "()V", "Landroidx/compose/foundation/u;", "a", "()Landroidx/compose/foundation/u;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final u a() {
            if (t.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? hb9.b : ib9.b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    gb9 a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, f43 density, float initialZoom);

    boolean b();
}
