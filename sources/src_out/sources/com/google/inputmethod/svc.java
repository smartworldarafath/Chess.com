package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\n\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0013R+\u00106\u001a\u0002002\u0006\u00101\u001a\u0002008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b \u00104\"\u0004\b&\u00105R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107¨\u00069"}, d2 = {"Lcom/google/android/svc;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/y;", "resolvedStyle", "typeface", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Landroidx/compose/ui/text/y;Ljava/lang/Object;)V", "Lcom/google/android/q16;", "a", "(Ljava/lang/Object;)J", "", "e", "g", "(Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/text/font/l$b;)J", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "setDensity", "(Lcom/google/android/f43;)V", "c", "Landroidx/compose/ui/text/font/l$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/l$b;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/l$b;)V", "d", "Landroidx/compose/ui/text/y;", "getResolvedStyle", "()Landroidx/compose/ui/text/y;", "setResolvedStyle", "(Landroidx/compose/ui/text/y;)V", "Ljava/lang/Object;", "getTypeface", "()Ljava/lang/Object;", "setTypeface", "", "<set-?>", "f", "Lcom/google/android/o58;", "()Z", "(Z)V", "dirty", "J", "minSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class svc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Object typeface;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 dirty = s0.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long minSize;

    public svc(LayoutDirection layoutDirection, f43 f43Var, l.b bVar, TextStyle textStyle, Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = f43Var;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
        this.minSize = b(this.fontFamilyResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean c() {
        return ((Boolean) this.dirty.getValue()).booleanValue();
    }

    private final void d(boolean z) {
        this.dirty.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void f(svc svcVar, LayoutDirection layoutDirection, f43 f43Var, l.b bVar, TextStyle textStyle, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            layoutDirection = svcVar.layoutDirection;
        }
        if ((i & 2) != 0) {
            f43Var = svcVar.density;
        }
        if ((i & 4) != 0) {
            bVar = svcVar.fontFamilyResolver;
        }
        if ((i & 8) != 0) {
            textStyle = svcVar.resolvedStyle;
        }
        if ((i & 16) != 0) {
            obj = svcVar.typeface;
        }
        Object obj3 = obj;
        l.b bVar2 = bVar;
        LayoutDirection layoutDirection2 = layoutDirection;
        svcVar.e(layoutDirection2, f43Var, bVar2, textStyle, obj3);
    }

    public final long a(Object typeface) {
        g(typeface);
        if (c()) {
            this.minSize = b(this.fontFamilyResolver);
            d(false);
        }
        return this.minSize;
    }

    public final long b(l.b fontFamilyResolver) {
        return ysc.b(this.resolvedStyle, this.density, fontFamilyResolver, null, 0, 24, null);
    }

    public final void e(LayoutDirection layoutDirection, f43 density, l.b fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        if (layoutDirection == this.layoutDirection && Intrinsics.e(density, this.density) && Intrinsics.e(fontFamilyResolver, this.fontFamilyResolver) && Intrinsics.e(resolvedStyle, this.resolvedStyle)) {
            g(typeface);
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        d(true);
    }

    public final void g(Object typeface) {
        if (Intrinsics.e(typeface, this.typeface)) {
            return;
        }
        this.typeface = typeface;
        d(true);
    }
}
