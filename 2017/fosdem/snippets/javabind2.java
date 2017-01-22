public final class Counter implements Seq.Proxy {
	public native void inc();

	public final native long getValue();
	public final native void setValue(long v);
	...
}

public abstract class Mygolibrary {
	public static native Counter newCounter();
	...
}
