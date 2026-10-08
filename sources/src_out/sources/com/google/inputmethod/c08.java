package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\n\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/c08;", "", "T", "Lcom/google/android/xa4;", "e", "()Lcom/google/android/xa4;", "a", "b", "f", "d", "c", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c08 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.c08$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/c08$a;", "", "<init>", "()V", "Lcom/google/android/c08;", "a", "()Lcom/google/android/c08;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final c08 a() {
            return b.b;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/google/android/c08$b;", "Lcom/google/android/c08;", "<init>", "()V", "T", "Lcom/google/android/xa4;", "e", "()Lcom/google/android/xa4;", "a", "b", "f", "d", "c", "Lcom/google/android/w2c;", "", "Lcom/google/android/w2c;", "defaultSpatialSpec", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "g", "fastEffectsSpec", "h", "slowEffectsSpec", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b implements c08 {
        public static final b b = new b();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final w2c<Object> defaultSpatialSpec;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final w2c<Object> fastSpatialSpec;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final w2c<Object> slowSpatialSpec;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private static final w2c<Object> defaultEffectsSpec;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private static final w2c<Object> fastEffectsSpec;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private static final w2c<Object> slowEffectsSpec;

        static {
            h5c h5cVar = h5c.a;
            defaultSpatialSpec = lr.j(h5cVar.c(), h5cVar.d(), null, 4, null);
            fastSpatialSpec = lr.j(h5cVar.g(), h5cVar.h(), null, 4, null);
            slowSpatialSpec = lr.j(h5cVar.k(), h5cVar.l(), null, 4, null);
            defaultEffectsSpec = lr.j(h5cVar.a(), h5cVar.b(), null, 4, null);
            fastEffectsSpec = lr.j(h5cVar.e(), h5cVar.f(), null, 4, null);
            slowEffectsSpec = lr.j(h5cVar.i(), h5cVar.j(), null, 4, null);
        }

        private b() {
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> a() {
            w2c<Object> w2cVar = fastSpatialSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return w2cVar;
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> b() {
            w2c<Object> w2cVar = slowSpatialSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return w2cVar;
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> c() {
            w2c<Object> w2cVar = slowEffectsSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
            return w2cVar;
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> d() {
            w2c<Object> w2cVar = fastEffectsSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return w2cVar;
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> e() {
            w2c<Object> w2cVar = defaultSpatialSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return w2cVar;
        }

        @Override // com.google.inputmethod.c08
        public <T> xa4<T> f() {
            w2c<Object> w2cVar = defaultEffectsSpec;
            Intrinsics.h(w2cVar, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return w2cVar;
        }
    }

    <T> xa4<T> a();

    <T> xa4<T> b();

    <T> xa4<T> c();

    <T> xa4<T> d();

    <T> xa4<T> e();

    <T> xa4<T> f();
}
