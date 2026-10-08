package androidx.compose.ui.text.font;

import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/l0;", "Lcom/google/android/q6c;", "", "", "e", "()Z", "cacheable", "b", "a", "Landroidx/compose/ui/text/font/l0$a;", "Landroidx/compose/ui/text/font/l0$b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l0 extends q6c<Object> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/l0$a;", "Landroidx/compose/ui/text/font/l0;", "Lcom/google/android/q6c;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "a", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "", "e", "()Z", "cacheable", "getValue", "()Ljava/lang/Object;", "value", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements l0, q6c<Object> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AsyncFontListLoader current;

        public a(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.l0
        /* JADX INFO: renamed from: e */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @Override // com.google.inputmethod.q6c
        public Object getValue() {
            return this.current.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/l0$b;", "Landroidx/compose/ui/text/font/l0;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "e", "()Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean cacheable;

        public b(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }

        @Override // androidx.compose.ui.text.font.l0
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // com.google.inputmethod.q6c
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ b(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }

    /* JADX INFO: renamed from: e */
    boolean getCacheable();
}
