package androidx.compose.ui.layout;

import com.google.inputmethod.kn6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH ¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/s;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/o$a;", "", "calculate", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "coordinate", "Lcom/google/android/kn6;", "sourceCoordinates", "targetCoordinates", "a", "(FLcom/google/android/kn6;Lcom/google/android/kn6;)F", "Lkotlin/jvm/functions/Function2;", "b", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function2<o.a, Float, Float> calculate;

    public /* synthetic */ s(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float a(float coordinate, kn6 sourceCoordinates, kn6 targetCoordinates);

    public final Function2<o.a, Float, Float> b() {
        return this.calculate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s(Function2<? super o.a, ? super Float, Float> function2) {
        this.calculate = function2;
    }
}
