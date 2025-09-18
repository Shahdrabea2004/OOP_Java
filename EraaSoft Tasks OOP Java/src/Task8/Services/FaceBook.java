package Task8.Services;

import Task8.model.Posts;

public class FaceBook implements ServiceSocialMedia{
    @Override
    public void showData(Posts posts) {
        System.out.println(posts);
    }

    @Override
    public void PrintAppName() {
        System.out.println("You are on application Facebook");
    }
}
