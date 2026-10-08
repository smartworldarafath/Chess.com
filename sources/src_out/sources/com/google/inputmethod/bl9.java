package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.p004runtime.d;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.b;
import kotlin.time.k;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\n*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R(\u0010.\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010'\u0012\u0004\b-\u0010\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/google/android/bl9;", "", "Lcom/google/android/ht6;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Lcom/google/android/fl9;", "executor", "<init>", "(Lcom/google/android/ht6;Landroidx/compose/ui/layout/SubcomposeLayoutState;Lcom/google/android/fl9;)V", "", "g", "()V", "", "index", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/cl9;", "prefetchMetrics", "", "isHighPriority", "Lkotlin/Function1;", "Lcom/google/android/nu6$c;", "onItemPremeasured", "Lcom/google/android/nu6$b;", "h", "(IJLcom/google/android/cl9;ZLkotlin/jvm/functions/Function1;)Lcom/google/android/nu6$b;", "Lcom/google/android/dl9;", "request", "e", "(Lcom/google/android/fl9;Lcom/google/android/dl9;Z)V", "d", "(ILcom/google/android/cl9;)Lcom/google/android/dl9;", "a", "Lcom/google/android/ht6;", "b", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "c", "Lcom/google/android/fl9;", "Z", "isStateActive", "f", "()Z", "setShouldPauseBetweenPrecompositionAndPremeasure$foundation", "(Z)V", "getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations", "shouldPauseBetweenPrecompositionAndPremeasure", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bl9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ht6 itemContentFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SubcomposeLayoutState subcomposeLayoutState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final fl9 executor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isStateActive = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean shouldPauseBetweenPrecompositionAndPremeasure;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBA\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u0015*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\u000b*\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u001aJ\u0019\u0010.\u001a\f\u0018\u00010,R\u00060\u0000R\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u001cJ\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u0015*\u00020\u001eH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010?R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010LR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010LR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0018\u0010R\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010QR\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010LR \u0010U\u001a\f\u0018\u00010,R\u00060\u0000R\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010TR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010XR\u0016\u0010]\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010LR\u0014\u0010_\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010^R\u0014\u0010`\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010<¨\u0006a"}, d2 = {"Lcom/google/android/bl9$a;", "Lcom/google/android/nu6$b;", "Lcom/google/android/dl9;", "Lcom/google/android/nu6$c;", "", "index", "Lcom/google/android/cl9;", "prefetchMetrics", "Lcom/google/android/bn9;", "priorityPrefetchScheduler", "Lkotlin/Function1;", "", "onItemPremeasured", "<init>", "(Lcom/google/android/bl9;ILcom/google/android/cl9;Lcom/google/android/bn9;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/kx1;", "constraints", "(Lcom/google/android/bl9;IJLcom/google/android/cl9;Lcom/google/android/bn9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "available", "average", "", "s", "(JJ)Z", "availableTimeNanos", "p", "(J)V", "t", "()V", "h", "Lcom/google/android/el9;", "i", "(Lcom/google/android/el9;)Z", "", "key", "contentType", "Lcom/google/android/ub0;", "averages", "n", "(Lcom/google/android/el9;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/ub0;)V", "l", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "m", "Lcom/google/android/bl9$a$a;", "Lcom/google/android/bl9;", "q", "()Lcom/google/android/bl9$a$a;", "cancel", "d", "placeableIndex", "Lcom/google/android/q16;", "c", "(I)J", "a", "", "toString", "()Ljava/lang/String;", "I", "getIndex", "()I", "b", "Lcom/google/android/cl9;", "Lcom/google/android/bn9;", "Lkotlin/jvm/functions/Function1;", "e", "Lcom/google/android/kx1;", "premeasureConstraints", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "f", "Landroidx/compose/ui/layout/SubcomposeLayoutState$b;", "precomposeHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "g", "Landroidx/compose/ui/layout/SubcomposeLayoutState$a;", "pausedPrecomposition", "Z", "isMeasured", "isCanceled", "j", "isApplied", "Ljava/lang/Object;", "keyUsedForComposition", "hasResolvedNestedPrefetches", "Lcom/google/android/bl9$a$a;", "nestedPrefetchController", "isUrgent", "o", "J", "elapsedTimeNanos", "Lkotlin/time/k$a$a;", "startTime", "r", "pauseRequested", "()Z", "isComposed", "placeablesCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a implements nu6.b, dl9, nu6.c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final cl9 prefetchMetrics;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final bn9 priorityPrefetchScheduler;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Function1<nu6.c, Unit> onItemPremeasured;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private kx1 premeasureConstraints;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private SubcomposeLayoutState.b precomposeHandle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private SubcomposeLayoutState.a pausedPrecomposition;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private boolean isMeasured;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private boolean isApplied;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private Object keyUsedForComposition;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private C0100a nestedPrefetchController;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private boolean isUrgent;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private long availableTimeNanos;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private long elapsedTimeNanos;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private long startTime;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private boolean pauseRequested;

        /* JADX INFO: renamed from: com.google.android.bl9$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/bl9$a$a;", "", "", "Lcom/google/android/nu6;", "states", "<init>", "(Lcom/google/android/bl9$a;Ljava/util/List;)V", "Lcom/google/android/el9;", "", "nestedPrefetchCount", "", "isUrgent", "c", "(Lcom/google/android/el9;IZ)Z", "a", "()I", "b", "Ljava/util/List;", "", "Lcom/google/android/dl9;", "[Ljava/util/List;", "requestsByState", "I", "stateIndex", "d", "requestIndex", "e", "Z", "()Z", "(Z)V", "executedNestedPrefetch", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private final class C0100a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<nu6> states;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final List<dl9>[] requestsByState;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private int stateIndex;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private int requestIndex;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private boolean executedNestedPrefetch;

            public C0100a(List<nu6> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    cx5.a("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final int a() {
                List<nu6> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    iMin = Math.min(iMin, list.get(i).getIdealNestedPrefetchCount());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final int b() {
                List<nu6> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    iMin = Math.min(iMin, list.get(i).getLastNumberOfNestedPrefetchItems());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final boolean c(el9 el9Var, int i, boolean z) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (a.this.isCanceled) {
                    cx5.c("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                try {
                    List<nu6> list = this.states;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.get(i2).l(i);
                    }
                    Unit unit = Unit.a;
                    Trace.endSection();
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.stateIndex < this.states.size()) {
                        try {
                            if (this.requestsByState[this.stateIndex] == null) {
                                if (el9Var.a() <= 0) {
                                    Trace.endSection();
                                    return true;
                                }
                                List<dl9>[] listArr = this.requestsByState;
                                int i3 = this.stateIndex;
                                listArr[i3] = this.states.get(i3).b();
                            }
                            List<dl9> list2 = this.requestsByState[this.stateIndex];
                            Intrinsics.g(list2);
                            while (this.requestIndex < list2.size()) {
                                dl9 dl9Var = list2.get(this.requestIndex);
                                if (z) {
                                    a aVar = dl9Var instanceof a ? (a) dl9Var : null;
                                    if (aVar != null) {
                                        aVar.d();
                                    }
                                }
                                this.executedNestedPrefetch = true;
                                if (dl9Var.a(el9Var)) {
                                    Trace.endSection();
                                    return true;
                                }
                                this.requestIndex++;
                            }
                            this.requestIndex = 0;
                            this.stateIndex++;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    Unit unit2 = Unit.a;
                    Trace.endSection();
                    return false;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getExecutedNestedPrefetch() {
                return this.executedNestedPrefetch;
            }

            public final void e(boolean z) {
                this.executedNestedPrefetch = z;
            }
        }

        public /* synthetic */ a(bl9 bl9Var, int i, long j, cl9 cl9Var, bn9 bn9Var, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
            this(bl9Var, i, j, cl9Var, bn9Var, function1);
        }

        private final void h() {
            SubcomposeLayoutState.a aVar = this.pausedPrecomposition;
            if (aVar != null) {
                aVar.cancel();
            }
            this.pausedPrecomposition = null;
            SubcomposeLayoutState.b bVar = this.precomposeHandle;
            if (bVar != null) {
                bVar.dispose();
            }
            this.precomposeHandle = null;
            this.nestedPrefetchController = null;
        }

        private final boolean i(el9 el9Var) {
            uo.a("compose:lazy:prefetch:execute:item", getIndex());
            lt6 lt6Var = (lt6) bl9.this.itemContentFactory.d().invoke();
            if (!this.isCanceled) {
                int iA = lt6Var.a();
                int index = getIndex();
                if (index >= 0 && index < iA) {
                    Object objD = lt6Var.d(getIndex());
                    Object obj = this.keyUsedForComposition;
                    if (obj != null && !Intrinsics.e(objD, obj)) {
                        h();
                        return false;
                    }
                    Object objF = lt6Var.f(getIndex());
                    ub0 ub0VarA = this.prefetchMetrics.a(objF);
                    boolean zJ = j();
                    p(el9Var.a());
                    if (!j()) {
                        if (up1.isPausableCompositionInPrefetchEnabled) {
                            if (s(this.availableTimeNanos, ub0VarA.getResumeTimeNanos() + ub0VarA.getPauseTimeNanos())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    n(el9Var, objD, objF, ub0VarA);
                                    Unit unit = Unit.a;
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            }
                        } else if (s(this.availableTimeNanos, ub0VarA.getCompositionTimeNanos())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                l(objD, objF);
                                Unit unit2 = Unit.a;
                                Trace.endSection();
                                t();
                                ub0VarA.k(this.elapsedTimeNanos);
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                        if (!j()) {
                            return true;
                        }
                    }
                    if (this.pausedPrecomposition != null) {
                        if (!s(this.availableTimeNanos, ub0VarA.getApplyTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            k();
                            Unit unit3 = Unit.a;
                            Trace.endSection();
                            t();
                            ub0VarA.j(this.elapsedTimeNanos);
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    if (!this.hasResolvedNestedPrefetches) {
                        if (this.availableTimeNanos <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.nestedPrefetchController = q();
                            this.hasResolvedNestedPrefetches = true;
                            Unit unit4 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    C0100a c0100a = this.nestedPrefetchController;
                    if (c0100a != null ? c0100a.c(el9Var, ub0VarA.getNestedPrefetchCount(), this.isUrgent) : false) {
                        return true;
                    }
                    C0100a c0100a2 = this.nestedPrefetchController;
                    if (c0100a2 != null && c0100a2.getExecutedNestedPrefetch()) {
                        t();
                        uo.a("compose:lazy:prefetch:execute:item", getIndex());
                        C0100a c0100a3 = this.nestedPrefetchController;
                        if (c0100a3 != null) {
                            c0100a3.e(false);
                        }
                    }
                    kx1 kx1Var = this.premeasureConstraints;
                    if (!this.isMeasured && kx1Var != null) {
                        if ((bl9.this.getShouldPauseBetweenPrecompositionAndPremeasure() && !zJ) || !s(this.availableTimeNanos, ub0VarA.getMeasureTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m(kx1Var.getValue());
                            Unit unit5 = Unit.a;
                            Trace.endSection();
                            t();
                            ub0VarA.l(this.elapsedTimeNanos);
                            Function1<nu6.c, Unit> function1 = this.onItemPremeasured;
                            if (function1 != null) {
                                function1.invoke(this);
                            }
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                    C0100a c0100a4 = this.nestedPrefetchController;
                    if (this.isMeasured && this.hasResolvedNestedPrefetches && c0100a4 != null) {
                        int iA2 = c0100a4.a();
                        ub0VarA.m(iA2);
                        if (c0100a4.b() < iA2) {
                            ub0VarA.c();
                        }
                    }
                    return false;
                }
            }
            h();
            return false;
        }

        private final boolean j() {
            SubcomposeLayoutState.a aVar;
            return this.isApplied || ((aVar = this.pausedPrecomposition) != null && aVar.getIsComplete());
        }

        private final void k() {
            SubcomposeLayoutState.a aVar = this.pausedPrecomposition;
            if (aVar == null) {
                throw new IllegalArgumentException("Nothing to apply!");
            }
            this.precomposeHandle = aVar.apply();
            this.pausedPrecomposition = null;
            this.isApplied = true;
        }

        private final void l(Object key, Object contentType) {
            if (!(this.precomposeHandle == null)) {
                cx5.a("Request was already composed!");
            }
            Function2<d, Integer, Unit> function2B = bl9.this.itemContentFactory.b(getIndex(), key, contentType);
            this.keyUsedForComposition = key;
            this.precomposeHandle = bl9.this.subcomposeLayoutState.j(key, function2B);
            this.isApplied = true;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        private final void m(long constraints) throws KotlinNothingValueException {
            if (this.isCanceled) {
                cx5.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                cx5.a("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.b bVar = this.precomposeHandle;
            if (bVar == null) {
                cx5.b("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iB = bVar.b();
            for (int i = 0; i < iB; i++) {
                bVar.e(i, constraints);
            }
        }

        private final void n(el9 el9Var, Object obj, Object obj2, final ub0 ub0Var) {
            SubcomposeLayoutState.a aVarD = this.pausedPrecomposition;
            if (aVarD == null) {
                bl9 bl9Var = bl9.this;
                aVarD = bl9Var.subcomposeLayoutState.d(obj, bl9Var.itemContentFactory.b(getIndex(), obj, obj2));
                this.pausedPrecomposition = aVarD;
                this.keyUsedForComposition = obj;
            }
            this.pauseRequested = false;
            while (!aVarD.getIsComplete() && !this.pauseRequested) {
                aVarD.b(new fob() { // from class: com.google.android.al9
                    @Override // com.google.inputmethod.fob
                    public final boolean a() {
                        return bl9.a.o(this.a, ub0Var);
                    }
                });
            }
            t();
            if (this.pauseRequested) {
                ub0Var.n(this.elapsedTimeNanos);
            } else {
                ub0Var.o(this.elapsedTimeNanos);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, ub0 ub0Var) {
            if (!aVar.pauseRequested) {
                aVar.t();
                ub0Var.o(aVar.elapsedTimeNanos);
                aVar.pauseRequested = !aVar.s(aVar.availableTimeNanos, ub0Var.getResumeTimeNanos() + ub0Var.getPauseTimeNanos());
            }
            return aVar.pauseRequested;
        }

        private final void p(long availableTimeNanos) {
            this.availableTimeNanos = availableTimeNanos;
            this.startTime = k.a.a.b();
            this.elapsedTimeNanos = 0L;
            uo.a("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        private final C0100a q() throws KotlinNothingValueException {
            SubcomposeLayoutState.b bVar = this.precomposeHandle;
            if (bVar == null) {
                cx5.b("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            bVar.d("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new Function1() { // from class: com.google.android.zk9
                public final Object invoke(Object obj) {
                    return bl9.a.r(objectRef, (fhd) obj);
                }
            });
            List list = (List) objectRef.element;
            if (list != null) {
                return new C0100a(list);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TraversableNode$Companion$TraverseDescendantsAction r(Ref.ObjectRef objectRef, fhd fhdVar) {
            Intrinsics.h(fhdVar, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
            nu6 nu6VarM3 = ((ihd) fhdVar).getPrefetchState();
            List listV = (List) objectRef.element;
            if (listV != null) {
                listV.add(nu6VarM3);
            } else {
                listV = m.v(new nu6[]{nu6VarM3});
            }
            objectRef.element = listV;
            return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }

        private final boolean s(long available, long average) {
            if (this.isUrgent) {
                average = 0;
            }
            return available > average;
        }

        private final void t() {
            long jB = k.a.a.b();
            long jX = b.x(k.a.a.j(jB, this.startTime));
            this.elapsedTimeNanos = jX;
            long j = this.availableTimeNanos - jX;
            this.availableTimeNanos = j;
            this.startTime = jB;
            uo.a("compose:lazy:prefetch:available_time_nanos", j);
        }

        @Override // com.google.inputmethod.dl9
        public boolean a(el9 el9Var) {
            boolean zI;
            if (!bl9.this.isStateActive) {
                return false;
            }
            if (this.isUrgent) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zI = i(el9Var);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                zI = i(el9Var);
            }
            uo.a("compose:lazy:prefetch:execute:item", -1L);
            return zI;
        }

        @Override // com.google.android.nu6.c
        public int b() {
            SubcomposeLayoutState.b bVar = this.precomposeHandle;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // com.google.android.nu6.c
        public long c(int placeableIndex) {
            SubcomposeLayoutState.b bVar = this.precomposeHandle;
            return bVar != null ? bVar.c(placeableIndex) : q16.INSTANCE.a();
        }

        @Override // com.google.android.nu6.b
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            h();
        }

        @Override // com.google.android.nu6.b
        public void d() {
            this.isUrgent = true;
        }

        @Override // com.google.android.nu6.c
        public int getIndex() {
            return this.index;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + getIndex() + ", constraints = " + this.premeasureConstraints + ", isComposed = " + j() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, cl9 cl9Var, bn9 bn9Var, Function1<? super nu6.c, Unit> function1) {
            this.index = i;
            this.prefetchMetrics = cl9Var;
            this.priorityPrefetchScheduler = bn9Var;
            this.onItemPremeasured = function1;
            this.startTime = k.a.a.b();
        }

        private a(bl9 bl9Var, int i, long j, cl9 cl9Var, bn9 bn9Var, Function1<? super nu6.c, Unit> function1) {
            this(i, cl9Var, bn9Var, function1);
            this.premeasureConstraints = kx1.a(j);
        }
    }

    public bl9(ht6 ht6Var, SubcomposeLayoutState subcomposeLayoutState, fl9 fl9Var) {
        this.itemContentFactory = ht6Var;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = fl9Var;
    }

    public final dl9 d(int index, cl9 prefetchMetrics) {
        fl9 fl9Var = this.executor;
        return new a(index, prefetchMetrics, fl9Var instanceof bn9 ? (bn9) fl9Var : null, null);
    }

    public final void e(fl9 fl9Var, dl9 dl9Var, boolean z) {
        if (!(fl9Var instanceof bn9)) {
            fl9Var.a(dl9Var);
        } else if (z) {
            ((bn9) fl9Var).b(dl9Var);
        } else {
            ((bn9) fl9Var).c(dl9Var);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldPauseBetweenPrecompositionAndPremeasure() {
        return this.shouldPauseBetweenPrecompositionAndPremeasure;
    }

    public final void g() {
        this.isStateActive = false;
    }

    public final nu6.b h(int index, long constraints, cl9 prefetchMetrics, boolean isHighPriority, Function1<? super nu6.c, Unit> onItemPremeasured) {
        fl9 fl9Var = this.executor;
        a aVar = new a(this, index, constraints, prefetchMetrics, fl9Var instanceof bn9 ? (bn9) fl9Var : null, onItemPremeasured, null);
        e(this.executor, aVar, isHighPriority);
        uo.a("compose:lazy:schedule_prefetch:index", index);
        return aVar;
    }
}
