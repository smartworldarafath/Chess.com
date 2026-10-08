package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 ]*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u000f{B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0002\u0010!J?\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J?\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J5\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/JQ\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u00105JK\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107JS\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u00109J]\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00028\u00002\u0006\u0010<\u001a\u00028\u00012\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b@\u0010AJ-\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010-JA\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bC\u0010DJ%\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bL\u0010MJ-\u0010N\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bN\u0010OJ?\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bP\u0010QJ%\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bE\u0010RJ9\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bU\u0010QJ?\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bY\u0010ZJ[\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0004H\u0002¢\u0006\u0004\b]\u0010^J#\u0010_\u001a\u00020\u00132\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b_\u0010`JW\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bb\u0010cJ_\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0001\u0010dJ\u000f\u0010e\u001a\u00020\u0004H\u0000¢\u0006\u0004\be\u0010^J\u0017\u0010f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bf\u0010\u0015J\u0017\u0010g\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010hJ#\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0004\bj\u0010GJ%\u0010l\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bl\u0010mJ'\u0010n\u001a\u0004\u0018\u00018\u00012\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bn\u0010oJQ\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00103\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bp\u0010qJ;\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\br\u0010sJM\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bt\u0010uJ3\u0010v\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bv\u0010wJG\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bx\u0010yJO\u0010z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bz\u0010uR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010CR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010|R4\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010}\u001a\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"Lcom/google/android/shd;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Lcom/google/android/e48;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Lcom/google/android/e48;)V", "(II[Ljava/lang/Object;)V", "Lcom/google/android/shd$b;", "b", "()Lcom/google/android/shd$b;", "c", "positionMask", "", "r", "(I)Z", "keyIndex", "t", "(I)Ljava/lang/Object;", "W", "key", "value", "s", "(ILjava/lang/Object;Ljava/lang/Object;)Lcom/google/android/shd;", "owner", "B", "(ILjava/lang/Object;Ljava/lang/Object;Lcom/google/android/e48;)Lcom/google/android/shd;", "(ILjava/lang/Object;)Lcom/google/android/shd;", "Lcom/google/android/h69;", "mutator", "M", "(ILjava/lang/Object;Lcom/google/android/h69;)Lcom/google/android/shd;", "nodeIndex", "newNode", "U", "(IILcom/google/android/shd;)Lcom/google/android/shd;", "L", "(ILcom/google/android/shd;Lcom/google/android/e48;)Lcom/google/android/shd;", "S", "(II)Lcom/google/android/shd;", "J", "(IILcom/google/android/e48;)Lcom/google/android/shd;", "newKeyHash", "newKey", "newValue", "shift", "d", "(IIILjava/lang/Object;Ljava/lang/Object;ILcom/google/android/e48;)[Ljava/lang/Object;", "v", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lcom/google/android/shd;", "C", "(IIILjava/lang/Object;Ljava/lang/Object;ILcom/google/android/e48;)Lcom/google/android/shd;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "u", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILcom/google/android/e48;)Lcom/google/android/shd;", "R", "I", "(IILcom/google/android/h69;)Lcom/google/android/shd;", "i", "j", "(I)Lcom/google/android/shd;", "A", "(ILcom/google/android/h69;)Lcom/google/android/shd;", "f", "(Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/shd$b;", "w", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/h69;)Lcom/google/android/shd;", "(Ljava/lang/Object;)Lcom/google/android/shd;", "y", "(Ljava/lang/Object;Lcom/google/android/h69;)Lcom/google/android/shd;", "z", "otherNode", "Lcom/google/android/d43;", "intersectionCounter", "x", "(Lcom/google/android/shd;Lcom/google/android/d43;Lcom/google/android/e48;)Lcom/google/android/shd;", "F", "(Lcom/google/android/shd;IILcom/google/android/d43;Lcom/google/android/h69;)Lcom/google/android/shd;", "e", "()I", "l", "(Lcom/google/android/shd;)Z", "targetNode", "T", "(Lcom/google/android/shd;Lcom/google/android/shd;II)Lcom/google/android/shd;", "(Lcom/google/android/shd;Lcom/google/android/shd;IILcom/google/android/e48;)Lcom/google/android/shd;", "m", "q", "n", "(I)I", "O", "N", "keyHash", "k", "(ILjava/lang/Object;I)Z", "o", "(ILjava/lang/Object;I)Ljava/lang/Object;", "E", "(Lcom/google/android/shd;ILcom/google/android/d43;Lcom/google/android/h69;)Lcom/google/android/shd;", "P", "(ILjava/lang/Object;Ljava/lang/Object;I)Lcom/google/android/shd$b;", "D", "(ILjava/lang/Object;Ljava/lang/Object;ILcom/google/android/h69;)Lcom/google/android/shd;", "Q", "(ILjava/lang/Object;I)Lcom/google/android/shd;", "G", "(ILjava/lang/Object;ILcom/google/android/h69;)Lcom/google/android/shd;", "H", "a", "Lcom/google/android/e48;", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class shd<K, V> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;
    private static final shd g = new shd(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int dataMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int nodeMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final e48 ownedBy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Object[] buffer;

    /* JADX INFO: renamed from: com.google.android.shd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/shd$a;", "", "<init>", "()V", "Lcom/google/android/shd;", "", "EMPTY", "Lcom/google/android/shd;", "a", "()Lcom/google/android/shd;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final shd a() {
            return shd.g;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/shd$b;", "K", "V", "", "Lcom/google/android/shd;", "node", "", "sizeDelta", "<init>", "(Lcom/google/android/shd;I)V", "a", "Lcom/google/android/shd;", "()Lcom/google/android/shd;", "c", "(Lcom/google/android/shd;)V", "b", "I", "()I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private shd<K, V> node;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int sizeDelta;

        public b(shd<K, V> shdVar, int i) {
            this.node = shdVar;
            this.sizeDelta = i;
        }

        public final shd<K, V> a() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void c(shd<K, V> shdVar) {
            this.node = shdVar;
        }
    }

    public shd(int i, int i2, Object[] objArr, e48 e48Var) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = e48Var;
        this.buffer = objArr;
    }

    private final shd<K, V> A(int i, h69<K, V> mutator) {
        mutator.m(mutator.size() - 1);
        mutator.j(W(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new shd<>(0, 0, bid.h(this.buffer, i), mutator.getOwnership());
        }
        this.buffer = bid.h(this.buffer, i);
        return this;
    }

    private final shd<K, V> B(int positionMask, K key, V value, e48 owner) {
        int iN = n(positionMask);
        if (this.ownedBy != owner) {
            return new shd<>(positionMask | this.dataMap, this.nodeMap, bid.g(this.buffer, iN, key, value), owner);
        }
        this.buffer = bid.g(this.buffer, iN, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final shd<K, V> C(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, e48 owner) {
        if (this.ownedBy != owner) {
            return new shd<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, d(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = d(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final shd<K, V> F(shd<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, h69<K, V> mutator) {
        if (r(positionMask)) {
            shd<K, V> shdVarN = N(O(positionMask));
            if (otherNode.r(positionMask)) {
                return shdVarN.E(otherNode.N(otherNode.O(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.q(positionMask)) {
                return shdVarN;
            }
            int iN = otherNode.n(positionMask);
            K kT = otherNode.t(iN);
            V vW = otherNode.W(iN);
            int size = mutator.size();
            shd<K, V> shdVarD = shdVarN.D(kT != null ? kT.hashCode() : 0, kT, vW, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.c(intersectionCounter.getCount() + 1);
            }
            return shdVarD;
        }
        if (!otherNode.r(positionMask)) {
            int iN2 = n(positionMask);
            K kT2 = t(iN2);
            V vW2 = W(iN2);
            int iN3 = otherNode.n(positionMask);
            K kT3 = otherNode.t(iN3);
            return u(kT2 != null ? kT2.hashCode() : 0, kT2, vW2, kT3 != null ? kT3.hashCode() : 0, kT3, otherNode.W(iN3), shift + 5, mutator.getOwnership());
        }
        shd<K, V> shdVarN2 = otherNode.N(otherNode.O(positionMask));
        if (!q(positionMask)) {
            return shdVarN2;
        }
        int iN4 = n(positionMask);
        K kT4 = t(iN4);
        int i = shift + 5;
        if (!shdVarN2.k(kT4 != null ? kT4.hashCode() : 0, kT4, i)) {
            return shdVarN2.D(kT4 != null ? kT4.hashCode() : 0, kT4, W(iN4), i, mutator);
        }
        intersectionCounter.c(intersectionCounter.getCount() + 1);
        return shdVarN2;
    }

    private final shd<K, V> I(int keyIndex, int positionMask, h69<K, V> mutator) {
        mutator.m(mutator.size() - 1);
        mutator.j(W(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new shd<>(positionMask ^ this.dataMap, this.nodeMap, bid.h(this.buffer, keyIndex), mutator.getOwnership());
        }
        this.buffer = bid.h(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    private final shd<K, V> J(int nodeIndex, int positionMask, e48 owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            return new shd<>(this.dataMap, positionMask ^ this.nodeMap, bid.i(objArr, nodeIndex), owner);
        }
        this.buffer = bid.i(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    private final shd<K, V> K(shd<K, V> targetNode, shd<K, V> newNode, int nodeIndex, int positionMask, e48 owner) {
        if (newNode == null) {
            return J(nodeIndex, positionMask, owner);
        }
        return (this.ownedBy == owner || targetNode != newNode) ? L(nodeIndex, newNode, owner) : this;
    }

    private final shd<K, V> L(int nodeIndex, shd<K, V> newNode, e48 owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = newNode;
        return new shd<>(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    private final shd<K, V> M(int keyIndex, V value, h69<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.i(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new shd<>(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getOwnership());
    }

    private final shd<K, V> R(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new shd<>(positionMask ^ this.dataMap, this.nodeMap, bid.h(objArr, keyIndex));
    }

    private final shd<K, V> S(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new shd<>(this.dataMap, positionMask ^ this.nodeMap, bid.i(objArr, nodeIndex));
    }

    private final shd<K, V> T(shd<K, V> targetNode, shd<K, V> newNode, int nodeIndex, int positionMask) {
        if (newNode == null) {
            return S(nodeIndex, positionMask);
        }
        return targetNode != newNode ? U(nodeIndex, positionMask, newNode) : this;
    }

    private final shd<K, V> U(int nodeIndex, int positionMask, shd<K, V> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[nodeIndex] = newNode;
            return new shd<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new shd<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, bid.k(this.buffer, nodeIndex, n(positionMask), objArr[0], objArr[1]));
    }

    private final shd<K, V> V(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new shd<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final V W(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, e48 owner) {
        K kT = t(keyIndex);
        return bid.j(this.buffer, keyIndex, O(positionMask) + 1, u(kT != null ? kT.hashCode() : 0, kT, W(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
    }

    private final int e() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += N(i).e();
        }
        return iBitCount;
    }

    private final boolean f(K key) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (!Intrinsics.e(key, this.buffer[iF])) {
                if (iF != i) {
                    iF += iJ;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K key) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ <= 0 || iF > i) && (iJ >= 0 || i > iF)) {
            return null;
        }
        while (!Intrinsics.e(key, t(iF))) {
            if (iF == i) {
                return null;
            }
            iF += iJ;
        }
        return W(iF);
    }

    private final b<K, V> h(K key, V value) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (!Intrinsics.e(key, t(iF))) {
                if (iF != i) {
                    iF += iJ;
                }
            }
            if (value == W(iF)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = value;
            return new shd(0, 0, objArrCopyOf).c();
        }
        return new shd(0, 0, bid.g(this.buffer, 0, key, value)).b();
    }

    private final shd<K, V> i(K key) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (!Intrinsics.e(key, t(iF))) {
                if (iF != i) {
                    iF += iJ;
                }
            }
            return j(iF);
        }
        return this;
    }

    private final shd<K, V> j(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new shd<>(0, 0, bid.h(objArr, i));
    }

    private final boolean l(shd<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final shd<K, V> s(int positionMask, K key, V value) {
        return new shd<>(positionMask | this.dataMap, this.nodeMap, bid.g(this.buffer, n(positionMask), key, value));
    }

    private final K t(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final shd<K, V> u(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, e48 owner) {
        if (shift > 30) {
            return new shd<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iF = bid.f(keyHash1, shift);
        int iF2 = bid.f(keyHash2, shift);
        if (iF != iF2) {
            return new shd<>((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new shd<>(0, 1 << iF, new Object[]{u(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final shd<K, V> v(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new shd<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, d(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final shd<K, V> w(K key, V value, h69<K, V> mutator) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (!Intrinsics.e(key, t(iF))) {
                if (iF != i) {
                    iF += iJ;
                }
            }
            mutator.j(W(iF));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[iF + 1] = value;
                return this;
            }
            mutator.i(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = value;
            return new shd<>(0, 0, objArrCopyOf, mutator.getOwnership());
        }
        mutator.m(mutator.size() + 1);
        return new shd<>(0, 0, bid.g(this.buffer, 0, key, value), mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final shd<K, V> x(shd<K, V> otherNode, DeltaCounter intersectionCounter, e48 owner) {
        ok1.a(this.nodeMap == 0);
        ok1.a(this.dataMap == 0);
        ok1.a(otherNode.nodeMap == 0);
        ok1.a(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        d dVarZ = g.z(g.A(0, otherNode.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (true) {
                if (f(otherNode.buffer[iF])) {
                    intersectionCounter.c(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[iF];
                    objArrCopyOf[length + 1] = objArr2[iF + 1];
                    length += 2;
                }
                if (iF == i) {
                    break;
                }
                iF += iJ;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new shd<>(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        return new shd<>(0, 0, objArrCopyOf2, owner);
    }

    private final shd<K, V> y(K key, h69<K, V> mutator) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (!Intrinsics.e(key, t(iF))) {
                if (iF != i) {
                    iF += iJ;
                }
            }
            return A(iF, mutator);
        }
        return this;
    }

    private final shd<K, V> z(K key, V value, h69<K, V> mutator) {
        d dVarZ = g.z(g.A(0, this.buffer.length), 2);
        int iF = dVarZ.f();
        int i = dVarZ.i();
        int iJ = dVarZ.j();
        if ((iJ > 0 && iF <= i) || (iJ < 0 && i <= iF)) {
            while (true) {
                if (Intrinsics.e(key, t(iF)) && Intrinsics.e(value, W(iF))) {
                    return A(iF, mutator);
                }
                if (iF != i) {
                    iF += iJ;
                }
            }
        }
        return this;
    }

    public final shd<K, V> D(int keyHash, K key, V value, int shift, h69<K, V> mutator) {
        h69<K, V> h69Var;
        shd<K, V> shdVarD;
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.e(key, t(iN))) {
                mutator.j(W(iN));
                return W(iN) == value ? this : M(iN, value, mutator);
            }
            mutator.m(mutator.size() + 1);
            return C(iN, iF, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!r(iF)) {
            mutator.m(mutator.size() + 1);
            return B(iF, key, value, mutator.getOwnership());
        }
        int iO = O(iF);
        shd<K, V> shdVarN = N(iO);
        if (shift == 30) {
            shdVarD = shdVarN.w(key, value, mutator);
            h69Var = mutator;
        } else {
            h69Var = mutator;
            shdVarD = shdVarN.D(keyHash, key, value, shift + 5, h69Var);
        }
        return shdVarN == shdVarD ? this : L(iO, shdVarD, h69Var.getOwnership());
    }

    public final shd<K, V> E(shd<K, V> otherNode, int shift, DeltaCounter intersectionCounter, h69<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.b(e());
            return this;
        }
        int i = shift;
        if (i > 30) {
            return x(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i2 = this.nodeMap | otherNode.nodeMap;
        int i3 = this.dataMap;
        int i4 = otherNode.dataMap;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        while (i6 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i6);
            if (Intrinsics.e(t(n(iLowestOneBit)), otherNode.t(otherNode.n(iLowestOneBit)))) {
                i5 |= iLowestOneBit;
            } else {
                i2 |= iLowestOneBit;
            }
            i6 ^= iLowestOneBit;
        }
        int i7 = 0;
        if (!((i2 & i5) == 0)) {
            ei9.b("Check failed.");
        }
        shd<K, V> shdVar = (Intrinsics.e(this.ownedBy, mutator.getOwnership()) && this.dataMap == i5 && this.nodeMap == i2) ? this : new shd<>(i5, i2, new Object[(Integer.bitCount(i5) * 2) + Integer.bitCount(i2)]);
        int i8 = i2;
        int i9 = 0;
        while (i8 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i8);
            Object[] objArr = shdVar.buffer;
            objArr[(objArr.length - 1) - i9] = F(otherNode, iLowestOneBit2, i, intersectionCounter, mutator);
            i9++;
            i8 ^= iLowestOneBit2;
            i = shift;
        }
        while (i5 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i5);
            int i10 = i7 * 2;
            if (otherNode.q(iLowestOneBit3)) {
                int iN = otherNode.n(iLowestOneBit3);
                shdVar.buffer[i10] = otherNode.t(iN);
                shdVar.buffer[i10 + 1] = otherNode.W(iN);
                if (q(iLowestOneBit3)) {
                    intersectionCounter.c(intersectionCounter.getCount() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                shdVar.buffer[i10] = t(iN2);
                shdVar.buffer[i10 + 1] = W(iN2);
            }
            i7++;
            i5 ^= iLowestOneBit3;
        }
        if (l(shdVar)) {
            return this;
        }
        return otherNode.l(shdVar) ? otherNode : shdVar;
    }

    public final shd<K, V> G(int keyHash, K key, int shift, h69<K, V> mutator) {
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.e(key, t(iN))) {
                return I(iN, iF, mutator);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            shd<K, V> shdVarN = N(iO);
            return K(shdVarN, shift == 30 ? shdVarN.y(key, mutator) : shdVarN.G(keyHash, key, shift + 5, mutator), iO, iF, mutator.getOwnership());
        }
        return this;
    }

    public final shd<K, V> H(int keyHash, K key, V value, int shift, h69<K, V> mutator) {
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.e(key, t(iN)) && Intrinsics.e(value, W(iN))) {
                return I(iN, iF, mutator);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            shd<K, V> shdVarN = N(iO);
            return K(shdVarN, shift == 30 ? shdVarN.z(key, value, mutator) : shdVarN.H(keyHash, key, value, shift + 5, mutator), iO, iF, mutator.getOwnership());
        }
        return this;
    }

    public final shd<K, V> N(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (shd) obj;
    }

    public final int O(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    public final b<K, V> P(int keyHash, K key, V value, int shift) {
        b<K, V> bVarP;
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (!Intrinsics.e(key, t(iN))) {
                return v(iN, iF, keyHash, key, value, shift).b();
            }
            if (W(iN) == value) {
                return null;
            }
            return V(iN, value).c();
        }
        if (!r(iF)) {
            return s(iF, key, value).b();
        }
        int iO = O(iF);
        shd<K, V> shdVarN = N(iO);
        if (shift == 30) {
            bVarP = shdVarN.h(key, value);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = shdVarN.P(keyHash, key, value, shift + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final shd<K, V> Q(int keyHash, K key, int shift) {
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.e(key, t(iN))) {
                return R(iN, iF);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            shd<K, V> shdVarN = N(iO);
            return T(shdVarN, shift == 30 ? shdVarN.i(key) : shdVarN.Q(keyHash, key, shift + 5), iO, iF);
        }
        return this;
    }

    public final boolean k(int keyHash, K key, int shift) {
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            return Intrinsics.e(key, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        shd<K, V> shdVarN = N(O(iF));
        return shift == 30 ? shdVarN.f(key) : shdVarN.k(keyHash, key, shift + 5);
    }

    public final int m() {
        return Integer.bitCount(this.dataMap);
    }

    public final int n(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    public final V o(int keyHash, K key, int shift) {
        int iF = 1 << bid.f(keyHash, shift);
        if (q(iF)) {
            int iN = n(iF);
            if (Intrinsics.e(key, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        shd<K, V> shdVarN = N(O(iF));
        return shift == 30 ? shdVarN.g(key) : shdVarN.o(keyHash, key, shift + 5);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean q(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    public shd(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
