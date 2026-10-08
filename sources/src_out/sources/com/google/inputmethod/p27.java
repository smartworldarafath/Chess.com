package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Lcom/google/android/p27;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveThickness", "c", "getActiveWaveAmplitude-D9Ej5fM", "ActiveWaveAmplitude", "d", "getActiveWaveWavelength-D9Ej5fM", "ActiveWaveWavelength", "e", "a", "Height", "f", "getIndeterminateActiveWaveWavelength-D9Ej5fM", "IndeterminateActiveWaveWavelength", "g", "StopSize", "h", "getStopTrailingSpace-D9Ej5fM", "StopTrailingSpace", "i", "TrackActiveSpace", "j", "getTrackThickness-D9Ej5fM", "TrackThickness", "k", "getWaveHeight-D9Ej5fM", "WaveHeight", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p27 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ActiveThickness;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float StopSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float TrackActiveSpace;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float TrackThickness;
    public static final p27 a = new p27();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ActiveWaveAmplitude = ff3.i((float) 3.0d);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float ActiveWaveWavelength = ff3.i((float) 40.0d);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float IndeterminateActiveWaveWavelength = ff3.i((float) 20.0d);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float StopTrailingSpace = ff3.i((float) 0.0d);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final float WaveHeight = ff3.i((float) 10.0d);

    static {
        float f = (float) 4.0d;
        ActiveThickness = ff3.i(f);
        Height = ff3.i(f);
        StopSize = ff3.i(f);
        TrackActiveSpace = ff3.i(f);
        TrackThickness = ff3.i(f);
    }

    private p27() {
    }

    public final float a() {
        return Height;
    }

    public final float b() {
        return StopSize;
    }

    public final float c() {
        return TrackActiveSpace;
    }
}
