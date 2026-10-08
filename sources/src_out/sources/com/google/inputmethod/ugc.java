package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.e;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/b;", "", "key1", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "block", "c", "(Landroidx/compose/ui/b;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/b;", "key2", "d", "(Landroidx/compose/ui/b;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/b;", "", "keys", "e", "(Landroidx/compose/ui/b;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/b;", "pointerInputEventHandler", "Lcom/google/android/wgc;", "a", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lcom/google/android/wgc;", "Landroidx/compose/ui/input/pointer/e;", "Landroidx/compose/ui/input/pointer/e;", "EmptyPointerEvent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ugc {
    private static final e a = new e(m.p());

    public static final wgc a(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
    }

    public static final b c(b bVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return bVar.then(new tgc(obj, null, null, pointerInputEventHandler, 6, null));
    }

    public static final b d(b bVar, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return bVar.then(new tgc(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    public static final b e(b bVar, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return bVar.then(new tgc(null, null, objArr, pointerInputEventHandler, 3, null));
    }
}
