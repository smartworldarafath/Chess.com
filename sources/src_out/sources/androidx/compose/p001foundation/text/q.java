package androidx.compose.p001foundation.text;

import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/q;", "", "Landroidx/compose/ui/text/b;", "initialText", "<init>", "(Landroidx/compose/ui/text/b;)V", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/f;", "linkRange", "Landroidx/compose/ui/text/r;", "newStyle", "", "c", "(Landroidx/compose/ui/text/b$d;Landroidx/compose/ui/text/r;)V", "a", "Landroidx/compose/ui/text/b;", "b", "()Landroidx/compose/ui/text/b;", "setStyledText", "styledText", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b initialText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private b styledText;

    public q(b bVar) {
        this.initialText = bVar;
        this.styledText = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.Range d(Ref.BooleanRef booleanRef, b.Range range, SpanStyle spanStyle, b.Range range2) {
        b.Range range3;
        b.Range range4;
        if (booleanRef.element && (range2.g() instanceof SpanStyle) && range2.h() == range.h() && range2.f() == range.f()) {
            range3 = new b.Range(spanStyle == null ? new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null) : spanStyle, range2.h(), range2.f());
            range4 = range2;
        } else {
            range3 = range2;
            range4 = range3;
        }
        booleanRef.element = Intrinsics.e(range, range4);
        return range3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getStyledText() {
        return this.styledText;
    }

    public final void c(final b.Range<f> linkRange, final SpanStyle newStyle) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.styledText = this.initialText.p(new Function1() { // from class: androidx.compose.foundation.text.p
            public final Object invoke(Object obj) {
                return q.d(booleanRef, linkRange, newStyle, (b.Range) obj);
            }
        });
    }
}
