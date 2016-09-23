package Music;

/**
 * Created by Justin on 7/29/16.
 */
public class PlayJson{
    Music music = new Music();

    private String name;
    private String favoriteBand;
    private String favoriteVenue;

    public void setName() {
        System.out.println("What is your name?");
        name = Json.scanner.nextLine();
        System.out.println("Welcome, " + name);
        music.setName(name);
    }

    public void setfavoriteBand(){
        System.out.println("What is your Favorite band?");
        favoriteBand = Json.scanner.nextLine();
        System.out.println("Your favorite band is: " + favoriteBand);
        music.setFavoriteBand(favoriteBand);
    }

    public void setfavoriteVenue(){
        System.out.println("What is your favorite Venue?");
        favoriteVenue = Json.scanner.nextLine();
        System.out.println("Your favorite Venue is: " + favoriteVenue);
        music.setFavoriteVenue(favoriteVenue);
    }



    public String getName() {
        return name;
    }



    public String getfavoriteBand() {
        return favoriteBand;
    }


    public String getfavoriteVenue() {
        return favoriteVenue;
    }


}
