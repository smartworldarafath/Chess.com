package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.cfd, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R'\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b\u001f\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/google/android/cfd;", "", "Lcom/google/android/h54;", "fade", "Lcom/google/android/ttb;", "slide", "Lcom/google/android/f81;", "changeSize", "Lcom/google/android/b4b;", "scale", "Lcom/google/android/s3e;", "veil", "", "hold", "", "effectsMap", "<init>", "(Lcom/google/android/h54;Lcom/google/android/ttb;Lcom/google/android/f81;Lcom/google/android/b4b;Lcom/google/android/s3e;ZLjava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/h54;", "c", "()Lcom/google/android/h54;", "b", "Lcom/google/android/ttb;", "f", "()Lcom/google/android/ttb;", "Lcom/google/android/f81;", "()Lcom/google/android/f81;", "d", "Lcom/google/android/b4b;", "e", "()Lcom/google/android/b4b;", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "Lcom/google/android/s3e;", "g", "()Lcom/google/android/s3e;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransitionData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final Fade fade;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final Slide slide;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final ChangeSize changeSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final Scale scale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean hold;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final Map<Object, Object> effectsMap;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, s3e s3eVar, boolean z, Map<Object, Object> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z;
        this.effectsMap = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<Object, Object> b() {
        return this.effectsMap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Fade getFade() {
        return this.fade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) other;
        return Intrinsics.e(this.fade, transitionData.fade) && Intrinsics.e(this.slide, transitionData.slide) && Intrinsics.e(this.changeSize, transitionData.changeSize) && Intrinsics.e(this.scale, transitionData.scale) && Intrinsics.e((Object) null, (Object) null) && this.hold == transitionData.hold && Intrinsics.e(this.effectsMap, transitionData.effectsMap);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Slide getSlide() {
        return this.slide;
    }

    public final s3e g() {
        return null;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 961) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", veil=" + ((Object) null) + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, s3e s3eVar, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale, (i & 16) != 0 ? null : s3eVar, (i & 32) != 0 ? false : z, (i & 64) != 0 ? b0.j() : map);
    }
}
