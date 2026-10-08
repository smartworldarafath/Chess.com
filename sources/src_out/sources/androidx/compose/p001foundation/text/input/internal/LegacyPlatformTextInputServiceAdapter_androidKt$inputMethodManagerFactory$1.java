package androidx.compose.p001foundation.text.input.internal;

import android.view.View;
import com.google.inputmethod.gy5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements Function1<View, gy5> {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 a = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, gy5.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final gy5 invoke(View view) {
        return new gy5(view);
    }
}
