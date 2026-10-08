package com.google.inputmethod;

import androidx.compose.ui.graphics.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002\u001b\u001fB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b%\u00102R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b+\u0010\u001a¨\u00063"}, d2 = {"Lcom/google/android/pp5;", "", "", "name", "Lcom/google/android/ff3;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lcom/google/android/z2e;", "root", "Lcom/google/android/ei1;", "tintColor", "Landroidx/compose/ui/graphics/e;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLcom/google/android/z2e;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "F", "f", "()F", "c", "e", "d", "m", "l", "Lcom/google/android/z2e;", "i", "()Lcom/google/android/z2e;", "g", "J", "k", "()J", "I", "j", "Z", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pp5 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int l;
    private static final Object m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float defaultWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float defaultHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float viewportWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float viewportHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final z2e root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long tintColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int tintBlendMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean autoMirror;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int genId;

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&J¡\u0001\u00108\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00150Dj\b\u0012\u0004\u0012\u00020\u0015`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0014\u0010O\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010N¨\u0006P"}, d2 = {"Lcom/google/android/pp5$a;", "", "", "name", "Lcom/google/android/ff3;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lcom/google/android/ei1;", "tintColor", "Landroidx/compose/ui/graphics/e;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "h", "()V", "Lcom/google/android/pp5$a$a;", "Lcom/google/android/z2e;", "e", "(Lcom/google/android/pp5$a$a;)Lcom/google/android/z2e;", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lcom/google/android/u39;", "clipPathData", "a", "(Ljava/lang/String;FFFFFFFLjava/util/List;)Lcom/google/android/pp5$a;", "g", "()Lcom/google/android/pp5$a;", "pathData", "Landroidx/compose/ui/graphics/p;", "pathFillType", "Lcom/google/android/qu0;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lcom/google/android/wbc;", "strokeLineCap", "Lcom/google/android/ybc;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "c", "(Ljava/util/List;ILjava/lang/String;Lcom/google/android/qu0;FLcom/google/android/qu0;FFIIFFFF)Lcom/google/android/pp5$a;", "Lcom/google/android/pp5;", "f", "()Lcom/google/android/pp5;", "Ljava/lang/String;", "b", "F", "d", "J", "I", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "nodes", "j", "Lcom/google/android/pp5$a$a;", "root", "k", "isConsumed", "()Lcom/google/android/pp5$a$a;", "currentGroup", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float defaultWidth;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float defaultHeight;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float viewportWidth;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final float viewportHeight;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final long tintColor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int tintBlendMode;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean autoMirror;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final ArrayList<C0120a> nodes;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private C0120a root;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private boolean isConsumed;

        /* JADX INFO: renamed from: com.google.android.pp5$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010,\u001a\u0004\b\u001a\u0010-\"\u0004\b.\u0010/R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b\u0014\u0010-\"\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/google/android/pp5$a$a;", "", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lcom/google/android/u39;", "clipPathData", "", "Lcom/google/android/b3e;", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "b", "F", "f", "()F", "setRotate", "(F)V", "d", "setPivotX", "e", "setPivotY", "g", "setScaleX", "h", "setScaleY", "i", "setTranslationX", "j", "setTranslationY", "Ljava/util/List;", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "setChildren", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class C0120a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private String name;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private float rotate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private float pivotX;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private float pivotY;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private float scaleX;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private float scaleY;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private float translationX;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private float translationY;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private List<? extends u39> clipPathData;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private List<b3e> children;

            public C0120a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public final List<b3e> a() {
                return this.children;
            }

            public final List<u39> b() {
                return this.clipPathData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getPivotX() {
                return this.pivotX;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getPivotY() {
                return this.pivotY;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getRotate() {
                return this.rotate;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getScaleX() {
                return this.scaleX;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final float getScaleY() {
                return this.scaleY;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final float getTranslationX() {
                return this.translationX;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final float getTranslationY() {
                return this.translationY;
            }

            public C0120a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends u39> list, List<b3e> list2) {
                this.name = str;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ C0120a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? a3e.e() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            if ((i & 8) != 0) {
                f3 = 0.0f;
            }
            if ((i & 16) != 0) {
                f4 = 1.0f;
            }
            if ((i & 32) != 0) {
                f5 = 1.0f;
            }
            if ((i & 64) != 0) {
                f6 = 0.0f;
            }
            if ((i & 128) != 0) {
                f7 = 0.0f;
            }
            if ((i & 256) != 0) {
                list = a3e.e();
            }
            float f8 = f7;
            List list2 = list;
            float f9 = f6;
            float f10 = f4;
            return aVar.a(str, f, f2, f3, f10, f5, f9, f8, list2);
        }

        private final z2e e(C0120a c0120a) {
            return new z2e(c0120a.getName(), c0120a.getRotate(), c0120a.getPivotX(), c0120a.getPivotY(), c0120a.getScaleX(), c0120a.getScaleY(), c0120a.getTranslationX(), c0120a.getTranslationY(), c0120a.b(), c0120a.a());
        }

        private final void h() {
            if (this.isConsumed) {
                zw5.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C0120a i() {
            return (C0120a) rp5.d(this.nodes);
        }

        public final a a(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends u39> clipPathData) {
            h();
            rp5.f(this.nodes, new C0120a(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, clipPathData, null, 512, null));
            return this;
        }

        public final a c(List<? extends u39> pathData, int pathFillType, String name, qu0 fill, float fillAlpha, qu0 stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            h();
            i().a().add(new d3e(name, pathData, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        public final pp5 f() {
            h();
            while (this.nodes.size() > 1) {
                g();
            }
            pp5 pp5Var = new pp5(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, e(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return pp5Var;
        }

        public final a g() {
            h();
            i().a().add(e((C0120a) rp5.e(this.nodes)));
            return this;
        }

        private a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<C0120a> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            C0120a c0120a = new C0120a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = c0120a;
            rp5.f(arrayList, c0120a);
        }

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? ei1.INSTANCE.i() : j, (i2 & 64) != 0 ? e.INSTANCE.z() : i, (i2 & 128) != 0 ? false : z, null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.pp5$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/pp5$b;", "", "<init>", "()V", "", "a", "()I", "imageVectorCount", "I", "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int i;
            synchronized (pp5.m) {
                i = pp5.l;
                pp5.l = i + 1;
            }
            return i;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        m = companion;
    }

    public /* synthetic */ pp5(String str, float f, float f2, float f3, float f4, z2e z2eVar, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, z2eVar, j, i, z, i2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof pp5)) {
            return false;
        }
        pp5 pp5Var = (pp5) other;
        return Intrinsics.e(this.name, pp5Var.name) && ff3.k(this.defaultWidth, pp5Var.defaultWidth) && ff3.k(this.defaultHeight, pp5Var.defaultHeight) && this.viewportWidth == pp5Var.viewportWidth && this.viewportHeight == pp5Var.viewportHeight && Intrinsics.e(this.root, pp5Var.root) && ei1.r(this.tintColor, pp5Var.tintColor) && e.E(this.tintBlendMode, pp5Var.tintBlendMode) && this.autoMirror == pp5Var.autoMirror;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDefaultWidth() {
        return this.defaultWidth;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGenId() {
        return this.genId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + ff3.l(this.defaultWidth)) * 31) + ff3.l(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + ei1.x(this.tintColor)) * 31) + e.F(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final z2e getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTintBlendMode() {
        return this.tintBlendMode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    private pp5(String str, float f, float f2, float f3, float f4, z2e z2eVar, long j, int i, boolean z, int i2) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = z2eVar;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
        this.genId = i2;
    }

    public /* synthetic */ pp5(String str, float f, float f2, float f3, float f4, z2e z2eVar, long j, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, z2eVar, j, i, z, (i3 & 512) != 0 ? INSTANCE.a() : i2, null);
    }
}
