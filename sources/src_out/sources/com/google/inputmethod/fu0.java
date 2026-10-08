package com.google.inputmethod;

import com.google.android.r43;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/google/android/fu0;", "", "", "offset", "size", "containerSize", "b", "(FFF)F", "Lcom/google/android/kr;", "a", "()Lcom/google/android/kr;", "getScrollAnimationSpec$annotations", "()V", "scrollAnimationSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface fu0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.fu0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/google/android/fu0$a;", "", "<init>", "()V", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lcom/google/android/kr;", "b", "Lcom/google/android/kr;", "c", "()Lcom/google/android/kr;", "DefaultScrollAnimationSpec", "Lcom/google/android/fu0;", "Lcom/google/android/fu0;", "()Lcom/google/android/fu0;", "DefaultBringIntoViewSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final kr<Float> DefaultScrollAnimationSpec = lr.j(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final fu0 DefaultBringIntoViewSpec = new C0109a();

        /* JADX INFO: renamed from: com.google.android.fu0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/fu0$a$a", "Lcom/google/android/fu0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0109a implements fu0 {
            C0109a() {
            }
        }

        private Companion() {
        }

        public final float a(float offset, float size, float containerSize) {
            float f = size + offset;
            if (offset >= 0.0f && f <= containerSize) {
                return 0.0f;
            }
            if (offset < 0.0f && f > containerSize) {
                return 0.0f;
            }
            float f2 = f - containerSize;
            return Math.abs(offset) < Math.abs(f2) ? offset : f2;
        }

        public final fu0 b() {
            return DefaultBringIntoViewSpec;
        }

        public final kr<Float> c() {
            return DefaultScrollAnimationSpec;
        }
    }

    @r43
    default kr<Float> a() {
        return INSTANCE.c();
    }

    default float b(float offset, float size, float containerSize) {
        return INSTANCE.a(offset, size, containerSize);
    }
}
