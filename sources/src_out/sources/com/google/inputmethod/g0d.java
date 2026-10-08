package com.google.inputmethod;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class g0d {

    static class a {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    static class b {
        public static void a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    private static class c implements ActionMode.Callback {
        ActionMode.Callback a() {
            throw null;
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static th9.a d(TextView textView) {
        return new th9.a(a.b(textView));
    }

    public static void e(TextView textView, ColorStateList colorStateList) {
        di9.g(textView);
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void f(TextView textView, PorterDuff.Mode mode) {
        di9.g(textView);
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void g(TextView textView, int i) {
        di9.d(i);
        a.c(textView, i);
    }

    public static void h(TextView textView, int i) {
        di9.d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void i(TextView textView, int i) {
        di9.d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void j(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            b.a(textView, i, f);
        } else {
            i(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void k(TextView textView, th9 th9Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(a.a(th9Var.b()));
        } else {
            if (!d(textView).a(th9Var.a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(th9Var);
        }
    }

    public static void l(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void m(TextView textView, th9.a aVar) {
        textView.setTextDirection(c(aVar.d()));
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    public static ActionMode.Callback n(ActionMode.Callback callback) {
        return callback instanceof c ? ((c) callback).a() : callback;
    }

    public static ActionMode.Callback o(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}
