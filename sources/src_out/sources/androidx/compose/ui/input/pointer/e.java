package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import com.google.inputmethod.ff9;
import com.google.inputmethod.he9;
import com.google.inputmethod.lo6;
import com.google.inputmethod.mq1;
import com.google.inputmethod.o56;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001b\u0010\fR*\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "", "Landroidx/compose/ui/input/pointer/i;", "changes", "Lcom/google/android/o56;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lcom/google/android/o56;)V", "(Ljava/util/List;)V", "Landroidx/compose/ui/input/pointer/g;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/google/android/o56;", "e", "()Lcom/google/android/o56;", "", "I", "d", "classification", "Lcom/google/android/he9;", "buttons", "Lcom/google/android/ff9;", "f", "keyboardModifiers", "value", "h", "i", "(I)V", "type", "Landroid/view/MotionEvent;", "g", "()Landroid/view/MotionEvent;", "motionEvent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o56 internalPointerEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int classification;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int buttons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int keyboardModifiers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int type;

    public e(List<PointerInputChange> list, o56 o56Var) {
        MotionEvent motionEventG;
        this.changes = list;
        this.internalPointerEvent = o56Var;
        this.classification = (Build.VERSION.SDK_INT < 29 || (motionEventG = g()) == null) ? 0 : motionEventG.getClassification();
        MotionEvent motionEventG2 = g();
        this.buttons = he9.a(motionEventG2 != null ? motionEventG2.getButtonState() : 0);
        MotionEvent motionEventG3 = g();
        this.keyboardModifiers = ff9.b(motionEventG3 != null ? motionEventG3.getMetaState() : 0);
        this.type = a();
    }

    private final int a() {
        MotionEvent motionEventG = g();
        int i = 0;
        if (motionEventG == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            while (i < size) {
                PointerInputChange pointerInputChange = list.get(i);
                if (f.d(pointerInputChange)) {
                    return g.INSTANCE.h();
                }
                if (f.b(pointerInputChange)) {
                    return g.INSTANCE.g();
                }
                i++;
            }
            return g.INSTANCE.c();
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 29 && motionEventG.getClassification() == 3;
        if (i2 >= 29 && motionEventG.getClassification() == 5) {
            i = 1;
        }
        int actionMasked = motionEventG.getActionMasked();
        if (actionMasked == 0) {
            if (z && mq1.isTrackpadGestureHandlingEnabled) {
                return g.INSTANCE.f();
            }
            return (i == 0 || !mq1.isTrackpadGestureHandlingEnabled) ? g.INSTANCE.g() : g.INSTANCE.k();
        }
        if (actionMasked == 1) {
            if (z && mq1.isTrackpadGestureHandlingEnabled) {
                return g.INSTANCE.d();
            }
            return (i == 0 || !mq1.isTrackpadGestureHandlingEnabled) ? g.INSTANCE.h() : g.INSTANCE.j();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    if (z && mq1.isTrackpadGestureHandlingEnabled) {
                        return g.INSTANCE.f();
                    }
                    return (i == 0 || !mq1.isTrackpadGestureHandlingEnabled) ? g.INSTANCE.g() : g.INSTANCE.i();
                case 6:
                    if (z && mq1.isTrackpadGestureHandlingEnabled) {
                        return g.INSTANCE.d();
                    }
                    return (i == 0 || !mq1.isTrackpadGestureHandlingEnabled) ? g.INSTANCE.h() : g.INSTANCE.i();
                case 7:
                    break;
                case 8:
                    return g.INSTANCE.l();
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    return g.INSTANCE.a();
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    return g.INSTANCE.b();
                default:
                    return g.INSTANCE.m();
            }
        }
        if (z && mq1.isTrackpadGestureHandlingEnabled) {
            return g.INSTANCE.e();
        }
        return (i == 0 || !mq1.isTrackpadGestureHandlingEnabled) ? g.INSTANCE.c() : g.INSTANCE.i();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> c() {
        return this.changes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getClassification() {
        return this.classification;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o56 getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    public final MotionEvent g() {
        o56 o56Var = this.internalPointerEvent;
        if (o56Var != null) {
            return o56Var.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void i(int i) {
        this.type = i;
    }

    public e(List<PointerInputChange> list) {
        this(list, null);
    }
}
