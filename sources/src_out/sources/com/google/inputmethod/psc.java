package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\bH\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J½\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0000¢\u0006\u0004\b5\u00106J'\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\b=\u0010<J'\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\b>\u0010<J'\u0010?\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\b?\u0010<J'\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\b@\u0010<J'\u0010A\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\bA\u0010<J'\u0010B\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\bB\u0010<J'\u0010C\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\bC\u0010<J'\u0010D\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\bD\u0010<J'\u0010E\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001¢\u0006\u0004\bE\u0010<J\u0017\u0010F\u001a\u00020\u00022\u0006\u00109\u001a\u000207H\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010O\u001a\u0004\bR\u0010QR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010O\u001a\u0004\bS\u0010QR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010QR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010QR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010O\u001a\u0004\b[\u0010QR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bY\u0010QR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b\\\u0010QR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010_R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\b`\u0010QR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\ba\u0010QR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010O\u001a\u0004\bb\u0010QR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\bc\u0010QR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010O\u001a\u0004\bd\u0010QR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\be\u0010QR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010O\u001a\u0004\bf\u0010QR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010O\u001a\u0004\bg\u0010QR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bh\u0010QR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010O\u001a\u0004\bi\u0010QR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010O\u001a\u0004\bj\u0010QR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\bk\u0010QR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010QR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010O\u001a\u0004\bq\u0010QR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010O\u001a\u0004\bs\u0010QR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010O\u001a\u0004\bu\u0010QR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010O\u001a\u0004\bw\u0010QR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010O\u001a\u0004\by\u0010QR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010O\u001a\u0004\b{\u0010QR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b|\u0010O\u001a\u0004\b}\u0010QR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b~\u0010O\u001a\u0004\b\u007f\u0010QR\u0019\u0010%\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010O\u001a\u0005\b\u0081\u0001\u0010QR\u0019\u0010&\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010O\u001a\u0005\b\u0083\u0001\u0010QR\u0018\u0010'\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bO\u0010O\u001a\u0005\b\u0084\u0001\u0010QR\u0019\u0010(\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010O\u001a\u0005\b\u0086\u0001\u0010QR\u0019\u0010)\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010O\u001a\u0005\b\u0088\u0001\u0010QR\u0019\u0010*\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010O\u001a\u0005\b\u008a\u0001\u0010QR\u0019\u0010+\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010O\u001a\u0005\b\u008c\u0001\u0010QR\u0019\u0010,\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010O\u001a\u0005\b\u008e\u0001\u0010QR\u0019\u0010-\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010O\u001a\u0005\b\u0090\u0001\u0010QR\u0019\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010O\u001a\u0005\b\u0092\u0001\u0010Q¨\u0006\u0093\u0001"}, d2 = {"Lcom/google/android/psc;", "", "Lcom/google/android/ei1;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lcom/google/android/hzc;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLcom/google/android/hzc;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "(JJJJJJJJJJLcom/google/android/hzc;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lcom/google/android/psc;", "Lkotlin/Function0;", "block", "u", "(Lcom/google/android/hzc;Lkotlin/jvm/functions/Function0;)Lcom/google/android/hzc;", "", "enabled", "isError", "focused", "p", "(ZZZ)J", "w", "n", "b", "q", "o", "v", "t", "r", "s", "f", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getFocusedTextColor-0d7_KjU", "()J", "m", "i", "d", "getErrorTextColor-0d7_KjU", "e", "getFocusedContainerColor-0d7_KjU", "l", "g", "h", "getErrorContainerColor-0d7_KjU", "j", "k", "Lcom/google/android/hzc;", "()Lcom/google/android/hzc;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "x", "getFocusedLabelColor-0d7_KjU", "y", "getUnfocusedLabelColor-0d7_KjU", "z", "getDisabledLabelColor-0d7_KjU", "A", "getErrorLabelColor-0d7_KjU", "B", "getFocusedPlaceholderColor-0d7_KjU", "C", "getUnfocusedPlaceholderColor-0d7_KjU", "D", "getDisabledPlaceholderColor-0d7_KjU", "E", "getErrorPlaceholderColor-0d7_KjU", "F", "getFocusedSupportingTextColor-0d7_KjU", "G", "getUnfocusedSupportingTextColor-0d7_KjU", "H", "getDisabledSupportingTextColor-0d7_KjU", "I", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "K", "getUnfocusedPrefixColor-0d7_KjU", "L", "getDisabledPrefixColor-0d7_KjU", "M", "getErrorPrefixColor-0d7_KjU", "N", "getFocusedSuffixColor-0d7_KjU", "O", "getUnfocusedSuffixColor-0d7_KjU", "P", "getDisabledSuffixColor-0d7_KjU", "Q", "getErrorSuffixColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class psc {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long focusedPlaceholderColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long unfocusedPlaceholderColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long errorPlaceholderColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long errorSupportingTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long focusedPrefixColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long unfocusedPrefixColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long disabledPrefixColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long errorPrefixColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long focusedSuffixColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long unfocusedSuffixColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long disabledSuffixColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long errorSuffixColor;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long focusedTextColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long unfocusedTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long errorTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long focusedContainerColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long unfocusedContainerColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long errorContainerColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final SelectionColors textSelectionColors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final long disabledLabelColor;

    public /* synthetic */ psc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, selectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionColors e(psc pscVar) {
        return pscVar.textSelectionColors;
    }

    public final long b(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledContainerColor;
        }
        if (isError) {
            return this.errorContainerColor;
        }
        return focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    public final psc c(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new psc(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, u(textSelectionColors, new Function0() { // from class: com.google.android.osc
            public final Object invoke() {
                return psc.e(this.a);
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof psc)) {
            return false;
        }
        psc pscVar = (psc) other;
        return ei1.r(this.focusedTextColor, pscVar.focusedTextColor) && ei1.r(this.unfocusedTextColor, pscVar.unfocusedTextColor) && ei1.r(this.disabledTextColor, pscVar.disabledTextColor) && ei1.r(this.errorTextColor, pscVar.errorTextColor) && ei1.r(this.focusedContainerColor, pscVar.focusedContainerColor) && ei1.r(this.unfocusedContainerColor, pscVar.unfocusedContainerColor) && ei1.r(this.disabledContainerColor, pscVar.disabledContainerColor) && ei1.r(this.errorContainerColor, pscVar.errorContainerColor) && ei1.r(this.cursorColor, pscVar.cursorColor) && ei1.r(this.errorCursorColor, pscVar.errorCursorColor) && Intrinsics.e(this.textSelectionColors, pscVar.textSelectionColors) && ei1.r(this.focusedIndicatorColor, pscVar.focusedIndicatorColor) && ei1.r(this.unfocusedIndicatorColor, pscVar.unfocusedIndicatorColor) && ei1.r(this.disabledIndicatorColor, pscVar.disabledIndicatorColor) && ei1.r(this.errorIndicatorColor, pscVar.errorIndicatorColor) && ei1.r(this.focusedLeadingIconColor, pscVar.focusedLeadingIconColor) && ei1.r(this.unfocusedLeadingIconColor, pscVar.unfocusedLeadingIconColor) && ei1.r(this.disabledLeadingIconColor, pscVar.disabledLeadingIconColor) && ei1.r(this.errorLeadingIconColor, pscVar.errorLeadingIconColor) && ei1.r(this.focusedTrailingIconColor, pscVar.focusedTrailingIconColor) && ei1.r(this.unfocusedTrailingIconColor, pscVar.unfocusedTrailingIconColor) && ei1.r(this.disabledTrailingIconColor, pscVar.disabledTrailingIconColor) && ei1.r(this.errorTrailingIconColor, pscVar.errorTrailingIconColor) && ei1.r(this.focusedLabelColor, pscVar.focusedLabelColor) && ei1.r(this.unfocusedLabelColor, pscVar.unfocusedLabelColor) && ei1.r(this.disabledLabelColor, pscVar.disabledLabelColor) && ei1.r(this.errorLabelColor, pscVar.errorLabelColor) && ei1.r(this.focusedPlaceholderColor, pscVar.focusedPlaceholderColor) && ei1.r(this.unfocusedPlaceholderColor, pscVar.unfocusedPlaceholderColor) && ei1.r(this.disabledPlaceholderColor, pscVar.disabledPlaceholderColor) && ei1.r(this.errorPlaceholderColor, pscVar.errorPlaceholderColor) && ei1.r(this.focusedSupportingTextColor, pscVar.focusedSupportingTextColor) && ei1.r(this.unfocusedSupportingTextColor, pscVar.unfocusedSupportingTextColor) && ei1.r(this.disabledSupportingTextColor, pscVar.disabledSupportingTextColor) && ei1.r(this.errorSupportingTextColor, pscVar.errorSupportingTextColor) && ei1.r(this.focusedPrefixColor, pscVar.focusedPrefixColor) && ei1.r(this.unfocusedPrefixColor, pscVar.unfocusedPrefixColor) && ei1.r(this.disabledPrefixColor, pscVar.disabledPrefixColor) && ei1.r(this.errorPrefixColor, pscVar.errorPrefixColor) && ei1.r(this.focusedSuffixColor, pscVar.focusedSuffixColor) && ei1.r(this.unfocusedSuffixColor, pscVar.unfocusedSuffixColor) && ei1.r(this.disabledSuffixColor, pscVar.disabledSuffixColor) && ei1.r(this.errorSuffixColor, pscVar.errorSuffixColor);
    }

    public final long f(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getCursorColor() {
        return this.cursorColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((ei1.x(this.focusedTextColor) * 31) + ei1.x(this.unfocusedTextColor)) * 31) + ei1.x(this.disabledTextColor)) * 31) + ei1.x(this.errorTextColor)) * 31) + ei1.x(this.focusedContainerColor)) * 31) + ei1.x(this.unfocusedContainerColor)) * 31) + ei1.x(this.disabledContainerColor)) * 31) + ei1.x(this.errorContainerColor)) * 31) + ei1.x(this.cursorColor)) * 31) + ei1.x(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + ei1.x(this.focusedIndicatorColor)) * 31) + ei1.x(this.unfocusedIndicatorColor)) * 31) + ei1.x(this.disabledIndicatorColor)) * 31) + ei1.x(this.errorIndicatorColor)) * 31) + ei1.x(this.focusedLeadingIconColor)) * 31) + ei1.x(this.unfocusedLeadingIconColor)) * 31) + ei1.x(this.disabledLeadingIconColor)) * 31) + ei1.x(this.errorLeadingIconColor)) * 31) + ei1.x(this.focusedTrailingIconColor)) * 31) + ei1.x(this.unfocusedTrailingIconColor)) * 31) + ei1.x(this.disabledTrailingIconColor)) * 31) + ei1.x(this.errorTrailingIconColor)) * 31) + ei1.x(this.focusedLabelColor)) * 31) + ei1.x(this.unfocusedLabelColor)) * 31) + ei1.x(this.disabledLabelColor)) * 31) + ei1.x(this.errorLabelColor)) * 31) + ei1.x(this.focusedPlaceholderColor)) * 31) + ei1.x(this.unfocusedPlaceholderColor)) * 31) + ei1.x(this.disabledPlaceholderColor)) * 31) + ei1.x(this.errorPlaceholderColor)) * 31) + ei1.x(this.focusedSupportingTextColor)) * 31) + ei1.x(this.unfocusedSupportingTextColor)) * 31) + ei1.x(this.disabledSupportingTextColor)) * 31) + ei1.x(this.errorSupportingTextColor)) * 31) + ei1.x(this.focusedPrefixColor)) * 31) + ei1.x(this.unfocusedPrefixColor)) * 31) + ei1.x(this.disabledPrefixColor)) * 31) + ei1.x(this.errorPrefixColor)) * 31) + ei1.x(this.focusedSuffixColor)) * 31) + ei1.x(this.unfocusedSuffixColor)) * 31) + ei1.x(this.disabledSuffixColor)) * 31) + ei1.x(this.errorSuffixColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getUnfocusedContainerColor() {
        return this.unfocusedContainerColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getUnfocusedTextColor() {
        return this.unfocusedTextColor;
    }

    public final long n(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledIndicatorColor;
        }
        if (isError) {
            return this.errorIndicatorColor;
        }
        return focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    public final long o(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLabelColor;
        }
        if (isError) {
            return this.errorLabelColor;
        }
        return focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    public final long p(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLeadingIconColor;
        }
        if (isError) {
            return this.errorLeadingIconColor;
        }
        return focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    public final long q(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPlaceholderColor;
        }
        if (isError) {
            return this.errorPlaceholderColor;
        }
        return focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    public final long r(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPrefixColor;
        }
        if (isError) {
            return this.errorPrefixColor;
        }
        return focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    public final long s(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSuffixColor;
        }
        if (isError) {
            return this.errorSuffixColor;
        }
        return focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    public final long t(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSupportingTextColor;
        }
        if (isError) {
            return this.errorSupportingTextColor;
        }
        return focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final SelectionColors u(SelectionColors selectionColors, Function0<SelectionColors> function0) {
        return selectionColors == null ? (SelectionColors) function0.invoke() : selectionColors;
    }

    public final long v(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTextColor;
        }
        if (isError) {
            return this.errorTextColor;
        }
        return focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    public final long w(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTrailingIconColor;
        }
        if (isError) {
            return this.errorTrailingIconColor;
        }
        return focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private psc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.focusedTextColor = j;
        this.unfocusedTextColor = j2;
        this.disabledTextColor = j3;
        this.errorTextColor = j4;
        this.focusedContainerColor = j5;
        this.unfocusedContainerColor = j6;
        this.disabledContainerColor = j7;
        this.errorContainerColor = j8;
        this.cursorColor = j9;
        this.errorCursorColor = j10;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j11;
        this.unfocusedIndicatorColor = j12;
        this.disabledIndicatorColor = j13;
        this.errorIndicatorColor = j14;
        this.focusedLeadingIconColor = j15;
        this.unfocusedLeadingIconColor = j16;
        this.disabledLeadingIconColor = j17;
        this.errorLeadingIconColor = j18;
        this.focusedTrailingIconColor = j19;
        this.unfocusedTrailingIconColor = j20;
        this.disabledTrailingIconColor = j21;
        this.errorTrailingIconColor = j22;
        this.focusedLabelColor = j23;
        this.unfocusedLabelColor = j24;
        this.disabledLabelColor = j25;
        this.errorLabelColor = j26;
        this.focusedPlaceholderColor = j27;
        this.unfocusedPlaceholderColor = j28;
        this.disabledPlaceholderColor = j29;
        this.errorPlaceholderColor = j30;
        this.focusedSupportingTextColor = j31;
        this.unfocusedSupportingTextColor = j32;
        this.disabledSupportingTextColor = j33;
        this.errorSupportingTextColor = j34;
        this.focusedPrefixColor = j35;
        this.unfocusedPrefixColor = j36;
        this.disabledPrefixColor = j37;
        this.errorPrefixColor = j38;
        this.focusedSuffixColor = j39;
        this.unfocusedSuffixColor = j40;
        this.disabledSuffixColor = j41;
        this.errorSuffixColor = j42;
    }
}
