package androidx.compose.ui.scrollcapture;

import com.google.inputmethod.r58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, r58.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    public final void a(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((r58) ((AdaptedFunctionReference) this).receiver).c(scrollCaptureCandidate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((ScrollCaptureCandidate) obj);
        return Unit.a;
    }
}
