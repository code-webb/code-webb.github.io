class sampleThread extends Thread{
    public void run(){
        System.out.println("hello world");
    }
}



public class program1{
  public static void main(String[] args) {
    sampleThread foo = new sampleThread();
    foo.run();
    
  }
}