package androidx.compose.p001foundation.text;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.irc;
import com.google.inputmethod.r12;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0013j\u0002\b\u000ej\u0002\b\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "key", "Landroidx/compose/foundation/text/c;", "stringId", "Landroidx/compose/foundation/text/b;", "drawableId", "<init>", "(Ljava/lang/String;ILjava/lang/Object;II)V", "", "g", "(Landroidx/compose/runtime/d;I)Ljava/lang/String;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "I", "e", "()I", "c", "a", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextContextMenuItems {
    public static final TextContextMenuItems a;
    public static final TextContextMenuItems b;
    public static final TextContextMenuItems c;
    public static final TextContextMenuItems d;
    public static final TextContextMenuItems e;
    private static final /* synthetic */ TextContextMenuItems[] f;
    private static final /* synthetic */ EnumEntries g;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    static {
        irc ircVar = irc.a;
        Object objC = ircVar.c();
        c.Companion companion = c.INSTANCE;
        int iC = companion.c();
        b.Companion companion2 = b.INSTANCE;
        a = new TextContextMenuItems("Cut", 0, objC, iC, companion2.b());
        b = new TextContextMenuItems("Copy", 1, ircVar.b(), companion.b(), companion2.a());
        c = new TextContextMenuItems("Paste", 2, ircVar.d(), companion.d(), companion2.c());
        d = new TextContextMenuItems("SelectAll", 3, ircVar.e(), companion.e(), companion2.d());
        e = new TextContextMenuItems("Autofill", 4, ircVar.a(), companion.a(), companion2.e());
        TextContextMenuItems[] textContextMenuItemsArrA = a();
        f = textContextMenuItemsArrA;
        g = a.a(textContextMenuItemsArrA);
    }

    private TextContextMenuItems(String str, int i, Object obj, int i2, int i3) {
        super(str, i);
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    private static final /* synthetic */ TextContextMenuItems[] a() {
        return new TextContextMenuItems[]{a, b, c, d, e};
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) f.clone();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStringId() {
        return this.stringId;
    }

    public final String g(d dVar, int i) {
        if (e.k()) {
            e.o(479426150, i, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        String strA = r12.a(this.stringId, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return strA;
    }
}
