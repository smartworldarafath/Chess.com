package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.Selection;
import androidx.compose.p001foundation.text.selection.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b \u0010\u000eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lcom/google/android/neb;", "", "Lcom/google/android/cdb;", "selectable", "i", "(Lcom/google/android/cdb;)Lcom/google/android/cdb;", "", "b", "(Lcom/google/android/cdb;)V", "", "e", "()J", "selectableId", "c", "(J)V", "Lcom/google/android/kn6;", "layoutCoordinates", "Lcom/google/android/rn8;", "startPosition", "Landroidx/compose/foundation/text/selection/f;", "adjustment", "", "isInTouchMode", "a", "(Lcom/google/android/kn6;JLandroidx/compose/foundation/text/selection/f;Z)V", "newPosition", "previousPosition", "isStartHandle", "g", "(Lcom/google/android/kn6;JJZLandroidx/compose/foundation/text/selection/f;Z)Z", "d", "()V", "h", "Lcom/google/android/x97;", "Landroidx/compose/foundation/text/selection/e;", "f", "()Lcom/google/android/x97;", "subselections", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface neb {
    void a(kn6 layoutCoordinates, long startPosition, f adjustment, boolean isInTouchMode);

    void b(cdb selectable);

    void c(long selectableId);

    void d();

    long e();

    x97<Selection> f();

    boolean g(kn6 layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, f adjustment, boolean isInTouchMode);

    void h(long selectableId);

    cdb i(cdb selectable);
}
