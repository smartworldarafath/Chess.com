package com.google.inputmethod;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/tic;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "isDark", "d", "(Z)I", "e", "a", "I", "b", "getDarkScrim$activity", "()I", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tic {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int lightScrim;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int darkScrim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int nightMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<Resources, Boolean> detectDarkMode;

    /* JADX INFO: renamed from: com.google.android.tic$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/tic$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Lcom/google/android/tic;", "d", "(IILkotlin/jvm/functions/Function1;)Lcom/google/android/tic;", "scrim", "g", "(I)Lcom/google/android/tic;", "i", "(II)Lcom/google/android/tic;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ tic e(Companion companion, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                function1 = new Function1() { // from class: com.google.android.sic
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(tic.Companion.f((Resources) obj2));
                    }
                };
            }
            return companion.d(i, i2, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "<unused var>");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "<unused var>");
            return false;
        }

        public final tic d(int lightScrim, int darkScrim, Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new tic(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        public final tic g(int scrim) {
            return new tic(scrim, scrim, 2, new Function1() { // from class: com.google.android.ric
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(tic.Companion.h((Resources) obj));
                }
            }, null);
        }

        public final tic i(int scrim, int darkScrim) {
            return new tic(scrim, darkScrim, 1, new Function1() { // from class: com.google.android.qic
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(tic.Companion.j((Resources) obj));
                }
            }, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ tic(int i, int i2, int i3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }

    public static final tic a(int i) {
        return INSTANCE.g(i);
    }

    public final Function1<Resources, Boolean> b() {
        return this.detectDarkMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int d(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int e(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private tic(int i, int i2, int i3, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = function1;
    }
}
