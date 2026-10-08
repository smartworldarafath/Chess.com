package androidx.compose.p001foundation.text.input.internal;

import com.google.inputmethod.zh7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements Function1<zh7, Unit> {
    final /* synthetic */ b.a $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(b.a aVar) {
        super(1, Intrinsics.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m(((zh7) obj).getValues());
        return Unit.a;
    }

    public final void m(float[] fArr) {
        AndroidLegacyPlatformTextInputServiceAdapter.t(this.$node, fArr);
    }
}
