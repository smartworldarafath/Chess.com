package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.r43;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.ci2;
import com.google.inputmethod.ci7;
import com.google.inputmethod.dy5;
import com.google.inputmethod.gba;
import com.google.inputmethod.wl;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "Lcom/google/android/ci7;", "rootPositionCalculator", "Lcom/google/android/dy5;", "inputMethodManager", "<init>", "(Lcom/google/android/ci7;Lcom/google/android/dy5;)V", "", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lcom/google/android/cwc;", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lkotlin/Function1;", "Lcom/google/android/zh7;", "textFieldToRootTransform", "Lcom/google/android/gba;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lkotlin/jvm/functions/Function1;Lcom/google/android/gba;Lcom/google/android/gba;)V", "a", "Lcom/google/android/ci7;", "Lcom/google/android/dy5;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "Lcom/google/android/cwc;", "k", "Lcom/google/android/vxc;", "l", "Lcom/google/android/zn8;", "m", "Lkotlin/jvm/functions/Function1;", "n", "Lcom/google/android/gba;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "q", "[F", "matrix", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "androidMatrix", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CursorAnchorInfoController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ci7 rootPositionCalculator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final dy5 inputMethodManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean monitorEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean includeInsertionMarker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean includeCharacterBounds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean includeEditorBounds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean includeLineBounds;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TextLayoutResult textLayoutResult;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private zn8 offsetMapping;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private gba innerTextFieldBounds;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private gba decorationBoxBounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Function1<? super zh7, Unit> textFieldToRootTransform = new Function1<zh7, Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        public final void a(float[] fArr) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((zh7) obj).getValues());
            return Unit.a;
        }
    };

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final float[] matrix = zh7.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    public CursorAnchorInfoController(ci7 ci7Var, dy5 dy5Var) {
        this.rootPositionCalculator = ci7Var;
        this.inputMethodManager = dy5Var;
    }

    private final void c() {
        if (this.inputMethodManager.b()) {
            this.textFieldToRootTransform.invoke(zh7.a(this.matrix));
            this.rootPositionCalculator.n(this.matrix);
            wl.a(this.androidMatrix, this.matrix);
            dy5 dy5Var = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            Intrinsics.g(textFieldValue);
            zn8 zn8Var = this.offsetMapping;
            Intrinsics.g(zn8Var);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.g(textLayoutResult);
            Matrix matrix = this.androidMatrix;
            gba gbaVar = this.innerTextFieldBounds;
            Intrinsics.g(gbaVar);
            gba gbaVar2 = this.decorationBoxBounds;
            Intrinsics.g(gbaVar2);
            dy5Var.updateCursorAnchorInfo(ci2.b(builder, textFieldValue, zn8Var, textLayoutResult, matrix, gbaVar, gbaVar2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = new Function1<zh7, Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                public final void a(float[] fArr) {
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((zh7) obj).getValues());
                    return Unit.a;
                }
            };
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            Unit unit = Unit.a;
        }
    }

    public final void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = includeInsertionMarker;
                this.includeCharacterBounds = includeCharacterBounds;
                this.includeEditorBounds = includeEditorBounds;
                this.includeLineBounds = includeLineBounds;
                if (immediate) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        c();
                    }
                }
                this.monitorEnabled = monitor;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, Function1<? super zh7, Unit> textFieldToRootTransform, gba innerTextFieldBounds, gba decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = textFieldToRootTransform;
                this.innerTextFieldBounds = innerTextFieldBounds;
                this.decorationBoxBounds = decorationBoxBounds;
                if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                    c();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
