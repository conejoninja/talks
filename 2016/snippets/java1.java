import go.mygolibrary.Mygolibrary;

public class MainActivity {
    ...
    private void someJavaFunction()
    {
            String resultFromGo = Mygolibrary.hello("JAVA");
            Log.d(TAG, resultFromGo);
    }
    ...
}