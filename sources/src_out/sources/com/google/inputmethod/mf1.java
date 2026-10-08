package com.google.inputmethod;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.b;
import com.google.android.q22;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/ef1;", "Landroidx/compose/ui/text/b;", "e", "(Lcom/google/android/ef1;Lcom/google/android/q22;)Ljava/lang/Object;", "f", "(Landroidx/compose/ui/text/b;)Lcom/google/android/ef1;", "Lcom/google/android/jf1;", "", "c", "(Lcom/google/android/jf1;)Z", "d", "", "b", "(Landroidx/compose/ui/text/b;)Ljava/lang/CharSequence;", "a", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class mf1 {
    public static final b a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iX0 = f.x0(annotationArr);
        if (iX0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (Intrinsics.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new b.Range(new hr2(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == iX0) {
                    break;
                }
                i++;
            }
        }
        return new b(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(b bVar) {
        if (bVar.g().isEmpty()) {
            return bVar.getText();
        }
        SpannableString spannableString = new SpannableString(bVar.getText());
        gs3 gs3Var = new gs3();
        List<b.Range<SpanStyle>> listG = bVar.g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            b.Range<SpanStyle> range = listG.get(i);
            SpanStyle spanStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            gs3Var.q();
            gs3Var.d(spanStyleA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", gs3Var.p()), start, end, 33);
        }
        return spannableString;
    }

    public static final boolean c(jf1 jf1Var) {
        return true;
    }

    public static final boolean d(jf1 jf1Var) {
        return true;
    }

    public static final Object e(ef1 ef1Var, q22<? super b> q22Var) {
        return lf1.b(ef1Var);
    }

    public static final ef1 f(b bVar) {
        return lf1.c(bVar);
    }
}
