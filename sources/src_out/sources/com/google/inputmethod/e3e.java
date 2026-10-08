package com.google.inputmethod;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "Landroid/content/res/XmlResourceParser;", "parser", "", "changingConfigurations", "Lcom/google/android/qp5$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lcom/google/android/qp5$a;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e3e {
    public static final qp5.ImageVectorEntry a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        pp5.a aVarA = goe.a(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!goe.d(xmlResourceParser)) {
            iG = goe.g(androidVectorParser, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new qp5.ImageVectorEntry(aVarA.f(), androidVectorParser.getConfig() | i);
    }
}
