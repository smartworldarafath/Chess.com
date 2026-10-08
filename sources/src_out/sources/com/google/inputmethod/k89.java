package com.google.inputmethod;

import com.google.android.w2;
import com.google.android.x00;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0011\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010SJ#\u0010Y\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150WH\u0002¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u001cJ7\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010`\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\b`\u0010aJC\u0010c\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\bc\u0010dJw\u0010\u0001\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010_\u001a\u00020;2\u0014\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060f2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060fH\u0002¢\u0006\u0004\b\u0001\u0010hJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020;H\u0002¢\u0006\u0004\bk\u0010>J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010i\u001a\u00020\nH\u0000¢\u0006\u0004\bi\u0010\u000fJ\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010rJ\u001d\u0010s\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010q\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010uJ%\u0010s\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bs\u0010vJ\u0018\u0010w\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\by\u0010xJ\u001d\u0010z\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bz\u0010tJ!\u0010{\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W¢\u0006\u0004\b{\u0010ZJ \u0010|\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~H\u0096\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J \u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0082\u0001\u0010nR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u0087\u0001R&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b/\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010\u008d\u0001R<\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0087\u0001\u001a\u0005\b\u0090\u0001\u0010!R8\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0005\b\u0092\u0001\u0010!R(\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0088\u0001\u001a\u0005\b\u0094\u0001\u0010\u000f¨\u0006\u0095\u0001"}, d2 = {"Lcom/google/android/k89;", "E", "Lcom/google/android/w2;", "Lcom/google/android/i79$a;", "Lcom/google/android/i79;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Lcom/google/android/i79;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "P", "()I", "size", "U", "(I)I", "T", "buffer", "", "r", "([Ljava/lang/Object;)Z", "t", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "u", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "w", "(Ljava/lang/Object;)[Ljava/lang/Object;", "v", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "C", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "D", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "d", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "B", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "A", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "q", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Lcom/google/android/fm8;", "elementCarry", "o", "([Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/fm8;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "n", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "R", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "S", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "c", "(I)[Ljava/lang/Object;", "N", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "M", "([Ljava/lang/Object;IILcom/google/android/fm8;)[Ljava/lang/Object;", "z", "([Ljava/lang/Object;II)V", "y", "Lkotlin/Function1;", "predicate", "H", "(Lkotlin/jvm/functions/Function1;)Z", "O", "x", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "J", "(Lkotlin/jvm/functions/Function1;ILcom/google/android/fm8;)I", "bufferSize", "G", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILcom/google/android/fm8;)I", "toBufferSize", "", "recyclableBuffers", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILcom/google/android/fm8;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "Q", "", "s", "(I)Ljava/util/ListIterator;", "build", "()Lcom/google/android/i79;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "K", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "a", "Lcom/google/android/i79;", "b", "[Ljava/lang/Object;", "I", "i", "setRootShift$runtime", "(I)V", "Lcom/google/android/e48;", "Lcom/google/android/e48;", "ownership", "value", "f", "g", "j", "h", "getSize", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k89<E> extends w2<E> implements i79.a<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private i79<? extends E> vector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object[] vectorRoot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Object[] vectorTail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int rootShift;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private e48 ownership = new e48();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Object[] root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Object[] tail;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int size;

    public k89(i79<? extends E> i79Var, Object[] objArr, Object[] objArr2, int i) {
        this.vector = i79Var;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] A(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            ei9.a("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            ei9.a("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrT = t(root);
        int iA = oyd.a(rootSize, shift);
        int i = shift - 5;
        objArrT[iA] = A((Object[]) objArrT[iA], rootSize, i, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrT[iA] = A((Object[]) objArrT[iA], 0, i, buffersIterator);
        }
        return objArrT;
    }

    private final Object[] B(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = x00.a(buffers);
        int i = rootSize >> 5;
        int i2 = this.rootShift;
        Object[] objArrA = i < (1 << i2) ? A(root, rootSize, i2, itA) : t(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrA = w(objArrA);
            int i3 = this.rootShift;
            A(objArrA, 1 << i3, i3, itA);
        }
        return objArrA;
    }

    private final void C(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            this.root = D(w(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = D(root, filledTail, i);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] D(Object[] root, Object[] tail, int shift) {
        int iA = oyd.a(size() - 1, shift);
        Object[] objArrT = t(root);
        if (shift == 5) {
            objArrT[iA] = tail;
            return objArrT;
        }
        objArrT[iA] = D((Object[]) objArrT[iA], tail, shift - 5);
        return objArrT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int E(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, fm8 bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (r(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i = 0; i < bufferSize; i++) {
            Object obj = buffer[i];
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : v();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int G(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, fm8 bufferRef) {
        Object[] objArrT = buffer;
        int i = bufferSize;
        boolean z = false;
        for (int i2 = 0; i2 < bufferSize; i2++) {
            Object obj = buffer[i2];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrT = t(buffer);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArrT[i] = obj;
                i++;
            }
        }
        bufferRef.b(objArrT);
        return i;
    }

    private final boolean H(Function1<? super E, Boolean> predicate) {
        Object[] objArrA;
        int iT = T();
        fm8 fm8Var = new fm8(null);
        if (this.root == null) {
            return J(predicate, iT, fm8Var) != iT;
        }
        ListIterator<Object[]> listIteratorS = s(0);
        int iG = 32;
        while (iG == 32 && listIteratorS.hasNext()) {
            iG = G(predicate, listIteratorS.next(), 32, fm8Var);
        }
        if (iG == 32) {
            ok1.a(!listIteratorS.hasNext());
            int iJ = J(predicate, iT, fm8Var);
            if (iJ == 0) {
                z(this.root, size(), this.rootShift);
            }
            return iJ != iT;
        }
        int iPreviousIndex = listIteratorS.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iE = iG;
        while (listIteratorS.hasNext()) {
            iE = E(predicate, listIteratorS.next(), 32, iE, fm8Var, arrayList2, arrayList);
        }
        int iE2 = E(predicate, this.tail, iT, iE, fm8Var, arrayList2, arrayList);
        Object value = fm8Var.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        f.A(objArr, (Object) null, iE2, 32);
        if (arrayList.isEmpty()) {
            objArrA = this.root;
            Intrinsics.g(objArrA);
        } else {
            objArrA = A(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = O(objArrA, size);
        this.tail = objArr;
        this.size = size + iE2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final int J(Function1<? super E, Boolean> predicate, int tailSize, fm8 bufferRef) {
        int iG = G(predicate, this.tail, tailSize, bufferRef);
        if (iG == tailSize) {
            ok1.a(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        f.A(objArr, (Object) null, iG, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iG);
        return iG;
    }

    private final Object[] M(Object[] root, int shift, int index, fm8 tailCarry) {
        int iA = oyd.a(index, shift);
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrN = f.n(root, t(root), iA, iA + 1, 32);
            objArrN[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrN;
        }
        int iA2 = root[31] == null ? oyd.a(P() - 1, shift) : 31;
        Object[] objArrT = t(root);
        int i = shift - 5;
        int i2 = iA + 1;
        if (i2 <= iA2) {
            while (true) {
                Object obj2 = objArrT[iA2];
                Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrT[iA2] = M((Object[]) obj2, i, 0, tailCarry);
                if (iA2 == i2) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrT[iA];
        Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrT[iA] = M((Object[]) obj3, i, index, tailCarry);
        return objArrT;
    }

    private final Object N(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        ok1.a(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            z(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrN = f.n(objArr, t(objArr), index, index + 1, size);
        objArrN[size - 1] = null;
        this.root = root;
        this.tail = objArrN;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] O(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            ei9.a("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i = size - 1;
        while (true) {
            int i2 = this.rootShift;
            if ((i >> i2) != 0) {
                return x(root, i, i2);
            }
            this.rootShift = i2 - 5;
            Object[] objArr = root[0];
            Intrinsics.h(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int P() {
        if (size() <= 32) {
            return 0;
        }
        return oyd.d(size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object[] Q(Object[] root, int shift, int index, E e, fm8 oldElementCarry) {
        int iA = oyd.a(index, shift);
        Object[] objArrT = t(root);
        if (shift != 0) {
            Object obj = objArrT[iA];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT[iA] = Q((Object[]) obj, shift - 5, index, e, oldElementCarry);
            return objArrT;
        }
        if (objArrT != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(objArrT[iA]);
        objArrT[iA] = e;
        return objArrT;
    }

    private final Object[] R(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorS = s(P() >> 5);
        while (listIteratorS.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorS.previous();
            f.n(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = u(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorS.previous();
    }

    private final void S(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrV;
        if (!(nullBuffers >= 1)) {
            ei9.a("requires at least one nullBuffer");
        }
        Object[] objArrT = t(startBuffer);
        buffers[0] = objArrT;
        int i = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i2 = (startBufferSize - i) + size;
        if (i2 < 32) {
            f.n(objArrT, nextBuffer, size + 1, i, startBufferSize);
        } else {
            int i3 = i2 - 31;
            if (nullBuffers == 1) {
                objArrV = objArrT;
            } else {
                objArrV = v();
                nullBuffers--;
                buffers[nullBuffers] = objArrV;
            }
            int i4 = startBufferSize - i3;
            f.n(objArrT, nextBuffer, 0, i4, startBufferSize);
            f.n(objArrT, objArrV, size + 1, i, i4);
            nextBuffer = objArrV;
        }
        Iterator<? extends E> it = elements.iterator();
        d(objArrT, i, it);
        for (int i5 = 1; i5 < nullBuffers; i5++) {
            buffers[i5] = d(v(), 0, it);
        }
        d(nextBuffer, 0, it);
    }

    private final int T() {
        return U(size());
    }

    private final int U(int size) {
        return size <= 32 ? size : size - oyd.d(size);
    }

    private final Object[] c(int index) {
        if (P() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[oyd.a(index, i)];
            Intrinsics.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] d(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void n(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArr;
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i = index >> 5;
        Object[] objArrR = R(i, rightShift, buffers, nullBuffers, nextBuffer);
        int iP = nullBuffers - (((P() >> 5) - 1) - i);
        if (iP < nullBuffers) {
            Object[] objArr2 = buffers[iP];
            Intrinsics.g(objArr2);
            objArr = objArr2;
        } else {
            objArr = nextBuffer;
        }
        S(elements, index, objArrR, 32, buffers, iP, objArr);
    }

    private final Object[] o(Object[] root, int shift, int index, Object element, fm8 elementCarry) {
        Object obj;
        int iA = oyd.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrN = f.n(root, t(root), iA + 1, iA, 31);
            objArrN[iA] = element;
            return objArrN;
        }
        Object[] objArrT = t(root);
        int i = shift - 5;
        Object obj2 = objArrT[iA];
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrT[iA] = o((Object[]) obj2, i, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrT[iA]) == null) {
                break;
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT[iA] = o((Object[]) obj, i, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrT;
    }

    private final void q(Object[] root, int index, E element) {
        int iT = T();
        Object[] objArrT = t(this.tail);
        if (iT < 32) {
            f.n(this.tail, objArrT, index + 1, index, iT);
            objArrT[index] = element;
            this.root = root;
            this.tail = objArrT;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        f.n(objArr, objArrT, index + 1, index, 31);
        objArrT[index] = element;
        C(root, objArrT, w(obj));
    }

    private final boolean r(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> s(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iP = P() >> 5;
        f47.b(index, iP);
        int i = this.rootShift;
        return i == 0 ? new mrb(objArr, index) : new rhd(objArr, index, iP, i / 5);
    }

    private final Object[] t(Object[] buffer) {
        if (buffer == null) {
            return v();
        }
        return r(buffer) ? buffer : f.s(buffer, v(), 0, 0, g.j(buffer.length, 32), 6, (Object) null);
    }

    private final Object[] u(Object[] buffer, int distance) {
        return r(buffer) ? f.n(buffer, buffer, distance, 0, 32 - distance) : f.n(buffer, v(), distance, 0, 32 - distance);
    }

    private final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] w(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] x(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            ei9.a("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iA = oyd.a(index, shift);
        Object obj = root[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objX = x((Object[]) obj, index, shift - 5);
        if (iA < 31) {
            int i = iA + 1;
            if (root[i] != null) {
                if (r(root)) {
                    f.A(root, (Object) null, i, 32);
                }
                root = f.n(root, v(), 0, 0, i);
            }
        }
        if (objX == root[iA]) {
            return root;
        }
        Object[] objArrT = t(root);
        objArrT[iA] = objX;
        return objArrT;
    }

    private final Object[] y(Object[] root, int shift, int rootSize, fm8 tailCarry) {
        Object[] objArrY;
        int iA = oyd.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrY = null;
        } else {
            Object obj = root[iA];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY = y((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrY == null && iA == 0) {
            return null;
        }
        Object[] objArrT = t(root);
        objArrT[iA] = objArrY;
        return objArrT;
    }

    private final void z(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        fm8 fm8Var = new fm8(null);
        Intrinsics.g(root);
        Object[] objArrY = y(root, shift, rootSize, fm8Var);
        Intrinsics.g(objArrY);
        Object value = fm8Var.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrY[1] == null) {
            this.root = (Object[]) objArrY[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrY;
            this.rootShift = shift;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K(Function1<? super E, Boolean> predicate) {
        boolean zH = H(predicate);
        if (zH) {
            ((AbstractList) this).modCount++;
        }
        return zH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iT = T();
        if (iT < 32) {
            Object[] objArrT = t(this.tail);
            objArrT[iT] = element;
            this.tail = objArrT;
            this.size = size() + 1;
        } else {
            C(this.root, this.tail, w(element));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iT = T();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iT >= elements.size()) {
            this.tail = d(t(this.tail), iT, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iT) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = d(t(this.tail), iT, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = d(v(), 0, it);
            }
            this.root = B(this.root, P(), objArr);
            this.tail = d(v(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // com.google.android.i79.a
    public i79<E> build() {
        g89 g89Var;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            g89Var = this.vector;
        } else {
            this.ownership = new e48();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                Intrinsics.g(objArr3);
                g89Var = new g89(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                g89Var = oyd.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                g89Var = new bvb(objArrCopyOf);
            }
        }
        this.vector = g89Var;
        return (i79<E>) g89Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    @Override // java.util.List
    public E get(int index) {
        f47.a(index, size());
        return (E) c(index)[index & 31];
    }

    public int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(final Collection<?> elements) {
        return K(new Function1() { // from class: com.google.android.i89
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k89.I(elements, obj));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E removeAt(int index) {
        f47.a(index, size());
        ((AbstractList) this).modCount++;
        int iP = P();
        if (index >= iP) {
            return (E) N(this.root, iP, this.rootShift, index - iP);
        }
        fm8 fm8Var = new fm8(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        N(M(objArr, this.rootShift, index, fm8Var), iP, this.rootShift, 0);
        return (E) fm8Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public E set(int index, E element) {
        f47.a(index, size());
        if (P() > index) {
            fm8 fm8Var = new fm8(null);
            Object[] objArr = this.root;
            Intrinsics.g(objArr);
            this.root = Q(objArr, this.rootShift, index, element, fm8Var);
            return (E) fm8Var.getValue();
        }
        Object[] objArrT = t(this.tail);
        if (objArrT != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i = index & 31;
        E e = (E) objArrT[i];
        objArrT[i] = element;
        this.tail = objArrT;
        return e;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        f47.b(index, size());
        return new o89(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public void add(int index, E element) {
        f47.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iP = P();
        if (index >= iP) {
            q(this.root, index - iP, element);
            return;
        }
        fm8 fm8Var = new fm8(null);
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        q(o(objArr, this.rootShift, index, element, fm8Var), 0, fm8Var.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Collection<? extends E> collection;
        Object[] objArrN;
        Object[][] objArr;
        k89 k89Var;
        f47.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i = (index >> 5) << 5;
        int size = (((size() - i) + elements.size()) - 1) / 32;
        if (size == 0) {
            ok1.a(index >= P());
            int i2 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrN2 = f.n(objArr2, t(objArr2), size2 + 1, i2, T());
            d(objArrN2, i2, elements.iterator());
            this.tail = objArrN2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iT = T();
        int iU = U(size() + elements.size());
        if (index >= P()) {
            objArrN = v();
            objArr = objArr3;
            k89 k89Var2 = this;
            collection = elements;
            k89Var2.S(collection, index, this.tail, iT, objArr, size, objArrN);
            k89Var = k89Var2;
        } else {
            k89 k89Var3 = this;
            collection = elements;
            if (iU > iT) {
                int i3 = iU - iT;
                Object[] objArrU = u(k89Var3.tail, i3);
                k89Var3.n(collection, index, i3, objArr3, size, objArrU);
                objArr = objArr3;
                objArrN = objArrU;
                k89Var = k89Var3;
            } else {
                int i4 = iT - iU;
                objArrN = f.n(k89Var3.tail, v(), 0, i4, iT);
                int i5 = 32 - i4;
                Object[] objArrU2 = u(k89Var3.tail, i5);
                int i6 = size - 1;
                objArr3[i6] = objArrU2;
                k89Var3.n(collection, index, i5, objArr3, i6, objArrU2);
                collection = collection;
                objArr = objArr3;
                k89Var = k89Var3;
            }
        }
        k89Var.root = B(k89Var.root, i, objArr);
        k89Var.tail = objArrN;
        k89Var.size = size() + collection.size();
        return true;
    }
}
