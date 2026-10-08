package com.google.inputmethod;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/sp1;", "Landroid/text/style/ClickableSpan;", "Landroidx/compose/ui/text/f;", "link", "<init>", "(Landroidx/compose/ui/text/f;)V", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "a", "Landroidx/compose/ui/text/f;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class sp1 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f link;

    public sp1(f fVar) {
        this.link = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        e37 linkInteractionListener = this.link.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.a(this.link);
        }
    }
}
