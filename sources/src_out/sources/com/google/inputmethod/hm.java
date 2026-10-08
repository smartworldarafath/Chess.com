package com.google.inputmethod;

import android.graphics.Typeface;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import com.google.android.rs4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b$\u00100R\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b)\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b3\u0010AR\u0014\u0010E\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010DR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010DR\u0014\u0010H\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010G¨\u0006I"}, d2 = {"Lcom/google/android/hm;", "Lcom/google/android/d19;", "", "text", "Landroidx/compose/ui/text/y;", "style", "", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/b$a;", "annotations", "Lcom/google/android/v99;", "placeholders", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Lcom/google/android/f43;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/l$b;Lcom/google/android/f43;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/text/y;", "h", "()Landroidx/compose/ui/text/y;", "c", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "d", "getPlaceholders", "e", "Landroidx/compose/ui/text/font/l$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/l$b;", "f", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "Lcom/google/android/po;", "g", "Lcom/google/android/po;", "j", "()Lcom/google/android/po;", "textPaint", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lcom/google/android/vn6;", "i", "Lcom/google/android/vn6;", "()Lcom/google/android/vn6;", "layoutIntrinsics", "Lcom/google/android/hod;", "Lcom/google/android/hod;", "resolvedTypefaces", "", "k", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hm implements d19 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<b.Range<? extends b.a>> annotations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<b.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final po textPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final vn6 layoutIntrinsics;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private hod resolvedTypefaces;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int textDirectionHeuristic;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.util.List, java.util.List<? extends androidx.compose.ui.text.b$d<? extends androidx.compose.ui.text.b$a>>, java.util.List<androidx.compose.ui.text.b$d<? extends androidx.compose.ui.text.b$a>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<androidx.compose.ui.text.b$d<? extends androidx.compose.ui.text.b$a>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public hm(String str, TextStyle textStyle, List<? extends b.Range<? extends b.a>> list, List<b.Range<Placeholder>> list2, l.b bVar, f43 f43Var) throws NoWhenBranchMatchedException {
        Object obj;
        ?? arrayList;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = f43Var;
        po poVar = new po(1, f43Var.getDensity());
        this.textPaint = poVar;
        this.emojiCompatProcessed = !im.c(textStyle) ? false : mq3.a.a().getValue().booleanValue();
        this.textDirectionHeuristic = im.d(textStyle.B(), textStyle.u());
        rs4 rs4Var = new rs4() { // from class: com.google.android.gm
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                return hm.e(this.a, (l) obj2, (FontWeight) obj3, (t) obj4, (u) obj5);
            }
        };
        vyc.e(poVar, textStyle.E());
        SpanStyle spanStyle = textStyle.getSpanStyle();
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((b.Range) obj).g() instanceof SpanStyle) {
                break;
            } else {
                i++;
            }
        }
        SpanStyle spanStyleA = vyc.a(poVar, spanStyle, rs4Var, f43Var, obj != null);
        if (spanStyleA != null) {
            int size2 = this.annotations.size() + 1;
            arrayList = new ArrayList(size2);
            int i2 = 0;
            while (i2 < size2) {
                arrayList.add(i2 == 0 ? new b.Range<>(spanStyleA, 0, this.text.length()) : this.annotations.get(i2 - 1));
                i2++;
            }
        } else {
            arrayList = this.annotations;
        }
        CharSequence charSequenceA = fm.a(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, rs4Var, this.emojiCompatProcessed);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new vn6(charSequenceA, this.textPaint, this.textDirectionHeuristic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface e(hm hmVar, l lVar, FontWeight fontWeight, t tVar, u uVar) {
        q6c<Object> q6cVarA = hmVar.fontFamilyResolver.a(lVar, fontWeight, tVar.getValue(), uVar.getValue());
        if (q6cVarA instanceof l0.b) {
            Object value = ((l0.b) q6cVarA).getValue();
            Intrinsics.h(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        hod hodVar = new hod(q6cVarA, hmVar.resolvedTypefaces);
        hmVar.resolvedTypefaces = hodVar;
        return hodVar.a();
    }

    @Override // com.google.inputmethod.d19
    public float a() {
        return this.layoutIntrinsics.h();
    }

    @Override // com.google.inputmethod.d19
    public float b() {
        return this.layoutIntrinsics.g();
    }

    @Override // com.google.inputmethod.d19
    public boolean c() {
        hod hodVar = this.resolvedTypefaces;
        if (hodVar != null ? hodVar.b() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && im.c(this.style) && mq3.a.a().getValue().booleanValue();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final vn6 getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final po getTextPaint() {
        return this.textPaint;
    }
}
