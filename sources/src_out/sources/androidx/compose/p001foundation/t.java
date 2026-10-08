package androidx.compose.p001foundation;

import android.os.Build;
import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jf3;
import com.google.inputmethod.od7;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function1;", "Lcom/google/android/f43;", "Lcom/google/android/rn8;", "sourceCenter", "magnifierCenter", "Lcom/google/android/jf3;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lcom/google/android/ff3;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/u;", "platformMagnifierFactory", "e", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/u;)Landroidx/compose/ui/b;", "", "sdkVersion", "c", "(I)Z", "other", "a", "(FF)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "b", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    private static final SemanticsPropertyKey<Function0<rn8>> a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (Function2) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f, float f2) {
        return (Float.isNaN(f) && Float.isNaN(f2)) || f == f2;
    }

    public static final SemanticsPropertyKey<Function0<rn8>> b() {
        return a;
    }

    public static final boolean c(int i) {
        return i >= 28;
    }

    public static /* synthetic */ boolean d(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return c(i);
    }

    public static final b e(b bVar, Function1<? super f43, rn8> function1, Function1<? super f43, rn8> function2, Function1<? super jf3, Unit> function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar) {
        if (d(0, 1, null)) {
            return bVar.then(new od7(function1, function2, function3, f, z, j, f2, f3, z2, uVar == null ? u.INSTANCE.a() : uVar, null));
        }
        return bVar;
    }

    public static /* synthetic */ b f(b bVar, Function1 function1, Function1 function2, Function1 function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            f = Float.NaN;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            j = jf3.INSTANCE.a();
        }
        if ((i & 64) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        if ((i & 128) != 0) {
            f3 = ff3.INSTANCE.c();
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        if ((i & 512) != 0) {
            uVar = null;
        }
        return e(bVar, function1, function2, function3, f, z, j, f2, f3, z2, uVar);
    }
}
