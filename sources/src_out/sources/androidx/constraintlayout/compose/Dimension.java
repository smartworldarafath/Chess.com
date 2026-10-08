package androidx.constraintlayout.compose;

import com.google.inputmethod.ma3;
import com.google.inputmethod.n6c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "a", "Companion", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Dimension {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/Dimension;", "b", "()Landroidx/constraintlayout/compose/Dimension;", "wrapContent", "Landroidx/constraintlayout/compose/Dimension$a;", "a", "()Landroidx/constraintlayout/compose/Dimension$a;", "fillToConstraints", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final a a() {
            return new ma3(new Function1<n6c, androidx.constraintlayout.core.state.b>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$fillToConstraints$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.constraintlayout.core.state.b invoke(n6c n6cVar) {
                    Intrinsics.checkNotNullParameter(n6cVar, "it");
                    androidx.constraintlayout.core.state.b bVarC = androidx.constraintlayout.core.state.b.c(androidx.constraintlayout.core.state.b.k);
                    Intrinsics.checkNotNullExpressionValue(bVarC, "Suggested(SPREAD_DIMENSION)");
                    return bVarC;
                }
            });
        }

        public final Dimension b() {
            return new ma3(new Function1<n6c, androidx.constraintlayout.core.state.b>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$wrapContent$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.constraintlayout.core.state.b invoke(n6c n6cVar) {
                    Intrinsics.checkNotNullParameter(n6cVar, "it");
                    androidx.constraintlayout.core.state.b bVarB = androidx.constraintlayout.core.state.b.b(androidx.constraintlayout.core.state.b.j);
                    Intrinsics.checkNotNullExpressionValue(bVarB, "Fixed(WRAP_DIMENSION)");
                    return bVarB;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$a;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a extends Dimension {
    }
}
