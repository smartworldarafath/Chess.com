package com.google.inputmethod;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class o37 {
    private static final String[] a = new String[0];
    private static final Comparator<a> b = new Comparator() { // from class: com.google.android.n37
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o37.a((o37.a) obj, (o37.a) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        URLSpan a;
        String b;
        int c;
        int d;

        a() {
        }
    }

    public static /* synthetic */ int a(a aVar, a aVar2) {
        int i = aVar.c;
        int i2 = aVar2.c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(aVar2.d, aVar.d);
    }

    public static boolean b(Spannable spannable, int i) {
        Spannable spannable2;
        if (i()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<a> arrayList = new ArrayList();
        if ((i & 1) != 0) {
            spannable2 = spannable;
            e(arrayList, spannable2, c49.h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        } else {
            spannable2 = spannable;
        }
        if ((i & 2) != 0) {
            e(arrayList, spannable2, c49.i, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            f(arrayList, spannable2);
        }
        h(arrayList, spannable2);
        if (arrayList.size() == 0) {
            return false;
        }
        for (a aVar : arrayList) {
            if (aVar.a == null) {
                c(aVar.b, aVar.c, aVar.d, spannable2);
            }
        }
        return true;
    }

    private static void c(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    private static String d(String str) {
        return WebView.findAddress(str);
    }

    private static void e(ArrayList<a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    a aVar = new a();
                    aVar.b = g(strGroup, strArr, matcher, transformFilter);
                    aVar.c = iStart;
                    aVar.d = iEnd;
                    arrayList.add(aVar);
                }
            }
        }
    }

    private static void f(ArrayList<a> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String strD = d(string);
                if (strD != null && (iIndexOf = string.indexOf(strD)) >= 0) {
                    a aVar = new a();
                    int length = strD.length() + iIndexOf;
                    aVar.c = iIndexOf + i;
                    i += length;
                    aVar.d = i;
                    string = string.substring(length);
                    try {
                        aVar.b = "geo:0,0?q=" + URLEncoder.encode(strD, "UTF-8");
                        arrayList.add(aVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static String g(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String str2 = str;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str3 = strArr[i];
            if (str2.regionMatches(true, 0, str3, 0, str3.length())) {
                z = true;
                if (!str2.regionMatches(false, 0, str3, 0, str3.length())) {
                    str2 = str3 + str2.substring(str3.length());
                    break;
                }
                break;
            }
            i++;
        }
        if (z || strArr.length <= 0) {
            return str2;
        }
        return strArr[0] + str2;
    }

    private static void h(ArrayList<a> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            a aVar = new a();
            aVar.a = uRLSpan;
            aVar.c = spannable.getSpanStart(uRLSpan);
            aVar.d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, b);
        int size = arrayList.size();
        while (i2 < size - 1) {
            a aVar2 = arrayList.get(i2);
            int i3 = i2 + 1;
            a aVar3 = arrayList.get(i3);
            int i4 = aVar2.c;
            int i5 = aVar3.c;
            if (i4 <= i5 && (i = aVar2.d) > i5) {
                int i6 = aVar3.d;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    Object obj = arrayList.get(i7).a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    private static boolean i() {
        return true;
    }
}
