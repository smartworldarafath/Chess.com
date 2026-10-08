package com.google.inputmethod;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.adaptive.MediaQuery_androidKt;
import androidx.compose.ui.platform.a0;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u001c\"\u0004\b!\u0010\u001eR+\u0010$\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b$\u0010%\"\u0004\b\u000e\u0010&R+\u0010'\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b'\u0010%\"\u0004\b\u001a\u0010&R+\u0010*\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010%\"\u0004\b\u0012\u0010&¨\u0006+"}, d2 = {"Lcom/google/android/gsd;", "Lcom/google/android/fsd;", "Landroid/content/Context;", "context", "Landroid/hardware/input/InputManager;", "inputManager", "Landroidx/compose/ui/platform/a0;", "windowInfo", "", "imeVisibility", "<init>", "(Landroid/content/Context;Landroid/hardware/input/InputManager;Landroidx/compose/ui/platform/a0;Z)V", "Landroid/content/pm/PackageManager;", "kotlin.jvm.PlatformType", "a", "Landroid/content/pm/PackageManager;", "packageManager", "<set-?>", "b", "Lcom/google/android/o58;", "get_windowInfo", "()Landroidx/compose/ui/platform/a0;", "e", "(Landroidx/compose/ui/platform/a0;)V", "_windowInfo", "Lcom/google/android/fsd$b;", "c", "get_windowPosture-m18o9QQ", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "_windowPosture", "Lcom/google/android/fsd$a;", "d", "get_anyPointer-fpxItnM", "_anyPointer", "isDocked", "()Z", "(Z)V", "isImeVisible", "g", "getHasPhysicalKeyboard", "hasPhysicalKeyboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gsd implements fsd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PackageManager packageManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 _windowInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58 _anyPointer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 isImeVisible;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final o58 hasPhysicalKeyboard;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 _windowPosture = s0.e(fsd.b.d(fsd.b.INSTANCE.b()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58 isDocked = s0.e(Boolean.FALSE, null, 2, null);

    public gsd(Context context, InputManager inputManager, a0 a0Var, boolean z) {
        this.packageManager = context.getPackageManager();
        this._windowInfo = s0.e(a0Var, null, 2, null);
        this._anyPointer = s0.e(fsd.a.e(MediaQuery_androidKt.l(inputManager)), null, 2, null);
        this.isImeVisible = s0.e(Boolean.valueOf(z), null, 2, null);
        this.hasPhysicalKeyboard = s0.e(Boolean.valueOf(MediaQuery_androidKt.f(inputManager)), null, 2, null);
    }

    public final void a(boolean z) {
        this.isDocked.setValue(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.hasPhysicalKeyboard.setValue(Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        this.isImeVisible.setValue(Boolean.valueOf(z));
    }

    public final void d(String str) {
        this._anyPointer.setValue(fsd.a.e(str));
    }

    public final void e(a0 a0Var) {
        this._windowInfo.setValue(a0Var);
    }

    public final void f(String str) {
        this._windowPosture.setValue(fsd.b.d(str));
    }
}
