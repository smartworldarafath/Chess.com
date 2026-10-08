package androidx.compose.p001foundation.text;

import android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/b;", "", "", "value", "a", "(I)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/b$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/b;", "b", "()I", "ActionModeCutDrawable", "a", "ActionModeCopyDrawable", "c", "ActionModePasteDrawable", "d", "ActionModeSelectAllDrawable", "e", "ID_NULL", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.a(R.attr.actionModeCopyDrawable);
        }

        public final int b() {
            return b.a(R.attr.actionModeCutDrawable);
        }

        public final int c() {
            return b.a(R.attr.actionModePasteDrawable);
        }

        public final int d() {
            return b.a(R.attr.actionModeSelectAllDrawable);
        }

        public final int e() {
            return b.a(0);
        }

        private Companion() {
        }
    }

    public static int a(int i) {
        return i;
    }
}
