package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.tc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\bÇ\u0002\u0018\u00002\u00020\u0001:\u00062\u001a)B.$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ/\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010 \u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bR \u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010%R \u0010+\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010%R \u00101\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R \u00104\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010-\u0012\u0004\b3\u0010\u0003\u001a\u0004\b,\u0010/R \u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00105\u0012\u0004\b7\u0010\u0003\u001a\u0004\b2\u00106R \u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00105\u0012\u0004\b;\u0010\u0003\u001a\u0004\b:\u00106R \u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00105\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u00106R \u0010A\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u00105\u0012\u0004\b@\u0010\u0003\u001a\u0004\b9\u00106¨\u0006C"}, d2 = {"Landroidx/compose/foundation/layout/c;", "", "<init>", "()V", "Lcom/google/android/ff3;", "space", "Landroidx/compose/foundation/layout/c$f;", "r", "(F)Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/tc$b;", "alignment", "Landroidx/compose/foundation/layout/c$e;", "s", "(FLcom/google/android/tc$b;)Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/tc$c;", "Landroidx/compose/foundation/layout/c$n;", "t", "(FLcom/google/android/tc$c;)Landroidx/compose/foundation/layout/c$n;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "n", "(I[I[IZ)V", "m", "([I[IZ)V", "l", "q", "p", "o", "b", "Landroidx/compose/foundation/layout/c$e;", "j", "()Landroidx/compose/foundation/layout/c$e;", "getStart$annotations", "Start", "c", "f", "getEnd$annotations", "End", "d", "Landroidx/compose/foundation/layout/c$n;", "k", "()Landroidx/compose/foundation/layout/c$n;", "getTop$annotations", "Top", "e", "getBottom$annotations", "Bottom", "Landroidx/compose/foundation/layout/c$f;", "()Landroidx/compose/foundation/layout/c$f;", "getCenter$annotations", "Center", "g", "i", "getSpaceEvenly$annotations", "SpaceEvenly", "h", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround$annotations", "SpaceAround", "a", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final c a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final e Start = new l();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final e End = new d();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final n Top = new m();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final n Bottom = new b();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final f Center = new C0019c();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final f SpaceEvenly = new i();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final f SpaceBetween = new h();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final f SpaceAround = new g();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u000e\u0010\u0011R \u0010\u0018\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\u0011R \u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\u0011R \u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0011R \u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u0011¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/c$a;", "", "<init>", "()V", "Lcom/google/android/ff3;", "space", "Landroidx/compose/foundation/layout/c$f;", "e", "(F)Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/tc$b;", "alignment", "Landroidx/compose/foundation/layout/c$e;", "f", "(FLcom/google/android/tc$b;)Landroidx/compose/foundation/layout/c$e;", "b", "Landroidx/compose/foundation/layout/c$e;", "c", "()Landroidx/compose/foundation/layout/c$e;", "getLeft$annotations", "Left", "getCenter$annotations", "Center", "d", "getRight$annotations", "Right", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final e Left = new b();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final e Center = new C0017a();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final e Right = new C0018c();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final e SpaceBetween = new e();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final e SpaceEvenly = new f();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final e SpaceAround = new d();

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$a", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0017a implements e {
            C0017a() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.l(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$b", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements e {
            b() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.m(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$c", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0018c implements e {
            C0018c() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.n(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$d", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements e {
            d() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.o(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$e", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements e {
            e() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.p(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$a$f", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements e {
            f() {
            }

            @Override // androidx.compose.foundation.layout.c.e
            public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                c.a.q(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int g(tc.b bVar, int i, LayoutDirection layoutDirection) {
            return bVar.a(0, i, layoutDirection);
        }

        public final e b() {
            return Center;
        }

        public final e c() {
            return Left;
        }

        public final e d() {
            return Right;
        }

        public final f e(float space) {
            k kVar = null;
            return new j(space, false, kVar, kVar);
        }

        public final e f(float space, final tc.b alignment) {
            return new j(space, false, new k() { // from class: com.google.android.o00
                @Override // androidx.compose.foundation.layout.c.k
                public final int a(int i, LayoutDirection layoutDirection) {
                    return c.a.g(alignment, i, layoutDirection);
                }
            }, null);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/c$b", "Landroidx/compose/foundation/layout/c$n;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "outPositions", "", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements n {
        b() {
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.n(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/c$c", "Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ff3;", "F", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0019c implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float spacing = ff3.i(0);

        C0019c() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.l(i, iArr, iArr2, false);
            } else {
                c.a.l(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.l(i, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.c.e, androidx.compose.foundation.layout.c.n
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$d", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e {
        d() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.n(i, iArr, iArr2, false);
            } else {
                c.a.m(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c$e;", "", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "Lcom/google/android/ff3;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface e {
        void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return ff3.i(0);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c$f;", "Landroidx/compose/foundation/layout/c$e;", "Landroidx/compose/foundation/layout/c$n;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f extends e, n {
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/c$g", "Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ff3;", "F", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float spacing = ff3.i(0);

        g() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.o(i, iArr, iArr2, false);
            } else {
                c.a.o(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.o(i, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.c.e, androidx.compose.foundation.layout.c.n
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/c$h", "Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ff3;", "F", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float spacing = ff3.i(0);

        h() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.p(i, iArr, iArr2, false);
            } else {
                c.a.p(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.p(i, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.c.e, androidx.compose.foundation.layout.c.n
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/c$i", "Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/ff3;", "F", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float spacing = ff3.i(0);

        i() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.q(i, iArr, iArr2, false);
            } else {
                c.a.q(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.q(i, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.c.e, androidx.compose.foundation.layout.c.n
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/c$j;", "Landroidx/compose/foundation/layout/c$f;", "Lcom/google/android/ff3;", "space", "", "rtlMirror", "Landroidx/compose/foundation/layout/c$k;", "alignment", "<init>", "(FZLandroidx/compose/foundation/layout/c$k;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getSpace-D9Ej5fM", "()F", "b", "Z", "getRtlMirror", "()Z", "c", "Landroidx/compose/foundation/layout/c$k;", "getAlignment", "()Landroidx/compose/foundation/layout/c$k;", "d", "getSpacing-D9Ej5fM", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j implements f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float space;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean rtlMirror;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final k alignment;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float spacing;

        public /* synthetic */ j(float f, boolean z, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, kVar);
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            if (iArr.length == 0) {
                return;
            }
            int iO1 = f43Var.O1(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int iMax = Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = Math.min(iO1, iMax);
                    i = iArr2[i4] - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i5 < length2) {
                    int i9 = iArr[i5];
                    int iMin2 = Math.min(i6, i - i9);
                    iArr2[i8] = iMin2;
                    int iMin3 = Math.min(iO1, (i - iMin2) - i9);
                    int i10 = iArr2[i8] + i9 + iMin3;
                    i5++;
                    i7 = iMin3;
                    i6 = i10;
                    i8++;
                }
                i2 = i - (i6 - i7);
            }
            k kVar = this.alignment;
            if (kVar == null || i2 <= 0) {
                return;
            }
            int iA = kVar.a(i2, layoutDirection);
            if (z) {
                iA -= i2;
            }
            if (iA != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iA;
                }
            }
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            a(f43Var, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return ff3.k(this.space, jVar.space) && this.rtlMirror == jVar.rtlMirror && Intrinsics.e(this.alignment, jVar.alignment);
        }

        @Override // androidx.compose.foundation.layout.c.e, androidx.compose.foundation.layout.c.n
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int iL = ((ff3.l(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            k kVar = this.alignment;
            return iL + (kVar == null ? 0 : kVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) ff3.m(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        private j(float f, boolean z, k kVar) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = kVar;
            this.spacing = f;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/c$k;", "", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "a", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface k {
        int a(int size, LayoutDirection layoutDirection);
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/c$l", "Landroidx/compose/foundation/layout/c$e;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "a", "(Lcom/google/android/f43;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements e {
        l() {
        }

        @Override // androidx.compose.foundation.layout.c.e
        public void a(f43 f43Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                c.a.m(iArr, iArr2, false);
            } else {
                c.a.n(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/c$m", "Landroidx/compose/foundation/layout/c$n;", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "outPositions", "", "arrange", "(Lcom/google/android/f43;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements n {
        m() {
        }

        @Override // androidx.compose.foundation.layout.c.n
        public void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2) {
            c.a.m(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c$n;", "", "Lcom/google/android/f43;", "", "totalSize", "", "sizes", "outPositions", "", "arrange", "(Lcom/google/android/f43;I[I[I)V", "Lcom/google/android/ff3;", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface n {
        void arrange(f43 f43Var, int i, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getSpacing() {
            return ff3.i(0);
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(int i2, LayoutDirection layoutDirection) {
        return tc.INSTANCE.k().a(0, i2, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(tc.b bVar, int i2, LayoutDirection layoutDirection) {
        return bVar.a(0, i2, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(tc.c cVar, int i2, LayoutDirection layoutDirection) {
        return cVar.a(0, i2);
    }

    public final n d() {
        return Bottom;
    }

    public final f e() {
        return Center;
    }

    public final e f() {
        return End;
    }

    public final f g() {
        return SpaceAround;
    }

    public final f h() {
        return SpaceBetween;
    }

    public final f i() {
        return SpaceEvenly;
    }

    public final e j() {
        return Start;
    }

    public final n k() {
        return Top;
    }

    public final void l(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float f2 = (totalSize - i3) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = size[i2];
                outPosition[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = size[length2];
            outPosition[length2] = Math.round(f2);
            f2 += i7;
        }
    }

    public final void m(int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = size[i2];
                outPosition[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = size[length2];
            outPosition[length2] = i2;
            i2 += i6;
        }
    }

    public final void n(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = totalSize - i3;
        if (!reverseInput) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = size[length2];
            outPosition[length2] = i5;
            i5 += i8;
        }
    }

    public final void o(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = !(size.length == 0) ? (totalSize - i3) / size.length : 0.0f;
        float f2 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = Math.round(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public final void p(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float fMax = (totalSize - i3) / Math.max(kotlin.collections.f.v0(size), 1);
        float f2 = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i5 = size[length];
                outPosition[length] = Math.round(f2);
                f2 += i5 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = size[i2];
            outPosition[i6] = Math.round(f2);
            f2 += i7 + fMax;
            i2++;
            i6++;
        }
    }

    public final void q(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        float length = (totalSize - i3) / (size.length + 1);
        if (reverseInput) {
            float f2 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i5 = size[length2];
                outPosition[length2] = Math.round(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = size.length;
        float f3 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = size[i2];
            outPosition[i6] = Math.round(f3);
            f3 += i7 + length;
            i2++;
            i6++;
        }
    }

    public final f r(float space) {
        return new j(space, true, new k() { // from class: com.google.android.m00
            @Override // androidx.compose.foundation.layout.c.k
            public final int a(int i2, LayoutDirection layoutDirection) {
                return c.u(i2, layoutDirection);
            }
        }, null);
    }

    public final e s(float space, final tc.b alignment) {
        return new j(space, true, new k() { // from class: com.google.android.n00
            @Override // androidx.compose.foundation.layout.c.k
            public final int a(int i2, LayoutDirection layoutDirection) {
                return c.v(alignment, i2, layoutDirection);
            }
        }, null);
    }

    public final n t(float space, final tc.c alignment) {
        return new j(space, false, new k() { // from class: com.google.android.l00
            @Override // androidx.compose.foundation.layout.c.k
            public final int a(int i2, LayoutDirection layoutDirection) {
                return c.w(alignment, i2, layoutDirection);
            }
        }, null);
    }
}
