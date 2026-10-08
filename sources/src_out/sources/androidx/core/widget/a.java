package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002A\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u0013J%\u0010\u001b\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J%\u0010\u001d\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001d\u0010\u0013J'\u0010 \u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b&\u0010\u0013J'\u0010'\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b'\u0010!J1\u0010(\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b(\u0010%J'\u0010)\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b)\u0010\u0013J'\u0010*\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b*\u0010!J1\u0010+\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b+\u0010%J'\u0010,\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b,\u0010\u0013J'\u0010.\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010-\u001a\u00020\u0005H\u0007¢\u0006\u0004\b.\u0010\u0013J%\u00100\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0007¢\u0006\u0004\b0\u0010\u0013J1\u00101\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b1\u0010\u0017J'\u00102\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b2\u0010\u0013J'\u00103\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010-\u001a\u00020\u0005H\u0007¢\u0006\u0004\b3\u0010\u0013J'\u00104\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b4\u0010\u0013J1\u00105\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b5\u0010\u0017J'\u00106\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b6\u0010\u0013J'\u00107\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b7\u0010\u0013J%\u00109\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u00108\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010\u0010J%\u0010;\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005H\u0007¢\u0006\u0004\b;\u0010\u0013J'\u0010=\u001a\u00020\n*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010<\u001a\u00020\u0005H\u0007¢\u0006\u0004\b=\u0010\u0013J\u001f\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Landroidx/core/widget/a;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "", "viewId", "", "value", "unit", "", "b", "(Landroid/widget/RemoteViews;IFI)V", "", "adjustViewBounds", "c", "(Landroid/widget/RemoteViews;IZ)V", "color", "d", "(Landroid/widget/RemoteViews;II)V", "notNight", "night", "e", "(Landroid/widget/RemoteViews;III)V", "resId", "f", "alpha", "g", "gravity", "h", "Landroid/content/res/ColorStateList;", "tint", "j", "(Landroid/widget/RemoteViews;ILandroid/content/res/ColorStateList;)V", "notNightTint", "nightTint", "k", "(Landroid/widget/RemoteViews;ILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V", "i", "p", "q", "o", "m", "n", "l", "pixels", "r", "maxLines", "s", "t", "u", "v", "w", "x", "y", "z", "clipToOutline", "A", "inflatedId", "B", "layoutResource", "C", "minSdk", "", "method", "a", "(ILjava/lang/String;)V", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final a a = new a();

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J3\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J3\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0011J=\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u0011J3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\u0011J=\u0010\"\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010!2\b\u0010\u0016\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J9\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010\u0011J3\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010\u0011J9\u0010+\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010(J3\u0010,\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010\u0011J3\u0010-\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010\u0011¨\u0006."}, d2 = {"Landroidx/core/widget/a$a;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "rv", "", "id", "", "method", "Landroid/graphics/BlendMode;", "mode", "", "a", "(Landroid/widget/RemoteViews;ILjava/lang/String;Landroid/graphics/BlendMode;)V", "resId", "b", "(Landroid/widget/RemoteViews;ILjava/lang/String;I)V", "c", "d", "e", "notNight", "night", "f", "(Landroid/widget/RemoteViews;ILjava/lang/String;II)V", "Landroid/content/res/ColorStateList;", "colorStateList", "h", "(Landroid/widget/RemoteViews;ILjava/lang/String;Landroid/content/res/ColorStateList;)V", "i", "(Landroid/widget/RemoteViews;ILjava/lang/String;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V", "g", "j", "Landroid/graphics/drawable/Icon;", "n", "(Landroid/widget/RemoteViews;ILjava/lang/String;Landroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;)V", "", "value", "unit", "o", "(Landroid/widget/RemoteViews;ILjava/lang/String;FI)V", "p", "q", "k", "l", "m", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class C0072a {
        public static final C0072a a = new C0072a();

        private C0072a() {
        }

        public static final void a(RemoteViews rv, int id, String method, BlendMode mode) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setBlendMode(id, method, mode);
        }

        public static final void b(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setCharSequence(id, method, resId);
        }

        public static final void c(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setCharSequenceAttr(id, method, resId);
        }

        public static final void d(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColor(id, method, resId);
        }

        public static final void e(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorAttr(id, method, resId);
        }

        public static final void f(RemoteViews rv, int id, String method, int notNight, int night) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorInt(id, method, notNight, night);
        }

        public static final void g(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorStateList(id, method, resId);
        }

        public static final void h(RemoteViews rv, int id, String method, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorStateList(id, method, colorStateList);
        }

        public static final void i(RemoteViews rv, int id, String method, ColorStateList notNight, ColorStateList night) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorStateList(id, method, notNight, night);
        }

        public static final void j(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setColorStateListAttr(id, method, resId);
        }

        public static final void k(RemoteViews rv, int id, String method, float value, int unit) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setFloatDimen(id, method, value, unit);
        }

        public static final void l(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setFloatDimen(id, method, resId);
        }

        public static final void m(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setFloatDimenAttr(id, method, resId);
        }

        public static final void n(RemoteViews rv, int id, String method, Icon notNight, Icon night) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setIcon(id, method, notNight, night);
        }

        public static final void o(RemoteViews rv, int id, String method, float value, int unit) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setIntDimen(id, method, value, unit);
        }

        public static final void p(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setIntDimen(id, method, resId);
        }

        public static final void q(RemoteViews rv, int id, String method, int resId) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv.setIntDimenAttr(id, method, resId);
        }
    }

    private a() {
    }

    public static final void A(RemoteViews remoteViews, int i, boolean z) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        a.a(31, "setClipToOutline");
        remoteViews.setBoolean(i, "setClipToOutline", z);
    }

    public static final void B(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        a.a(16, "setInflatedId");
        remoteViews.setInt(i, "setInflatedId", i2);
    }

    public static final void C(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        a.a(16, "setLayoutResource");
        remoteViews.setInt(i, "setLayoutResource", i2);
    }

    private final void a(int minSdk, String method) {
        if (Build.VERSION.SDK_INT >= minSdk) {
            return;
        }
        throw new IllegalArgumentException((method + " is only available on SDK " + minSdk + " and higher").toString());
    }

    public static final void b(RemoteViews remoteViews, int i, float f, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.o(remoteViews, i, "setColumnWidth", f, i2);
    }

    public static final void c(RemoteViews remoteViews, int i, boolean z) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setBoolean(i, "setAdjustViewBounds", z);
    }

    public static final void d(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setColorFilter", i2);
    }

    public static final void e(RemoteViews remoteViews, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.f(remoteViews, i, "setColorFilter", i2, i3);
    }

    public static final void f(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.d(remoteViews, i, "setColorFilter", i2);
    }

    public static final void g(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setImageAlpha", i2);
    }

    public static final void h(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setGravity", i2);
    }

    public static final void i(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.g(remoteViews, i, "setIndeterminateTintList", i2);
    }

    public static final void j(RemoteViews remoteViews, int i, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.h(remoteViews, i, "setIndeterminateTintList", colorStateList);
    }

    public static final void k(RemoteViews remoteViews, int i, ColorStateList colorStateList, ColorStateList colorStateList2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.i(remoteViews, i, "setIndeterminateTintList", colorStateList, colorStateList2);
    }

    public static final void l(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.g(remoteViews, i, "setProgressBackgroundTintList", i2);
    }

    public static final void m(RemoteViews remoteViews, int i, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.h(remoteViews, i, "setProgressBackgroundTintList", colorStateList);
    }

    public static final void n(RemoteViews remoteViews, int i, ColorStateList colorStateList, ColorStateList colorStateList2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.i(remoteViews, i, "setProgressBackgroundTintList", colorStateList, colorStateList2);
    }

    public static final void o(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.g(remoteViews, i, "setProgressTintList", i2);
    }

    public static final void p(RemoteViews remoteViews, int i, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.h(remoteViews, i, "setProgressTintList", colorStateList);
    }

    public static final void q(RemoteViews remoteViews, int i, ColorStateList colorStateList, ColorStateList colorStateList2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.i(remoteViews, i, "setProgressTintList", colorStateList, colorStateList2);
    }

    public static final void r(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setHeight", i2);
    }

    public static final void s(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setMaxLines", i2);
    }

    public static final void t(RemoteViews remoteViews, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.f(remoteViews, i, "setTextColor", i2, i3);
    }

    public static final void u(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.g(remoteViews, i, "setTextColor", i2);
    }

    public static final void v(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setWidth", i2);
    }

    public static final void w(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setBackgroundColor", i2);
    }

    public static final void x(RemoteViews remoteViews, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        C0072a.f(remoteViews, i, "setBackgroundColor", i2, i3);
    }

    public static final void y(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            C0072a.d(remoteViews, i, "setBackgroundColor", i2);
        } else {
            remoteViews.setInt(i, "setBackgroundResource", i2);
        }
    }

    public static final void z(RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setBackgroundResource", i2);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 \u00162\u00020\u0001:\u0001\u0018B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\"R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\"¨\u0006$"}, d2 = {"Landroidx/core/widget/a$b;", "", "", "ids", "", "Landroid/widget/RemoteViews;", "views", "", "hasStableIds", "", "viewTypeCount", "<init>", "([J[Landroid/widget/RemoteViews;ZI)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "position", "", "b", "(I)J", "c", "(I)Landroid/widget/RemoteViews;", "e", "()Z", "a", "[J", "mIds", "[Landroid/widget/RemoteViews;", "mViews", "Z", "mHasStableIds", "d", "I", "mViewTypeCount", "()I", "itemCount", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        private static final C0073a e = new C0073a(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long[] mIds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final RemoteViews[] mViews;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean mHasStableIds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int mViewTypeCount;

        /* JADX INFO: renamed from: androidx.core.widget.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/widget/a$b$a;", "", "<init>", "()V", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class C0073a {
            public /* synthetic */ C0073a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0073a() {
            }
        }

        public b(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
            Intrinsics.checkNotNullParameter(jArr, "ids");
            Intrinsics.checkNotNullParameter(remoteViewsArr, "views");
            this.mIds = jArr;
            this.mViews = remoteViewsArr;
            this.mHasStableIds = z;
            this.mViewTypeCount = i;
            if (jArr.length != remoteViewsArr.length) {
                throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
            }
            if (i < 1) {
                throw new IllegalArgumentException("View type count must be >= 1");
            }
            ArrayList arrayList = new ArrayList(remoteViewsArr.length);
            for (RemoteViews remoteViews : remoteViewsArr) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = m.p0(arrayList).size();
            if (size <= i) {
                return;
            }
            throw new IllegalArgumentException(("View type count is set to " + i + ", but the collection contains " + size + " different layout ids").toString());
        }

        public final int a() {
            return this.mIds.length;
        }

        public final long b(int position) {
            return this.mIds[position];
        }

        public final RemoteViews c(int position) {
            return this.mViews[position];
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMViewTypeCount() {
            return this.mViewTypeCount;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getMHasStableIds() {
            return this.mHasStableIds;
        }

        public b(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            long[] jArr = new long[i];
            this.mIds = jArr;
            parcel.readLongArray(jArr);
            Parcelable.Creator creator = RemoteViews.CREATOR;
            Intrinsics.checkNotNullExpressionValue(creator, "CREATOR");
            RemoteViews[] remoteViewsArr = new RemoteViews[i];
            parcel.readTypedArray(remoteViewsArr, creator);
            this.mViews = (RemoteViews[]) f.b1(remoteViewsArr);
            this.mHasStableIds = parcel.readInt() == 1;
            this.mViewTypeCount = parcel.readInt();
        }
    }
}
