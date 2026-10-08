package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/google/android/mj3;", "", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Lcom/google/android/okb;", "shadow", "Lcom/google/android/lj3;", "e", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Lcom/google/android/okb;)Lcom/google/android/lj3;", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface mj3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.mj3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/mj3$a;", "", "<init>", "()V", "Lcom/google/android/mj3;", "b", "Lcom/google/android/mj3;", "a", "()Lcom/google/android/mj3;", "Default", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final mj3 Default = C0115a.c;

        /* JADX INFO: renamed from: com.google.android.mj3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/google/android/xkb;", "shape", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Lcom/google/android/okb;", "dropShadow", "Lcom/google/android/lj3;", "e", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Lcom/google/android/okb;)Lcom/google/android/lj3;"}, k = 3, mv = {2, 1, 0})
        static final class C0115a implements mj3 {
            public static final C0115a c = new C0115a();

            C0115a() {
            }

            @Override // com.google.inputmethod.mj3
            public final lj3 e(xkb xkbVar, long j, LayoutDirection layoutDirection, f43 f43Var, Shadow shadow) {
                return new lj3(shadow, xkbVar.mo5createOutlinePq9zytI(j, layoutDirection, f43Var));
            }
        }

        private Companion() {
        }

        public final mj3 a() {
            return Default;
        }
    }

    lj3 e(xkb shape, long size, LayoutDirection layoutDirection, f43 density, Shadow shadow);
}
