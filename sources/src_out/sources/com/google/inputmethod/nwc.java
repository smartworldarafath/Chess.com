package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/nwc;", "", "Lcom/google/android/gba;", "textBounds", "rect", "", "a", "(Lcom/google/android/gba;Lcom/google/android/gba;)Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface nwc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.nwc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/google/android/nwc$a;", "", "<init>", "()V", "Lcom/google/android/nwc;", "b", "Lcom/google/android/nwc;", "g", "()Lcom/google/android/nwc;", "AnyOverlap", "c", "getContainsAll", "ContainsAll", "d", "h", "ContainsCenter", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final nwc AnyOverlap = new nwc() { // from class: com.google.android.kwc
            @Override // com.google.inputmethod.nwc
            public final boolean a(gba gbaVar, gba gbaVar2) {
                return nwc.Companion.d(gbaVar, gbaVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final nwc ContainsAll = new nwc() { // from class: com.google.android.lwc
            @Override // com.google.inputmethod.nwc
            public final boolean a(gba gbaVar, gba gbaVar2) {
                return nwc.Companion.e(gbaVar, gbaVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final nwc ContainsCenter = new nwc() { // from class: com.google.android.mwc
            @Override // com.google.inputmethod.nwc
            public final boolean a(gba gbaVar, gba gbaVar2) {
                return nwc.Companion.f(gbaVar, gbaVar2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(gba gbaVar, gba gbaVar2) {
            return gbaVar.s(gbaVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(gba gbaVar, gba gbaVar2) {
            return !gbaVar2.r() && gbaVar.getLeft() >= gbaVar2.getLeft() && gbaVar.getRight() <= gbaVar2.getRight() && gbaVar.getTop() >= gbaVar2.getTop() && gbaVar.getBottom() <= gbaVar2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(gba gbaVar, gba gbaVar2) {
            return gbaVar2.b(gbaVar.h());
        }

        public final nwc g() {
            return AnyOverlap;
        }

        public final nwc h() {
            return ContainsCenter;
        }
    }

    boolean a(gba textBounds, gba rect);
}
