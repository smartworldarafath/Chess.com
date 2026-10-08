package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.text.selection.Selection;
import androidx.compose.p001foundation.text.selection.f;
import com.google.inputmethod.heb;
import com.google.inputmethod.vac;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/f;", "", "Lcom/google/android/heb;", "layout", "Landroidx/compose/foundation/text/selection/e;", "a", "(Lcom/google/android/heb;)Landroidx/compose/foundation/text/selection/e;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/f$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/selection/f;", "b", "Landroidx/compose/foundation/text/selection/f;", "l", "()Landroidx/compose/foundation/text/selection/f;", "None", "c", "getCharacter", "Character", "d", "n", "Word", "e", "m", "Paragraph", "f", "k", "CharacterWithWordAccelerate", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final f None = new f() { // from class: com.google.android.mdb
            @Override // androidx.compose.p001foundation.text.selection.f
            public final Selection a(heb hebVar) {
                return f.Companion.h(hebVar);
            }
        };

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final f Character = new f() { // from class: com.google.android.ndb
            @Override // androidx.compose.p001foundation.text.selection.f
            public final Selection a(heb hebVar) {
                return f.Companion.f(hebVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final f Word = new f() { // from class: com.google.android.odb
            @Override // androidx.compose.p001foundation.text.selection.f
            public final Selection a(heb hebVar) {
                return f.Companion.j(hebVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final f Paragraph = new f() { // from class: com.google.android.pdb
            @Override // androidx.compose.p001foundation.text.selection.f
            public final Selection a(heb hebVar) {
                return f.Companion.i(hebVar);
            }
        };

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final f CharacterWithWordAccelerate = new f() { // from class: com.google.android.qdb
            @Override // androidx.compose.p001foundation.text.selection.f
            public final Selection a(heb hebVar) {
                return f.Companion.g(hebVar);
            }
        };

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0030a implements a {
            public static final C0030a a = new C0030a();

            C0030a() {
            }

            @Override // androidx.compose.p001foundation.text.selection.a
            public final long a(d dVar, int i) {
                return vac.c(dVar.c(), i);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.f$a$b */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements a {
            public static final b a = new b();

            b() {
            }

            @Override // androidx.compose.p001foundation.text.selection.a
            public final long a(d dVar, int i) {
                return dVar.getTextLayoutResult().C(i);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection f(heb hebVar) {
            return g.h(None.a(hebVar), hebVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection g(heb hebVar) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo anchorInfoL;
            Selection.AnchorInfo start;
            Selection.AnchorInfo end2;
            Selection previousSelection = hebVar.getPreviousSelection();
            if (previousSelection == null) {
                return Word.a(hebVar);
            }
            if (hebVar.getIsStartHandle()) {
                end = previousSelection.getStart();
                anchorInfoL = g.l(hebVar, hebVar.f(), end);
                end2 = previousSelection.getEnd();
                start = anchorInfoL;
            } else {
                end = previousSelection.getEnd();
                anchorInfoL = g.l(hebVar, hebVar.e(), end);
                start = previousSelection.getStart();
                end2 = anchorInfoL;
            }
            if (Intrinsics.e(anchorInfoL, end)) {
                return previousSelection;
            }
            return g.h(new Selection(start, end2, hebVar.c() == CrossStatus.CROSSED || (hebVar.c() == CrossStatus.COLLAPSED && start.getOffset() > end2.getOffset())), hebVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection h(heb hebVar) {
            return new Selection(hebVar.f().a(hebVar.f().getRawStartHandleOffset()), hebVar.e().a(hebVar.e().getRawEndHandleOffset()), hebVar.c() == CrossStatus.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection i(heb hebVar) {
            return g.e(hebVar, C0030a.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection j(heb hebVar) {
            return g.e(hebVar, b.a);
        }

        public final f k() {
            return CharacterWithWordAccelerate;
        }

        public final f l() {
            return None;
        }

        public final f m() {
            return Paragraph;
        }

        public final f n() {
            return Word;
        }
    }

    Selection a(heb layout);
}
