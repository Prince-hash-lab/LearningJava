package SOLID.liskovsp;

// L : Liskov substitution Principle (LSP) ----->implemented in this program

// I : Interface Segregation Principle (ISP) ----->implemented in this program

// public interface smedia {  
//     public void chatWithFriend();

//     public void sendPhotosAndVideos();
//  }

public class instagram implements smedia, SocialPostAndMediaManager {
    public void chatWithFriend() {
        //logic
        System.out.println(" chat with friends");
    }

    public void sendPhotosAndVideos() {
        System.out.println(" send photos and videos with friends");

        //logic
    }

    public void publishPost(Object post) {
        //logic
        System.out.println(" publish post");

    }

    public static void main(String[] args) {
        instagram itg = new instagram();
        itg.chatWithFriend();
        itg.sendPhotosAndVideos();
        itg.publishPost(null);
    }
}