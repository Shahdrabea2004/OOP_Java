package Task8;

import Task8.Services.FaceBook;
import Task8.Services.LinkedIn;
import Task8.Services.ServiceSocialMedia;
import Task8.model.Posts;

import java.util.Scanner;

/*
Please Create App facebook & LinkedIn api for posts that accept (id,text,image) and show them
Look!
on facbook please print that you are on application facebook
on LinkedIn please print that you are on application LinkedIn
 */
public class Main {
    public static void main(String []shahd){
        Scanner sc=new Scanner(System.in);
        ServiceSocialMedia serviceSocialMedia;
        //Facebook
        Posts posts = new Posts();
        System.out.println("Enter Facebook Post ID: ");
        posts.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Facebook Post Text: ");
        posts.setText(sc.nextLine());
        System.out.println("Enter Facebook Post Image: ");
        posts.setImage(sc.nextLine());

        serviceSocialMedia=new LinkedIn();
        serviceSocialMedia.PrintAppName();
        serviceSocialMedia.showData(posts);

        //LinkedIn
        Posts post2 = new Posts();
        System.out.println("Enter LinkedIn Post ID: ");
        post2.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter LinkedIn Post Text: ");
        post2.setText(sc.nextLine());
        System.out.println("Enter LinkedIn Post Image: ");
        post2.setImage(sc.nextLine());

        serviceSocialMedia=new LinkedIn();
        serviceSocialMedia.PrintAppName();
        serviceSocialMedia.showData(post2);


    }
}
