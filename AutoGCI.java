


interface AutoGCI<T>
{

 public static void getReference(Object obj)throws Exception
{
Runtime r = Runtime.getRuntime();
System.out.println("Total  memory  of heap available :"+r.totalMemory());
System.out.println("Total free memory of heap before Destroying  Object  : "+r.freeMemory());
obj = null;
r.gc();
System.out.println("After free memory  :"+r.freeMemory());
System.out.println("Object is Destroyed");
}




}