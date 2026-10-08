package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class d {
    static HashMap<String, Constructor<? extends a>> b;
    private HashMap<Integer, ArrayList<a>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends a>> map = new HashMap<>();
        b = map;
        try {
            map.put("KeyAttribute", b.class.getConstructor(null));
            b.put("KeyPosition", e.class.getConstructor(null));
            b.put("KeyCycle", c.class.getConstructor(null));
            b.put("KeyTimeCycle", g.class.getConstructor(null));
            b.put("KeyTrigger", h.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public d() {
    }

    public void a(j jVar) {
        ArrayList<a> arrayList = this.a.get(-1);
        if (arrayList != null) {
            jVar.b(arrayList);
        }
    }

    public void b(j jVar) {
        ArrayList<a> arrayList = this.a.get(Integer.valueOf(jVar.c));
        if (arrayList != null) {
            jVar.b(arrayList);
        }
        ArrayList<a> arrayList2 = this.a.get(-1);
        if (arrayList2 != null) {
            for (a aVar : arrayList2) {
                if (aVar.f(((ConstraintLayout.b) jVar.b.getLayoutParams()).c0)) {
                    jVar.a(aVar);
                }
            }
        }
    }

    public void c(a aVar) {
        if (!this.a.containsKey(Integer.valueOf(aVar.b))) {
            this.a.put(Integer.valueOf(aVar.b), new ArrayList<>());
        }
        ArrayList<a> arrayList = this.a.get(Integer.valueOf(aVar.b));
        if (arrayList != null) {
            arrayList.add(aVar);
        }
    }

    public ArrayList<a> d(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public d(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        a gVar;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    gVar = new g();
                                    gVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(gVar);
                                    aVar = gVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    gVar = new b();
                                    gVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(gVar);
                                    aVar = gVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    gVar = new c();
                                    gVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(gVar);
                                    aVar = gVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    gVar = new e();
                                    gVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(gVar);
                                    aVar = gVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    gVar = new h();
                                    gVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(gVar);
                                    aVar = gVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        return;
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (aVar != null && (map2 = aVar.e) != null) {
                            ConstraintAttribute.i(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && aVar != null && (map = aVar.e) != null) {
                        ConstraintAttribute.i(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
