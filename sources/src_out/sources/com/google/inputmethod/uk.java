package com.google.inputmethod;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.ResourceFont;
import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/h0;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(Landroidx/compose/ui/text/font/h0;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(Landroidx/compose/ui/text/font/h0;Landroid/content/Context;Lcom/google/android/q22;)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class uk {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/android/uk$a", "Lcom/google/android/mla$c;", "Landroid/graphics/Typeface;", "typeface", "", "g", "(Landroid/graphics/Typeface;)V", "", "reason", "f", "(I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends mla.c {
        final /* synthetic */ g41<Typeface> a;
        final /* synthetic */ ResourceFont b;

        /* JADX WARN: Multi-variable type inference failed */
        a(g41<? super Typeface> g41Var, ResourceFont resourceFont) {
            this.a = g41Var;
            this.b = resourceFont;
        }

        @Override // com.google.android.mla.c
        public void f(int reason) {
            this.a.i(new IllegalStateException("Unable to load font " + this.b + " (reason=" + reason + ')'));
        }

        @Override // com.google.android.mla.c
        public void g(Typeface typeface) {
            this.a.resumeWith(Result.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        Typeface typefaceH = mla.h(context, resourceFont.getResId());
        Intrinsics.g(typefaceH);
        return typefaceH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, q22<? super Typeface> q22Var) {
        e eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        mla.j(context, resourceFont.getResId(), new a(eVar, resourceFont), null);
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }
}
