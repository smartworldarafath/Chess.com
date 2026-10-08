package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.CrossStatus;
import androidx.compose.p001foundation.text.selection.Selection;
import androidx.compose.p001foundation.text.selection.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010#\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lcom/google/android/heb;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/d;", "", "block", "k", "(Lkotlin/jvm/functions/Function1;)V", "other", "", "h", "(Lcom/google/android/heb;)Z", "", "getSize", "()I", "size", "g", "startSlot", "j", "endSlot", "Landroidx/compose/foundation/text/selection/CrossStatus;", "c", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "f", "()Landroidx/compose/foundation/text/selection/d;", "startInfo", "e", "endInfo", "b", "currentInfo", "i", "firstInfo", "a", "()Z", "isStartHandle", "Landroidx/compose/foundation/text/selection/e;", "d", "()Landroidx/compose/foundation/text/selection/e;", "previousSelection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface heb {
    boolean a();

    d b();

    CrossStatus c();

    Selection d();

    d e();

    d f();

    int g();

    int getSize();

    boolean h(heb other);

    d i();

    int j();

    void k(Function1<? super d, Unit> block);
}
