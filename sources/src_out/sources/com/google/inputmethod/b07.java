package com.google.inputmethod;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/google/android/b07;", "", "Lkotlin/Function1;", "Lcom/google/android/zh7;", "", "localToScreen", "Lcom/google/android/ey5;", "inputMethodManager", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/ey5;)V", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lcom/google/android/cwc;", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/gba;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/gba;Lcom/google/android/gba;)V", "a", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/ey5;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "Lcom/google/android/cwc;", "k", "Lcom/google/android/vxc;", "l", "Lcom/google/android/zn8;", "m", "Lcom/google/android/gba;", "n", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b07 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<zh7, Unit> localToScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ey5 inputMethodManager;

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

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private gba innerTextFieldBounds;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private gba decorationBoxBounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float[] matrix = zh7.c(null, 1, null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Matrix androidMatrix = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public b07(Function1<? super zh7, Unit> function1, ey5 ey5Var) {
        this.localToScreen = function1;
        this.inputMethodManager = ey5Var;
    }

    private final void c() {
        if (!this.inputMethodManager.b() || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        zh7.i(this.matrix);
        this.localToScreen.invoke(zh7.a(this.matrix));
        float[] fArr = this.matrix;
        gba gbaVar = this.decorationBoxBounds;
        Intrinsics.g(gbaVar);
        float f = -gbaVar.getLeft();
        gba gbaVar2 = this.decorationBoxBounds;
        Intrinsics.g(gbaVar2);
        zh7.r(fArr, f, -gbaVar2.getTop(), 0.0f);
        wl.a(this.androidMatrix, this.matrix);
        ey5 ey5Var = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        Intrinsics.g(textFieldValue);
        zn8 zn8Var = this.offsetMapping;
        Intrinsics.g(zn8Var);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        Intrinsics.g(textLayoutResult);
        Matrix matrix = this.androidMatrix;
        gba gbaVar3 = this.innerTextFieldBounds;
        Intrinsics.g(gbaVar3);
        gba gbaVar4 = this.decorationBoxBounds;
        Intrinsics.g(gbaVar4);
        ey5Var.updateCursorAnchorInfo(a07.b(builder, textFieldValue, zn8Var, textLayoutResult, matrix, gbaVar3, gbaVar4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void a() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
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

    public final void d(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, gba innerTextFieldBounds, gba decorationBoxBounds) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
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
