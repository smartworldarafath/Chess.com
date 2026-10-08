package androidx.compose.ui.layout;

import com.google.inputmethod.kn6;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/s;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/o$a;", "", "calculation", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "()V", "coordinate", "Lcom/google/android/kn6;", "sourceCoordinates", "targetCoordinates", "a", "(FLcom/google/android/kn6;Lcom/google/android/kn6;)F", "b", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerticalRuler extends s {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000e\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/VerticalRuler$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/VerticalRuler;", "rulers", "b", "([Landroidx/compose/ui/layout/VerticalRuler;)Landroidx/compose/ui/layout/VerticalRuler;", "c", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/o$a;", "", "calculation", "a", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/VerticalRuler;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VerticalRuler a(Function2<? super o.a, ? super Float, Float> calculation) {
            return new VerticalRuler(calculation, null);
        }

        public final VerticalRuler b(final VerticalRuler... rulers) {
            return a(new Function2<o.a, Float, Float>() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final Float a(o.a aVar, float f) {
                    return Float.valueOf(t.b(aVar, true, rulers, f));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a((o.a) obj, ((Number) obj2).floatValue());
                }
            });
        }

        public final VerticalRuler c(final VerticalRuler... rulers) {
            return a(new Function2<o.a, Float, Float>() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final Float a(o.a aVar, float f) {
                    return Float.valueOf(t.b(aVar, false, rulers, f));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a((o.a) obj, ((Number) obj2).floatValue());
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ VerticalRuler(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.s
    public float a(float coordinate, kn6 sourceCoordinates, kn6 targetCoordinates) {
        return Float.intBitsToFloat((int) (targetCoordinates.Q(sourceCoordinates, rn8.e((((long) Float.floatToRawIntBits(((int) (sourceCoordinates.a() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(coordinate) << 32))) >> 32));
    }

    private VerticalRuler(Function2<? super o.a, ? super Float, Float> function2) {
        super(function2, null);
    }

    public VerticalRuler() {
        this(null);
    }
}
