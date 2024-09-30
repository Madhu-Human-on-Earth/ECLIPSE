package THREADS;
//public class SleepMessages {
//    public static void main(String args[]) throws InterruptedException {
//        String importantInfo[] = {
//            "Mares eat oats",
//            "Does eat oats",
//            "Little lambs eat ivy",
//            "A kid will eat ivy too"
//        };
//
//        for (int i = 0;i < importantInfo.length;i++) {
//            //Pause for 4 seconds
//            Thread.sleep(4000);
//            //Print a message
//            System.out.println(importantInfo[i]);
//        }
//    }
//}
public class SleepMessages {
    public static void main(String args[])  {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // This line would cause a compilation error
            System.out.println(importantInfo[i]);
        }
    }
}
