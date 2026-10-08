package androidx.compose.p001foundation.text.selection;

import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.cdb;
import com.google.inputmethod.kn6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u00020\u000b*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/selection/b;", "Lcom/google/android/cdb;", "", "selectableId", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "coordinatesCallback", "Lcom/google/android/vxc;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "a", "()I", "J", "getSelectableId", "()J", "b", "Lkotlin/jvm/functions/Function0;", "c", "", "Landroidx/compose/foundation/platform/SynchronizedObject;", "d", "Ljava/lang/Object;", "lock", "e", "Lcom/google/android/vxc;", "_previousTextLayoutResult", "f", "I", "_previousLastVisibleOffset", "(Lcom/google/android/vxc;)I", "lastVisibleOffset", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements cdb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<kn6> coordinatesCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<TextLayoutResult> layoutResultCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextLayoutResult _previousTextLayoutResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object lock = this;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public b(long j, Function0<? extends kn6> function0, Function0<TextLayoutResult> function1) {
        this.selectableId = j;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function1;
    }

    private final int b(TextLayoutResult textLayoutResult) {
        int i;
        int iN;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (!textLayoutResult.f() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        iN = textLayoutResult.n() - 1;
                    } else {
                        int iJ = g.j(textLayoutResult.r((int) (textLayoutResult.getSize() & 4294967295L)), textLayoutResult.n() - 1);
                        while (iJ >= 0 && textLayoutResult.v(iJ) >= ((int) (textLayoutResult.getSize() & 4294967295L))) {
                            iJ--;
                        }
                        iN = g.e(iJ, 0);
                    }
                    this._previousLastVisibleOffset = textLayoutResult.o(iN, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i = this._previousLastVisibleOffset;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // com.google.inputmethod.cdb
    public int a() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return b(textLayoutResult);
    }
}
