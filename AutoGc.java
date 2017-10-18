

class AutoGc<T>
{
 
public static void getReference(Object obj)throws Exception
{
Runtime r = Runtime.getRuntime();
System.out.println("Total  memory  of heap available in system :"+r.totalMemory());
System.out.println("Total free memory of heap before Destroying  Object  : "+r.freeMemory());
obj = null;
r.gc();
System.out.println("After destroying Object free memory available in heap  :"+r.freeMemory());
System.out.println("Object is Destroyed");
}

}