package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/google/android/ne9;", "", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ne9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.ne9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/google/android/ne9$a;", "", "<init>", "()V", "Lcom/google/android/ne9;", "b", "Lcom/google/android/ne9;", "a", "()Lcom/google/android/ne9;", "Default", "c", "getCrosshair", "Crosshair", "d", "Text", "e", "Hand", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final ne9 Default = re9.c();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final ne9 Crosshair = re9.b();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final ne9 Text = re9.e();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final ne9 Hand = re9.d();

        private Companion() {
        }

        public final ne9 a() {
            return Default;
        }

        public final ne9 b() {
            return Hand;
        }

        public final ne9 c() {
            return Text;
        }
    }
}
