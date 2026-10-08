package com.google.inputmethod;

import androidx.compose.ui.text.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/google/android/nce;", "", "Landroidx/compose/ui/text/b;", "text", "Lcom/google/android/jed;", "a", "(Landroidx/compose/ui/text/b;)Lcom/google/android/jed;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface nce {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.nce$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/android/nce$a;", "", "<init>", "()V", "Lcom/google/android/nce;", "b", "Lcom/google/android/nce;", "c", "()Lcom/google/android/nce;", "getNone$annotations", "None", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final nce None = new nce() { // from class: com.google.android.mce
            @Override // com.google.inputmethod.nce
            public final TransformedText a(b bVar) {
                return nce.Companion.b(bVar);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText b(b bVar) {
            return new TransformedText(bVar, zn8.INSTANCE.a());
        }

        public final nce c() {
            return None;
        }
    }

    TransformedText a(b text);
}
