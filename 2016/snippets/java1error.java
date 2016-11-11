    ...
    private void someJavaFunction()
    {
            try {
                String resultFromGo = Mygolibrary.helloWithError("JAVA");
                Log.d(TAG, resultFromGo);
            } catch(Exception e) { // If error != nil in Go, will enter the catch
                Log.e(TAG, e.toString());
            }
    }
    ...
