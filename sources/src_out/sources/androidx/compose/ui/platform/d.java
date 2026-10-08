package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.gba;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/a;", "<init>", "()V", "", "lineNumber", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "i", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "", "text", "Lcom/google/android/vxc;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "j", "(Ljava/lang/String;Lcom/google/android/vxc;Landroidx/compose/ui/semantics/SemanticsNode;)V", "current", "", "a", "(I)[I", "b", "c", "Lcom/google/android/vxc;", "d", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends a {
    private static d h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SemanticsNode node;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Rect tempRect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int g = 8;
    private static final ResolvedTextDirection i = ResolvedTextDirection.Rtl;
    private static final ResolvedTextDirection j = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/d;", "a", "()Landroidx/compose/ui/platform/d;", "pageInstance", "Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            if (d.h == null) {
                d.h = new d(null);
            }
            d dVar = d.h;
            Intrinsics.h(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return dVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int lineNumber, ResolvedTextDirection direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        TextLayoutResult textLayoutResult2 = null;
        if (textLayoutResult == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult = null;
        }
        int iU = textLayoutResult.u(lineNumber);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult3 = null;
        }
        if (direction != textLayoutResult3.y(iU)) {
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.x("layoutResult");
            } else {
                textLayoutResult2 = textLayoutResult4;
            }
            return textLayoutResult2.u(lineNumber);
        }
        TextLayoutResult textLayoutResult5 = this.layoutResult;
        if (textLayoutResult5 == null) {
            Intrinsics.x("layoutResult");
            textLayoutResult5 = null;
        }
        return TextLayoutResult.p(textLayoutResult5, lineNumber, false, 2, null) - 1;
    }

    @Override // com.google.inputmethod.d6
    public int[] a(int current) {
        int iN;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.x("node");
                semanticsNode = null;
            }
            gba gbaVarK = semanticsNode.k();
            int iRound = Math.round(gbaVarK.getBottom() - gbaVarK.getTop());
            int iE = kotlin.ranges.g.e(0, current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iE);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) + iRound;
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult4 = null;
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult5 = null;
            }
            if (fV < textLayoutResult4.v(textLayoutResult5.n() - 1)) {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                if (textLayoutResult6 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult6;
                }
                iN = textLayoutResult.r(fV);
            } else {
                TextLayoutResult textLayoutResult7 = this.layoutResult;
                if (textLayoutResult7 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult7;
                }
                iN = textLayoutResult.n();
            }
            return c(iE, i(iN - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.inputmethod.d6
    public int[] b(int current) {
        int iR;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.node;
            if (semanticsNode == null) {
                Intrinsics.x("node");
                semanticsNode = null;
            }
            gba gbaVarK = semanticsNode.k();
            int iRound = Math.round(gbaVarK.getBottom() - gbaVarK.getTop());
            int iJ = kotlin.ranges.g.j(d().length(), current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult2 = null;
            }
            int iQ = textLayoutResult2.q(iJ);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.x("layoutResult");
                textLayoutResult3 = null;
            }
            float fV = textLayoutResult3.v(iQ) - iRound;
            if (fV > 0.0f) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.x("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult4;
                }
                iR = textLayoutResult.r(fV);
            } else {
                iR = 0;
            }
            if (iJ == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, i), iJ);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String text, TextLayoutResult layoutResult, SemanticsNode node) {
        f(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    private d() {
        this.tempRect = new Rect();
    }
}
