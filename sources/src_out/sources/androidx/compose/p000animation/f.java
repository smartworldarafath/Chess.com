package androidx.compose.p000animation;

import com.google.inputmethod.ChangeSize;
import com.google.inputmethod.Fade;
import com.google.inputmethod.Scale;
import com.google.inputmethod.Slide;
import com.google.inputmethod.TransitionData;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/f;", "", "<init>", "()V", "exit", "c", "(Landroidx/compose/animation/f;)Landroidx/compose/animation/f;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Lcom/google/android/cfd;", "b", "()Lcom/google/android/cfd;", "data", "a", "Landroidx/compose/animation/g;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final f b = new g(new TransitionData(null, null, null, null, null, false, null, 127, null));
    private static final f c = new g(new TransitionData(null, null, null, null, null, true, null, 95, null));

    /* JADX INFO: renamed from: androidx.compose.animation.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/f$a;", "", "<init>", "()V", "Landroidx/compose/animation/f;", "None", "Landroidx/compose/animation/f;", "a", "()Landroidx/compose/animation/f;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    public final f c(f exit) {
        Fade fade = exit.b().getFade();
        if (fade == null) {
            fade = b().getFade();
        }
        Slide slide = exit.b().getSlide();
        if (slide == null) {
            slide = b().getSlide();
        }
        ChangeSize changeSize = exit.b().getChangeSize();
        if (changeSize == null) {
            changeSize = b().getChangeSize();
        }
        Scale scale = exit.b().getScale();
        if (scale == null) {
            scale = b().getScale();
        }
        exit.b().g();
        b().g();
        return new g(new TransitionData(fade, slide, changeSize, scale, null, exit.b().getHold() || b().getHold(), b0.t(b().b(), exit.b().b())));
    }

    public boolean equals(Object other) {
        return (other instanceof f) && Intrinsics.e(((f) other).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (Intrinsics.e(this, b)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.e(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionDataB = b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        Fade fade = transitionDataB.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = transitionDataB.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = transitionDataB.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = transitionDataB.getScale();
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(transitionDataB.getHold());
        return sb.toString();
    }

    private f() {
    }
}
