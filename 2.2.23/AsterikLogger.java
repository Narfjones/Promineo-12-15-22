public class AsterikLogger implements Logger{
    public void log(String s){
        System.out.println("***" + s + "***");
    }

    public void error(String s){
        System.out.println("***********************");

        System.out.println("************************");
    }
}
