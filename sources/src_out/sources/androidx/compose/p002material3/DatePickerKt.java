package androidx.compose.p002material3;

import androidx.compose.p000animation.AnimatedContentKt;
import androidx.compose.p000animation.AnimatedContentTransitionScope;
import androidx.compose.p000animation.AnimatedVisibilityKt;
import androidx.compose.p000animation.EnterExitTransitionKt;
import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p001foundation.lazy.LazyListState;
import androidx.compose.p001foundation.lazy.grid.LazyGridState;
import androidx.compose.p002material3.DatePickerKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rs4;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.android.ut0;
import com.google.inputmethod.BorderStroke;
import com.google.inputmethod.CalendarDate;
import com.google.inputmethod.CalendarMonth;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.aad;
import com.google.inputmethod.afb;
import com.google.inputmethod.afc;
import com.google.inputmethod.b21;
import com.google.inputmethod.bo2;
import com.google.inputmethod.bp6;
import com.google.inputmethod.by0;
import com.google.inputmethod.c21;
import com.google.inputmethod.ce3;
import com.google.inputmethod.cpc;
import com.google.inputmethod.cqa;
import com.google.inputmethod.cw6;
import com.google.inputmethod.cz1;
import com.google.inputmethod.d08;
import com.google.inputmethod.d21;
import com.google.inputmethod.d57;
import com.google.inputmethod.ddb;
import com.google.inputmethod.dfa;
import com.google.inputmethod.do1;
import com.google.inputmethod.dud;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff1;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fs1;
import com.google.inputmethod.g21;
import com.google.inputmethod.gs1;
import com.google.inputmethod.h02;
import com.google.inputmethod.hp6;
import com.google.inputmethod.hpa;
import com.google.inputmethod.hra;
import com.google.inputmethod.ira;
import com.google.inputmethod.jp2;
import com.google.inputmethod.k0b;
import com.google.inputmethod.ko1;
import com.google.inputmethod.ldb;
import com.google.inputmethod.lqa;
import com.google.inputmethod.lr6;
import com.google.inputmethod.m15;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nj5;
import com.google.inputmethod.ns9;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.os9;
import com.google.inputmethod.pp1;
import com.google.inputmethod.pp5;
import com.google.inputmethod.pr0;
import com.google.inputmethod.q16;
import com.google.inputmethod.qg4;
import com.google.inputmethod.qxc;
import com.google.inputmethod.qzb;
import com.google.inputmethod.rbc;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sj5;
import com.google.inputmethod.sq;
import com.google.inputmethod.sq6;
import com.google.inputmethod.tc;
import com.google.inputmethod.tj5;
import com.google.inputmethod.uj5;
import com.google.inputmethod.ulb;
import com.google.inputmethod.up6;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn2;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wp2;
import com.google.inputmethod.wx0;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xod;
import com.google.inputmethod.yj1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\u001ao\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001am\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b#\u0010$\u001a;\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b(\u0010)\u001a\u0085\u0001\u00100\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00172\u0014\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b0\u00101\u001aq\u00102\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00122\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b2\u00103\u001aM\u00108\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b8\u00109\u001aq\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b<\u0010=\u001a<\u0010>\u001a\u00020\t2\u0006\u0010;\u001a\u00020:2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b>\u0010?\u001a\u001f\u0010@\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b@\u0010A\u001au\u0010L\u001a\u00020\t2\u0006\u0010C\u001a\u00020B2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0&2\u0006\u0010D\u001a\u00020\u00122\b\u0010E\u001a\u0004\u0018\u00010\u00122\b\u0010F\u001a\u0004\u0018\u00010\u00122\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010K\u001a\u00060Ij\u0002`JH\u0001¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010O\u001a\u00020N2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\bO\u0010P\u001a9\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\fH\u0003¢\u0006\u0004\bW\u0010X\u001ae\u0010a\u001a\u00020\t2\u0006\u0010Y\u001a\u00020V2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\f2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\f2\u0006\u0010^\u001a\u00020\f2\u0006\u0010_\u001a\u00020\f2\u0006\u0010`\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\ba\u0010b\u001aS\u0010d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00122\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\t0&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\bd\u0010e\u001aU\u0010g\u001a\u00020\t2\u0006\u0010Y\u001a\u00020V2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\f2\u0006\u0010f\u001a\u00020\f2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010]\u001a\u00020\f2\u0006\u0010`\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\bg\u0010h\u001ai\u0010p\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010i\u001a\u00020\f2\u0006\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\f2\u0006\u0010l\u001a\u00020V2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\bp\u0010q\u001a=\u0010s\u001a\u00020\t2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\bs\u0010t\u001aA\u0010x\u001a\u00020\t2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010v\u001a\u00020u2\u0006\u0010w\u001a\u00020V2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010]\u001a\u00020\fH\u0003¢\u0006\u0004\bx\u0010y\"\u001a\u0010~\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u001c\u0010\u0081\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010}\"\u001d\u0010\u0084\u0001\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010{\u001a\u0005\b\u0083\u0001\u0010}\" \u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0018\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0018\u0010\u008e\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0087\u0001\"\u0016\u0010\u0090\u0001\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010{¨\u0006\u0091\u0001²\u0006\u000e\u0010k\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/google/android/wp2;", "state", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/bo2;", "dateFormatter", "Lcom/google/android/vn2;", "colors", "Lkotlin/Function0;", "", "title", "headline", "", "showModeToggle", "Landroidx/compose/ui/focus/f;", "focusRequester", "K", "(Lcom/google/android/wp2;Landroidx/compose/ui/b;Lcom/google/android/bo2;Lcom/google/android/vn2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/focus/f;Landroidx/compose/runtime/d;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/c0;", "initialDisplayMode", "Lcom/google/android/ddb;", "selectableDates", "S0", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILcom/google/android/ddb;Landroidx/compose/runtime/d;II)Lcom/google/android/wp2;", "modeToggleButton", "Landroidx/compose/ui/text/y;", "headlineTextStyle", "Lcom/google/android/ff3;", "headerMinHeight", "content", "H", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/google/android/vn2;Landroidx/compose/ui/text/y;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "Z", "(Landroidx/compose/ui/b;ILkotlin/jvm/functions/Function1;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "selectedDateMillis", "displayedMonthMillis", "onDateSelectionChange", "onDisplayedMonthChange", "Lcom/google/android/d21;", "calendarModel", "k0", "(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/bo2;Lcom/google/android/ddb;Lcom/google/android/vn2;Landroidx/compose/ui/focus/f;Landroidx/compose/runtime/d;II)V", "M", "(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/bo2;Lcom/google/android/ddb;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/ei1;", "titleContentColor", "headlineContentColor", "minHeight", "U", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "b0", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/bo2;Lcom/google/android/ddb;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "U0", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/q22;)Ljava/lang/Object;", "t0", "(Lcom/google/android/vn2;Lcom/google/android/d21;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/h21;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Lcom/google/android/ldb;", "rangeSelectionInfo", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "f0", "(Lcom/google/android/h21;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ljava/lang/Long;Lcom/google/android/ldb;Lcom/google/android/bo2;Lcom/google/android/ddb;Lcom/google/android/vn2;Ljava/util/Locale;Landroidx/compose/runtime/d;I)V", "", "R0", "(Lkotlin/ranges/IntRange;)I", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "N0", "(ZZZZZLandroidx/compose/runtime/d;I)Ljava/lang/String;", "text", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "W", "(Ljava/lang/String;Landroidx/compose/ui/b;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "onYearSelected", "z0", "(Landroidx/compose/ui/b;JLkotlin/jvm/functions/Function1;Lcom/google/android/ddb;Lcom/google/android/d21;Lkotlin/ranges/IntRange;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "currentYear", "w0", "(Ljava/lang/String;Landroidx/compose/ui/b;ZZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "i0", "(Landroidx/compose/ui/b;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/google/android/vn2;Landroidx/compose/runtime/d;I)V", "expanded", "B0", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/pp5;", "icon", "contentDescription", "d0", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/pp5;Ljava/lang/String;Landroidx/compose/ui/b;ZLandroidx/compose/runtime/d;II)V", "a", "F", "Q0", "()F", "RecommendedSizeForAccessibility", "b", "getMonthYearHeight", "MonthYearHeight", "c", "O0", "DatePickerHorizontalPadding", "Lcom/google/android/rx8;", "d", "Lcom/google/android/rx8;", "P0", "()Lcom/google/android/rx8;", "DatePickerModeTogglePadding", "e", "DatePickerTitlePadding", "f", "DatePickerHeadlinePadding", "g", "YearsVerticalPadding", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DatePickerKt {
    private static final float a = ff3.i(48);
    private static final float b = ff3.i(56);
    private static final float c;
    private static final rx8 d;
    private static final rx8 e;
    private static final rx8 f;
    private static final float g;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;
        final /* synthetic */ vn2 d;
        final /* synthetic */ TextStyle e;

        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0031a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ hra a;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

            /* JADX WARN: Multi-variable type inference failed */
            C0031a(hra hraVar, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
                this.a = hraVar;
                this.b = function2;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-738208900, i, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1385)");
                }
                androidx.compose.ui.b bVarB = hra.b(this.a, androidx.compose.ui.b.INSTANCE, 1.0f, false, 2, null);
                Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.b;
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarB);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B = companion.b();
                if (dVar.G() == null) {
                    pp1.d();
                }
                dVar.o();
                if (dVar.getInserting()) {
                    dVar.W(function0B);
                } else {
                    dVar.k();
                }
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVar, 0);
                dVar.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, vn2 vn2Var, TextStyle textStyle) {
            this.a = function2;
            this.b = function3;
            this.c = function4;
            this.d = vn2Var;
            this.e = textStyle;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            androidx.compose.foundation.layout.c.e eVarJ;
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1658370654, i, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1371)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarH = SizeKt.h(companion, 0.0f, 1, null);
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function3 = this.b;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function4 = this.c;
            vn2 vn2Var = this.d;
            TextStyle textStyle = this.e;
            androidx.compose.p001foundation.layout.c cVar = androidx.compose.p001foundation.layout.c.a;
            androidx.compose.foundation.layout.c.n nVarK = cVar.k();
            tc.Companion companion2 = tc.INSTANCE;
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(nVarK, companion2.k(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarH);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarA, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            yj1 yj1Var = yj1.a;
            if (function2 == null || function3 == null) {
                eVarJ = function2 != null ? cVar.j() : cVar.f();
            } else {
                eVarJ = cVar.h();
            }
            androidx.compose.ui.b bVarH2 = SizeKt.h(companion, 0.0f, 1, null);
            ej7 ej7VarB = t0.b(eVarJ, companion2.i(), dVar, 48);
            int iA2 = pp1.a(dVar, 0);
            gs1 gs1VarJ2 = dVar.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVar, bVarH2);
            Function0<ComposeUiNode> function0B2 = companion3.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B2);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC2 = dud.c(dVar);
            dud.i(dVarC2, ej7VarB, companion3.d());
            dud.i(dVarC2, gs1VarJ2, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
            if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE2, companion3.e());
            ira iraVar = ira.a;
            if (function2 != null) {
                dVar.y(-516028300);
                qxc.h(textStyle, ko1.e(-738208900, true, new C0031a(iraVar, function2), dVar, 54), dVar, 48);
                dVar.u();
            } else {
                dVar.y(-515838022);
                dVar.u();
            }
            if (function3 == null) {
                dVar.y(-515799087);
            } else {
                dVar.y(260455984);
                function3.invoke(dVar, 0);
            }
            dVar.u();
            dVar.m();
            if (function4 == null && function2 == null && function3 == null) {
                dVar.y(-250277930);
                dVar.u();
            } else {
                dVar.y(-250360576);
                ce3.e(null, 0.0f, vn2Var.getDividerColor(), dVar, 0, 3);
                dVar.u();
            }
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ wp2 a;
        final /* synthetic */ vn2 b;

        b(wp2 wp2Var, vn2 vn2Var) {
            this.a = wp2Var;
            this.b = vn2Var;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1655706771, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
            }
            androidx.compose.p002material3.h.a.g(this.a.g(), nx8.l(androidx.compose.ui.b.INSTANCE, DatePickerKt.e), this.b.getTitleContentColor(), dVar, 3120, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ wp2 a;
        final /* synthetic */ bo2 b;
        final /* synthetic */ vn2 c;

        c(wp2 wp2Var, bo2 bo2Var, vn2 vn2Var) {
            this.a = wp2Var;
            this.b = bo2Var;
            this.c = vn2Var;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1439279037, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
            }
            androidx.compose.p002material3.h.a.d(this.a.d(), this.a.g(), this.b, nx8.l(androidx.compose.ui.b.INSTANCE, DatePickerKt.f), this.c.getHeadlineContentColor(), dVar, 199680, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ wp2 a;
        final /* synthetic */ vn2 b;

        d(wp2 wp2Var, vn2 vn2Var) {
            this.a = wp2Var;
            this.b = vn2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(wp2 wp2Var, c0 c0Var) {
            wp2Var.f(c0Var.getValue());
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1483431603, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:206)");
            }
            androidx.compose.ui.b bVarL = nx8.l(androidx.compose.ui.b.INSTANCE, DatePickerKt.P0());
            int iG = this.a.g();
            boolean zX = dVar.x(this.a);
            final wp2 wp2Var = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.j
                    public final Object invoke(Object obj) {
                        return DatePickerKt.d.c(wp2Var, (c0) obj);
                    }
                };
                dVar.L(objR);
            }
            DatePickerKt.Z(bVarL, iG, (Function1) objR, this.b, dVar, 6);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ wp2 a;
        final /* synthetic */ d21 b;
        final /* synthetic */ bo2 c;
        final /* synthetic */ vn2 d;
        final /* synthetic */ androidx.compose.ui.focus.f e;

        e(wp2 wp2Var, d21 d21Var, bo2 bo2Var, vn2 vn2Var, androidx.compose.ui.focus.f fVar) {
            this.a = wp2Var;
            this.b = d21Var;
            this.c = bo2Var;
            this.d = vn2Var;
            this.e = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(wp2 wp2Var, Long l) {
            wp2Var.a(l);
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(wp2 wp2Var, long j) {
            wp2Var.b(j);
            return Unit.a;
        }

        public final void c(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1346903698, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)");
            }
            Long lD = this.a.d();
            long jH = this.a.h();
            int iG = this.a.g();
            boolean zX = dVar.x(this.a);
            final wp2 wp2Var = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.k
                    public final Object invoke(Object obj) {
                        return DatePickerKt.e.d(wp2Var, (Long) obj);
                    }
                };
                dVar.L(objR);
            }
            Function1 function1 = (Function1) objR;
            boolean zX2 = dVar.x(this.a);
            final wp2 wp2Var2 = this.a;
            Object objR2 = dVar.R();
            if (zX2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR2 = new Function1() { // from class: androidx.compose.material3.l
                    public final Object invoke(Object obj) {
                        return DatePickerKt.e.g(wp2Var2, ((Long) obj).longValue());
                    }
                };
                dVar.L(objR2);
            }
            DatePickerKt.k0(lD, jH, iG, function1, (Function1) objR2, this.b, this.a.e(), this.c, this.a.c(), this.d, this.e, dVar, 0, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1344395458, i, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1692)");
            }
            tc tcVarD = tc.INSTANCE.d();
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tcVarD, false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ vn2 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ boolean f;

        g(String str, vn2 vn2Var, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = str;
            this.b = vn2Var;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1126347158, i, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2032)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            jp2 jp2Var = jp2.a;
            androidx.compose.ui.b bVarN = SizeKt.n(companion, jp2Var.g(), jp2Var.e());
            tc tcVarE = tc.INSTANCE.e();
            String str = this.a;
            vn2 vn2Var = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            boolean z4 = this.f;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tcVarE, false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarN);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.o
                    public final Object invoke(Object obj) {
                        return DatePickerKt.g.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(str, afb.a(companion, (Function1) objR), vn2Var.b(z, z2, z3, z4, dVar, 0).getValue().getValue(), null, 0L, null, null, null, 0L, null, cpc.h(cpc.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 261112);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ Function1<c0, Unit> b;
        final /* synthetic */ androidx.compose.ui.b c;

        /* JADX WARN: Multi-variable type inference failed */
        h(int i, Function1<? super c0, Unit> function1, androidx.compose.ui.b bVar) {
            this.a = i;
            this.b = function1;
            this.c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(c0.c(c0.INSTANCE.a()));
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1) {
            function1.invoke(c0.c(c0.INSTANCE.b()));
            return Unit.a;
        }

        public final void c(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1734512197, i, -1, "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)");
            }
            if (c0.f(this.a, c0.INSTANCE.b())) {
                dVar.y(-101264927);
                pp5 pp5VarD = uj5.a.d();
                rbc.Companion companion = rbc.INSTANCE;
                String strB = vbc.b(rbc.a(wz9.t), dVar, 0);
                boolean zX = dVar.x(this.b);
                final Function1<c0, Unit> function1 = this.b;
                Object objR = dVar.R();
                if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function0() { // from class: androidx.compose.material3.p
                        public final Object invoke() {
                            return DatePickerKt.h.d(function1);
                        }
                    };
                    dVar.L(objR);
                }
                DatePickerKt.d0((Function0) objR, pp5VarD, strB, this.c, false, dVar, 0, 16);
                dVar.u();
            } else {
                dVar.y(-100967048);
                pp5 pp5VarC = uj5.a.c();
                rbc.Companion companion2 = rbc.INSTANCE;
                String strB2 = vbc.b(rbc.a(wz9.r), dVar, 0);
                boolean zX2 = dVar.x(this.b);
                final Function1<c0, Unit> function2 = this.b;
                Object objR2 = dVar.R();
                if (zX2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR2 = new Function0() { // from class: androidx.compose.material3.q
                        public final Object invoke() {
                            return DatePickerKt.h.g(function2);
                        }
                    };
                    dVar.L(objR2);
                }
                DatePickerKt.d0((Function0) objR2, pp5VarC, strB2, this.c, false, dVar, 0, 16);
                dVar.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class i implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ IntRange b;
        final /* synthetic */ d21 c;
        final /* synthetic */ CalendarMonth d;
        final /* synthetic */ Function1<Long, Unit> e;
        final /* synthetic */ CalendarDate f;
        final /* synthetic */ Long g;
        final /* synthetic */ bo2 h;
        final /* synthetic */ ddb i;
        final /* synthetic */ vn2 j;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements rs4<lr6, Integer, androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ d21 a;
            final /* synthetic */ CalendarMonth b;
            final /* synthetic */ Function1<Long, Unit> c;
            final /* synthetic */ CalendarDate d;
            final /* synthetic */ Long e;
            final /* synthetic */ bo2 f;
            final /* synthetic */ ddb g;
            final /* synthetic */ vn2 h;

            /* JADX WARN: Multi-variable type inference failed */
            a(d21 d21Var, CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Long l, bo2 bo2Var, ddb ddbVar, vn2 vn2Var) {
                this.a = d21Var;
                this.b = calendarMonth;
                this.c = function1;
                this.d = calendarDate;
                this.e = l;
                this.f = bo2Var;
                this.g = ddbVar;
                this.h = vn2Var;
            }

            public final void a(lr6 lr6Var, int i, androidx.compose.p004runtime.d dVar, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (dVar.x(lr6Var) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= dVar.C(i) ? 32 : 16;
                }
                if (!dVar.g((i3 & 147) != 146, i3 & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(72599078, i3, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
                }
                CalendarMonth calendarMonthM = this.a.m(this.b, i);
                androidx.compose.ui.b bVarC = lr6.c(lr6Var, androidx.compose.ui.b.INSTANCE, 0.0f, 1, null);
                Function1<Long, Unit> function1 = this.c;
                CalendarDate calendarDate = this.d;
                Long l = this.e;
                bo2 bo2Var = this.f;
                ddb ddbVar = this.g;
                vn2 vn2Var = this.h;
                d21 d21Var = this.a;
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                int iA = pp1.a(dVar, 0);
                gs1 gs1VarJ = dVar.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B = companion.b();
                if (dVar.G() == null) {
                    pp1.d();
                }
                dVar.o();
                if (dVar.getInserting()) {
                    dVar.W(function0B);
                } else {
                    dVar.k();
                }
                androidx.compose.p004runtime.d dVarC = dud.c(dVar);
                dud.i(dVarC, ej7VarI, companion.d());
                dud.i(dVarC, gs1VarJ, companion.f());
                Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                DatePickerKt.f0(calendarMonthM, function1, calendarDate.getUtcTimeMillis(), l, null, null, bo2Var, ddbVar, vn2Var, d21Var.getLocale(), dVar, 221184);
                dVar.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a((lr6) obj, ((Number) obj2).intValue(), (androidx.compose.p004runtime.d) obj3, ((Number) obj4).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(LazyListState lazyListState, IntRange intRange, d21 d21Var, CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Long l, bo2 bo2Var, ddb ddbVar, vn2 vn2Var) {
            this.a = lazyListState;
            this.b = intRange;
            this.c = d21Var;
            this.d = calendarMonth;
            this.e = function1;
            this.f = calendarDate;
            this.g = l;
            this.h = bo2Var;
            this.i = ddbVar;
            this.j = vn2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(nfb nfbVar) {
            SemanticsPropertiesKt.i0(nfbVar, new ScrollAxisRange(new Function0() { // from class: androidx.compose.material3.t
                public final Object invoke() {
                    return Float.valueOf(DatePickerKt.i.j());
                }
            }, new Function0() { // from class: androidx.compose.material3.u
                public final Object invoke() {
                    return Float.valueOf(DatePickerKt.i.k());
                }
            }, false, 4, null));
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float j() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float k() {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(IntRange intRange, d21 d21Var, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, cw6 cw6Var) {
            cw6.i(cw6Var, DatePickerKt.R0(intRange), null, null, ko1.c(72599078, true, new a(d21Var, calendarMonth, function1, calendarDate, l, bo2Var, ddbVar, vn2Var)), 6, null);
            return Unit.a;
        }

        public final void g(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1504086906, i, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            Object objR = dVar.R();
            androidx.compose.p004runtime.d.Companion companion2 = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion2.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.r
                    public final Object invoke(Object obj) {
                        return DatePickerKt.i.i((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarD = afb.d(companion, false, (Function1) objR, 1, null);
            LazyListState lazyListState = this.a;
            qg4 qg4VarQ = androidx.compose.p002material3.h.a.q(lazyListState, null, dVar, 384, 2);
            boolean zT = dVar.T(this.b) | dVar.T(this.c) | dVar.x(this.d) | dVar.x(this.e) | dVar.x(this.f) | dVar.x(this.g) | dVar.T(this.h) | dVar.x(this.i) | dVar.x(this.j);
            final IntRange intRange = this.b;
            final d21 d21Var = this.c;
            final CalendarMonth calendarMonth = this.d;
            final Function1<Long, Unit> function1 = this.e;
            final CalendarDate calendarDate = this.f;
            final Long l = this.g;
            final bo2 bo2Var = this.h;
            final ddb ddbVar = this.i;
            final vn2 vn2Var = this.j;
            Object objR2 = dVar.R();
            if (zT || objR2 == companion2.a()) {
                Function1 function2 = new Function1() { // from class: androidx.compose.material3.s
                    public final Object invoke(Object obj) {
                        return DatePickerKt.i.l(intRange, d21Var, calendarMonth, function1, calendarDate, l, bo2Var, ddbVar, vn2Var, (cw6) obj);
                    }
                };
                dVar.L(function2);
                objR2 = function2;
            }
            bp6.e(bVarD, lazyListState, null, false, null, null, qg4VarQ, false, null, (Function1) objR2, dVar, 0, 444);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            g((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class j implements ps4<aad, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ String a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1905952188, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2283)");
                }
                qxc.j(this.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        j(String str) {
            this.a = str;
        }

        public final void a(aad aadVar, androidx.compose.p004runtime.d dVar, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? dVar.x(aadVar) : dVar.T(aadVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (!dVar.g((i2 & 19) != 18, i2 & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-456272562, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2283)");
            }
            TooltipKt.g(aadVar, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ko1.e(1905952188, true, new a(this.a), dVar, 54), dVar, (i2 & 14) | 805306368, 255);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((aad) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class k implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ androidx.compose.ui.b b;
        final /* synthetic */ boolean c;
        final /* synthetic */ pp5 d;
        final /* synthetic */ String e;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ pp5 a;
            final /* synthetic */ String b;

            a(pp5 pp5Var, String str) {
                this.a = pp5Var;
                this.b = str;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1301085432, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2287)");
                }
                sj5.e(this.a, this.b, null, 0L, dVar, 0, 12);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        k(Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z, pp5 pp5Var, String str) {
            this.a = function0;
            this.b = bVar;
            this.c = z;
            this.d = pp5Var;
            this.e = str;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void a(androidx.compose.p004runtime.d dVar, int i) throws NoWhenBranchMatchedException {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1124908186, i, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2286)");
            }
            nj5.h(this.a, this.b, this.c, null, null, null, ko1.e(-1301085432, true, new a(this.d, this.e), dVar, 54), dVar, 1572864, 56);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class l implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ vn2 b;

        l(String str, vn2 vn2Var) {
            this.a = str;
            this.b = vn2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, nfb nfbVar) {
            SemanticsPropertiesKt.k0(nfbVar, d57.INSTANCE.b());
            SemanticsPropertiesKt.b0(nfbVar, str);
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(619076006, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2204)");
            }
            String str = this.a;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zX = dVar.x(str);
            final String str2 = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.v
                    public final Object invoke(Object obj) {
                        return DatePickerKt.l.c(str2, (nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(str, afb.d(companion, false, (Function1) objR, 1, null), this.b.getNavigationContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262136);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class m implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Function0<Unit> c;
        final /* synthetic */ boolean d;

        m(Function0<Unit> function0, boolean z, Function0<Unit> function1, boolean z2) {
            this.a = function0;
            this.b = z;
            this.c = function1;
            this.d = z2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-128317193, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2220)");
            }
            Function0<Unit> function0 = this.a;
            boolean z = this.b;
            Function0<Unit> function1 = this.c;
            boolean z2 = this.d;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.l(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarB, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            ira iraVar = ira.a;
            tj5 tj5Var = tj5.a;
            pp5 pp5VarA = tj5Var.a();
            rbc.Companion companion3 = rbc.INSTANCE;
            DatePickerKt.d0(function0, pp5VarA, vbc.b(rbc.a(wz9.v), dVar, 0), null, z, dVar, 0, 8);
            DatePickerKt.d0(function1, tj5Var.b(), vbc.b(rbc.a(wz9.u), dVar, 0), null, z2, dVar, 0, 8);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class n implements rs4<sq, c0, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Long a;
        final /* synthetic */ long b;
        final /* synthetic */ Function1<Long, Unit> c;
        final /* synthetic */ Function1<Long, Unit> d;
        final /* synthetic */ d21 e;
        final /* synthetic */ IntRange f;
        final /* synthetic */ bo2 g;
        final /* synthetic */ ddb h;
        final /* synthetic */ vn2 i;
        final /* synthetic */ androidx.compose.ui.focus.f j;

        /* JADX WARN: Multi-variable type inference failed */
        n(Long l, long j, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function2, d21 d21Var, IntRange intRange, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, androidx.compose.ui.focus.f fVar) {
            this.a = l;
            this.b = j;
            this.c = function1;
            this.d = function2;
            this.e = d21Var;
            this.f = intRange;
            this.g = bo2Var;
            this.h = ddbVar;
            this.i = vn2Var;
            this.j = fVar;
        }

        public final void a(sq sqVar, int i, androidx.compose.p004runtime.d dVar, int i2) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1838500091, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1498)");
            }
            c0.Companion companion = c0.INSTANCE;
            if (c0.f(i, companion.b())) {
                dVar.y(1567031954);
                DatePickerKt.M(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, dVar, 0);
                dVar.u();
            } else if (c0.f(i, companion.a())) {
                dVar.y(1567050592);
                DateInputKt.g(this.a, this.c, this.e, this.f, this.g, this.h, this.i, this.j, dVar, 0);
                dVar.u();
            } else {
                dVar.y(1334373351);
                dVar.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((sq) obj, ((c0) obj2).getValue(), (androidx.compose.p004runtime.d) obj3, ((Number) obj4).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class o implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ vn2 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;

        o(String str, vn2 vn2Var, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = vn2Var;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-564400443, i, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2157)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarH = SizeKt.h(companion, 0.0f, 1, null);
            tc tcVarE = tc.INSTANCE.e();
            String str = this.a;
            vn2 vn2Var = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tcVarE, false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarH);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.w
                    public final Object invoke(Object obj) {
                        return DatePickerKt.o.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(str, afb.a(companion, (Function1) objR), vn2Var.l(z, z2, z3, dVar, 0).getValue().getValue(), null, 0L, null, null, null, 0L, null, cpc.h(cpc.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 261112);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class p implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ d21 a;
        final /* synthetic */ long b;
        final /* synthetic */ IntRange c;
        final /* synthetic */ androidx.compose.ui.b d;
        final /* synthetic */ vn2 e;
        final /* synthetic */ Function1<Integer, Unit> f;
        final /* synthetic */ ddb g;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements rs4<up6, Integer, androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ IntRange a;
            final /* synthetic */ d21 b;
            final /* synthetic */ int c;
            final /* synthetic */ int d;
            final /* synthetic */ Function1<Integer, Unit> e;
            final /* synthetic */ ddb f;
            final /* synthetic */ vn2 g;

            /* JADX WARN: Multi-variable type inference failed */
            a(IntRange intRange, d21 d21Var, int i, int i2, Function1<? super Integer, Unit> function1, ddb ddbVar, vn2 vn2Var) {
                this.a = intRange;
                this.b = d21Var;
                this.c = i;
                this.d = i2;
                this.e = function1;
                this.f = ddbVar;
                this.g = vn2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, int i) {
                function1.invoke(Integer.valueOf(i));
                return Unit.a;
            }

            public final void b(up6 up6Var, int i, androidx.compose.p004runtime.d dVar, int i2) {
                int i3;
                if ((i2 & 48) == 0) {
                    i3 = i2 | (dVar.C(i) ? 32 : 16);
                } else {
                    i3 = i2;
                }
                if (!dVar.g((i3 & 145) != 144, i3 & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(674613074, i3, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)");
                }
                final int iF = i + this.a.f();
                String strC = c21.c(iF, 0, 0, false, this.b.getLocale(), 7, null);
                androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                jp2 jp2Var = jp2.a;
                androidx.compose.ui.b bVarN = SizeKt.n(companion, jp2Var.x(), jp2Var.w());
                boolean z = iF == this.c;
                boolean z2 = iF == this.d;
                boolean zX = dVar.x(this.e) | dVar.C(iF);
                final Function1<Integer, Unit> function1 = this.e;
                Object objR = dVar.R();
                if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function0() { // from class: androidx.compose.material3.y
                        public final Object invoke() {
                            return DatePickerKt.p.a.c(function1, iF);
                        }
                    };
                    dVar.L(objR);
                }
                boolean zB = this.f.b(iF);
                rbc.Companion companion2 = rbc.INSTANCE;
                String str = String.format(vbc.b(rbc.a(wz9.p), dVar, 0), Arrays.copyOf(new Object[]{strC}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                DatePickerKt.w0(strC, bVarN, z, z2, (Function0) objR, zB, str, this.g, dVar, 48);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                b((up6) obj, ((Number) obj2).intValue(), (androidx.compose.p004runtime.d) obj3, ((Number) obj4).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(d21 d21Var, long j, IntRange intRange, androidx.compose.ui.b bVar, vn2 vn2Var, Function1<? super Integer, Unit> function1, ddb ddbVar) {
            this.a = d21Var;
            this.b = j;
            this.c = intRange;
            this.d = bVar;
            this.e = vn2Var;
            this.f = function1;
            this.g = ddbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(IntRange intRange, d21 d21Var, int i, int i2, Function1 function1, ddb ddbVar, vn2 vn2Var, sq6 sq6Var) {
            sq6.b(sq6Var, kotlin.collections.m.o0(intRange), null, null, null, ko1.c(674613074, true, new a(intRange, d21Var, i, i2, function1, ddbVar, vn2Var)), 14, null);
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1301915789, i, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)");
            }
            d21 d21Var = this.a;
            final int year = d21Var.i(d21Var.j()).getYear();
            final int year2 = this.a.h(this.b).getYear();
            LazyGridState lazyGridStateG = androidx.compose.p001foundation.lazy.grid.d.g(Math.max(0, (year2 - this.c.f()) - 3), 0, dVar, 0, 2);
            m15.b bVar = new m15.b(3);
            androidx.compose.ui.b bVarD = BackgroundKt.d(this.d, this.e.getContainerColor(), null, 2, null);
            androidx.compose.p001foundation.layout.c cVar = androidx.compose.p001foundation.layout.c.a;
            androidx.compose.foundation.layout.c.f fVarI = cVar.i();
            androidx.compose.foundation.layout.c.f fVarR = cVar.r(DatePickerKt.g);
            boolean zT = dVar.T(this.c) | dVar.T(this.a) | dVar.C(year2) | dVar.C(year) | dVar.x(this.f) | dVar.x(this.g) | dVar.x(this.e);
            final IntRange intRange = this.c;
            final d21 d21Var2 = this.a;
            final Function1<Integer, Unit> function1 = this.f;
            final ddb ddbVar = this.g;
            final vn2 vn2Var = this.e;
            Object objR = dVar.R();
            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.x
                    public final Object invoke(Object obj) {
                        return DatePickerKt.p.c(intRange, d21Var2, year2, year, function1, ddbVar, vn2Var, (sq6) obj);
                    }
                };
                dVar.L(objR);
            }
            hp6.c(bVar, bVarD, lazyGridStateG, null, false, fVarR, fVarI, null, false, null, (Function1) objR, dVar, 1769472, 0, 920);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class q implements ps4<hra, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        q(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, boolean z) {
            this.a = function2;
            this.b = z;
        }

        public final void a(hra hraVar, androidx.compose.p004runtime.d dVar, int i) {
            String strB;
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1899489890, i, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2256)");
            }
            this.a.invoke(dVar, 0);
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            qzb.a(SizeKt.t(companion, wx0.a.h()), dVar, 6);
            pp5 pp5VarA = uj5.a.a();
            if (this.b) {
                dVar.y(1509384391);
                rbc.Companion companion2 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.s), dVar, 0);
                dVar.u();
            } else {
                dVar.y(1509478662);
                rbc.Companion companion3 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.w), dVar, 0);
                dVar.u();
            }
            sj5.e(pp5VarA, strB, cqa.a(companion, this.b ? 180.0f : 0.0f), 0L, dVar, 0, 8);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((hra) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class r<T> implements ui4 {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ Function1<Long, Unit> b;
        final /* synthetic */ d21 c;
        final /* synthetic */ IntRange d;

        /* JADX WARN: Multi-variable type inference failed */
        r(LazyListState lazyListState, Function1<? super Long, Unit> function1, d21 d21Var, IntRange intRange) {
            this.a = lazyListState;
            this.b = function1;
            this.c = d21Var;
            this.d = intRange;
        }

        public final Object a(int i, q22<? super Unit> q22Var) {
            int iX = this.a.x() / 12;
            this.b.invoke(ut0.f(this.c.g(this.d.f() + iX, (this.a.x() % 12) + 1).getStartUtcTimeMillis()));
            return Unit.a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, q22 q22Var) {
            return a(((Number) obj).intValue(), q22Var);
        }
    }

    static {
        float f2 = 12;
        c = ff3.i(f2);
        d = nx8.i(0.0f, 0.0f, ff3.i(f2), ff3.i(f2), 3, null);
        float f3 = 24;
        float f4 = 16;
        e = nx8.i(ff3.i(f3), ff3.i(f4), ff3.i(f2), 0.0f, 8, null);
        f = nx8.i(ff3.i(f3), 0.0f, ff3.i(f2), ff3.i(f2), 2, null);
        g = ff3.i(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(androidx.compose.ui.b bVar, long j2, Function1 function1, ddb ddbVar, d21 d21Var, IntRange intRange, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        z0(bVar, j2, function1, ddbVar, d21Var, intRange, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    private static final void B0(final Function0<Unit> function0, final boolean z, androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        Function0<Unit> function1;
        int i4;
        androidx.compose.ui.b bVar2;
        int i5;
        boolean z2;
        final androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        androidx.compose.p004runtime.d dVarF = dVar.F(-709923073);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            function1 = function0;
        } else if ((i2 & 6) == 0) {
            function1 = function0;
            i4 = (dVarF.T(function1) ? 4 : 2) | i2;
        } else {
            function1 = function0;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.A(z) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (dVarF.T(function2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i4 & 1)) {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-709923073, i4, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
                }
                bVar2 = bVar4;
                by0.j(function1, bVar2, false, lqa.g(), wx0.a.s(0L, ((ei1) dVarF.v(cz1.a())).getValue(), 0L, 0L, dVarF, 24576, 13), null, null, null, null, ko1.e(1899489890, true, new q(function2, z), dVarF, 54), dVarF, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
                dVarF = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            } else {
                dVarF.q();
            }
            bVar3 = bVar2;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.so2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.C0(function0, z, bVar3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        bVar2 = bVar;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (dVarF.T(function2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i4 & 1)) {
            if (i6 != 0) {
                bVar4 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-709923073, i4, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2247)");
            }
            bVar2 = bVar4;
            by0.j(function1, bVar2, false, lqa.g(), wx0.a.s(0L, ((ei1) dVarF.v(cz1.a())).getValue(), 0L, 0L, dVarF, 24576, 13), null, null, null, null, ko1.e(1899489890, true, new q(function2, z), dVarF, 54), dVarF, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
            dVarF = dVarF;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        bVar3 = bVar2;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.so2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.C0(function0, z, bVar3, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(Function0 function0, boolean z, androidx.compose.ui.b bVar, Function2 function2, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        B0(function0, z, bVar, function2, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    public static final void H(final androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final vn2 vn2Var, final TextStyle textStyle, final float f2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8;
        vn2 vn2Var2;
        TextStyle textStyle2;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(1539132883);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function6 = function2;
            i3 |= dVarF.T(function6) ? 32 : 16;
        } else {
            function6 = function2;
        }
        if ((i2 & 384) == 0) {
            function7 = function3;
            i3 |= dVarF.T(function7) ? 256 : 128;
        } else {
            function7 = function3;
        }
        if ((i2 & 3072) == 0) {
            function8 = function4;
            i3 |= dVarF.T(function8) ? 2048 : 1024;
        } else {
            function8 = function4;
        }
        if ((i2 & 24576) == 0) {
            vn2Var2 = vn2Var;
            i3 |= dVarF.x(vn2Var2) ? 16384 : 8192;
        } else {
            vn2Var2 = vn2Var;
        }
        if ((196608 & i2) == 0) {
            textStyle2 = textStyle;
            i3 |= dVarF.x(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dVarF.B(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dVarF.T(function5) ? 8388608 : 4194304;
        }
        if (dVarF.g((4793491 & i3) != 4793490, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1539132883, i3, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1351)");
            }
            int i4 = i3;
            androidx.compose.ui.b bVarX = SizeKt.x(bVar, jp2.a.d(), 0.0f, 0.0f, 0.0f, 14, null);
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.no2
                    public final Object invoke(Object obj) {
                        return DatePickerKt.J((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarD = BackgroundKt.d(afb.d(bVarX, false, (Function1) objR, 1, null), vn2Var2.getContainerColor(), null, 2, null);
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.k(), dVarF, 0);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarD);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            yj1 yj1Var = yj1.a;
            U(androidx.compose.ui.b.INSTANCE, function2, vn2Var2.getTitleContentColor(), vn2Var2.getHeadlineContentColor(), f2, ko1.e(-1658370654, true, new a(function7, function8, function6, vn2Var2, textStyle2), dVarF, 54), dVarF, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            dVar2 = dVarF;
            function5.invoke(dVar2, Integer.valueOf((i4 >> 21) & 14));
            dVar2.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.yo2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.I(bVar, function2, function3, function4, vn2Var, textStyle, f2, function5, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.b bVar, Function2 function2, Function2 function3, Function2 function4, vn2 vn2Var, TextStyle textStyle, float f2, Function2 function5, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        H(bVar, function2, function3, function4, vn2Var, textStyle, f2, function5, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(nfb nfbVar) {
        SemanticsPropertiesKt.Z(nfbVar, true);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:108:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0136  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0186  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:150:0x0205  */
    /* JADX WARN: Code duplicated, block: B:152:0x0221  */
    /* JADX WARN: Code duplicated, block: B:155:0x027e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0289  */
    /* JADX WARN: Code duplicated, block: B:161:0x029d  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(final wp2 wp2Var, androidx.compose.ui.b bVar, bo2 bo2Var, vn2 vn2Var, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, boolean z, androidx.compose.ui.focus.f fVar, androidx.compose.p004runtime.d dVar, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        androidx.compose.ui.b bVar2;
        vn2 vn2Var2;
        int i5;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2E;
        int i6;
        int i7;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        boolean z3;
        androidx.compose.p004runtime.d dVar2;
        final bo2 bo2Var2;
        final androidx.compose.ui.focus.f fVar2;
        final androidx.compose.ui.b bVar3;
        final vn2 vn2Var3;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5;
        final boolean z4;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        s6b s6bVarH;
        bo2 bo2Var3;
        vn2 vn2VarI;
        boolean z5;
        int i13;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2E2;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        boolean z6;
        vn2 vn2Var4;
        androidx.compose.ui.b bVar4;
        int i14;
        androidx.compose.ui.focus.f fVar3;
        Object objR;
        Object objR2;
        boolean zX;
        Object objR3;
        d21 d21VarA;
        do1 do1VarE;
        int i15;
        boolean zT;
        androidx.compose.p004runtime.d dVarF = dVar.F(1105472031);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(wp2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) != 0) {
                    i15 = 128;
                } else {
                    if ((i2 & 512) == 0) {
                        zT = dVarF.x(bo2Var);
                    } else {
                        zT = dVarF.T(bo2Var);
                    }
                    if (zT) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                }
                i4 |= i15;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    vn2Var2 = vn2Var;
                    int i17 = dVarF.x(vn2Var2) ? 2048 : 1024;
                    i4 |= i17;
                } else {
                    vn2Var2 = vn2Var;
                }
                i4 |= i17;
            } else {
                vn2Var2 = vn2Var;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    function2E = function2;
                    if (dVarF.T(function2E)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        function4 = function3;
                        if (dVarF.T(function4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            z2 = z;
                            if (dVarF.A(z2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 128;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (dVarF.x(fVar)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i4 |= i12;
                        }
                        if ((i4 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i4 & 1)) {
                            dVarF.U();
                            if ((i2 & 1) != 0 || dVarF.t()) {
                                if (i16 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    objR2 = dVarF.R();
                                    if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                        dVarF.L(objR2);
                                    }
                                    bo2Var3 = (bo2) objR2;
                                    i4 &= -897;
                                } else {
                                    bo2Var3 = bo2Var;
                                }
                                if ((i3 & 8) != 0) {
                                    vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                    i4 &= -7169;
                                } else {
                                    vn2VarI = vn2Var2;
                                }
                                if (i5 != 0) {
                                    z5 = true;
                                    function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                    i13 = 54;
                                } else {
                                    z5 = true;
                                    i13 = 54;
                                }
                                if (i7 != 0) {
                                    function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                                } else {
                                    function2E2 = function4;
                                }
                                if (i9 != 0) {
                                    z2 = true;
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new androidx.compose.ui.focus.f();
                                        dVarF.L(objR);
                                    }
                                    int i18 = i4;
                                    fVar3 = (androidx.compose.ui.focus.f) objR;
                                    z6 = z2;
                                    vn2Var4 = vn2VarI;
                                    i14 = i18;
                                    function4 = function2E2;
                                    function7 = function2E;
                                    bVar4 = bVar2;
                                } else {
                                    function4 = function2E2;
                                    function7 = function2E;
                                    z6 = z2;
                                    vn2Var4 = vn2VarI;
                                    bVar4 = bVar2;
                                    i14 = i4;
                                    fVar3 = fVar;
                                }
                            } else {
                                dVarF.q();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                bo2Var3 = bo2Var;
                                i14 = i4;
                                function7 = function2E;
                                z6 = z2;
                                fVar3 = fVar;
                                bVar4 = bVar2;
                                vn2Var4 = vn2Var2;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                            }
                            zX = dVarF.x(wp2Var.getLocale());
                            objR3 = dVarF.R();
                            if (zX || objR3 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                if (wp2Var instanceof androidx.compose.p002material3.a) {
                                    d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                                } else {
                                    d21VarA = g21.a(wp2Var.getLocale());
                                }
                                objR3 = d21VarA;
                                dVarF.L(objR3);
                            }
                            d21 d21Var = (d21) objR3;
                            if (z6) {
                                dVarF.y(-690551113);
                                do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                                dVarF.u();
                            } else {
                                dVarF.y(-690163489);
                                dVarF.u();
                                do1VarE = null;
                            }
                            do1 do1Var = do1VarE;
                            jp2 jp2Var = jp2.a;
                            TextStyle textStyleE = xod.e(jp2Var.q(), dVarF, 6);
                            float fO = jp2Var.o();
                            androidx.compose.ui.focus.f fVar4 = fVar3;
                            e eVar = new e(wp2Var, d21Var, bo2Var3, vn2Var4, fVar4);
                            bo2 bo2Var4 = bo2Var3;
                            int i19 = i14 >> 9;
                            dVar2 = dVarF;
                            H(bVar4, function7, function4, do1Var, vn2Var4, textStyleE, fO, ko1.e(-1346903698, true, eVar, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i19 & 112) | (i19 & 896) | ((i14 << 3) & 57344));
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bo2Var2 = bo2Var4;
                            fVar2 = fVar4;
                            z4 = z6;
                            bVar3 = bVar4;
                            function5 = function7;
                            vn2Var3 = vn2Var4;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bo2Var2 = bo2Var;
                            fVar2 = fVar;
                            bVar3 = bVar2;
                            vn2Var3 = vn2Var2;
                            function5 = function2E;
                            z4 = z2;
                        }
                        function6 = function4;
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.co2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i4 |= 1572864;
                    z2 = z;
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(fVar)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i4 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i110 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i110;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        } else {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i111 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i111;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zX = dVarF.x(wp2Var.getLocale());
                        objR3 = dVarF.R();
                        if (zX) {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        } else {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        }
                        d21 d21Var2 = (d21) objR3;
                        if (z6) {
                            dVarF.y(-690551113);
                            do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                            dVarF.u();
                        } else {
                            dVarF.y(-690163489);
                            dVarF.u();
                            do1VarE = null;
                        }
                        do1 do1Var2 = do1VarE;
                        jp2 jp2Var2 = jp2.a;
                        TextStyle textStyleE2 = xod.e(jp2Var2.q(), dVarF, 6);
                        float fO2 = jp2Var2.o();
                        androidx.compose.ui.focus.f fVar5 = fVar3;
                        e eVar2 = new e(wp2Var, d21Var2, bo2Var3, vn2Var4, fVar5);
                        bo2 bo2Var5 = bo2Var3;
                        int i112 = i14 >> 9;
                        dVar2 = dVarF;
                        H(bVar4, function7, function4, do1Var2, vn2Var4, textStyleE2, fO2, ko1.e(-1346903698, true, eVar2, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i112 & 112) | (i112 & 896) | ((i14 << 3) & 57344));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bo2Var2 = bo2Var5;
                        fVar2 = fVar5;
                        z4 = z6;
                        bVar3 = bVar4;
                        function5 = function7;
                        vn2Var3 = vn2Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bo2Var2 = bo2Var;
                        fVar2 = fVar;
                        bVar3 = bVar2;
                        vn2Var3 = vn2Var2;
                        function5 = function2E;
                        z4 = z2;
                    }
                    function6 = function4;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.co2
                            public final Object invoke(Object obj, Object obj2) {
                                return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 196608;
                function4 = function3;
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(fVar)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i4 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i113 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i113;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        } else {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i114 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i114;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zX = dVarF.x(wp2Var.getLocale());
                        objR3 = dVarF.R();
                        if (zX) {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        } else {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        }
                        d21 d21Var3 = (d21) objR3;
                        if (z6) {
                            dVarF.y(-690551113);
                            do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                            dVarF.u();
                        } else {
                            dVarF.y(-690163489);
                            dVarF.u();
                            do1VarE = null;
                        }
                        do1 do1Var3 = do1VarE;
                        jp2 jp2Var3 = jp2.a;
                        TextStyle textStyleE3 = xod.e(jp2Var3.q(), dVarF, 6);
                        float fO3 = jp2Var3.o();
                        androidx.compose.ui.focus.f fVar6 = fVar3;
                        e eVar3 = new e(wp2Var, d21Var3, bo2Var3, vn2Var4, fVar6);
                        bo2 bo2Var6 = bo2Var3;
                        int i115 = i14 >> 9;
                        dVar2 = dVarF;
                        H(bVar4, function7, function4, do1Var3, vn2Var4, textStyleE3, fO3, ko1.e(-1346903698, true, eVar3, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i115 & 112) | (i115 & 896) | ((i14 << 3) & 57344));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bo2Var2 = bo2Var6;
                        fVar2 = fVar6;
                        z4 = z6;
                        bVar3 = bVar4;
                        function5 = function7;
                        vn2Var3 = vn2Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bo2Var2 = bo2Var;
                        fVar2 = fVar;
                        bVar3 = bVar2;
                        vn2Var3 = vn2Var2;
                        function5 = function2E;
                        z4 = z2;
                    }
                    function6 = function4;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.co2
                            public final Object invoke(Object obj, Object obj2) {
                                return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                z2 = z;
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i116 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i116;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i117 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i117;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var4 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var4 = do1VarE;
                    jp2 jp2Var4 = jp2.a;
                    TextStyle textStyleE4 = xod.e(jp2Var4.q(), dVarF, 6);
                    float fO4 = jp2Var4.o();
                    androidx.compose.ui.focus.f fVar7 = fVar3;
                    e eVar4 = new e(wp2Var, d21Var4, bo2Var3, vn2Var4, fVar7);
                    bo2 bo2Var7 = bo2Var3;
                    int i118 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var4, vn2Var4, textStyleE4, fO4, ko1.e(-1346903698, true, eVar4, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i118 & 112) | (i118 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var7;
                    fVar2 = fVar7;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            function2E = function2;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function3;
                    if (dVarF.T(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(fVar)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i4 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i119 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i119;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        } else {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i1110 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i1110;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zX = dVarF.x(wp2Var.getLocale());
                        objR3 = dVarF.R();
                        if (zX) {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        } else {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        }
                        d21 d21Var5 = (d21) objR3;
                        if (z6) {
                            dVarF.y(-690551113);
                            do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                            dVarF.u();
                        } else {
                            dVarF.y(-690163489);
                            dVarF.u();
                            do1VarE = null;
                        }
                        do1 do1Var5 = do1VarE;
                        jp2 jp2Var5 = jp2.a;
                        TextStyle textStyleE5 = xod.e(jp2Var5.q(), dVarF, 6);
                        float fO5 = jp2Var5.o();
                        androidx.compose.ui.focus.f fVar8 = fVar3;
                        e eVar5 = new e(wp2Var, d21Var5, bo2Var3, vn2Var4, fVar8);
                        bo2 bo2Var8 = bo2Var3;
                        int i1111 = i14 >> 9;
                        dVar2 = dVarF;
                        H(bVar4, function7, function4, do1Var5, vn2Var4, textStyleE5, fO5, ko1.e(-1346903698, true, eVar5, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i1111 & 112) | (i1111 & 896) | ((i14 << 3) & 57344));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bo2Var2 = bo2Var8;
                        fVar2 = fVar8;
                        z4 = z6;
                        bVar3 = bVar4;
                        function5 = function7;
                        vn2Var3 = vn2Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bo2Var2 = bo2Var;
                        fVar2 = fVar;
                        bVar3 = bVar2;
                        vn2Var3 = vn2Var2;
                        function5 = function2E;
                        z4 = z2;
                    }
                    function6 = function4;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.co2
                            public final Object invoke(Object obj, Object obj2) {
                                return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                z2 = z;
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i1112 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i1112;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i1113 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i1113;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var6 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var6 = do1VarE;
                    jp2 jp2Var6 = jp2.a;
                    TextStyle textStyleE6 = xod.e(jp2Var6.q(), dVarF, 6);
                    float fO6 = jp2Var6.o();
                    androidx.compose.ui.focus.f fVar9 = fVar3;
                    e eVar6 = new e(wp2Var, d21Var6, bo2Var3, vn2Var4, fVar9);
                    bo2 bo2Var9 = bo2Var3;
                    int i1114 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var6, vn2Var4, textStyleE6, fO6, ko1.e(-1346903698, true, eVar6, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i1114 & 112) | (i1114 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var9;
                    fVar2 = fVar9;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            function4 = function3;
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i1115 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i1115;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i1116 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i1116;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var7 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var7 = do1VarE;
                    jp2 jp2Var7 = jp2.a;
                    TextStyle textStyleE7 = xod.e(jp2Var7.q(), dVarF, 6);
                    float fO7 = jp2Var7.o();
                    androidx.compose.ui.focus.f fVar10 = fVar3;
                    e eVar7 = new e(wp2Var, d21Var7, bo2Var3, vn2Var4, fVar10);
                    bo2 bo2Var10 = bo2Var3;
                    int i1117 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var7, vn2Var4, textStyleE7, fO7, ko1.e(-1346903698, true, eVar7, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i1117 & 112) | (i1117 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var10;
                    fVar2 = fVar10;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            z2 = z;
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(fVar)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((i4 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i1118 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i1118;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                } else {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i1119 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i1119;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zX = dVarF.x(wp2Var.getLocale());
                objR3 = dVarF.R();
                if (zX) {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                } else {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                }
                d21 d21Var8 = (d21) objR3;
                if (z6) {
                    dVarF.y(-690551113);
                    do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-690163489);
                    dVarF.u();
                    do1VarE = null;
                }
                do1 do1Var8 = do1VarE;
                jp2 jp2Var8 = jp2.a;
                TextStyle textStyleE8 = xod.e(jp2Var8.q(), dVarF, 6);
                float fO8 = jp2Var8.o();
                androidx.compose.ui.focus.f fVar11 = fVar3;
                e eVar8 = new e(wp2Var, d21Var8, bo2Var3, vn2Var4, fVar11);
                bo2 bo2Var11 = bo2Var3;
                int i11110 = i14 >> 9;
                dVar2 = dVarF;
                H(bVar4, function7, function4, do1Var8, vn2Var4, textStyleE8, fO8, ko1.e(-1346903698, true, eVar8, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i11110 & 112) | (i11110 & 896) | ((i14 << 3) & 57344));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bo2Var2 = bo2Var11;
                fVar2 = fVar11;
                z4 = z6;
                bVar3 = bVar4;
                function5 = function7;
                vn2Var3 = vn2Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bo2Var2 = bo2Var;
                fVar2 = fVar;
                bVar3 = bVar2;
                vn2Var3 = vn2Var2;
                function5 = function2E;
                z4 = z2;
            }
            function6 = function4;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.co2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) != 0) {
                i15 = 128;
            } else {
                if ((i2 & 512) == 0) {
                    zT = dVarF.x(bo2Var);
                } else {
                    zT = dVarF.T(bo2Var);
                }
                if (zT) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
            }
            i4 |= i15;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                vn2Var2 = vn2Var;
                if (dVarF.x(vn2Var2)) {
                }
                i4 |= i17;
            } else {
                vn2Var2 = vn2Var;
            }
            i4 |= i17;
        } else {
            vn2Var2 = vn2Var;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                function2E = function2;
                if (dVarF.T(function2E)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    function4 = function3;
                    if (dVarF.T(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (dVarF.x(fVar)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    if ((i4 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i4 & 1)) {
                        dVarF.U();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i11111 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i11111;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        } else {
                            if (i16 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                    dVarF.L(objR2);
                                }
                                bo2Var3 = (bo2) objR2;
                                i4 &= -897;
                            } else {
                                bo2Var3 = bo2Var;
                            }
                            if ((i3 & 8) != 0) {
                                vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                                i4 &= -7169;
                            } else {
                                vn2VarI = vn2Var2;
                            }
                            if (i5 != 0) {
                                z5 = true;
                                function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                                i13 = 54;
                            } else {
                                z5 = true;
                                i13 = 54;
                            }
                            if (i7 != 0) {
                                function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                            } else {
                                function2E2 = function4;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR);
                                }
                                int i11112 = i4;
                                fVar3 = (androidx.compose.ui.focus.f) objR;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                i14 = i11112;
                                function4 = function2E2;
                                function7 = function2E;
                                bVar4 = bVar2;
                            } else {
                                function4 = function2E2;
                                function7 = function2E;
                                z6 = z2;
                                vn2Var4 = vn2VarI;
                                bVar4 = bVar2;
                                i14 = i4;
                                fVar3 = fVar;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                        }
                        zX = dVarF.x(wp2Var.getLocale());
                        objR3 = dVarF.R();
                        if (zX) {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        } else {
                            if (wp2Var instanceof androidx.compose.p002material3.a) {
                                d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                            } else {
                                d21VarA = g21.a(wp2Var.getLocale());
                            }
                            objR3 = d21VarA;
                            dVarF.L(objR3);
                        }
                        d21 d21Var9 = (d21) objR3;
                        if (z6) {
                            dVarF.y(-690551113);
                            do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                            dVarF.u();
                        } else {
                            dVarF.y(-690163489);
                            dVarF.u();
                            do1VarE = null;
                        }
                        do1 do1Var9 = do1VarE;
                        jp2 jp2Var9 = jp2.a;
                        TextStyle textStyleE9 = xod.e(jp2Var9.q(), dVarF, 6);
                        float fO9 = jp2Var9.o();
                        androidx.compose.ui.focus.f fVar12 = fVar3;
                        e eVar9 = new e(wp2Var, d21Var9, bo2Var3, vn2Var4, fVar12);
                        bo2 bo2Var12 = bo2Var3;
                        int i11113 = i14 >> 9;
                        dVar2 = dVarF;
                        H(bVar4, function7, function4, do1Var9, vn2Var4, textStyleE9, fO9, ko1.e(-1346903698, true, eVar9, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i11113 & 112) | (i11113 & 896) | ((i14 << 3) & 57344));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bo2Var2 = bo2Var12;
                        fVar2 = fVar12;
                        z4 = z6;
                        bVar3 = bVar4;
                        function5 = function7;
                        vn2Var3 = vn2Var4;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bo2Var2 = bo2Var;
                        fVar2 = fVar;
                        bVar3 = bVar2;
                        vn2Var3 = vn2Var2;
                        function5 = function2E;
                        z4 = z2;
                    }
                    function6 = function4;
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.co2
                            public final Object invoke(Object obj, Object obj2) {
                                return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 1572864;
                z2 = z;
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i11114 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i11114;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i11115 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i11115;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var10 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var10 = do1VarE;
                    jp2 jp2Var10 = jp2.a;
                    TextStyle textStyleE10 = xod.e(jp2Var10.q(), dVarF, 6);
                    float fO10 = jp2Var10.o();
                    androidx.compose.ui.focus.f fVar13 = fVar3;
                    e eVar10 = new e(wp2Var, d21Var10, bo2Var3, vn2Var4, fVar13);
                    bo2 bo2Var13 = bo2Var3;
                    int i11116 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var10, vn2Var4, textStyleE10, fO10, ko1.e(-1346903698, true, eVar10, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i11116 & 112) | (i11116 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var13;
                    fVar2 = fVar13;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 196608;
            function4 = function3;
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i11117 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i11117;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i11118 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i11118;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var11 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var11 = do1VarE;
                    jp2 jp2Var11 = jp2.a;
                    TextStyle textStyleE11 = xod.e(jp2Var11.q(), dVarF, 6);
                    float fO11 = jp2Var11.o();
                    androidx.compose.ui.focus.f fVar14 = fVar3;
                    e eVar11 = new e(wp2Var, d21Var11, bo2Var3, vn2Var4, fVar14);
                    bo2 bo2Var14 = bo2Var3;
                    int i11119 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var11, vn2Var4, textStyleE11, fO11, ko1.e(-1346903698, true, eVar11, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i11119 & 112) | (i11119 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var14;
                    fVar2 = fVar14;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            z2 = z;
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(fVar)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((i4 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i111110 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i111110;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                } else {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i111111 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i111111;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zX = dVarF.x(wp2Var.getLocale());
                objR3 = dVarF.R();
                if (zX) {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                } else {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                }
                d21 d21Var12 = (d21) objR3;
                if (z6) {
                    dVarF.y(-690551113);
                    do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-690163489);
                    dVarF.u();
                    do1VarE = null;
                }
                do1 do1Var12 = do1VarE;
                jp2 jp2Var12 = jp2.a;
                TextStyle textStyleE12 = xod.e(jp2Var12.q(), dVarF, 6);
                float fO12 = jp2Var12.o();
                androidx.compose.ui.focus.f fVar15 = fVar3;
                e eVar12 = new e(wp2Var, d21Var12, bo2Var3, vn2Var4, fVar15);
                bo2 bo2Var15 = bo2Var3;
                int i111112 = i14 >> 9;
                dVar2 = dVarF;
                H(bVar4, function7, function4, do1Var12, vn2Var4, textStyleE12, fO12, ko1.e(-1346903698, true, eVar12, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i111112 & 112) | (i111112 & 896) | ((i14 << 3) & 57344));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bo2Var2 = bo2Var15;
                fVar2 = fVar15;
                z4 = z6;
                bVar3 = bVar4;
                function5 = function7;
                vn2Var3 = vn2Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bo2Var2 = bo2Var;
                fVar2 = fVar;
                bVar3 = bVar2;
                vn2Var3 = vn2Var2;
                function5 = function2E;
                z4 = z2;
            }
            function6 = function4;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.co2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        function2E = function2;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                function4 = function3;
                if (dVarF.T(function4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (dVarF.x(fVar)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                if ((i4 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i111113 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i111113;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    } else {
                        if (i16 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                                dVarF.L(objR2);
                            }
                            bo2Var3 = (bo2) objR2;
                            i4 &= -897;
                        } else {
                            bo2Var3 = bo2Var;
                        }
                        if ((i3 & 8) != 0) {
                            vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                            i4 &= -7169;
                        } else {
                            vn2VarI = vn2Var2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                            function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                            i13 = 54;
                        } else {
                            z5 = true;
                            i13 = 54;
                        }
                        if (i7 != 0) {
                            function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                        } else {
                            function2E2 = function4;
                        }
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new androidx.compose.ui.focus.f();
                                dVarF.L(objR);
                            }
                            int i111114 = i4;
                            fVar3 = (androidx.compose.ui.focus.f) objR;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            i14 = i111114;
                            function4 = function2E2;
                            function7 = function2E;
                            bVar4 = bVar2;
                        } else {
                            function4 = function2E2;
                            function7 = function2E;
                            z6 = z2;
                            vn2Var4 = vn2VarI;
                            bVar4 = bVar2;
                            i14 = i4;
                            fVar3 = fVar;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                    }
                    zX = dVarF.x(wp2Var.getLocale());
                    objR3 = dVarF.R();
                    if (zX) {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    } else {
                        if (wp2Var instanceof androidx.compose.p002material3.a) {
                            d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                        } else {
                            d21VarA = g21.a(wp2Var.getLocale());
                        }
                        objR3 = d21VarA;
                        dVarF.L(objR3);
                    }
                    d21 d21Var13 = (d21) objR3;
                    if (z6) {
                        dVarF.y(-690551113);
                        do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-690163489);
                        dVarF.u();
                        do1VarE = null;
                    }
                    do1 do1Var13 = do1VarE;
                    jp2 jp2Var13 = jp2.a;
                    TextStyle textStyleE13 = xod.e(jp2Var13.q(), dVarF, 6);
                    float fO13 = jp2Var13.o();
                    androidx.compose.ui.focus.f fVar16 = fVar3;
                    e eVar13 = new e(wp2Var, d21Var13, bo2Var3, vn2Var4, fVar16);
                    bo2 bo2Var16 = bo2Var3;
                    int i111115 = i14 >> 9;
                    dVar2 = dVarF;
                    H(bVar4, function7, function4, do1Var13, vn2Var4, textStyleE13, fO13, ko1.e(-1346903698, true, eVar13, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i111115 & 112) | (i111115 & 896) | ((i14 << 3) & 57344));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bo2Var2 = bo2Var16;
                    fVar2 = fVar16;
                    z4 = z6;
                    bVar3 = bVar4;
                    function5 = function7;
                    vn2Var3 = vn2Var4;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bo2Var2 = bo2Var;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    vn2Var3 = vn2Var2;
                    function5 = function2E;
                    z4 = z2;
                }
                function6 = function4;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.co2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 1572864;
            z2 = z;
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(fVar)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((i4 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i111116 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i111116;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                } else {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i111117 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i111117;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zX = dVarF.x(wp2Var.getLocale());
                objR3 = dVarF.R();
                if (zX) {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                } else {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                }
                d21 d21Var14 = (d21) objR3;
                if (z6) {
                    dVarF.y(-690551113);
                    do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-690163489);
                    dVarF.u();
                    do1VarE = null;
                }
                do1 do1Var14 = do1VarE;
                jp2 jp2Var14 = jp2.a;
                TextStyle textStyleE14 = xod.e(jp2Var14.q(), dVarF, 6);
                float fO14 = jp2Var14.o();
                androidx.compose.ui.focus.f fVar17 = fVar3;
                e eVar14 = new e(wp2Var, d21Var14, bo2Var3, vn2Var4, fVar17);
                bo2 bo2Var17 = bo2Var3;
                int i111118 = i14 >> 9;
                dVar2 = dVarF;
                H(bVar4, function7, function4, do1Var14, vn2Var4, textStyleE14, fO14, ko1.e(-1346903698, true, eVar14, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i111118 & 112) | (i111118 & 896) | ((i14 << 3) & 57344));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bo2Var2 = bo2Var17;
                fVar2 = fVar17;
                z4 = z6;
                bVar3 = bVar4;
                function5 = function7;
                vn2Var3 = vn2Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bo2Var2 = bo2Var;
                fVar2 = fVar;
                bVar3 = bVar2;
                vn2Var3 = vn2Var2;
                function5 = function2E;
                z4 = z2;
            }
            function6 = function4;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.co2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 196608;
        function4 = function3;
        i9 = i3 & 64;
        if (i9 != 0) {
            if ((1572864 & i2) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (dVarF.x(fVar)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            if ((i4 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i111119 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i111119;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                } else {
                    if (i16 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                            dVarF.L(objR2);
                        }
                        bo2Var3 = (bo2) objR2;
                        i4 &= -897;
                    } else {
                        bo2Var3 = bo2Var;
                    }
                    if ((i3 & 8) != 0) {
                        vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                        i4 &= -7169;
                    } else {
                        vn2VarI = vn2Var2;
                    }
                    if (i5 != 0) {
                        z5 = true;
                        function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                        i13 = 54;
                    } else {
                        z5 = true;
                        i13 = 54;
                    }
                    if (i7 != 0) {
                        function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                    } else {
                        function2E2 = function4;
                    }
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new androidx.compose.ui.focus.f();
                            dVarF.L(objR);
                        }
                        int i1111110 = i4;
                        fVar3 = (androidx.compose.ui.focus.f) objR;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        i14 = i1111110;
                        function4 = function2E2;
                        function7 = function2E;
                        bVar4 = bVar2;
                    } else {
                        function4 = function2E2;
                        function7 = function2E;
                        z6 = z2;
                        vn2Var4 = vn2VarI;
                        bVar4 = bVar2;
                        i14 = i4;
                        fVar3 = fVar;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
                }
                zX = dVarF.x(wp2Var.getLocale());
                objR3 = dVarF.R();
                if (zX) {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                } else {
                    if (wp2Var instanceof androidx.compose.p002material3.a) {
                        d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                    } else {
                        d21VarA = g21.a(wp2Var.getLocale());
                    }
                    objR3 = d21VarA;
                    dVarF.L(objR3);
                }
                d21 d21Var15 = (d21) objR3;
                if (z6) {
                    dVarF.y(-690551113);
                    do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-690163489);
                    dVarF.u();
                    do1VarE = null;
                }
                do1 do1Var15 = do1VarE;
                jp2 jp2Var15 = jp2.a;
                TextStyle textStyleE15 = xod.e(jp2Var15.q(), dVarF, 6);
                float fO15 = jp2Var15.o();
                androidx.compose.ui.focus.f fVar18 = fVar3;
                e eVar15 = new e(wp2Var, d21Var15, bo2Var3, vn2Var4, fVar18);
                bo2 bo2Var18 = bo2Var3;
                int i1111111 = i14 >> 9;
                dVar2 = dVarF;
                H(bVar4, function7, function4, do1Var15, vn2Var4, textStyleE15, fO15, ko1.e(-1346903698, true, eVar15, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i1111111 & 112) | (i1111111 & 896) | ((i14 << 3) & 57344));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bo2Var2 = bo2Var18;
                fVar2 = fVar18;
                z4 = z6;
                bVar3 = bVar4;
                function5 = function7;
                vn2Var3 = vn2Var4;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bo2Var2 = bo2Var;
                fVar2 = fVar;
                bVar3 = bVar2;
                vn2Var3 = vn2Var2;
                function5 = function2E;
                z4 = z2;
            }
            function6 = function4;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.co2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 1572864;
        z2 = z;
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (dVarF.x(fVar)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        if ((i4 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                        dVarF.L(objR2);
                    }
                    bo2Var3 = (bo2) objR2;
                    i4 &= -897;
                } else {
                    bo2Var3 = bo2Var;
                }
                if ((i3 & 8) != 0) {
                    vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                    i4 &= -7169;
                } else {
                    vn2VarI = vn2Var2;
                }
                if (i5 != 0) {
                    z5 = true;
                    function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                    i13 = 54;
                } else {
                    z5 = true;
                    i13 = 54;
                }
                if (i7 != 0) {
                    function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                } else {
                    function2E2 = function4;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    objR = dVarF.R();
                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR = new androidx.compose.ui.focus.f();
                        dVarF.L(objR);
                    }
                    int i1111112 = i4;
                    fVar3 = (androidx.compose.ui.focus.f) objR;
                    z6 = z2;
                    vn2Var4 = vn2VarI;
                    i14 = i1111112;
                    function4 = function2E2;
                    function7 = function2E;
                    bVar4 = bVar2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z6 = z2;
                    vn2Var4 = vn2VarI;
                    bVar4 = bVar2;
                    i14 = i4;
                    fVar3 = fVar;
                }
            } else {
                if (i16 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR2 = androidx.compose.p002material3.h.k(androidx.compose.p002material3.h.a, null, null, null, 7, null);
                        dVarF.L(objR2);
                    }
                    bo2Var3 = (bo2) objR2;
                    i4 &= -897;
                } else {
                    bo2Var3 = bo2Var;
                }
                if ((i3 & 8) != 0) {
                    vn2VarI = androidx.compose.p002material3.h.a.i(dVarF, 6);
                    i4 &= -7169;
                } else {
                    vn2VarI = vn2Var2;
                }
                if (i5 != 0) {
                    z5 = true;
                    function2E = ko1.e(1655706771, true, new b(wp2Var, vn2VarI), dVarF, 54);
                    i13 = 54;
                } else {
                    z5 = true;
                    i13 = 54;
                }
                if (i7 != 0) {
                    function2E2 = ko1.e(1439279037, z5, new c(wp2Var, bo2Var3, vn2VarI), dVarF, i13);
                } else {
                    function2E2 = function4;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    objR = dVarF.R();
                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR = new androidx.compose.ui.focus.f();
                        dVarF.L(objR);
                    }
                    int i1111113 = i4;
                    fVar3 = (androidx.compose.ui.focus.f) objR;
                    z6 = z2;
                    vn2Var4 = vn2VarI;
                    i14 = i1111113;
                    function4 = function2E2;
                    function7 = function2E;
                    bVar4 = bVar2;
                } else {
                    function4 = function2E2;
                    function7 = function2E;
                    z6 = z2;
                    vn2Var4 = vn2VarI;
                    bVar4 = bVar2;
                    i14 = i4;
                    fVar3 = fVar;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1105472031, i14, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:190)");
            }
            zX = dVarF.x(wp2Var.getLocale());
            objR3 = dVarF.R();
            if (zX) {
                if (wp2Var instanceof androidx.compose.p002material3.a) {
                    d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                } else {
                    d21VarA = g21.a(wp2Var.getLocale());
                }
                objR3 = d21VarA;
                dVarF.L(objR3);
            } else {
                if (wp2Var instanceof androidx.compose.p002material3.a) {
                    d21VarA = ((androidx.compose.p002material3.a) wp2Var).getCalendarModel();
                } else {
                    d21VarA = g21.a(wp2Var.getLocale());
                }
                objR3 = d21VarA;
                dVarF.L(objR3);
            }
            d21 d21Var16 = (d21) objR3;
            if (z6) {
                dVarF.y(-690551113);
                do1VarE = ko1.e(-1483431603, true, new d(wp2Var, vn2Var4), dVarF, 54);
                dVarF.u();
            } else {
                dVarF.y(-690163489);
                dVarF.u();
                do1VarE = null;
            }
            do1 do1Var16 = do1VarE;
            jp2 jp2Var16 = jp2.a;
            TextStyle textStyleE16 = xod.e(jp2Var16.q(), dVarF, 6);
            float fO16 = jp2Var16.o();
            androidx.compose.ui.focus.f fVar19 = fVar3;
            e eVar16 = new e(wp2Var, d21Var16, bo2Var3, vn2Var4, fVar19);
            bo2 bo2Var19 = bo2Var3;
            int i1111114 = i14 >> 9;
            dVar2 = dVarF;
            H(bVar4, function7, function4, do1Var16, vn2Var4, textStyleE16, fO16, ko1.e(-1346903698, true, eVar16, dVarF, 54), dVar2, ((i14 >> 3) & 14) | 14155776 | (i1111114 & 112) | (i1111114 & 896) | ((i14 << 3) & 57344));
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bo2Var2 = bo2Var19;
            fVar2 = fVar19;
            z4 = z6;
            bVar3 = bVar4;
            function5 = function7;
            vn2Var3 = vn2Var4;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bo2Var2 = bo2Var;
            fVar2 = fVar;
            bVar3 = bVar2;
            vn2Var3 = vn2Var2;
            function5 = function2E;
            z4 = z2;
        }
        function6 = function4;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.co2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.L(wp2Var, bVar3, bo2Var2, vn2Var3, function5, function6, z4, fVar2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit L(wp2 wp2Var, androidx.compose.ui.b bVar, bo2 bo2Var, vn2 vn2Var, Function2 function2, Function2 function3, boolean z, androidx.compose.ui.focus.f fVar, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) throws NoWhenBranchMatchedException {
        K(wp2Var, bVar, bo2Var, vn2Var, function2, function3, z, fVar, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(final Long l2, final long j2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final d21 d21Var, final IntRange intRange, final bo2 bo2Var, final ddb ddbVar, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-434467002);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.D(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(d21Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.T(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? dVarF.x(bo2Var) : dVarF.T(bo2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dVarF.x(ddbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dVarF.x(vn2Var) ? 67108864 : 33554432;
        }
        if (dVarF.g((38347923 & i3) != 38347922, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-434467002, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1537)");
            }
            CalendarMonth calendarMonthH = d21Var.h(j2);
            int iE = kotlin.ranges.g.e(calendarMonthH.f(intRange), 0);
            final LazyListState lazyListStateC = androidx.compose.p001foundation.lazy.d.c(iE, 0, dVarF, 0, 2);
            Integer numValueOf = Integer.valueOf(iE);
            boolean zX = dVarF.x(lazyListStateC) | dVarF.C(iE);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new C0175DatePickerKt$DatePickerContent$1$1(lazyListStateC, iE, null);
                dVarF.L(objR);
            }
            vn3.g(numValueOf, (Function2) objR, dVarF, 0);
            Object objR2 = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR2);
            }
            final ta2 ta2Var = (ta2) objR2;
            Object[] objArr = new Object[0];
            Object objR3 = dVarF.R();
            if (objR3 == companion.a()) {
                objR3 = new Function0() { // from class: com.google.android.ho2
                    public final Object invoke() {
                        return DatePickerKt.N();
                    }
                };
                dVarF.L(objR3);
            }
            final o58 o58Var = (o58) dfa.l(objArr, (Function0) objR3, dVarF, 48);
            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
            androidx.compose.p001foundation.layout.c cVar = androidx.compose.p001foundation.layout.c.a;
            androidx.compose.foundation.layout.c.n nVarK = cVar.k();
            tc.Companion companion3 = tc.INSTANCE;
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(nVarK, companion3.k(), dVarF, 0);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            int i4 = i3;
            Function0<ComposeUiNode> function0B = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA, companion4.d());
            dud.i(dVarC, gs1VarJ, companion4.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion4.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion4.e());
            yj1 yj1Var = yj1.a;
            float f2 = c;
            androidx.compose.ui.b bVarP = nx8.p(companion2, f2, 0.0f, 2, null);
            boolean zC = lazyListStateC.c();
            boolean zF = lazyListStateC.f();
            boolean zO = O(o58Var);
            String strA = bo2Var.a(Long.valueOf(j2), d21Var.getLocale());
            if (strA == null) {
                strA = "-";
            }
            boolean zT = dVarF.T(ta2Var) | dVarF.x(lazyListStateC);
            String str = strA;
            Object objR4 = dVarF.R();
            if (zT || objR4 == companion.a()) {
                objR4 = new Function0() { // from class: com.google.android.io2
                    public final Object invoke() {
                        return DatePickerKt.Q(ta2Var, lazyListStateC);
                    }
                };
                dVarF.L(objR4);
            }
            Function0 function0 = (Function0) objR4;
            boolean zT2 = dVarF.T(ta2Var) | dVarF.x(lazyListStateC);
            Object objR5 = dVarF.R();
            if (zT2 || objR5 == companion.a()) {
                objR5 = new Function0() { // from class: com.google.android.jo2
                    public final Object invoke() {
                        return DatePickerKt.R(ta2Var, lazyListStateC);
                    }
                };
                dVarF.L(objR5);
            }
            Function0 function3 = (Function0) objR5;
            boolean zX2 = dVarF.x(o58Var);
            Object objR6 = dVarF.R();
            if (zX2 || objR6 == companion.a()) {
                objR6 = new Function0() { // from class: com.google.android.ko2
                    public final Object invoke() {
                        return DatePickerKt.S(o58Var);
                    }
                };
                dVarF.L(objR6);
            }
            Function0 function4 = (Function0) objR6;
            int i5 = i4 & 234881024;
            i0(bVarP, zC, zF, zO, str, function0, function3, function4, vn2Var, dVarF, i5 | 6);
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion3.o(), false);
            int iA2 = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, companion2);
            Function0<ComposeUiNode> function0B2 = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B2);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
            dud.i(dVarC2, ej7VarI, companion4.d());
            dud.i(dVarC2, gs1VarJ2, companion4.f());
            Function2<ComposeUiNode, Integer, Unit> function2C2 = companion4.c();
            if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE2, companion4.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            androidx.compose.ui.b bVarP2 = nx8.p(companion2, f2, 0.0f, 2, null);
            ej7 ej7VarA2 = androidx.compose.p001foundation.layout.o.a(cVar.k(), companion3.k(), dVarF, 0);
            int iA3 = pp1.a(dVarF, 0);
            gs1 gs1VarJ3 = dVarF.j();
            androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarP2);
            Function0<ComposeUiNode> function0B3 = companion4.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B3);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC3 = dud.c(dVarF);
            dud.i(dVarC3, ej7VarA2, companion4.d());
            dud.i(dVarC3, gs1VarJ3, companion4.f());
            Function2<ComposeUiNode, Integer, Unit> function2C3 = companion4.c();
            if (dVarC3.getInserting() || !Intrinsics.e(dVarC3.R(), Integer.valueOf(iA3))) {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            }
            dud.i(dVarC3, bVarE3, companion4.e());
            t0(vn2Var, d21Var, dVarF, ((i4 >> 24) & 14) | ((i4 >> 9) & 112));
            b0(lazyListStateC, l2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, dVarF, ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | i5);
            dVarF.m();
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
            xa4 xa4VarB = d08.b(motionSchemeKeyTokens, dVarF, 6);
            xa4 xa4VarB2 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
            xa4 xa4VarB3 = d08.b(motionSchemeKeyTokens, dVarF, 6);
            AnimatedVisibilityKt.i(O(o58Var), ff1.b(companion2), EnterExitTransitionKt.m(xa4VarB3, null, false, null, 14, null).c(EnterExitTransitionKt.n(xa4VarB, 0.6f)), EnterExitTransitionKt.A(xa4VarB3, null, false, null, 14, null).c(EnterExitTransitionKt.q(xa4VarB2, 0.0f, 2, null)), null, ko1.e(1193716082, true, new DatePickerKt$DatePickerContent$2$4$2(j2, o58Var, ta2Var, lazyListStateC, intRange, calendarMonthH, ddbVar, d21Var, vn2Var), dVarF, 54), dVarF, 196656, 16);
            dVarF = dVarF;
            dVarF.m();
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.lo2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.T(l2, j2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o58 N() {
        return s0.e(Boolean.FALSE, null, 2, null);
    }

    private static final String N0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, androidx.compose.p004runtime.d dVar, int i2) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1972)");
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            dVar.y(974450583);
            if (z3) {
                dVar.y(1416909399);
                rbc.Companion companion = rbc.INSTANCE;
                sb.append(vbc.b(rbc.a(wz9.C), dVar, 0));
                dVar.u();
            } else if (z4) {
                dVar.y(1416913397);
                rbc.Companion companion2 = rbc.INSTANCE;
                sb.append(vbc.b(rbc.a(wz9.B), dVar, 0));
                dVar.u();
            } else if (z5) {
                dVar.y(1416917332);
                rbc.Companion companion3 = rbc.INSTANCE;
                sb.append(vbc.b(rbc.a(wz9.A), dVar, 0));
                dVar.u();
            } else {
                dVar.y(974832875);
                dVar.u();
            }
            dVar.u();
        } else {
            dVar.y(974838827);
            dVar.u();
        }
        if (z2) {
            dVar.y(1416920485);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            rbc.Companion companion4 = rbc.INSTANCE;
            sb.append(vbc.b(rbc.a(wz9.y), dVar, 0));
            dVar.u();
        } else {
            dVar.y(975029291);
            dVar.u();
        }
        String string = sb.length() == 0 ? null : sb.toString();
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(o58<Boolean> o58Var) {
        return o58Var.getValue().booleanValue();
    }

    public static final float O0() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(o58<Boolean> o58Var, boolean z) {
        o58Var.setValue(Boolean.valueOf(z));
    }

    public static final rx8 P0() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(ta2 ta2Var, LazyListState lazyListState) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0176DatePickerKt$DatePickerContent$2$1$1$1(lazyListState, null), 3, (Object) null);
        return Unit.a;
    }

    public static final float Q0() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(ta2 ta2Var, LazyListState lazyListState) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0177DatePickerKt$DatePickerContent$2$2$1$1(lazyListState, null), 3, (Object) null);
        return Unit.a;
    }

    public static final int R0(IntRange intRange) {
        return ((intRange.i() - intRange.f()) + 1) * 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(o58 o58Var) {
        P(o58Var, !O(o58Var));
        return Unit.a;
    }

    public static final wp2 S0(Long l2, Long l3, IntRange intRange, int i2, ddb ddbVar, androidx.compose.p004runtime.d dVar, int i3, int i4) {
        if ((i4 & 1) != 0) {
            l2 = null;
        }
        final Long l4 = l2;
        final Long l5 = (i4 & 2) != 0 ? l4 : l3;
        if ((i4 & 4) != 0) {
            intRange = androidx.compose.p002material3.h.a.p();
        }
        final IntRange intRange2 = intRange;
        if ((i4 & 8) != 0) {
            i2 = c0.INSTANCE.b();
        }
        final int i5 = i2;
        if ((i4 & 16) != 0) {
            ddbVar = androidx.compose.p002material3.h.a.l();
        }
        final ddb ddbVar2 = ddbVar;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(2065763010, i3, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:373)");
        }
        final Locale localeA = b21.a(dVar, 0);
        Object[] objArr = new Object[0];
        k0b<a0, Object> k0bVarC = a0.INSTANCE.c(ddbVar2, localeA);
        boolean z = true;
        boolean zT = ((((i3 & 14) ^ 6) > 4 && dVar.x(l4)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && dVar.x(l5)) || (i3 & 48) == 32) | dVar.T(intRange2) | ((((i3 & 7168) ^ 3072) > 2048 && dVar.C(i5)) || (i3 & 3072) == 2048);
        if ((((57344 & i3) ^ 24576) <= 16384 || !dVar.x(ddbVar2)) && (i3 & 24576) != 16384) {
            z = false;
        }
        boolean zT2 = zT | z | dVar.T(localeA);
        Object objR = dVar.R();
        if (zT2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            Object obj = new Function0() { // from class: com.google.android.cp2
                public final Object invoke() {
                    return DatePickerKt.T0(l4, l5, intRange2, i5, ddbVar2, localeA);
                }
            };
            dVar.L(obj);
            objR = obj;
        }
        a0 a0Var = (a0) dfa.k(objArr, k0bVarC, (Function0) objR, dVar, 0);
        a0Var.j(ddbVar2);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Long l2, long j2, Function1 function1, Function1 function2, d21 d21Var, IntRange intRange, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        M(l2, j2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 T0(Long l2, Long l3, IntRange intRange, int i2, ddb ddbVar, Locale locale) {
        return new a0(l2, l3, intRange, i2, ddbVar, locale, null);
    }

    public static final void U(final androidx.compose.ui.b bVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final long j2, final long j3, final float f2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(2020490761);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.D(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.D(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.B(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.T(function3) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i3) != 74898, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(2020490761, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1677)");
            }
            androidx.compose.ui.b bVarThen = SizeKt.h(bVar, 0.0f, 1, null).then(function2 != null ? SizeKt.b(androidx.compose.ui.b.INSTANCE, 0.0f, f2, 1, null) : androidx.compose.ui.b.INSTANCE);
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.h(), tc.INSTANCE.k(), dVarF, 6);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarThen);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            yj1 yj1Var = yj1.a;
            if (function2 != null) {
                dVarF.y(396894187);
                ns9.b(j2, xod.e(jp2.a.s(), dVarF, 6), ko1.e(1344395458, true, new f(function2), dVarF, 54), dVarF, ((i3 >> 6) & 14) | 384);
                dVarF.u();
            } else {
                dVarF.y(397163267);
                dVarF.u();
            }
            fs1.c(cz1.a().d(ei1.l(j3)), function3, dVarF, os9.i | ((i3 >> 12) & 112));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.dp2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.V(bVar, function2, j2, j3, f2, function3, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Object U0(final LazyListState lazyListState, Function1<? super Long, Unit> function1, d21 d21Var, IntRange intRange, q22<? super Unit> q22Var) {
        Object objCollect = p0.s(new Function0() { // from class: com.google.android.uo2
            public final Object invoke() {
                return Integer.valueOf(DatePickerKt.V0(lazyListState));
            }
        }).collect(new r(lazyListState, function1, d21Var, intRange), q22Var);
        return objCollect == kotlin.coroutines.intrinsics.a.g() ? objCollect : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(androidx.compose.ui.b bVar, Function2 function2, long j2, long j3, float f2, Function2 function3, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        U(bVar, function2, j2, j3, f2, function3, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V0(LazyListState lazyListState) {
        return lazyListState.x();
    }

    private static final void W(final String str, final androidx.compose.ui.b bVar, final boolean z, final Function0<Unit> function0, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        vn2 vn2Var2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-945355136);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.A(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.T(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z6 = z2;
            i3 |= dVarF.A(z6) ? 16384 : 8192;
        } else {
            z6 = z2;
        }
        if ((196608 & i2) == 0) {
            z7 = z3;
            i3 |= dVarF.A(z7) ? 131072 : 65536;
        } else {
            z7 = z3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dVarF.A(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z8 = z5;
            i3 |= dVarF.A(z8) ? 8388608 : 4194304;
        } else {
            z8 = z5;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dVarF.x(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            vn2Var2 = vn2Var;
            i3 |= dVarF.x(vn2Var2) ? 536870912 : 268435456;
        } else {
            vn2Var2 = vn2Var;
        }
        if (dVarF.g((306783379 & i3) != 306783378, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-945355136, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:2003)");
            }
            boolean z9 = (234881024 & i3) == 67108864;
            Object objR = dVarF.R();
            if (z9 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.xo2
                    public final Object invoke(Object obj) {
                        return DatePickerKt.X(str2, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarC = afb.c(bVar, true, (Function1) objR);
            jp2 jp2Var = jp2.a;
            int i4 = i3 >> 6;
            afc.d(z, function0, bVarC, z3, ulb.i(jp2Var.f(), dVarF, 6), vn2Var2.a(z, z7, z6, dVarF, (i4 & 14) | ((i3 >> 12) & 112) | (i4 & 896) | ((i3 >> 18) & 7168)).getValue().getValue(), 0L, 0.0f, 0.0f, (!z4 || z) ? null : pr0.a(jp2Var.l(), vn2Var.getTodayDateBorderColor()), null, ko1.e(1126347158, true, new g(str, vn2Var, z4, z, z8, z3), dVarF, 54), dVarF, i4 & 7294, 48, 1472);
            dVarF = dVarF;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.zo2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.Y(str, bVar, z, function0, z2, z3, z4, z5, str2, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(String str, nfb nfbVar) {
        SemanticsPropertiesKt.x0(nfbVar, new androidx.compose.ui.text.b(str, null, 2, null));
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.a());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(String str, androidx.compose.ui.b bVar, boolean z, Function0 function0, boolean z2, boolean z3, boolean z4, boolean z5, String str2, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        W(str, bVar, z, function0, z2, z3, z4, z5, str2, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    public static final void Z(final androidx.compose.ui.b bVar, final int i2, final Function1<? super c0, Unit> function1, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i3) {
        int i4;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1461252485);
        if ((i3 & 6) == 0) {
            i4 = (dVarF.x(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dVarF.C(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dVarF.T(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dVarF.x(vn2Var) ? 2048 : 1024;
        }
        if (dVarF.g((i4 & 1171) != 1170, i4 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1461252485, i4, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1406)");
            }
            fs1.c(cz1.a().d(ei1.l(vn2Var.getHeadlineContentColor())), ko1.e(-1734512197, true, new h(i2, function1, bVar), dVarF, 54), dVarF, os9.i | 48);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.hp2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.a0(bVar, i2, function1, vn2Var, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(androidx.compose.ui.b bVar, int i2, Function1 function1, vn2 vn2Var, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        Z(bVar, i2, function1, vn2Var, dVar, saa.a(i3 | 1));
        return Unit.a;
    }

    private static final void b0(LazyListState lazyListState, final Long l2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final d21 d21Var, final IntRange intRange, final bo2 bo2Var, final ddb ddbVar, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        Long l3;
        Function1<? super Long, Unit> function3;
        ddb ddbVar2;
        vn2 vn2Var2;
        Object c0179DatePickerKt$HorizontalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1994757941);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(lazyListState2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l3 = l2;
            i3 |= dVarF.x(l3) ? 32 : 16;
        } else {
            l3 = l2;
        }
        if ((i2 & 384) == 0) {
            function3 = function1;
            i3 |= dVarF.T(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(d21Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.T(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? dVarF.x(bo2Var) : dVarF.T(bo2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            ddbVar2 = ddbVar;
            i3 |= dVarF.x(ddbVar2) ? 8388608 : 4194304;
        } else {
            ddbVar2 = ddbVar;
        }
        if ((100663296 & i2) == 0) {
            vn2Var2 = vn2Var;
            i3 |= dVarF.x(vn2Var2) ? 67108864 : 33554432;
        } else {
            vn2Var2 = vn2Var;
        }
        if (dVarF.g((38347923 & i3) != 38347922, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1994757941, i3, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1711)");
            }
            CalendarDate calendarDateJ = d21Var.j();
            boolean zX = dVarF.x(intRange);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = d21Var.g(intRange.f(), 1);
                dVarF.L(objR);
            }
            int i4 = i3;
            qxc.h(xod.e(jp2.a.h(), dVarF, 6), ko1.e(1504086906, true, new i(lazyListState2, intRange, d21Var, (CalendarMonth) objR, function3, calendarDateJ, l3, bo2Var, ddbVar2, vn2Var2), dVarF, 54), dVarF, 48);
            int i5 = i4 & 14;
            boolean zT = (i5 == 4) | ((i4 & 7168) == 2048) | dVarF.T(d21Var) | dVarF.T(intRange);
            Object objR2 = dVarF.R();
            if (zT || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                lazyListState2 = lazyListState;
                c0179DatePickerKt$HorizontalMonthsList$2$1 = new C0179DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, function2, d21Var, intRange, null);
                dVarF.L(c0179DatePickerKt$HorizontalMonthsList$2$1);
            } else {
                c0179DatePickerKt$HorizontalMonthsList$2$1 = objR2;
                lazyListState2 = lazyListState;
            }
            vn3.g(lazyListState2, (Function2) c0179DatePickerKt$HorizontalMonthsList$2$1, dVarF, i5);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ro2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.c0(lazyListState2, l2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(LazyListState lazyListState, Long l2, Function1 function1, Function1 function2, d21 d21Var, IntRange intRange, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        b0(lazyListState, l2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void d0(final Function0<Unit> function0, final pp5 pp5Var, final String str, androidx.compose.ui.b bVar, boolean z, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        Function0<Unit> function1;
        int i4;
        pp5 pp5Var2;
        int i5;
        int i6;
        androidx.compose.ui.b bVar2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        final androidx.compose.ui.b bVar3;
        final boolean z4;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        boolean z5;
        androidx.compose.p004runtime.d dVarF = dVar.F(-368059805);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            function1 = function0;
        } else if ((i2 & 6) == 0) {
            function1 = function0;
            i4 = (dVarF.T(function1) ? 4 : 2) | i2;
        } else {
            function1 = function0;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                pp5Var2 = pp5Var;
                i4 |= dVarF.x(pp5Var2) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.x(str)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i4 & 1)) {
                        if (i6 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                        }
                        androidx.compose.ui.b bVar5 = bVar4;
                        boolean z6 = z5;
                        TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar5, z6, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                        dVarF = dVarF;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar5;
                        z4 = z6;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z4 = z2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                            public final Object invoke(Object obj, Object obj2) {
                                return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                z2 = z;
                if ((i4 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    if (i6 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.b bVar6 = bVar4;
                    boolean z7 = z5;
                    TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar6, z7, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                    dVarF = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar6;
                    z4 = z7;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            bVar2 = bVar;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                if ((i4 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    if (i6 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.b bVar7 = bVar4;
                    boolean z8 = z5;
                    TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar7, z8, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                    dVarF = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar7;
                    z4 = z8;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.b bVar8 = bVar4;
                boolean z9 = z5;
                TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar8, z9, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                dVarF = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar8;
                z4 = z9;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        pp5Var2 = pp5Var;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (dVarF.x(str)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                if ((i4 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    if (i6 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                    }
                    androidx.compose.ui.b bVar9 = bVar4;
                    boolean z10 = z5;
                    TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar9, z10, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                    dVarF = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar9;
                    z4 = z10;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z4 = z2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                        public final Object invoke(Object obj, Object obj2) {
                            return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.b bVar10 = bVar4;
                boolean z11 = z5;
                TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar10, z11, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                dVarF = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar10;
                z4 = z11;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        bVar2 = bVar;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                if (i6 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
                }
                androidx.compose.ui.b bVar11 = bVar4;
                boolean z12 = z5;
                TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar11, z12, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
                dVarF = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar11;
                z4 = z12;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z4 = z2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                    public final Object invoke(Object obj, Object obj2) {
                        return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i4 & 1)) {
            if (i6 != 0) {
                bVar4 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i8 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-368059805, i4, -1, "androidx.compose.material3.IconButtonWithTooltip (DatePicker.kt:2279)");
            }
            androidx.compose.ui.b bVar12 = bVar4;
            boolean z13 = z5;
            TooltipKt.j(s2.a.f(q2.INSTANCE.a(), 0.0f, dVarF, 390, 2), ko1.e(-456272562, true, new j(str), dVarF, 54), TooltipKt.v(false, false, null, dVarF, 0, 7), null, null, false, false, false, ko1.e(-1124908186, true, new k(function1, bVar12, z13, pp5Var2, str), dVarF, 54), dVarF, 100663344, 248);
            dVarF = dVarF;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar3 = bVar12;
            z4 = z13;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            z4 = z2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.mo2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.e0(function0, pp5Var, str, bVar3, z4, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(Function0 function0, pp5 pp5Var, String str, androidx.compose.ui.b bVar, boolean z, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        d0(function0, pp5Var, str, bVar, z, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    public static final void f0(final CalendarMonth calendarMonth, final Function1<? super Long, Unit> function1, final long j2, final Long l2, final Long l3, final ldb ldbVar, final bo2 bo2Var, final ddb ddbVar, final vn2 vn2Var, final Locale locale, androidx.compose.p004runtime.d dVar, final int i2) {
        CalendarMonth calendarMonth2;
        int i3;
        int i4;
        Locale locale2 = locale;
        androidx.compose.p004runtime.d dVarF = dVar.F(-333300603);
        if ((i2 & 6) == 0) {
            calendarMonth2 = calendarMonth;
            i3 = (dVarF.x(calendarMonth2) ? 4 : 2) | i2;
        } else {
            calendarMonth2 = calendarMonth;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.D(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.x(l2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.x(l3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.x(ldbVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? dVarF.x(bo2Var) : dVarF.T(bo2Var) ? 1048576 : 524288;
        }
        int i5 = i3;
        int i6 = (12582912 & i2) == 0 ? i5 | (dVarF.x(ddbVar) ? 8388608 : 4194304) : i5;
        if ((i2 & 100663296) == 0) {
            i6 |= dVarF.x(vn2Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= dVarF.T(locale2) ? 536870912 : 268435456;
        }
        if (dVarF.g((i6 & 306783379) != 306783378, i6 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-333300603, i6, -1, "androidx.compose.material3.Month (DatePicker.kt:1844)");
            }
            dVarF.y(606771165);
            dVarF.u();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarThen = SizeKt.l(companion, ff3.i(a * 6)).then(companion);
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.i(), tc.INSTANCE.k(), dVarF, 6);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            yj1 yj1Var = yj1.a;
            dVarF.y(-680088486);
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 6; i7 < i9; i9 = 6) {
                androidx.compose.ui.b bVarH = SizeKt.h(androidx.compose.ui.b.INSTANCE, 0.0f, 1, null);
                ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.i(), tc.INSTANCE.i(), dVarF, 54);
                int iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarH);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                int i10 = i7;
                Function0<ComposeUiNode> function0B2 = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarB, companion3.d());
                dud.i(dVarC2, gs1VarJ2, companion3.f());
                Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion3.e());
                ira iraVar = ira.a;
                dVarF.y(1542622325);
                int i11 = i8;
                for (int i12 = 0; i12 < 7; i12++) {
                    if (i11 < calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() || i11 >= calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth2.getNumberOfDays()) {
                        i4 = i6;
                        dVarF.y(576825328);
                        androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                        jp2 jp2Var = jp2.a;
                        qzb.a(SizeKt.v(SizeKt.x(companion4, jp2Var.g(), jp2Var.e(), 0.0f, 0.0f, 12, null), ((ff3) dVarF.v(InteractiveComponentSizeKt.e())).getValue(), ((ff3) dVarF.v(InteractiveComponentSizeKt.e())).getValue()), dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(577914947);
                        int daysFromStartOfWeekToFirstOfMonth = i11 - calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth();
                        final long startUtcTimeMillis = calendarMonth2.getStartUtcTimeMillis() + (((long) daysFromStartOfWeekToFirstOfMonth) * 86400000);
                        boolean z = startUtcTimeMillis == j2;
                        boolean z2 = l2 != null && startUtcTimeMillis == l2.longValue();
                        boolean z3 = l3 != null && startUtcTimeMillis == l3.longValue();
                        dVarF.y(578890300);
                        dVarF.u();
                        i4 = i6;
                        boolean z4 = z3;
                        boolean z5 = z;
                        androidx.compose.p004runtime.d dVar2 = dVarF;
                        String strN0 = N0(false, z5, z2, z4, false, dVar2, 0);
                        boolean z6 = z2;
                        String strC = bo2Var.c(Long.valueOf(startUtcTimeMillis), locale2, true);
                        if (strC == null) {
                            strC = "";
                        }
                        int i13 = daysFromStartOfWeekToFirstOfMonth + 1;
                        dVarF = dVar2;
                        String str = strC;
                        String strC2 = c21.c(i13, 0, 0, false, locale, 7, null);
                        androidx.compose.ui.b.Companion companion5 = androidx.compose.ui.b.INSTANCE;
                        boolean z7 = z6 || z4;
                        boolean zD = ((i4 & 112) == 32) | dVarF.D(startUtcTimeMillis);
                        Object objR = dVarF.R();
                        if (zD || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new Function0() { // from class: com.google.android.vo2
                                public final Object invoke() {
                                    return DatePickerKt.g0(function1, startUtcTimeMillis);
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function0 function0 = (Function0) objR;
                        boolean zD2 = dVarF.D(startUtcTimeMillis) | ((29360128 & i4) == 8388608);
                        Object objR2 = dVarF.R();
                        if (zD2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR2 = Boolean.valueOf(ddbVar.b(calendarMonth.getYear()) && ddbVar.a(startUtcTimeMillis));
                            dVarF.L(objR2);
                        }
                        boolean zBooleanValue = ((Boolean) objR2).booleanValue();
                        if (strN0 != null) {
                            str = strN0 + ", " + str;
                        }
                        W(strC2, companion5, z7, function0, z6, zBooleanValue, z5, false, str, vn2Var, dVarF, ((i4 << 3) & 1879048192) | 48);
                        dVarF.u();
                    }
                    calendarMonth2 = calendarMonth;
                    locale2 = locale;
                    i6 = i4;
                    i11++;
                }
                dVarF.u();
                dVarF.m();
                calendarMonth2 = calendarMonth;
                locale2 = locale;
                i7 = i10 + 1;
                i8 = i11;
            }
            dVarF.u();
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2(function1, j2, l2, l3, ldbVar, bo2Var, ddbVar, vn2Var, locale, i2) { // from class: com.google.android.wo2
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Long d;
                public final /* synthetic */ Long e;
                public final /* synthetic */ bo2 f;
                public final /* synthetic */ ddb g;
                public final /* synthetic */ vn2 h;
                public final /* synthetic */ Locale i;
                public final /* synthetic */ int j;

                {
                    this.f = bo2Var;
                    this.g = ddbVar;
                    this.h = vn2Var;
                    this.i = locale;
                    this.j = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.h0(this.a, this.b, this.c, this.d, this.e, null, this.f, this.g, this.h, this.i, this.j, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(Function1 function1, long j2) {
        function1.invoke(Long.valueOf(j2));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(CalendarMonth calendarMonth, Function1 function1, long j2, Long l2, Long l3, ldb ldbVar, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, Locale locale, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        f0(calendarMonth, function1, j2, l2, l3, ldbVar, bo2Var, ddbVar, vn2Var, locale, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    private static final void i0(final androidx.compose.ui.b bVar, final boolean z, final boolean z2, final boolean z3, final String str, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        Function0<Unit> function3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-773929258);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.A(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.A(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.A(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.x(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.T(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dVarF.T(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            function3 = function2;
            i3 |= dVarF.T(function3) ? 8388608 : 4194304;
        } else {
            function3 = function2;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dVarF.x(vn2Var) ? 67108864 : 33554432;
        }
        if (dVarF.g((38347923 & i3) != 38347922, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-773929258, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2191)");
            }
            androidx.compose.ui.b bVarL = SizeKt.l(SizeKt.h(bVar, 0.0f, 1, null), b);
            int i4 = i3;
            ej7 ej7VarB = t0.b(z3 ? androidx.compose.p001foundation.layout.c.a.j() : androidx.compose.p001foundation.layout.c.a.h(), tc.INSTANCE.i(), dVarF, 48);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarL);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            ira iraVar = ira.a;
            B0(function3, z3, null, ko1.e(619076006, true, new l(str, vn2Var), dVarF, 54), dVarF, ((i4 >> 21) & 14) | 3072 | ((i4 >> 6) & 112), 4);
            if (z3) {
                dVarF.y(282432080);
                dVarF.u();
            } else {
                dVarF.y(281624840);
                fs1.c(cz1.a().d(ei1.l(vn2Var.getNavigationContentColor())), ko1.e(-128317193, true, new m(function1, z2, function0, z), dVarF, 54), dVarF, 48 | os9.i);
                dVarF.u();
            }
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qo2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.j0(bVar, z, z2, z3, str, function0, function1, function2, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(androidx.compose.ui.b bVar, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function1, Function0 function2, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        i0(bVar, z, z2, z3, str, function0, function1, function2, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(final Long l2, final long j2, final int i2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final d21 d21Var, final IntRange intRange, final bo2 bo2Var, final ddb ddbVar, final vn2 vn2Var, final androidx.compose.ui.focus.f fVar, androidx.compose.p004runtime.d dVar, final int i3, final int i4) {
        int i5;
        d21 d21Var2;
        IntRange intRange2;
        ddb ddbVar2;
        int i6;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-2053685029);
        if ((i3 & 6) == 0) {
            i5 = (dVarF.x(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dVarF.D(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dVarF.C(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dVarF.T(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dVarF.T(function2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            d21Var2 = d21Var;
            i5 |= dVarF.T(d21Var2) ? 131072 : 65536;
        } else {
            d21Var2 = d21Var;
        }
        if ((1572864 & i3) == 0) {
            intRange2 = intRange;
            i5 |= dVarF.T(intRange2) ? 1048576 : 524288;
        } else {
            intRange2 = intRange;
        }
        if ((12582912 & i3) == 0) {
            i5 |= (16777216 & i3) == 0 ? dVarF.x(bo2Var) : dVarF.T(bo2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            ddbVar2 = ddbVar;
            i5 |= dVarF.x(ddbVar2) ? 67108864 : 33554432;
        } else {
            ddbVar2 = ddbVar;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= dVarF.x(vn2Var) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (dVarF.x(fVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (dVarF.g(((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i5 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-2053685029, i5, i6, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1443)");
            }
            final int i7 = -((f43) dVarF.v(CompositionLocalsKt.g())).O1(ff3.i(48));
            final xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultEffects, dVarF, 6);
            final xa4 xa4VarB2 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
            int i8 = i5;
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            final xa4 xa4VarB3 = d08.b(motionSchemeKeyTokens, dVarF, 6);
            final xa4 xa4VarB4 = d08.b(motionSchemeKeyTokens, dVarF, 6);
            c0 c0VarC = c0.c(i2);
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            Object objR = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion2 = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion2.a()) {
                objR = new Function1() { // from class: com.google.android.ep2
                    public final Object invoke(Object obj) {
                        return DatePickerKt.l0((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarD = afb.d(companion, false, (Function1) objR, 1, null);
            boolean zT = dVarF.T(xa4VarB3) | dVarF.T(xa4VarB) | dVarF.T(xa4VarB2) | dVarF.C(i7) | dVarF.T(xa4VarB4);
            Object objR2 = dVarF.R();
            if (zT || objR2 == companion2.a()) {
                objR2 = new Function1() { // from class: com.google.android.fp2
                    public final Object invoke(Object obj) {
                        return DatePickerKt.m0(xa4VarB3, xa4VarB, xa4VarB2, i7, xa4VarB4, (AnimatedContentTransitionScope) obj);
                    }
                };
                dVarF.L(objR2);
            }
            dVar2 = dVarF;
            AnimatedContentKt.b(c0VarC, bVarD, (Function1) objR2, null, "DatePickerDisplayModeAnimation", null, ko1.e(1838500091, true, new n(l2, j2, function1, function2, d21Var2, intRange2, bo2Var, ddbVar2, vn2Var, fVar), dVarF, 54), dVar2, ((i8 >> 6) & 14) | 1597440, 40);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.gp2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.s0(l2, j2, i2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, fVar, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(nfb nfbVar) {
        SemanticsPropertiesKt.Z(nfbVar, true);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h02 m0(xa4 xa4Var, xa4 xa4Var2, xa4 xa4Var3, final int i2, final xa4 xa4Var4, AnimatedContentTransitionScope animatedContentTransitionScope) {
        return animatedContentTransitionScope.b(c0.f(((c0) animatedContentTransitionScope.d()).getValue(), c0.INSTANCE.a()) ? AnimatedContentKt.f(EnterExitTransitionKt.F(xa4Var, new Function1() { // from class: com.google.android.ip2
            public final Object invoke(Object obj) {
                return Integer.valueOf(DatePickerKt.n0(((Integer) obj).intValue()));
            }
        }).c(EnterExitTransitionKt.o(xa4Var2, 0.0f, 2, null)), EnterExitTransitionKt.q(xa4Var3, 0.0f, 2, null).c(EnterExitTransitionKt.L(xa4Var, new Function1() { // from class: com.google.android.do2
            public final Object invoke(Object obj) {
                return Integer.valueOf(DatePickerKt.o0(i2, ((Integer) obj).intValue()));
            }
        }))) : AnimatedContentKt.f(EnterExitTransitionKt.F(xa4Var, new Function1() { // from class: com.google.android.eo2
            public final Object invoke(Object obj) {
                return Integer.valueOf(DatePickerKt.p0(i2, ((Integer) obj).intValue()));
            }
        }).c(EnterExitTransitionKt.o(xa4Var2, 0.0f, 2, null)), EnterExitTransitionKt.L(xa4Var, new Function1() { // from class: com.google.android.fo2
            public final Object invoke(Object obj) {
                return Integer.valueOf(DatePickerKt.q0(((Integer) obj).intValue()));
            }
        }).c(EnterExitTransitionKt.q(xa4Var3, 0.0f, 2, null))), AnimatedContentKt.c(true, new Function2() { // from class: com.google.android.go2
            public final Object invoke(Object obj, Object obj2) {
                return DatePickerKt.r0(xa4Var4, (q16) obj, (q16) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n0(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o0(int i2, int i3) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p0(int i2, int i3) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q0(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xa4 r0(xa4 xa4Var, q16 q16Var, q16 q16Var2) {
        return xa4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(Long l2, long j2, int i2, Function1 function1, Function1 function2, d21 d21Var, IntRange intRange, bo2 bo2Var, ddb ddbVar, vn2 vn2Var, androidx.compose.ui.focus.f fVar, int i3, int i4, androidx.compose.p004runtime.d dVar, int i5) {
        k0(l2, j2, i2, function1, function2, d21Var, intRange, bo2Var, ddbVar, vn2Var, fVar, dVar, saa.a(i3 | 1), saa.a(i4));
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void t0(final vn2 vn2Var, final d21 d21Var, androidx.compose.p004runtime.d dVar, final int i2) {
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1849465391);
        int i3 = (i2 & 6) == 0 ? (dVarF.x(vn2Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(d21Var) ? 32 : 16;
        }
        ?? r8 = 0;
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1849465391, i3, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1782)");
            }
            int firstDayOfWeek = d21Var.getFirstDayOfWeek();
            List<Pair<String, String>> listK = d21Var.k();
            ArrayList arrayList = new ArrayList();
            int i4 = firstDayOfWeek - 1;
            int size = listK.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(listK.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(listK.get(i6));
            }
            TextStyle textStyleE = xod.e(jp2.a.E(), dVarF, 6);
            androidx.compose.ui.b bVarH = SizeKt.h(SizeKt.b(androidx.compose.ui.b.INSTANCE, 0.0f, a, 1, null), 0.0f, 1, null);
            ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.i(), tc.INSTANCE.i(), dVarF, 54);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarH);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            ira iraVar = ira.a;
            dVarF.y(24563235);
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                final Pair pair = (Pair) arrayList.get(i7);
                androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                boolean zX = dVarF.x(pair);
                Object objR = dVarF.R();
                if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.oo2
                        public final Object invoke(Object obj) {
                            return DatePickerKt.u0(pair, (nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarA = afb.a(companion2, (Function1) objR);
                jp2 jp2Var = jp2.a;
                androidx.compose.ui.b bVarV = SizeKt.v(SizeKt.x(bVarA, jp2Var.g(), jp2Var.e(), 0.0f, 0.0f, 12, null), ((ff3) dVarF.v(InteractiveComponentSizeKt.e())).getValue(), ((ff3) dVarF.v(InteractiveComponentSizeKt.e())).getValue());
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), r8);
                int iA2 = pp1.a(dVarF, r8);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarV);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> function0B2 = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarI, companion3.d());
                dud.i(dVarC2, gs1VarJ2, companion3.f());
                Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion3.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                androidx.compose.p004runtime.d dVar3 = dVarF;
                qxc.j((String) pair.d(), SizeKt.E(companion2, null, false, 3, null), vn2Var.getWeekdayContentColor(), null, 0L, null, null, null, 0L, null, cpc.h(cpc.INSTANCE.a()), 0L, 0, false, 0, 0, null, textStyleE, dVar3, 48, 0, 130040);
                dVar3.m();
                i7++;
                dVarF = dVar3;
                arrayList = arrayList;
                r8 = 0;
            }
            dVar2 = dVarF;
            dVar2.u();
            dVar2.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.po2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.v0(vn2Var, d21Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(Pair pair, nfb nfbVar) {
        SemanticsPropertiesKt.b0(nfbVar, (String) pair.c());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(vn2 vn2Var, d21 d21Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        t0(vn2Var, d21Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(final String str, final androidx.compose.ui.b bVar, final boolean z, final boolean z2, final Function0<Unit> function0, final boolean z3, final String str2, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        String str3;
        int i3;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1153850597);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (dVarF.x(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.A(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.A(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.A(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dVarF.x(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dVarF.x(vn2Var) ? 8388608 : 4194304;
        }
        if (dVarF.g((4793491 & i3) != 4793490, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1153850597, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2128)");
            }
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objR = dVarF.R();
            if (z4 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = (!z2 || z) ? null : pr0.a(jp2.a.l(), vn2Var.getTodayDateBorderColor());
                dVarF.L(objR);
            }
            BorderStroke borderStroke = (BorderStroke) objR;
            boolean z5 = (3670016 & i3) == 1048576;
            Object objR2 = dVarF.R();
            if (z5 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR2 = new Function1() { // from class: com.google.android.ap2
                    public final Object invoke(Object obj) {
                        return DatePickerKt.x0(str2, (nfb) obj);
                    }
                };
                dVarF.L(objR2);
            }
            int i4 = i3 >> 6;
            int i5 = i4 & 14;
            dVar2 = dVarF;
            afc.d(z, function0, afb.c(bVar, true, (Function1) objR2), z3, ulb.i(jp2.a.B(), dVarF, 6), vn2Var.k(z, z3, dVarF, i5 | ((i3 >> 12) & 112) | ((i3 >> 15) & 896)).getValue().getValue(), 0L, 0.0f, 0.0f, borderStroke, null, ko1.e(-564400443, true, new o(str3, vn2Var, z2, z, z3), dVarF, 54), dVar2, i5 | ((i3 >> 9) & 112) | (i4 & 7168), 48, 1472);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.bp2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.y0(str, bVar, z, z2, function0, z3, str2, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(String str, nfb nfbVar) {
        SemanticsPropertiesKt.x0(nfbVar, new androidx.compose.ui.text.b(str, null, 2, null));
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.a());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(String str, androidx.compose.ui.b bVar, boolean z, boolean z2, Function0 function0, boolean z3, String str2, vn2 vn2Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        w0(str, bVar, z, z2, function0, z3, str2, vn2Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(final androidx.compose.ui.b bVar, final long j2, final Function1<? super Integer, Unit> function1, final ddb ddbVar, final d21 d21Var, final IntRange intRange, final vn2 vn2Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1286899812);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.D(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.x(ddbVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(d21Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dVarF.T(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dVarF.x(vn2Var) ? 1048576 : 524288;
        }
        if (dVarF.g((599187 & i3) != 599186, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1286899812, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2068)");
            }
            qxc.h(xod.e(jp2.a.y(), dVarF, 6), ko1.e(1301915789, true, new p(d21Var, j2, intRange, bVar, vn2Var, function1, ddbVar), dVarF, 54), dVarF, 48);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.to2
                public final Object invoke(Object obj, Object obj2) {
                    return DatePickerKt.A0(bVar, j2, function1, ddbVar, d21Var, intRange, vn2Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
