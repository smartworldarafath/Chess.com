package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p004runtime.d;
import androidx.compose.ui.b;
import androidx.compose.ui.text.TextStyle;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b\u001b\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b#\u00101R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b\u001f\u00106R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b*\u00108¨\u00069"}, d2 = {"Lcom/google/android/gsb;", "", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "title", "Landroidx/compose/ui/text/y;", "titleTextStyle", "subtitle", "subtitleTextStyle", "Lcom/google/android/tc$b;", "titleHorizontalAlignment", "navigationIcon", "Lkotlin/Function1;", "Lcom/google/android/hra;", "actions", "Lcom/google/android/ff3;", "expandedHeight", "Landroidx/compose/foundation/layout/g1;", "windowInsets", "Lcom/google/android/oad;", "colors", "Lcom/google/android/sad;", "scrollBehavior", "<init>", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/y;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/y;Lcom/google/android/tc$b;Lkotlin/jvm/functions/Function2;Lcom/google/android/ps4;FLandroidx/compose/foundation/layout/g1;Lcom/google/android/oad;Lcom/google/android/sad;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/b;", "d", "()Landroidx/compose/ui/b;", "b", "Lkotlin/jvm/functions/Function2;", "i", "()Lkotlin/jvm/functions/Function2;", "c", "Landroidx/compose/ui/text/y;", "k", "()Landroidx/compose/ui/text/y;", "g", "e", "h", "f", "Lcom/google/android/tc$b;", "j", "()Lcom/google/android/tc$b;", "Lcom/google/android/ps4;", "()Lcom/google/android/ps4;", "F", "()F", "Landroidx/compose/foundation/layout/g1;", "l", "()Landroidx/compose/foundation/layout/g1;", "Lcom/google/android/oad;", "()Lcom/google/android/oad;", "Lcom/google/android/sad;", "()Lcom/google/android/sad;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class gsb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<d, Integer, Unit> title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextStyle titleTextStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<d, Integer, Unit> subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextStyle subtitleTextStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final tc.b titleHorizontalAlignment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function2<d, Integer, Unit> navigationIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ps4<hra, d, Integer, Unit> actions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float expandedHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final g1 windowInsets;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final oad colors;

    public /* synthetic */ gsb(b bVar, Function2 function2, TextStyle textStyle, Function2 function3, TextStyle textStyle2, tc.b bVar2, Function2 function4, ps4 ps4Var, float f, g1 g1Var, oad oadVar, sad sadVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, function2, textStyle, function3, textStyle2, bVar2, function4, ps4Var, f, g1Var, oadVar, sadVar);
    }

    public final ps4<hra, d, Integer, Unit> a() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final oad getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getExpandedHeight() {
        return this.expandedHeight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getModifier() {
        return this.modifier;
    }

    public final Function2<d, Integer, Unit> e() {
        return this.navigationIcon;
    }

    public final sad f() {
        return null;
    }

    public final Function2<d, Integer, Unit> g() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final Function2<d, Integer, Unit> i() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final tc.b getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final g1 getWindowInsets() {
        return this.windowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gsb(b bVar, Function2<? super d, ? super Integer, Unit> function2, TextStyle textStyle, Function2<? super d, ? super Integer, Unit> function3, TextStyle textStyle2, tc.b bVar2, Function2<? super d, ? super Integer, Unit> function4, ps4<? super hra, ? super d, ? super Integer, Unit> ps4Var, float f, g1 g1Var, oad oadVar, sad sadVar) {
        this.modifier = bVar;
        this.title = function2;
        this.titleTextStyle = textStyle;
        this.subtitle = function3;
        this.subtitleTextStyle = textStyle2;
        this.titleHorizontalAlignment = bVar2;
        this.navigationIcon = function4;
        this.actions = ps4Var;
        this.expandedHeight = f;
        this.windowInsets = g1Var;
        this.colors = oadVar;
    }
}
