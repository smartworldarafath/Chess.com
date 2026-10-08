package com.google.inputmethod;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/nl;", "", "<init>", "()V", "Lcom/google/android/rxc;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "c", "(Lcom/google/android/rxc;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nl {
    public static final nl a = new nl();

    private nl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(rxc layout, RectF rectF, int granularity, final Function2<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        SegmentFinder segmentFinderA;
        if (granularity == 1) {
            segmentFinderA = ut.a.a(new fle(layout.G(), layout.I()));
        } else {
            jl.a();
            segmentFinderA = kl.a(il.a(layout.G(), layout.getTextPaint()));
        }
        return layout.getLayout().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: com.google.android.ml
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return nl.b(inclusionStrategy, rectF2, rectF3);
            }
        });
    }
}
