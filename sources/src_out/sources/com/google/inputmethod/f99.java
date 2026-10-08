package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010!\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR*\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u0006\u0010(\"\u0004\b&\u0010)R.\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0005\u001a\u0004\u0018\u00010+8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0016\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/google/android/f99;", "", "<init>", "()V", "Lcom/google/android/f9$g;", "value", "a", "Lcom/google/android/f9$g;", "d", "()Lcom/google/android/f9$g;", "k", "(Lcom/google/android/f9$g;)V", "mediaType", "", "b", "I", "getMaxItems", "()I", "i", "(I)V", "maxItems", "", "c", "Z", "isOrderedSelection", "()Z", "l", "(Z)V", "Lcom/google/android/f9$b;", "Lcom/google/android/f9$b;", "()Lcom/google/android/f9$b;", "h", "(Lcom/google/android/f9$b;)V", "defaultTab", "e", "g", "isCustomAccentColorApplied", "", "f", "J", "()J", "(J)V", "accentColor", "Lcom/google/android/f9$e;", "mediaCapabilitiesForTranscoding", "Lcom/google/android/f9$e;", "()Lcom/google/android/f9$e;", "j", "(Lcom/google/android/f9$e;)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f99 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isOrderedSelection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isCustomAccentColorApplied;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long accentColor;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private f9.g mediaType = f9.c.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int maxItems = d9.INSTANCE.a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private f9.b defaultTab = f9.b.a.a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/f99$a;", "", "<init>", "()V", "Lcom/google/android/f9$g;", "mediaType", "d", "(Lcom/google/android/f9$g;)Lcom/google/android/f99$a;", "", "maxItems", "c", "(I)Lcom/google/android/f99$a;", "", "isOrderedSelection", "e", "(Z)Lcom/google/android/f99$a;", "Lcom/google/android/f9$b;", "defaultTab", "b", "(Lcom/google/android/f9$b;)Lcom/google/android/f99$a;", "Lcom/google/android/f99;", "a", "()Lcom/google/android/f99;", "Lcom/google/android/f9$g;", "I", "Z", "Lcom/google/android/f9$b;", "isCustomAccentColorApplied", "", "f", "J", "accentColor", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isOrderedSelection;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean isCustomAccentColorApplied;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private long accentColor;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private f9.g mediaType = f9.c.a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int maxItems = d9.INSTANCE.a();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private f9.b defaultTab = f9.b.a.a;

        public final f99 a() {
            f99 f99Var = new f99();
            f99Var.k(this.mediaType);
            f99Var.i(this.maxItems);
            f99Var.l(this.isOrderedSelection);
            f99Var.h(this.defaultTab);
            f99Var.g(this.isCustomAccentColorApplied);
            f99Var.f(this.accentColor);
            f99Var.j(null);
            return f99Var;
        }

        public final a b(f9.b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        public final a c(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        public final a d(f9.g mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        public final a e(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f9.b getDefaultTab() {
        return this.defaultTab;
    }

    public final f9.e c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f9.g getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final void f(long j) {
        this.accentColor = j;
    }

    public final void g(boolean z) {
        this.isCustomAccentColorApplied = z;
    }

    public final void h(f9.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.defaultTab = bVar;
    }

    public final void i(int i) {
        this.maxItems = i;
    }

    public final void j(f9.e eVar) {
    }

    public final void k(f9.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.mediaType = gVar;
    }

    public final void l(boolean z) {
        this.isOrderedSelection = z;
    }
}
