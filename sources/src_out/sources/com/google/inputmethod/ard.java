package com.google.inputmethod;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/google/android/ard;", "", "<init>", "()V", "Landroidx/compose/ui/text/a0;", "urlAnnotation", "Landroid/text/style/URLSpan;", "c", "(Landroidx/compose/ui/text/a0;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/f$b;", "urlRange", "b", "(Landroidx/compose/ui/text/b$d;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/f;", "linkRange", "Landroid/text/style/ClickableSpan;", "a", "(Landroidx/compose/ui/text/b$d;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "Lcom/google/android/sp1;", "linkSpansWithListenerByAnnotation", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ard {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeakHashMap<b.Range<f.b>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WeakHashMap<b.Range<f>, sp1> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan a(b.Range<f> linkRange) {
        WeakHashMap<b.Range<f>, sp1> weakHashMap = this.linkSpansWithListenerByAnnotation;
        sp1 sp1Var = weakHashMap.get(linkRange);
        if (sp1Var == null) {
            sp1Var = new sp1(linkRange.g());
            weakHashMap.put(linkRange, sp1Var);
        }
        return sp1Var;
    }

    public final URLSpan b(b.Range<f.b> urlRange) {
        WeakHashMap<b.Range<f.b>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlRange.g().getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan c(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
