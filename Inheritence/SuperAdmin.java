package Inheritence;

public class SuperAdmin extends VideoAdmin {
    public static void DeleteVideo(){
        System.out.println("deleting video");
        System.out.println("watch");
    }
    public static void main(String[] args) {

        watchvideo();
        AddVideo();
        DeleteVideo();

    }
}
