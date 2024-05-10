package iterator.pseudo;

import iterator.pseudo.socialnetworks.Facebook;
import iterator.pseudo.socialnetworks.SocialNetwork;

import java.util.*;

public class App {
    public static void main(String[] args) {
        SocialNetwork network = new Facebook(createProfiles());

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("Vu@gmail.com",
                "Hi, I'm Thang. Could you share and like this video for me?");
        spammer.sendSpamToCoworkers("Thai@gmail.com",
                "Nice to meet you! My name is Thang - HR of TWS company. " +
                        "I need you fill in this form before 4PM.");
    }

    public static List<Profile> createProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("Ving@gmail.com", "Ving", "friends:DatTa@gmail.com", "friends:Vu@gmail.com", "coworkers:Thai@gmail.com"));
        data.add(new Profile("Vu@gmail.com", "Vu", "friends:Ving@gmail.com", "coworkers:Thai@gmail.com"));
        data.add(new Profile("DatTa@gmail.com", "Dat Ta", "coworkers:Thai@gmail.com"));
        data.add(new Profile("Thai@gmail.com", "Thai", "coworkers:Vu@gmail.com"));
        data.add(new Profile("Diep@gmail.com", "Diep", "coworkers:Thai@gmail.com", "coworkers:Ving@gmail.com", "friends:DatTa@gmail.com"));
        return data;
    }
}
