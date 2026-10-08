package com.google.inputmethod;

import androidx.compose.p000animation.core.RepeatMode;
import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001a\u0010#\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Lcom/google/android/m3e;", "Lcom/google/android/ur;", "V", "Lcom/google/android/f3e;", "Lcom/google/android/i3e;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Lcom/google/android/y5c;", "initialStartOffset", "<init>", "(Lcom/google/android/i3e;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "h", "(J)J", "start", "startVelocity", "end", "i", "(JLcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)Lcom/google/android/ur;", "initialValue", "targetValue", "initialVelocity", "g", "d", "b", "(Lcom/google/android/ur;Lcom/google/android/ur;Lcom/google/android/ur;)J", "a", "Lcom/google/android/i3e;", "Landroidx/compose/animation/core/RepeatMode;", "c", "J", "getDurationNanos$animation_core", "()J", "durationNanos", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m3e<V extends ur> implements f3e<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final i3e<V> animation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RepeatMode repeatMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ m3e(i3e i3eVar, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3eVar, repeatMode, j);
    }

    private final long h(long playTimeNanos) {
        long j = this.initialOffsetNanos;
        if (playTimeNanos + j <= 0) {
            return 0L;
        }
        long j2 = playTimeNanos + j;
        long j3 = this.durationNanos;
        long j4 = j2 / j3;
        return (this.repeatMode == RepeatMode.Restart || j4 % ((long) 2) == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    private final V i(long playTimeNanos, V start, V startVelocity, V end) {
        long j = this.initialOffsetNanos;
        long j2 = playTimeNanos + j;
        long j3 = this.durationNanos;
        return j2 > j3 ? this.animation.d(j3 - j, start, end, startVelocity) : startVelocity;
    }

    @Override // com.google.inputmethod.f3e
    public boolean a() {
        return true;
    }

    @Override // com.google.inputmethod.f3e
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return Long.MAX_VALUE;
    }

    @Override // com.google.inputmethod.f3e
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.d(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // com.google.inputmethod.f3e
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.g(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    private m3e(i3e<V> i3eVar, RepeatMode repeatMode, long j) {
        this.animation = i3eVar;
        this.repeatMode = repeatMode;
        this.durationNanos = ((long) (i3eVar.getDelayMillis() + i3eVar.c())) * 1000000;
        this.initialOffsetNanos = j * 1000000;
    }
}
