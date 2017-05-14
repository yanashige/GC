class OutOfMemory {
 public static void main(String args[])throws Exception{
  for (int i = 0 ; i < 100 ;i++) {
   Thread thread = new Thread (new MyOperation());
   thread.start();

   while(thread.isAlive()){
    thread.sleep(500);
   }
  }
 }
}

class MyOperation extends Thread{
 protected double[] huge_buffer = null;
 public void run(){
  huge_buffer = new double[100000];
 }
}
