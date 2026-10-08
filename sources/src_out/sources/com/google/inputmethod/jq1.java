package com.google.inputmethod;

import androidx.compose.p004runtime.tooling.DiagnosticComposeException;
import com.google.android.ox3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lkotlin/Function0;", "Lcom/google/android/fq1;", "trace", "", "d", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "b", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "a", "(Ljava/lang/StringBuilder;Lcom/google/android/fq1;)V", "", "Lcom/google/android/iq1;", "c", "(Lcom/google/android/fq1;)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class jq1 {
    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r9
  0x003a: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v13 java.lang.String) binds: [B:7:0x0027, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(StringBuilder sb, fq1 fq1Var) {
        List listC = m.c();
        List listZ = m.Z(fq1Var.a());
        int size = listZ.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) listZ.get(i);
            gzb sourceInfo = composeStackTraceFrame.getSourceInfo();
            if (sourceInfo != null) {
                String functionName = sourceInfo.getFunctionName();
                if (functionName != null) {
                    str = functionName;
                } else {
                    functionName = sourceInfo.getIsCall() ? "<lambda>" : null;
                    if (functionName != null) {
                        str = functionName;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                }
                String sourceFile = sourceInfo.getSourceFile();
                if (sourceFile != null) {
                    str2 = sourceFile;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List<r77> listB = sourceInfo.b();
                String str3 = str + '(' + str2 + ':' + ((composeStackTraceFrame.getGroupOffset() == null || composeStackTraceFrame.getGroupOffset().intValue() >= listB.size()) ? "<unknown line>" : String.valueOf(listB.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber())) + ')';
                if (!sourceInfo.getIsCall()) {
                }
                if (!Intrinsics.e(sourceInfo.getFunctionName(), "rememberCompositionContext") || !Intrinsics.e(sourceInfo.getPackageHash(), "9igjgp")) {
                    listC.add(str3);
                }
            }
        }
        List listZ2 = m.Z(m.a(listC));
        int size2 = listZ2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str4 = (String) listZ2.get(i2);
            sb.append("\tat ");
            sb.append(str4);
            sb.append('\n');
        }
    }

    public static final Throwable b(Throwable th, Function0<fq1> function0) {
        d(th, function0);
        return th;
    }

    public static final List<ComposeStackTraceFrame> c(fq1 fq1Var) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        int size = fq1Var.a().size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ComposeStackTraceFrame composeStackTraceFrame = fq1Var.a().get(i);
            if (!f.f0(iArr, composeStackTraceFrame.getGroupKey())) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i3 = i + 2;
                    if (i3 < size && fq1Var.a().get(i3).getGroupKey() == 1000) {
                        break;
                    }
                    m.S(arrayList);
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean d(Throwable th, Function0<fq1> function0) {
        DiagnosticComposeException diagnosticComposeException;
        List listB = ox3.b(th);
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listB.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            fq1 fq1Var = (fq1) function0.invoke();
            if (fq1Var != null) {
                if (fq1Var.getHasSourceInformation()) {
                    List<ComposeStackTraceFrame> listA = fq1Var.a();
                    int size2 = listA.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (listA.get(i2).getSourceInfo() != null) {
                            z = true;
                            break;
                        }
                    }
                } else if (!fq1Var.a().isEmpty()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                Intrinsics.g(fq1Var);
                diagnosticComposeException = new DiagnosticComposeException(fq1Var);
            } else {
                diagnosticComposeException = null;
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            ox3.a(th, diagnosticComposeException);
        }
        return z;
    }
}
